package ConstantInitializer;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ConstantInitializer0 {

    public static boolean debug = false;

    @Test
    public void ConstantInitializer001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer001");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.lang.Class<?> wildcardClass3 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (-1.0d) + "'", serializable2.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void ConstantInitializer002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer002");
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
    public void ConstantInitializer003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer003");
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
    public void ConstantInitializer004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer004");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>(obj0);
    }

    @Test
    public void ConstantInitializer005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer005");
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
    public void ConstantInitializer006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer006");
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
    public void ConstantInitializer007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer007");
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
    public void ConstantInitializer008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer008");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence> charSequenceConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence>((java.lang.CharSequence) "");
    }

    @Test
    public void ConstantInitializer009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer009");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        java.io.Serializable serializable6 = serializableConstantInitializer1.get();
        // The following exception was thrown during execution in ConstantInitializer generation
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
    public void ConstantInitializer010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer010");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass5 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void ConstantInitializer011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer011");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializerConstantInitializer3);
    }

    @Test
    public void ConstantInitializer012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer012");
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
    public void ConstantInitializer013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer013");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.String> strConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.String>("hi!");
    }

    @Test
    public void ConstantInitializer014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer014");
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
    public void ConstantInitializer015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer015");
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
    public void ConstantInitializer016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer016");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Comparable<java.lang.String>> strComparableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void ConstantInitializer017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer017");
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
    public void ConstantInitializer018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer018");
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
    public void ConstantInitializer019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer019");
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
    public void ConstantInitializer020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer020");
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
    public void ConstantInitializer021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer021");
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
    public void ConstantInitializer022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer022");
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
    public void ConstantInitializer023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer023");
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
    public void ConstantInitializer024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer024");
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
    public void ConstantInitializer025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer025");
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
    public void ConstantInitializer026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer026");
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
    public void ConstantInitializer027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer027");
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
    public void ConstantInitializer028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer028");
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
    public void ConstantInitializer029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer029");
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
    public void ConstantInitializer030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer030");
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
    public void ConstantInitializer031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer031");
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
    public void ConstantInitializer032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer032");
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
    public void ConstantInitializer033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer033");
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
    public void ConstantInitializer034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer034");
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
    public void ConstantInitializer035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer035");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass3 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void ConstantInitializer036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer036");
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
    public void ConstantInitializer037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer037");
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
    public void ConstantInitializer038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer038");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        boolean boolean3 = serializableConstantInitializer1.equals((java.lang.Object) (short) 10);
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = serializableConstantInitializer1.equals(obj4);
        java.io.Serializable serializable6 = serializableConstantInitializer1.get();
        // The following exception was thrown during execution in ConstantInitializer generation
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
    public void ConstantInitializer039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer039");
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
    public void ConstantInitializer040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer040");
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
    public void ConstantInitializer041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer041");
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
    public void ConstantInitializer042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer042");
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
    public void ConstantInitializer043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer043");
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
    public void ConstantInitializer044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer044");
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
    public void ConstantInitializer045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer045");
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
    public void ConstantInitializer046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer046");
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
    public void ConstantInitializer047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer047");
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
    public void ConstantInitializer048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer048");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1));
        boolean boolean3 = serializableConstantInitializer1.equals((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass4 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ConstantInitializer049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer049");
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
    public void ConstantInitializer050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer050");
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
    public void ConstantInitializer051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer051");
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
    public void ConstantInitializer052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer052");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) -1);
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (short) -1 + "'", serializable2.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (short) -1 + "'", serializable3.equals((short) -1));
    }

    @Test
    public void ConstantInitializer053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer053");
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
    public void ConstantInitializer054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer054");
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
    public void ConstantInitializer055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer055");
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
    public void ConstantInitializer056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer056");
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
    public void ConstantInitializer057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer057");
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
    public void ConstantInitializer058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer058");
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
    public void ConstantInitializer059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer059");
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
    public void ConstantInitializer060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer060");
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
    public void ConstantInitializer061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer061");
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
    public void ConstantInitializer062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer062");
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
    public void ConstantInitializer063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer063");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.Class<?> wildcardClass2 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass2);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass2);
        java.lang.String str5 = serializableConstantInitializer4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void ConstantInitializer064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer064");
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
    public void ConstantInitializer065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer065");
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
    public void ConstantInitializer066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer066");
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
    public void ConstantInitializer067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer067");
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
    public void ConstantInitializer068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer068");
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
    public void ConstantInitializer069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer069");
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
    public void ConstantInitializer070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer070");
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
    public void ConstantInitializer071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer071");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass4 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ConstantInitializer072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer072");
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
    public void ConstantInitializer073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer073");
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
    public void ConstantInitializer074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer074");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Comparable<java.lang.String>> strComparableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void ConstantInitializer075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer075");
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
    public void ConstantInitializer076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer076");
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
    public void ConstantInitializer077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer077");
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
    public void ConstantInitializer078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer078");
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
    public void ConstantInitializer079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer079");
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
    public void ConstantInitializer080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer080");
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
    public void ConstantInitializer081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer081");
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
    public void ConstantInitializer082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer082");
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
    public void ConstantInitializer083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer083");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        boolean boolean3 = serializableConstantInitializer1.equals((java.lang.Object) (short) 10);
        boolean boolean5 = serializableConstantInitializer1.equals((java.lang.Object) 0);
        java.io.Serializable serializable6 = serializableConstantInitializer1.get();
        // The following exception was thrown during execution in ConstantInitializer generation
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
    public void ConstantInitializer084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer084");
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
    public void ConstantInitializer085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer085");
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
    public void ConstantInitializer086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer086");
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
    public void ConstantInitializer087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer087");
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
    public void ConstantInitializer088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer088");
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
    public void ConstantInitializer089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer089");
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
    public void ConstantInitializer090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer090");
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
    public void ConstantInitializer091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer091");
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
    public void ConstantInitializer092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer092");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) -1);
        java.lang.Class<?> wildcardClass2 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void ConstantInitializer093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer093");
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
    public void ConstantInitializer094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer094");
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
    public void ConstantInitializer095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer095");
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
    public void ConstantInitializer096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer096");
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
    public void ConstantInitializer097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer097");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) 1);
    }

    @Test
    public void ConstantInitializer098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer098");
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
    public void ConstantInitializer099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer099");
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
    public void ConstantInitializer100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer100");
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
    public void ConstantInitializer101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer101");
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
    public void ConstantInitializer102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer102");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) (-1L));
    }

    @Test
    public void ConstantInitializer103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer103");
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
    public void ConstantInitializer104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer104");
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
    public void ConstantInitializer105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer105");
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
    public void ConstantInitializer106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer106");
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
    public void ConstantInitializer107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer107");
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
    public void ConstantInitializer108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer108");
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
    public void ConstantInitializer109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer109");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer110");
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
    public void ConstantInitializer111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer111");
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
    public void ConstantInitializer112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer112");
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
    public void ConstantInitializer113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer113");
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
    public void ConstantInitializer114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer114");
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
    public void ConstantInitializer115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer115");
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
    public void ConstantInitializer116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer116");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass3 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void ConstantInitializer117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer117");
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
    public void ConstantInitializer118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer118");
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
    public void ConstantInitializer119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer119");
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
    public void ConstantInitializer120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer120");
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
    public void ConstantInitializer121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer121");
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
    public void ConstantInitializer122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer122");
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
    public void ConstantInitializer123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer123");
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
    public void ConstantInitializer124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer124");
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
    public void ConstantInitializer125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer125");
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
    public void ConstantInitializer126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer126");
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
    public void ConstantInitializer127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer127");
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
    public void ConstantInitializer128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer128");
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
    public void ConstantInitializer129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer129");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) ' ');
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.lang.Class<?> wildcardClass3 = serializable2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + ' ' + "'", serializable2.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void ConstantInitializer130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer130");
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
    public void ConstantInitializer131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer131");
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
    public void ConstantInitializer132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer132");
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
    public void ConstantInitializer133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer133");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 10L);
        java.lang.Class<?> wildcardClass2 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void ConstantInitializer134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer134");
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
    public void ConstantInitializer135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer135");
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
    public void ConstantInitializer136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer136");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 1L);
    }

    @Test
    public void ConstantInitializer137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer137");
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
    public void ConstantInitializer138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer138");
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
    public void ConstantInitializer139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer139");
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
    public void ConstantInitializer140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer140");
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
    public void ConstantInitializer141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer141");
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
    public void ConstantInitializer142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer142");
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
    public void ConstantInitializer143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer143");
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
    public void ConstantInitializer144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer144");
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
    public void ConstantInitializer145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer145");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.lang.String str6 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable7 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable8 = serializableConstantInitializer1.get();
        // The following exception was thrown during execution in ConstantInitializer generation
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
    public void ConstantInitializer146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer146");
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
    public void ConstantInitializer147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer147");
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
    public void ConstantInitializer148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer148");
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
    public void ConstantInitializer149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer149");
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
    public void ConstantInitializer150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer150");
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
    public void ConstantInitializer151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer151");
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
    public void ConstantInitializer152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer152");
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
    public void ConstantInitializer153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer153");
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
    public void ConstantInitializer154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer154");
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
    public void ConstantInitializer155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer155");
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
    public void ConstantInitializer156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer156");
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
    public void ConstantInitializer157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer157");
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
    public void ConstantInitializer158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer158");
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
    public void ConstantInitializer159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer159");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) -1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass4 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ConstantInitializer160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer160");
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
    public void ConstantInitializer161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer161");
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
    public void ConstantInitializer162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer162");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 10L);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass3 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void ConstantInitializer163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer163");
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
    public void ConstantInitializer164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer164");
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
    public void ConstantInitializer165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer165");
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
    public void ConstantInitializer166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer166");
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
    public void ConstantInitializer167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer167");
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
    public void ConstantInitializer168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer168");
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
    public void ConstantInitializer169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer169");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) ' ');
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + ' ' + "'", serializable2.equals(' '));
    }

    @Test
    public void ConstantInitializer170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer170");
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
    public void ConstantInitializer171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer171");
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
    public void ConstantInitializer172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer172");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 10L);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass4 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ConstantInitializer173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer173");
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
    public void ConstantInitializer174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer174");
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
    public void ConstantInitializer175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer175");
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
    public void ConstantInitializer176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer176");
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
    public void ConstantInitializer177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer177");
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
    public void ConstantInitializer178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer178");
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
    public void ConstantInitializer179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer179");
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
    public void ConstantInitializer180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer180");
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
    public void ConstantInitializer181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer181");
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
    public void ConstantInitializer182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer182");
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
    public void ConstantInitializer183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer183");
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
    public void ConstantInitializer184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer184");
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
    public void ConstantInitializer185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer185");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1));
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (-1) + "'", serializable2.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1) + "'", serializable3.equals((-1)));
    }

    @Test
    public void ConstantInitializer186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer186");
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
    public void ConstantInitializer187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer187");
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
    public void ConstantInitializer188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer188");
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
    public void ConstantInitializer189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer189");
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
    public void ConstantInitializer190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer190");
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
    public void ConstantInitializer191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer191");
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
    public void ConstantInitializer192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer192");
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
    public void ConstantInitializer193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer193");
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
    public void ConstantInitializer194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer194");
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
    public void ConstantInitializer195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer195");
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
    public void ConstantInitializer196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer196");
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
    public void ConstantInitializer197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer197");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 10L);
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + 10L + "'", serializable2.equals(10L));
    }

    @Test
    public void ConstantInitializer198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer198");
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
    public void ConstantInitializer199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer199");
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
    public void ConstantInitializer200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer200");
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
    public void ConstantInitializer201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer201");
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
    public void ConstantInitializer202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer202");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 1);
    }

    @Test
    public void ConstantInitializer203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer203");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 1.0f);
    }

    @Test
    public void ConstantInitializer204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer204");
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
    public void ConstantInitializer205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer205");
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
    public void ConstantInitializer206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer206");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        boolean boolean3 = serializableConstantInitializer1.equals((java.lang.Object) (short) 10);
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer6 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (byte) 1);
        boolean boolean7 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer6);
        java.io.Serializable serializable8 = serializableConstantInitializer1.get();
        // The following exception was thrown during execution in ConstantInitializer generation
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
    public void ConstantInitializer207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer207");
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
    public void ConstantInitializer208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer208");
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
    public void ConstantInitializer209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer209");
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
    public void ConstantInitializer210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer210");
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
    public void ConstantInitializer211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer211");
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
    public void ConstantInitializer212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer212");
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
    public void ConstantInitializer213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer213");
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
    public void ConstantInitializer214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer214");
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
    public void ConstantInitializer215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer215");
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
    public void ConstantInitializer216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer216");
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
    public void ConstantInitializer217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer217");
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
    public void ConstantInitializer218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer218");
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
    public void ConstantInitializer219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer219");
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
    public void ConstantInitializer220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer220");
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
    public void ConstantInitializer221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer221");
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
    public void ConstantInitializer222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer222");
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
    public void ConstantInitializer223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer223");
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
    public void ConstantInitializer224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer224");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 0.0d);
        java.lang.Class<?> wildcardClass2 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void ConstantInitializer225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer225");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        boolean boolean3 = serializableConstantInitializer1.equals((java.lang.Object) (short) 10);
        java.lang.String str4 = serializableConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void ConstantInitializer226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer226");
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
    public void ConstantInitializer227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer227");
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
    public void ConstantInitializer228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer228");
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
    public void ConstantInitializer229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer229");
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
    public void ConstantInitializer230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer230");
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
    public void ConstantInitializer231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer231");
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
    public void ConstantInitializer232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer232");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (-1) + "'", serializable2.equals((-1)));
    }

    @Test
    public void ConstantInitializer233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer233");
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
    public void ConstantInitializer234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer234");
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
    public void ConstantInitializer235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer235");
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
    public void ConstantInitializer236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer236");
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
    public void ConstantInitializer237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer237");
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
    public void ConstantInitializer238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer238");
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
    public void ConstantInitializer239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer239");
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
    public void ConstantInitializer240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer240");
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
    public void ConstantInitializer241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer241");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0f);
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + 100.0f + "'", serializable2.equals(100.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + 100.0f + "'", serializable3.equals(100.0f));
    }

    @Test
    public void ConstantInitializer242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer242");
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
    public void ConstantInitializer243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer243");
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
    public void ConstantInitializer244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer244");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass3 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void ConstantInitializer245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer245");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1));
        java.lang.Class<?> wildcardClass2 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void ConstantInitializer246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer246");
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
    public void ConstantInitializer247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer247");
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
    public void ConstantInitializer248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer248");
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
    public void ConstantInitializer249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer249");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1.0d) + "'", serializable3.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer250");
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
    public void ConstantInitializer251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer251");
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
    public void ConstantInitializer252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer252");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence> charSequenceConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence>(charSequence0);
    }

    @Test
    public void ConstantInitializer253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer253");
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
    public void ConstantInitializer254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer254");
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
    public void ConstantInitializer255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer255");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) -1);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (short) -1 + "'", serializable3.equals((short) -1));
    }

    @Test
    public void ConstantInitializer256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer256");
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
    public void ConstantInitializer257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer257");
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
    public void ConstantInitializer258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer258");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.lang.Object obj2 = null;
        boolean boolean3 = serializableConstantInitializer1.equals(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void ConstantInitializer259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer259");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) -1);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass4 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ConstantInitializer260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer260");
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
    public void ConstantInitializer261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer261");
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
    public void ConstantInitializer262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer262");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) ' ');
        java.lang.Class<?> wildcardClass2 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void ConstantInitializer263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer263");
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
    public void ConstantInitializer264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer264");
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
    public void ConstantInitializer265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer265");
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
    public void ConstantInitializer266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer266");
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
    public void ConstantInitializer267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer267");
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
    public void ConstantInitializer268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer268");
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
    public void ConstantInitializer269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer269");
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
    public void ConstantInitializer270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer270");
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
    public void ConstantInitializer271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer271");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) -1);
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (short) -1 + "'", serializable2.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (short) -1 + "'", serializable3.equals((short) -1));
    }

    @Test
    public void ConstantInitializer272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer272");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) -1);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass3 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass3);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void ConstantInitializer273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer273");
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
    public void ConstantInitializer274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer274");
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
    public void ConstantInitializer275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer275");
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
    public void ConstantInitializer276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer276");
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
    public void ConstantInitializer277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer277");
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
    public void ConstantInitializer278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer278");
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
    public void ConstantInitializer279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer279");
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
    public void ConstantInitializer280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer280");
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
    public void ConstantInitializer281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer281");
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
    public void ConstantInitializer282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer282");
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
    public void ConstantInitializer283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer283");
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
    public void ConstantInitializer284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer284");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.lang.String str6 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable7 = serializableConstantInitializer1.get();
        // The following exception was thrown during execution in ConstantInitializer generation
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
    public void ConstantInitializer285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer285");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 10L);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
        java.lang.String str3 = serializableConstantInitializer1.toString();
    }

    @Test
    public void ConstantInitializer286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer286");
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
    public void ConstantInitializer287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer287");
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
    public void ConstantInitializer288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer288");
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
    public void ConstantInitializer289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer289");
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
    public void ConstantInitializer290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer290");
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
    public void ConstantInitializer291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer291");
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
    public void ConstantInitializer292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer292");
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
    public void ConstantInitializer293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer293");
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
    public void ConstantInitializer294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer294");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass5 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void ConstantInitializer295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer295");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) (byte) 0);
    }

    @Test
    public void ConstantInitializer296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer296");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer0);
        java.lang.Class<?> wildcardClass2 = serializableConstantInitializerConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void ConstantInitializer297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer297");
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
    public void ConstantInitializer298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer298");
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
    public void ConstantInitializer299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer299");
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
    public void ConstantInitializer300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer300");
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
    public void ConstantInitializer301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer301");
        org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.io.Serializable> serializableConcurrentInitializer0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.io.Serializable>> serializableConcurrentInitializerConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.io.Serializable>>(serializableConcurrentInitializer0);
        java.lang.Class<?> wildcardClass2 = serializableConcurrentInitializerConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.Type> typeConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.Type>((java.lang.reflect.Type) wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void ConstantInitializer302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer302");
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
    public void ConstantInitializer303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer303");
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
    public void ConstantInitializer304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer304");
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
    public void ConstantInitializer305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer305");
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
    public void ConstantInitializer306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer306");
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
    public void ConstantInitializer307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer307");
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
    public void ConstantInitializer308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer308");
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
    public void ConstantInitializer309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer309");
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
    public void ConstantInitializer310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer310");
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
    public void ConstantInitializer311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer311");
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
    public void ConstantInitializer312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer312");
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
    public void ConstantInitializer313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer313");
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
    public void ConstantInitializer314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer314");
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
    public void ConstantInitializer315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer315");
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
    public void ConstantInitializer316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer316");
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
    public void ConstantInitializer317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer317");
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
    public void ConstantInitializer318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer318");
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
    public void ConstantInitializer319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer319");
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
    public void ConstantInitializer320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer320");
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
    public void ConstantInitializer321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer321");
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
    public void ConstantInitializer322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer322");
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
    public void ConstantInitializer323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer323");
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
    public void ConstantInitializer324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer324");
        java.lang.reflect.Type type0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.Type> typeConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.Type>(type0);
    }

    @Test
    public void ConstantInitializer325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer325");
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
    public void ConstantInitializer326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer326");
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
    public void ConstantInitializer327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer327");
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
    public void ConstantInitializer328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer328");
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
    public void ConstantInitializer329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer329");
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
    public void ConstantInitializer330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer330");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.io.Serializable>> serializableConcurrentInitializerConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.io.Serializable>>((org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.io.Serializable>) serializableConstantInitializer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (-1.0d) + "'", serializable4.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer331");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 10);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + 10 + "'", serializable3.equals(10));
    }

    @Test
    public void ConstantInitializer332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer332");
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
    public void ConstantInitializer333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer333");
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
    public void ConstantInitializer334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer334");
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
    public void ConstantInitializer335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer335");
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
    public void ConstantInitializer336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer336");
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
    public void ConstantInitializer337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer337");
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
    public void ConstantInitializer338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer338");
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
    public void ConstantInitializer339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer339");
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
    public void ConstantInitializer340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer340");
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
    public void ConstantInitializer341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer341");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 0.0f);
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + 0.0f + "'", serializable2.equals(0.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + 0.0f + "'", serializable3.equals(0.0f));
    }

    @Test
    public void ConstantInitializer342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer342");
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
    public void ConstantInitializer343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer343");
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
    public void ConstantInitializer344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer344");
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
    public void ConstantInitializer345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer345");
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
    public void ConstantInitializer346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer346");
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
    public void ConstantInitializer347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer347");
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
    public void ConstantInitializer348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer348");
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
    public void ConstantInitializer349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer349");
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
    public void ConstantInitializer350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer350");
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
    public void ConstantInitializer351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer351");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 0.0d);
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + 0.0d + "'", serializable2.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + 0.0d + "'", serializable3.equals(0.0d));
    }

    @Test
    public void ConstantInitializer352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer352");
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
    public void ConstantInitializer353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer353");
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
    public void ConstantInitializer354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer354");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        // The following exception was thrown during execution in ConstantInitializer generation
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
    public void ConstantInitializer355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer355");
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
    public void ConstantInitializer356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer356");
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
    public void ConstantInitializer357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer357");
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
    public void ConstantInitializer358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer358");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass2);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void ConstantInitializer359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer359");
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
    public void ConstantInitializer360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer360");
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
    public void ConstantInitializer361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer361");
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
    public void ConstantInitializer362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer362");
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
    public void ConstantInitializer363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer363");
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
    public void ConstantInitializer364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer364");
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
    public void ConstantInitializer365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer365");
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
    public void ConstantInitializer366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer366");
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
    public void ConstantInitializer367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer367");
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
    public void ConstantInitializer368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer368");
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
    public void ConstantInitializer369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer369");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.String str3 = serializableConstantInitializer1.toString();
    }

    @Test
    public void ConstantInitializer370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer370");
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
    public void ConstantInitializer371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer371");
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
    public void ConstantInitializer372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer372");
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
    public void ConstantInitializer373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer373");
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
    public void ConstantInitializer374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer374");
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
    public void ConstantInitializer375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer375");
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
    public void ConstantInitializer376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer376");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) -1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (short) -1 + "'", serializable5.equals((short) -1));
    }

    @Test
    public void ConstantInitializer377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer377");
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
    public void ConstantInitializer378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer378");
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
    public void ConstantInitializer379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer379");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) 100.0d);
        java.lang.Class<?> wildcardClass2 = objConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass2);
        java.lang.String str4 = serializableConstantInitializer3.toString();
        java.lang.String str5 = serializableConstantInitializer3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void ConstantInitializer380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer380");
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
    public void ConstantInitializer381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer381");
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
    public void ConstantInitializer382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer382");
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
    public void ConstantInitializer383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer383");
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
    public void ConstantInitializer384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer384");
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
    public void ConstantInitializer385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer385");
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
    public void ConstantInitializer386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer386");
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
    public void ConstantInitializer387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer387");
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
    public void ConstantInitializer388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer388");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.String> strConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.String>("");
        java.lang.Class<?> wildcardClass2 = strConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void ConstantInitializer389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer389");
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
    public void ConstantInitializer390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer390");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (byte) 1);
        java.lang.Class<?> wildcardClass2 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void ConstantInitializer391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer391");
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
    public void ConstantInitializer392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer392");
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
    public void ConstantInitializer393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer393");
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
    public void ConstantInitializer394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer394");
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
    public void ConstantInitializer395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer395");
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
    public void ConstantInitializer396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer396");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) ' ');
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + ' ' + "'", serializable3.equals(' '));
    }

    @Test
    public void ConstantInitializer397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer397");
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
    public void ConstantInitializer398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer398");
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
    public void ConstantInitializer399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer399");
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
    public void ConstantInitializer400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer400");
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
    public void ConstantInitializer401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer401");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.String str6 = serializableConstantInitializer5.toString();
        boolean boolean7 = serializableConstantInitializer1.equals((java.lang.Object) str6);
        java.io.Serializable serializable8 = serializableConstantInitializer1.getObject();
        // The following exception was thrown during execution in ConstantInitializer generation
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
    public void ConstantInitializer402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer402");
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
    public void ConstantInitializer403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer403");
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
    public void ConstantInitializer404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer404");
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
    public void ConstantInitializer405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer405");
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
    public void ConstantInitializer406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer406");
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
    public void ConstantInitializer407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer407");
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
    public void ConstantInitializer408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer408");
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
    public void ConstantInitializer409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer409");
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
    public void ConstantInitializer410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer410");
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
    public void ConstantInitializer411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer411");
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
    public void ConstantInitializer412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer412");
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
    public void ConstantInitializer413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer413");
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
    public void ConstantInitializer414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer414");
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
    public void ConstantInitializer415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer415");
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
    public void ConstantInitializer416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer416");
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
    public void ConstantInitializer417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer417");
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
    public void ConstantInitializer418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer418");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        java.lang.Class<?> wildcardClass3 = objConstantInitializer2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void ConstantInitializer419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer419");
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
    public void ConstantInitializer420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer420");
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
    public void ConstantInitializer421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer421");
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
    public void ConstantInitializer422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer422");
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
    public void ConstantInitializer423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer423");
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
    public void ConstantInitializer424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer424");
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
    public void ConstantInitializer425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer425");
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
    public void ConstantInitializer426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer426");
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
    public void ConstantInitializer427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer427");
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
    public void ConstantInitializer428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer428");
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
    public void ConstantInitializer429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer429");
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
    public void ConstantInitializer430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer430");
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
    public void ConstantInitializer431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer431");
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
    public void ConstantInitializer432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer432");
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
    public void ConstantInitializer433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer433");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable2);
    }

    @Test
    public void ConstantInitializer434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer434");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence> charSequenceConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence>((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass2 = charSequenceConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void ConstantInitializer435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer435");
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
    public void ConstantInitializer436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer436");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) -1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
        java.lang.Class<?> wildcardClass3 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void ConstantInitializer437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer437");
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
    public void ConstantInitializer438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer438");
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
    public void ConstantInitializer439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer439");
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
    public void ConstantInitializer440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer440");
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
    public void ConstantInitializer441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer441");
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
    public void ConstantInitializer442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer442");
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
    public void ConstantInitializer443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer443");
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
    public void ConstantInitializer444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer444");
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
    public void ConstantInitializer445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer445");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) ' ');
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + ' ' + "'", serializable4.equals(' '));
    }

    @Test
    public void ConstantInitializer446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer446");
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
    public void ConstantInitializer447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer447");
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
    public void ConstantInitializer448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer448");
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
    public void ConstantInitializer449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer449");
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
    public void ConstantInitializer450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer450");
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
    public void ConstantInitializer451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer451");
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
    public void ConstantInitializer452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer452");
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
    public void ConstantInitializer453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer453");
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
    public void ConstantInitializer454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer454");
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
    public void ConstantInitializer455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer455");
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
    public void ConstantInitializer456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer456");
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
    public void ConstantInitializer457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer457");
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
    public void ConstantInitializer458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer458");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 10L);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
        java.lang.Class<?> wildcardClass3 = serializableConstantInitializerConstantInitializer2.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.Type> typeConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.Type>((java.lang.reflect.Type) wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void ConstantInitializer459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer459");
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
    public void ConstantInitializer460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer460");
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
    public void ConstantInitializer461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer461");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.lang.String str5 = serializableConstantInitializer1.toString();
    }

    @Test
    public void ConstantInitializer462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer462");
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
    public void ConstantInitializer463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer463");
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
    public void ConstantInitializer464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer464");
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
    public void ConstantInitializer465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer465");
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
    public void ConstantInitializer466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer466");
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
    public void ConstantInitializer467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer467");
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
    public void ConstantInitializer468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer468");
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
    public void ConstantInitializer469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer469");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) 100);
    }

    @Test
    public void ConstantInitializer470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer470");
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
    public void ConstantInitializer471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer471");
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
    public void ConstantInitializer472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer472");
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
    public void ConstantInitializer473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer473");
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
    public void ConstantInitializer474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer474");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 10);
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + 10 + "'", serializable2.equals(10));
    }

    @Test
    public void ConstantInitializer475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer475");
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
    public void ConstantInitializer476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer476");
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
    public void ConstantInitializer477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer477");
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
    public void ConstantInitializer478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer478");
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
    public void ConstantInitializer479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer479");
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
    public void ConstantInitializer480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer480");
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
    public void ConstantInitializer481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer481");
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
    public void ConstantInitializer482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer482");
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
    public void ConstantInitializer483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer483");
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
    public void ConstantInitializer484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer484");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (byte) 10);
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (byte) 10 + "'", serializable2.equals((byte) 10));
    }

    @Test
    public void ConstantInitializer485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer485");
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
    public void ConstantInitializer486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer486");
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
    public void ConstantInitializer487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer487");
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
    public void ConstantInitializer488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer488");
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
    public void ConstantInitializer489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer489");
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
    public void ConstantInitializer490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer490");
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
    public void ConstantInitializer491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer491");
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
    public void ConstantInitializer492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer492");
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
    public void ConstantInitializer493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer493");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 0.0f);
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        java.lang.Class<?> wildcardClass3 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + 0.0f + "'", serializable2.equals(0.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void ConstantInitializer494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer494");
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
    public void ConstantInitializer495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer495");
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
    public void ConstantInitializer496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer496");
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
    public void ConstantInitializer497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer497");
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
    public void ConstantInitializer498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer498");
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
    public void ConstantInitializer499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer499");
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
    public void ConstantInitializer500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.ConstantInitializer500");
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

