package ConstantInitializer;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ConstantInitializer1 {

    public static boolean debug = false;

    @Test
    public void ConstantInitializer501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer501");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.lang.Object obj5 = null;
        boolean boolean6 = serializableConstantInitializer1.equals(obj5);
        java.io.Serializable serializable7 = serializableConstantInitializer1.get();
        java.io.Serializable serializable8 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + (-1.0d) + "'", serializable7.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + (-1.0d) + "'", serializable8.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer502");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.lang.String str6 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable7 = serializableConstantInitializer1.getObject();
        java.lang.String str8 = serializableConstantInitializer1.toString();
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer9 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
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
    }

    @Test
    public void ConstantInitializer503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer503");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) -1);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        java.lang.String str7 = serializableConstantInitializer1.toString();
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
    public void ConstantInitializer504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer504");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        java.lang.Object obj3 = null;
        boolean boolean4 = serializableConstantInitializer1.equals(obj3);
        java.lang.String str5 = serializableConstantInitializer1.toString();
        boolean boolean7 = serializableConstantInitializer1.equals((java.lang.Object) 0.0d);
        java.io.Serializable serializable8 = serializableConstantInitializer1.getObject();
        java.lang.Class<?> wildcardClass9 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + (-1.0d) + "'", serializable8.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ConstantInitializer505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer505");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) 100.0d);
        java.lang.Class<?> wildcardClass2 = objConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass2);
        java.lang.String str4 = serializableConstantInitializer3.toString();
        java.io.Serializable serializable5 = serializableConstantInitializer3.get();
        java.io.Serializable serializable6 = serializableConstantInitializer3.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
    }

    @Test
    public void ConstantInitializer506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer506");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        java.lang.String str5 = serializableConstantInitializer1.toString();
        java.lang.String str6 = serializableConstantInitializer1.toString();
        java.lang.String str7 = serializableConstantInitializer1.toString();
        java.lang.String str8 = serializableConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + 100.0d + "'", serializable4.equals(100.0d));
    }

    @Test
    public void ConstantInitializer507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer507");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        java.lang.Object obj3 = null;
        boolean boolean4 = serializableConstantInitializer1.equals(obj3);
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        java.lang.Class<?> wildcardClass6 = serializable5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ConstantInitializer508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer508");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        java.lang.Object obj7 = null;
        boolean boolean8 = serializableConstantInitializer1.equals(obj7);
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
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (-1.0d) + "'", serializable6.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ConstantInitializer509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer509");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 0.0d);
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + 0.0d + "'", serializable2.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + 0.0d + "'", serializable3.equals(0.0d));
    }

    @Test
    public void ConstantInitializer510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer510");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 0.0d);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.lang.String str4 = serializableConstantInitializer3.toString();
        boolean boolean5 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer3);
        java.lang.String str6 = serializableConstantInitializer3.toString();
        java.lang.String str7 = serializableConstantInitializer3.toString();
        java.io.Serializable serializable8 = serializableConstantInitializer3.get();
        java.lang.Class<?> wildcardClass9 = serializableConstantInitializer3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + (-1.0d) + "'", serializable8.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ConstantInitializer511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer511");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (-1.0d) + "'", serializable2.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (-1.0d) + "'", serializable4.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer512");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.Class<?> wildcardClass2 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass2);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass2);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass2);
        java.io.Serializable serializable6 = serializableConstantInitializer5.getObject();
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer7 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer5);
        java.io.Serializable serializable8 = serializableConstantInitializer5.get();
        java.lang.String str9 = serializableConstantInitializer5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable8);
    }

    @Test
    public void ConstantInitializer513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer513");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        java.lang.Object obj3 = null;
        boolean boolean4 = serializableConstantInitializer1.equals(obj3);
        java.lang.String str5 = serializableConstantInitializer1.toString();
        java.lang.String str6 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable7 = serializableConstantInitializer1.getObject();
        java.lang.Class<?> wildcardClass8 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + (-1.0d) + "'", serializable7.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ConstantInitializer514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer514");
        java.lang.Comparable<java.lang.String> strComparable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Comparable<java.lang.String>> strComparableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Comparable<java.lang.String>>(strComparable0);
        java.lang.Class<?> wildcardClass2 = strComparableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void ConstantInitializer515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer515");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1));
        boolean boolean3 = serializableConstantInitializer1.equals((java.lang.Object) 10);
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.io.Serializable>> serializableConcurrentInitializerConstantInitializer7 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.io.Serializable>>((org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.io.Serializable>) serializableConstantInitializer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (-1) + "'", serializable4.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1) + "'", serializable5.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (-1) + "'", serializable6.equals((-1)));
    }

    @Test
    public void ConstantInitializer516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer516");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        boolean boolean3 = serializableConstantInitializer1.equals((java.lang.Object) (short) 10);
        boolean boolean5 = serializableConstantInitializer1.equals((java.lang.Object) 0);
        java.io.Serializable serializable6 = serializableConstantInitializer1.get();
        java.io.Serializable serializable7 = serializableConstantInitializer1.get();
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
    public void ConstantInitializer517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer517");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        java.lang.String str6 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass7 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer8 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass7);
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
    public void ConstantInitializer518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer518");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1));
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        java.lang.Class<?> wildcardClass3 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (-1) + "'", serializable2.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void ConstantInitializer519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer519");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) -1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer6 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer5);
        boolean boolean7 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer5);
        java.lang.Class<?> wildcardClass8 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (-1.0d) + "'", serializable2.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ConstantInitializer520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer520");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass4 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.GenericDeclaration> genericDeclarationConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass4);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer6 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass4);
        java.io.Serializable serializable7 = serializableConstantInitializer6.get();
        java.io.Serializable serializable8 = serializableConstantInitializer6.get();
        java.lang.Class<?> wildcardClass9 = serializable8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ConstantInitializer521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer521");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 0.0d);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.lang.String str4 = serializableConstantInitializer3.toString();
        boolean boolean5 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer3);
        java.io.Serializable serializable6 = serializableConstantInitializer3.getObject();
        java.lang.Class<?> wildcardClass7 = serializableConstantInitializer3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (-1.0d) + "'", serializable6.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ConstantInitializer522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer522");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        boolean boolean6 = serializableConstantInitializer1.equals((java.lang.Object) 1.0f);
        java.lang.String str7 = serializableConstantInitializer1.toString();
        java.lang.String str8 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass9 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ConstantInitializer523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer523");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        boolean boolean5 = serializableConstantInitializer1.equals((java.lang.Object) (short) 1);
        java.io.Serializable serializable6 = serializableConstantInitializer1.get();
        java.lang.String str7 = serializableConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + 100.0d + "'", serializable3.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + 100.0d + "'", serializable6.equals(100.0d));
    }

    @Test
    public void ConstantInitializer524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer524");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        boolean boolean7 = serializableConstantInitializer1.equals((java.lang.Object) "hi!");
        java.io.Serializable serializable8 = serializableConstantInitializer1.getObject();
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
    public void ConstantInitializer525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer525");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        boolean boolean3 = serializableConstantInitializer1.equals((java.lang.Object) (short) 10);
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = serializableConstantInitializer1.equals(obj4);
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        java.lang.String str7 = serializableConstantInitializer1.toString();
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer8 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable6);
    }

    @Test
    public void ConstantInitializer526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer526");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable4);
        boolean boolean6 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer5);
        java.lang.String str7 = serializableConstantInitializer1.toString();
        java.lang.String str8 = serializableConstantInitializer1.toString();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer9 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void ConstantInitializer527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer527");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) -1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
        java.lang.Class<?> wildcardClass3 = serializableConstantInitializerConstantInitializer2.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass3);
        java.lang.String str5 = serializableConstantInitializer4.toString();
        java.io.Serializable serializable6 = serializableConstantInitializer4.get();
        java.lang.String str7 = serializableConstantInitializer4.toString();
        java.lang.Class<?> wildcardClass8 = serializableConstantInitializer4.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.AnnotatedElement> annotatedElementConstantInitializer9 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.AnnotatedElement>((java.lang.reflect.AnnotatedElement) wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ConstantInitializer528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer528");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.lang.String str5 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass6 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.GenericDeclaration> genericDeclarationConstantInitializer7 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (-1.0d) + "'", serializable2.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1.0d) + "'", serializable3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (-1.0d) + "'", serializable4.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ConstantInitializer529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer529");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.lang.Class<?> wildcardClass6 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (-1.0d) + "'", serializable4.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ConstantInitializer530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer530");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable4);
        boolean boolean6 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer5);
        java.io.Serializable serializable7 = serializableConstantInitializer1.getObject();
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
    public void ConstantInitializer531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer531");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        boolean boolean5 = serializableConstantInitializer1.equals((java.lang.Object) 0L);
        java.io.Serializable serializable6 = serializableConstantInitializer1.get();
        java.io.Serializable serializable7 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable7);
    }

    @Test
    public void ConstantInitializer532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer532");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 0.0f);
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        java.lang.Class<?> wildcardClass3 = serializable2.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable2);
        java.lang.Class<?> wildcardClass5 = serializable2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + 0.0f + "'", serializable2.equals(0.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void ConstantInitializer533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer533");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1));
        boolean boolean3 = serializableConstantInitializer1.equals((java.lang.Object) 10);
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        java.lang.Class<?> wildcardClass5 = serializable4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (-1) + "'", serializable4.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void ConstantInitializer534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer534");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.lang.String str4 = serializableConstantInitializer3.toString();
        java.io.Serializable serializable5 = serializableConstantInitializer3.getObject();
        java.lang.String str6 = serializableConstantInitializer3.toString();
        java.io.Serializable serializable7 = serializableConstantInitializer3.getObject();
        boolean boolean8 = serializableConstantInitializer1.equals((java.lang.Object) serializable7);
        java.io.Serializable serializable9 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + (-1.0d) + "'", serializable7.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable9 + "' != '" + (-1) + "'", serializable9.equals((-1)));
    }

    @Test
    public void ConstantInitializer535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer535");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) true);
        java.lang.Class<?> wildcardClass2 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void ConstantInitializer536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer536");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
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
    public void ConstantInitializer537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer537");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) "");
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        java.lang.Class<?> wildcardClass6 = serializable5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + "" + "'", serializable3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + "" + "'", serializable5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ConstantInitializer538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer538");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
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
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable8);
    }

    @Test
    public void ConstantInitializer539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer539");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        java.lang.Class<?> wildcardClass5 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer6 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass5);
        java.lang.String str7 = serializableConstantInitializer6.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + 100.0d + "'", serializable4.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void ConstantInitializer540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer540");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) -1);
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.lang.String str6 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable7 = serializableConstantInitializer1.getObject();
        java.lang.Class<?> wildcardClass8 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer9 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass8);
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
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ConstantInitializer541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer541");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1));
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        java.lang.Class<?> wildcardClass3 = serializable2.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass3);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass3);
        java.io.Serializable serializable6 = serializableConstantInitializer5.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (-1) + "'", serializable2.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
    }

    @Test
    public void ConstantInitializer542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer542");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        boolean boolean3 = serializableConstantInitializer1.equals((java.lang.Object) (short) 10);
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = serializableConstantInitializer1.equals(obj4);
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
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
    public void ConstantInitializer543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer543");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable7 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable8 = serializableConstantInitializer1.getObject();
        java.lang.String str9 = serializableConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + 100.0d + "'", serializable4.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + 100.0d + "'", serializable5.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + 100.0d + "'", serializable6.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + 100.0d + "'", serializable7.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + 100.0d + "'", serializable8.equals(100.0d));
    }

    @Test
    public void ConstantInitializer544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer544");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) -1);
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (short) -1 + "'", serializable2.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (short) -1 + "'", serializable4.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (short) -1 + "'", serializable5.equals((short) -1));
    }

    @Test
    public void ConstantInitializer545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer545");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        java.lang.String str5 = serializableConstantInitializer1.toString();
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer6 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
        java.lang.String str7 = serializableConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + 100.0d + "'", serializable4.equals(100.0d));
    }

    @Test
    public void ConstantInitializer546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer546");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer4);
        java.lang.Class<?> wildcardClass6 = serializableConstantInitializer4.getClass();
        boolean boolean7 = serializableConstantInitializer1.equals((java.lang.Object) wildcardClass6);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer8 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass6);
        java.lang.String str9 = serializableConstantInitializer8.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void ConstantInitializer547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer547");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable7 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable7);
    }

    @Test
    public void ConstantInitializer548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer548");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer4);
        java.lang.Class<?> wildcardClass6 = serializableConstantInitializer4.getClass();
        boolean boolean7 = serializableConstantInitializer1.equals((java.lang.Object) wildcardClass6);
        java.io.Serializable serializable8 = serializableConstantInitializer1.getObject();
        java.lang.Class<?> wildcardClass9 = serializable8.getClass();
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
    public void ConstantInitializer549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer549");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.lang.String str6 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable7 = serializableConstantInitializer1.get();
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
    }

    @Test
    public void ConstantInitializer550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer550");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0f));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (-1.0f) + "'", serializable2.equals((-1.0f)));
    }

    @Test
    public void ConstantInitializer551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer551");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        java.lang.Object obj3 = null;
        boolean boolean4 = serializableConstantInitializer1.equals(obj3);
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable7 = serializableConstantInitializer1.get();
        java.io.Serializable serializable8 = serializableConstantInitializer1.get();
        java.lang.Class<?> wildcardClass9 = serializable8.getClass();
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
    public void ConstantInitializer552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer552");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.lang.String str6 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable7 = serializableConstantInitializer1.getObject();
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
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + (-1.0d) + "'", serializable7.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + (-1.0d) + "'", serializable8.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer553");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 0.0d);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.lang.String str4 = serializableConstantInitializer3.toString();
        boolean boolean5 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer3);
        java.lang.String str6 = serializableConstantInitializer3.toString();
        java.lang.String str7 = serializableConstantInitializer3.toString();
        java.io.Serializable serializable8 = serializableConstantInitializer3.get();
        java.io.Serializable serializable9 = serializableConstantInitializer3.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + (-1.0d) + "'", serializable8.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable9 + "' != '" + (-1.0d) + "'", serializable9.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer554");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) ' ');
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + ' ' + "'", serializable4.equals(' '));
    }

    @Test
    public void ConstantInitializer555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer555");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
        java.lang.Class<?> wildcardClass4 = serializableConstantInitializerConstantInitializer3.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.AnnotatedElement> annotatedElementConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.AnnotatedElement>((java.lang.reflect.AnnotatedElement) wildcardClass4);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer6 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass4);
        java.io.Serializable serializable7 = serializableConstantInitializer6.get();
        java.lang.String str8 = serializableConstantInitializer6.toString();
        java.lang.Class<?> wildcardClass9 = serializableConstantInitializer6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ConstantInitializer556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer556");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) ' ');
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.lang.Class<?> wildcardClass5 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.GenericDeclaration> genericDeclarationConstantInitializer6 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + ' ' + "'", serializable4.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void ConstantInitializer557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer557");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
        boolean boolean5 = serializableConstantInitializer1.equals((java.lang.Object) (byte) 1);
        boolean boolean7 = serializableConstantInitializer1.equals((java.lang.Object) ' ');
        java.lang.String str8 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass9 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ConstantInitializer558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer558");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        java.lang.Object obj3 = null;
        boolean boolean4 = serializableConstantInitializer1.equals(obj3);
        java.lang.String str5 = serializableConstantInitializer1.toString();
        boolean boolean7 = serializableConstantInitializer1.equals((java.lang.Object) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void ConstantInitializer559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer559");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        boolean boolean5 = serializableConstantInitializer1.equals((java.lang.Object) (short) 1);
        java.io.Serializable serializable6 = serializableConstantInitializer1.get();
        java.io.Serializable serializable7 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + 100.0d + "'", serializable3.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + 100.0d + "'", serializable6.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + 100.0d + "'", serializable7.equals(100.0d));
    }

    @Test
    public void ConstantInitializer560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer560");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) ' ');
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + ' ' + "'", serializable2.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + ' ' + "'", serializable3.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + ' ' + "'", serializable4.equals(' '));
    }

    @Test
    public void ConstantInitializer561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer561");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable6 = serializableConstantInitializer1.get();
        java.lang.String str7 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable8 = serializableConstantInitializer1.getObject();
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
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + (-1.0d) + "'", serializable8.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable9 + "' != '" + (-1.0d) + "'", serializable9.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer562");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 0.0d);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.lang.String str4 = serializableConstantInitializer3.toString();
        boolean boolean5 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer3);
        java.lang.String str6 = serializableConstantInitializer3.toString();
        java.lang.String str7 = serializableConstantInitializer3.toString();
        java.lang.String str8 = serializableConstantInitializer3.toString();
        java.io.Serializable serializable9 = serializableConstantInitializer3.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable9 + "' != '" + (-1.0d) + "'", serializable9.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer563");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable7 = serializableConstantInitializer1.get();
        java.lang.Class<?> wildcardClass8 = serializableConstantInitializer1.getClass();
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
    public void ConstantInitializer564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer564");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) 100.0d);
        java.lang.Class<?> wildcardClass2 = objConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass2);
        java.io.Serializable serializable4 = serializableConstantInitializer3.get();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer6 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 0.0f);
        java.io.Serializable serializable7 = serializableConstantInitializer6.getObject();
        boolean boolean8 = serializableConstantInitializer3.equals((java.lang.Object) serializableConstantInitializer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + 0.0f + "'", serializable7.equals(0.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void ConstantInitializer565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer565");
        org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.io.Serializable> serializableConcurrentInitializer0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.io.Serializable>> serializableConcurrentInitializerConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.io.Serializable>>(serializableConcurrentInitializer0);
        java.lang.Class<?> wildcardClass2 = serializableConcurrentInitializerConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.GenericDeclaration> genericDeclarationConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass2);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.GenericDeclaration> genericDeclarationConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void ConstantInitializer566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer566");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 10L);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.lang.Class<?> wildcardClass6 = serializable5.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer7 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable5);
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
    public void ConstantInitializer567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer567");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        boolean boolean3 = serializableConstantInitializer1.equals((java.lang.Object) (short) 10);
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = serializableConstantInitializer1.equals(obj4);
        java.io.Serializable serializable6 = serializableConstantInitializer1.get();
        java.lang.String str7 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable8 = serializableConstantInitializer1.getObject();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable8);
    }

    @Test
    public void ConstantInitializer568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer568");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) -1);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer7 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializable6);
        java.lang.Class<?> wildcardClass8 = objConstantInitializer7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (short) -1 + "'", serializable3.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (short) -1 + "'", serializable4.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (short) -1 + "'", serializable5.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (short) -1 + "'", serializable6.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ConstantInitializer569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer569");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer6 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) ' ');
        java.io.Serializable serializable7 = serializableConstantInitializer6.getObject();
        boolean boolean8 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer6);
        java.lang.Class<?> wildcardClass9 = serializableConstantInitializer6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (-1.0d) + "'", serializable2.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1.0d) + "'", serializable3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (-1.0d) + "'", serializable4.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + ' ' + "'", serializable7.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ConstantInitializer570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer570");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass5 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer6 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass5);
        java.io.Serializable serializable7 = serializableConstantInitializer6.getObject();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer8 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable7);
        java.lang.Class<?> wildcardClass9 = serializableConstantInitializer8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1.0d) + "'", serializable3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ConstantInitializer571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer571");
        java.lang.reflect.AnnotatedElement annotatedElement0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.AnnotatedElement> annotatedElementConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.AnnotatedElement>(annotatedElement0);
    }

    @Test
    public void ConstantInitializer572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer572");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) ' ');
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        java.lang.Class<?> wildcardClass7 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.GenericDeclaration> genericDeclarationConstantInitializer8 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass7);
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
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ConstantInitializer573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer573");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.lang.String str5 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass6 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (-1.0d) + "'", serializable2.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1.0d) + "'", serializable3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ConstantInitializer574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer574");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 0.0f);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) -1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer3);
        java.lang.String str5 = serializableConstantInitializer3.toString();
        boolean boolean6 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer3);
        java.io.Serializable serializable7 = serializableConstantInitializer3.get();
        java.lang.String str8 = serializableConstantInitializer3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + (short) -1 + "'", serializable7.equals((short) -1));
    }

    @Test
    public void ConstantInitializer575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer575");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        java.lang.Object obj3 = null;
        boolean boolean4 = serializableConstantInitializer1.equals(obj3);
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.lang.String str6 = serializableConstantInitializer1.toString();
        java.lang.String str7 = serializableConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer576");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        boolean boolean3 = serializableConstantInitializer1.equals((java.lang.Object) (short) 10);
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        java.io.Serializable serializable6 = serializableConstantInitializer1.get();
        java.lang.String str7 = serializableConstantInitializer1.toString();
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
    public void ConstantInitializer577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer577");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        boolean boolean5 = serializableConstantInitializer1.equals((java.lang.Object) (short) 1);
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        java.lang.String str7 = serializableConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + 100.0d + "'", serializable3.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + 100.0d + "'", serializable6.equals(100.0d));
    }

    @Test
    public void ConstantInitializer578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer578");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 0.0d);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.lang.String str4 = serializableConstantInitializer3.toString();
        boolean boolean5 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer3);
        java.io.Serializable serializable6 = serializableConstantInitializer1.get();
        java.lang.String str7 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable8 = serializableConstantInitializer1.get();
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.io.Serializable>> serializableConcurrentInitializerConstantInitializer9 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.io.Serializable>>((org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.io.Serializable>) serializableConstantInitializer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + 0.0d + "'", serializable6.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + 0.0d + "'", serializable8.equals(0.0d));
    }

    @Test
    public void ConstantInitializer579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer579");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.lang.String str5 = serializableConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (-1.0d) + "'", serializable2.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (-1.0d) + "'", serializable4.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer580");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) -1);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass3 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.AnnotatedElement> annotatedElementConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.AnnotatedElement>((java.lang.reflect.AnnotatedElement) wildcardClass3);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass3);
        java.lang.Class<?> wildcardClass6 = serializableConstantInitializer5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ConstantInitializer581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer581");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (byte) -1);
    }

    @Test
    public void ConstantInitializer582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer582");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        boolean boolean3 = serializableConstantInitializer1.equals((java.lang.Object) (short) 10);
        boolean boolean5 = serializableConstantInitializer1.equals((java.lang.Object) 0);
        java.io.Serializable serializable6 = serializableConstantInitializer1.get();
        java.io.Serializable serializable7 = serializableConstantInitializer1.get();
        java.lang.Class<?> wildcardClass8 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void ConstantInitializer583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer583");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) '4');
        boolean boolean6 = serializableConstantInitializer1.equals((java.lang.Object) '4');
        java.io.Serializable serializable7 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + 100.0d + "'", serializable7.equals(100.0d));
    }

    @Test
    public void ConstantInitializer584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer584");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) ' ');
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.lang.Class<?> wildcardClass4 = serializable3.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass4);
        java.io.Serializable serializable6 = serializableConstantInitializer5.get();
        java.lang.String str7 = serializableConstantInitializer5.toString();
        java.io.Serializable serializable8 = serializableConstantInitializer5.get();
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
    public void ConstantInitializer585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer585");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) "");
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.lang.String str5 = serializableConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + "" + "'", serializable3.equals(""));
    }

    @Test
    public void ConstantInitializer586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer586");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        java.io.Serializable serializable6 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + 100.0d + "'", serializable4.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + 100.0d + "'", serializable5.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + 100.0d + "'", serializable6.equals(100.0d));
    }

    @Test
    public void ConstantInitializer587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer587");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
        java.lang.Class<?> wildcardClass4 = serializableConstantInitializerConstantInitializer3.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.AnnotatedElement> annotatedElementConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.AnnotatedElement>((java.lang.reflect.AnnotatedElement) wildcardClass4);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer6 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass4);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer7 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass4);
        java.io.Serializable serializable8 = serializableConstantInitializer7.getObject();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer9 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable8);
    }

    @Test
    public void ConstantInitializer588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer588");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
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
    public void ConstantInitializer589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer589");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass5 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer6 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass5);
        java.io.Serializable serializable7 = serializableConstantInitializer6.getObject();
        java.lang.String str8 = serializableConstantInitializer6.toString();
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
    public void ConstantInitializer590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer590");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        java.io.Serializable serializable6 = serializableConstantInitializer1.get();
        java.io.Serializable serializable7 = serializableConstantInitializer1.get();
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
    public void ConstantInitializer591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer591");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        boolean boolean7 = serializableConstantInitializer1.equals((java.lang.Object) 1.0d);
        java.io.Serializable serializable8 = serializableConstantInitializer1.get();
        java.io.Serializable serializable9 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + 100.0d + "'", serializable4.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + 100.0d + "'", serializable5.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + 100.0d + "'", serializable8.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable9 + "' != '" + 100.0d + "'", serializable9.equals(100.0d));
    }

    @Test
    public void ConstantInitializer592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer592");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.lang.Class<?> wildcardClass5 = serializable4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + 100.0d + "'", serializable4.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void ConstantInitializer593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer593");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) -1);
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        java.lang.String str5 = serializableConstantInitializer1.toString();
        java.lang.String str6 = serializableConstantInitializer1.toString();
        java.lang.String str7 = serializableConstantInitializer1.toString();
        java.lang.String str8 = serializableConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (short) -1 + "'", serializable2.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (short) -1 + "'", serializable3.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (short) -1 + "'", serializable4.equals((short) -1));
    }

    @Test
    public void ConstantInitializer594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer594");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        boolean boolean6 = serializableConstantInitializer1.equals((java.lang.Object) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (-1.0d) + "'", serializable2.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1.0d) + "'", serializable3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (-1.0d) + "'", serializable4.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void ConstantInitializer595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer595");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.Class<?> wildcardClass2 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass2);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass2);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass2);
        java.lang.Class<?> wildcardClass6 = serializableConstantInitializer5.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer7 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass6);
        java.io.Serializable serializable8 = serializableConstantInitializer7.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable8);
    }

    @Test
    public void ConstantInitializer596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer596");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
        boolean boolean5 = serializableConstantInitializer1.equals((java.lang.Object) (byte) 1);
        java.lang.String str6 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable7 = serializableConstantInitializer1.get();
        java.io.Serializable serializable8 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + (-1.0d) + "'", serializable7.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + (-1.0d) + "'", serializable8.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer597");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.lang.Object obj5 = null;
        boolean boolean6 = serializableConstantInitializer1.equals(obj5);
        java.io.Serializable serializable7 = serializableConstantInitializer1.getObject();
        java.lang.Class<?> wildcardClass8 = serializable7.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.AnnotatedElement> annotatedElementConstantInitializer9 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.AnnotatedElement>((java.lang.reflect.AnnotatedElement) wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + (-1.0d) + "'", serializable7.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ConstantInitializer598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer598");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) ' ');
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.lang.Class<?> wildcardClass4 = serializable3.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass4);
        java.io.Serializable serializable6 = serializableConstantInitializer5.get();
        java.io.Serializable serializable7 = serializableConstantInitializer5.getObject();
        java.io.Serializable serializable8 = serializableConstantInitializer5.get();
        java.lang.String str9 = serializableConstantInitializer5.toString();
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
    }

    @Test
    public void ConstantInitializer599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer599");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        boolean boolean3 = serializableConstantInitializer1.equals((java.lang.Object) (short) 10);
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer6 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (byte) 1);
        boolean boolean7 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer6);
        java.io.Serializable serializable8 = serializableConstantInitializer1.getObject();
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
    public void ConstantInitializer600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer600");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        boolean boolean3 = serializableConstantInitializer1.equals((java.lang.Object) (short) 10);
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        java.lang.Class<?> wildcardClass6 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer7 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass6);
        java.io.Serializable serializable8 = serializableConstantInitializer7.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable8);
    }

    @Test
    public void ConstantInitializer601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer601");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass2);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.GenericDeclaration> genericDeclarationConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass2);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass2);
        java.io.Serializable serializable6 = serializableConstantInitializer5.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
    }

    @Test
    public void ConstantInitializer602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer602");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        java.io.Serializable serializable6 = serializableConstantInitializer1.get();
        java.lang.String str7 = serializableConstantInitializer1.toString();
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
    public void ConstantInitializer603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer603");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) ' ');
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.lang.Class<?> wildcardClass4 = serializable3.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass4);
        java.io.Serializable serializable6 = serializableConstantInitializer5.get();
        java.io.Serializable serializable7 = serializableConstantInitializer5.getObject();
        java.lang.String str8 = serializableConstantInitializer5.toString();
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
    public void ConstantInitializer604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer604");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        java.lang.String str5 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable6 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable6);
    }

    @Test
    public void ConstantInitializer605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer605");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.lang.String str5 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable6 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1.0d) + "'", serializable3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (-1.0d) + "'", serializable6.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer606");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 0.0d);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.lang.String str6 = serializableConstantInitializer5.toString();
        boolean boolean7 = serializableConstantInitializer3.equals((java.lang.Object) serializableConstantInitializer5);
        boolean boolean8 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void ConstantInitializer607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer607");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable5);
    }

    @Test
    public void ConstantInitializer608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer608");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) -1);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        java.lang.String str5 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (short) -1 + "'", serializable3.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (short) -1 + "'", serializable4.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (short) -1 + "'", serializable6.equals((short) -1));
    }

    @Test
    public void ConstantInitializer609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer609");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        java.lang.Class<?> wildcardClass6 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer7 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass6);
        java.io.Serializable serializable8 = serializableConstantInitializer7.get();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable8);
    }

    @Test
    public void ConstantInitializer610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer610");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 0.0d);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.lang.String str4 = serializableConstantInitializer3.toString();
        boolean boolean5 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer3);
        java.io.Serializable serializable6 = serializableConstantInitializer1.get();
        java.lang.String str7 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable8 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable9 = serializableConstantInitializer1.get();
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
    public void ConstantInitializer611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer611");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.lang.String str5 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass6 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.AnnotatedElement> annotatedElementConstantInitializer7 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.AnnotatedElement>((java.lang.reflect.AnnotatedElement) wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1.0d) + "'", serializable3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ConstantInitializer612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer612");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        java.lang.String str7 = serializableConstantInitializer1.toString();
        java.lang.String str8 = serializableConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + 100.0d + "'", serializable4.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + 100.0d + "'", serializable5.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + 100.0d + "'", serializable6.equals(100.0d));
    }

    @Test
    public void ConstantInitializer613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer613");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.lang.Class<?> wildcardClass2 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass2);
        boolean boolean5 = serializableConstantInitializer3.equals((java.lang.Object) (short) 10);
        java.io.Serializable serializable6 = serializableConstantInitializer3.getObject();
        java.lang.String str7 = serializableConstantInitializer3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
    }

    @Test
    public void ConstantInitializer614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer614");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) -1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
        java.lang.Class<?> wildcardClass3 = serializableConstantInitializerConstantInitializer2.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass3);
        java.lang.String str5 = serializableConstantInitializer4.toString();
        java.io.Serializable serializable6 = serializableConstantInitializer4.getObject();
        java.io.Serializable serializable7 = serializableConstantInitializer4.getObject();
        java.lang.Class<?> wildcardClass8 = serializable7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ConstantInitializer615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer615");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) 100.0d);
        java.lang.Class<?> wildcardClass2 = objConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass2);
        java.lang.String str4 = serializableConstantInitializer3.toString();
        java.io.Serializable serializable5 = serializableConstantInitializer3.get();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer6 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable5);
    }

    @Test
    public void ConstantInitializer616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer616");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        java.lang.Object obj3 = null;
        boolean boolean4 = serializableConstantInitializer1.equals(obj3);
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        java.lang.Object obj7 = null;
        boolean boolean8 = serializableConstantInitializer1.equals(obj7);
        java.io.Serializable serializable9 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
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
    public void ConstantInitializer617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer617");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        java.lang.String str5 = serializableConstantInitializer1.toString();
        java.lang.String str6 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable7 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + 100.0d + "'", serializable4.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + 100.0d + "'", serializable7.equals(100.0d));
    }

    @Test
    public void ConstantInitializer618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer618");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.lang.Class<?> wildcardClass6 = serializable5.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer7 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass6);
        java.io.Serializable serializable8 = serializableConstantInitializer7.getObject();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable8);
    }

    @Test
    public void ConstantInitializer619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer619");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 0.0f);
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        java.lang.Class<?> wildcardClass3 = serializable2.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable2);
        java.io.Serializable serializable5 = serializableConstantInitializer4.get();
        java.io.Serializable serializable6 = serializableConstantInitializer4.getObject();
        java.io.Serializable serializable7 = serializableConstantInitializer4.get();
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
    public void ConstantInitializer620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer620");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        // The following exception was thrown during execution in ConstantInitializer generation
        try {
            java.lang.Class<?> wildcardClass4 = serializable3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
    }

    @Test
    public void ConstantInitializer621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer621");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (byte) 1);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4.equals((byte) 1));
    }

    @Test
    public void ConstantInitializer622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer622");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        java.lang.String str5 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass6 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.Type> typeConstantInitializer7 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.Type>((java.lang.reflect.Type) wildcardClass6);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer8 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass6);
        java.io.Serializable serializable9 = serializableConstantInitializer8.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + 100.0d + "'", serializable4.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable9);
    }

    @Test
    public void ConstantInitializer623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer623");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) ' ');
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.lang.Class<?> wildcardClass4 = serializable3.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass4);
        java.io.Serializable serializable6 = serializableConstantInitializer5.get();
        java.io.Serializable serializable7 = serializableConstantInitializer5.getObject();
        java.io.Serializable serializable8 = serializableConstantInitializer5.getObject();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer9 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer5);
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
    }

    @Test
    public void ConstantInitializer624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer624");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        java.lang.String str5 = serializableConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable4);
    }

    @Test
    public void ConstantInitializer625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer625");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 0.0f);
        java.lang.Class<?> wildcardClass2 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass2);
        java.lang.String str4 = serializableConstantInitializer3.toString();
        java.lang.String str5 = serializableConstantInitializer3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void ConstantInitializer626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer626");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) "");
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + "" + "'", serializable3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + "" + "'", serializable4.equals(""));
    }

    @Test
    public void ConstantInitializer627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer627");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        java.lang.Object obj3 = null;
        boolean boolean4 = serializableConstantInitializer1.equals(obj3);
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        java.lang.String str6 = serializableConstantInitializer1.toString();
        java.lang.String str7 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass8 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ConstantInitializer628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer628");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass4 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.GenericDeclaration> genericDeclarationConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass4);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.AnnotatedElement> annotatedElementConstantInitializer6 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.AnnotatedElement>((java.lang.reflect.AnnotatedElement) wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ConstantInitializer629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer629");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) ' ');
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        boolean boolean8 = serializableConstantInitializer1.equals((java.lang.Object) true);
        java.io.Serializable serializable9 = serializableConstantInitializer1.get();
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
        org.junit.Assert.assertTrue("'" + serializable9 + "' != '" + ' ' + "'", serializable9.equals(' '));
    }

    @Test
    public void ConstantInitializer630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer630");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass5 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer6 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass5);
        java.io.Serializable serializable7 = serializableConstantInitializer6.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1.0d) + "'", serializable3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable7);
    }

    @Test
    public void ConstantInitializer631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer631");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer7 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
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
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + (-1.0d) + "'", serializable8.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable9 + "' != '" + (-1.0d) + "'", serializable9.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer632");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.lang.String str5 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass6 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer7 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass6);
        java.io.Serializable serializable8 = serializableConstantInitializer7.get();
        java.io.Serializable serializable9 = serializableConstantInitializer7.get();
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
    public void ConstantInitializer633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer633");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        boolean boolean3 = serializableConstantInitializer1.equals((java.lang.Object) (short) 10);
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = serializableConstantInitializer1.equals(obj4);
        java.io.Serializable serializable6 = serializableConstantInitializer1.get();
        java.io.Serializable serializable7 = serializableConstantInitializer1.get();
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
    public void ConstantInitializer634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer634");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass4 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass4);
        java.lang.String str6 = serializableConstantInitializer5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ConstantInitializer635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer635");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
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
    public void ConstantInitializer636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer636");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass5 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer6 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass5);
        java.io.Serializable serializable7 = serializableConstantInitializer6.getObject();
        java.lang.String str8 = serializableConstantInitializer6.toString();
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
    public void ConstantInitializer637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer637");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 0.0f);
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        java.lang.Class<?> wildcardClass3 = serializable2.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable2);
        java.lang.String str5 = serializableConstantInitializer4.toString();
        java.io.Serializable serializable6 = serializableConstantInitializer4.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + 0.0f + "'", serializable2.equals(0.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + 0.0f + "'", serializable6.equals(0.0f));
    }

    @Test
    public void ConstantInitializer638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer638");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.lang.String str5 = serializableConstantInitializer1.toString();
        java.lang.String str6 = serializableConstantInitializer1.toString();
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer7 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
        java.io.Serializable serializable8 = serializableConstantInitializer1.getObject();
        java.lang.String str9 = serializableConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (-1.0d) + "'", serializable2.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1.0d) + "'", serializable3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + (-1.0d) + "'", serializable8.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer639");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (byte) 100);
        java.lang.Class<?> wildcardClass2 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.Type> typeConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.Type>((java.lang.reflect.Type) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = typeConstantInitializer3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ConstantInitializer640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer640");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.lang.String str5 = serializableConstantInitializer1.toString();
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
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ConstantInitializer641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer641");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) ' ');
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.lang.String str5 = serializableConstantInitializer1.toString();
        java.lang.String str6 = serializableConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + ' ' + "'", serializable4.equals(' '));
    }

    @Test
    public void ConstantInitializer642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer642");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.lang.Object obj5 = null;
        boolean boolean6 = serializableConstantInitializer1.equals(obj5);
        java.io.Serializable serializable7 = serializableConstantInitializer1.get();
        java.io.Serializable serializable8 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + (-1.0d) + "'", serializable7.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + (-1.0d) + "'", serializable8.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer643");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) -1);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass3 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass3);
        java.io.Serializable serializable5 = serializableConstantInitializer4.get();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer6 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable5);
        java.lang.String str7 = serializableConstantInitializer6.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable5);
    }

    @Test
    public void ConstantInitializer644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer644");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        java.io.Serializable serializable6 = serializableConstantInitializer1.get();
        java.lang.String str7 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass8 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ConstantInitializer645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer645");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        boolean boolean6 = serializableConstantInitializer1.equals((java.lang.Object) 1.0f);
        java.io.Serializable serializable7 = serializableConstantInitializer1.get();
        java.io.Serializable serializable8 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable8);
    }

    @Test
    public void ConstantInitializer646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer646");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) ' ');
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.lang.Class<?> wildcardClass4 = serializable3.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass4);
        java.lang.String str6 = serializableConstantInitializer5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + ' ' + "'", serializable2.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + ' ' + "'", serializable3.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ConstantInitializer647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer647");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 0.0d);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.lang.String str4 = serializableConstantInitializer3.toString();
        boolean boolean5 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer3);
        java.lang.String str6 = serializableConstantInitializer3.toString();
        java.lang.Class<?> wildcardClass7 = serializableConstantInitializer3.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer8 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ConstantInitializer648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer648");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        java.lang.Object obj3 = null;
        boolean boolean4 = serializableConstantInitializer1.equals(obj3);
        java.lang.Class<?> wildcardClass5 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer6 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass5);
        java.lang.Class<?> wildcardClass7 = serializableConstantInitializer6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ConstantInitializer649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer649");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1));
        boolean boolean3 = serializableConstantInitializer1.equals((java.lang.Object) 10);
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable6 = serializableConstantInitializer1.get();
        java.io.Serializable serializable7 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1) + "'", serializable5.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (-1) + "'", serializable6.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + (-1) + "'", serializable7.equals((-1)));
    }

    @Test
    public void ConstantInitializer650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer650");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) ' ');
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable6 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + ' ' + "'", serializable5.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + ' ' + "'", serializable6.equals(' '));
    }

    @Test
    public void ConstantInitializer651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer651");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable7 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable8 = serializableConstantInitializer1.get();
        java.lang.String str9 = serializableConstantInitializer1.toString();
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
    public void ConstantInitializer652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer652");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        boolean boolean5 = serializableConstantInitializer1.equals((java.lang.Object) 0L);
        java.io.Serializable serializable6 = serializableConstantInitializer1.get();
        java.lang.String str7 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable8 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable8);
    }

    @Test
    public void ConstantInitializer653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer653");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) ' ');
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + ' ' + "'", serializable4.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + ' ' + "'", serializable5.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + ' ' + "'", serializable6.equals(' '));
    }

    @Test
    public void ConstantInitializer654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer654");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 0.0f);
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        java.lang.Class<?> wildcardClass3 = serializable2.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass3);
        java.io.Serializable serializable5 = serializableConstantInitializer4.getObject();
        java.io.Serializable serializable6 = serializableConstantInitializer4.getObject();
        java.lang.Class<?> wildcardClass7 = serializable6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + 0.0f + "'", serializable2.equals(0.0f));
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
    public void ConstantInitializer655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer655");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.lang.String str5 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable7 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1.0d) + "'", serializable3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (-1.0d) + "'", serializable6.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + (-1.0d) + "'", serializable7.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer656");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        java.lang.String str5 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass6 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.Type> typeConstantInitializer7 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.Type>((java.lang.reflect.Type) wildcardClass6);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.GenericDeclaration> genericDeclarationConstantInitializer8 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass6);
        java.lang.Class<?> wildcardClass9 = genericDeclarationConstantInitializer8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + 100.0d + "'", serializable4.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ConstantInitializer657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer657");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        boolean boolean6 = serializableConstantInitializer1.equals((java.lang.Object) 10.0f);
        java.lang.Class<?> wildcardClass7 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1.0d) + "'", serializable3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ConstantInitializer658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer658");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        java.lang.Class<?> wildcardClass3 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass3);
        java.io.Serializable serializable5 = serializableConstantInitializer4.getObject();
        java.lang.Class<?> wildcardClass6 = serializableConstantInitializer4.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer7 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass6);
        java.io.Serializable serializable8 = serializableConstantInitializer7.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable8);
    }

    @Test
    public void ConstantInitializer659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer659");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        java.lang.Object obj3 = null;
        boolean boolean4 = serializableConstantInitializer1.equals(obj3);
        java.lang.String str5 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass6 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.AnnotatedElement> annotatedElementConstantInitializer7 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.AnnotatedElement>((java.lang.reflect.AnnotatedElement) wildcardClass6);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer8 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass6);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.Type> typeConstantInitializer9 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.Type>((java.lang.reflect.Type) wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ConstantInitializer660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer660");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) ' ');
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        java.lang.String str5 = serializableConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + ' ' + "'", serializable2.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + ' ' + "'", serializable3.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + ' ' + "'", serializable4.equals(' '));
    }

    @Test
    public void ConstantInitializer661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer661");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) 100.0d);
        java.lang.Class<?> wildcardClass2 = objConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass2);
        java.io.Serializable serializable4 = serializableConstantInitializer3.get();
        java.io.Serializable serializable5 = serializableConstantInitializer3.get();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer6 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable5);
    }

    @Test
    public void ConstantInitializer662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer662");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        boolean boolean6 = serializableConstantInitializer1.equals((java.lang.Object) 10.0f);
        java.io.Serializable serializable7 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1.0d) + "'", serializable3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + (-1.0d) + "'", serializable7.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer663");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) -1);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        java.io.Serializable serializable6 = serializableConstantInitializer1.get();
        java.io.Serializable serializable7 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable8 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable9 = serializableConstantInitializer1.get();
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
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + (short) -1 + "'", serializable8.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable9 + "' != '" + (short) -1 + "'", serializable9.equals((short) -1));
    }

    @Test
    public void ConstantInitializer664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer664");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        boolean boolean3 = serializableConstantInitializer1.equals((java.lang.Object) (short) 10);
        boolean boolean5 = serializableConstantInitializer1.equals((java.lang.Object) 0);
        java.io.Serializable serializable6 = serializableConstantInitializer1.get();
        java.io.Serializable serializable7 = serializableConstantInitializer1.get();
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
    public void ConstantInitializer665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer665");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1L));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.String str4 = serializableConstantInitializer3.toString();
        java.lang.String str5 = serializableConstantInitializer3.toString();
        boolean boolean6 = serializableConstantInitializer1.equals((java.lang.Object) str5);
        java.lang.String str7 = serializableConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void ConstantInitializer666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer666");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) -1);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer6 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1));
        java.io.Serializable serializable7 = serializableConstantInitializer6.get();
        boolean boolean8 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer6);
        java.io.Serializable serializable9 = serializableConstantInitializer6.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (short) -1 + "'", serializable3.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (short) -1 + "'", serializable4.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + (-1) + "'", serializable7.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable9 + "' != '" + (-1) + "'", serializable9.equals((-1)));
    }

    @Test
    public void ConstantInitializer667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer667");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
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
    public void ConstantInitializer668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer668");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        java.lang.Object obj3 = null;
        boolean boolean4 = serializableConstantInitializer1.equals(obj3);
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        java.lang.String str7 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable8 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (-1.0d) + "'", serializable6.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + (-1.0d) + "'", serializable8.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer669");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
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
    public void ConstantInitializer670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer670");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) -1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
        java.lang.Class<?> wildcardClass3 = serializableConstantInitializerConstantInitializer2.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass3);
        java.lang.String str5 = serializableConstantInitializer4.toString();
        java.io.Serializable serializable6 = serializableConstantInitializer4.getObject();
        java.io.Serializable serializable7 = serializableConstantInitializer4.getObject();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer8 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable7);
        java.io.Serializable serializable9 = serializableConstantInitializer8.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable9);
    }

    @Test
    public void ConstantInitializer671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer671");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100);
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + 100 + "'", serializable2.equals(100));
    }

    @Test
    public void ConstantInitializer672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer672");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        boolean boolean5 = serializableConstantInitializer1.equals((java.lang.Object) 0L);
        java.io.Serializable serializable6 = serializableConstantInitializer1.get();
        java.lang.Class<?> wildcardClass7 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.Type> typeConstantInitializer8 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.Type>((java.lang.reflect.Type) wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ConstantInitializer673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer673");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) ' ');
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.lang.Class<?> wildcardClass5 = serializable4.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer6 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + ' ' + "'", serializable4.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void ConstantInitializer674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer674");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) "");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer3);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer3);
        java.lang.Class<?> wildcardClass6 = serializableConstantInitializer3.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.GenericDeclaration> genericDeclarationConstantInitializer7 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass6);
        boolean boolean8 = serializableConstantInitializer1.equals((java.lang.Object) wildcardClass6);
        java.io.Serializable serializable9 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable9 + "' != '" + "" + "'", serializable9.equals(""));
    }

    @Test
    public void ConstantInitializer675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer675");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        boolean boolean6 = serializableConstantInitializer1.equals((java.lang.Object) 1.0f);
        java.io.Serializable serializable7 = serializableConstantInitializer1.get();
        java.io.Serializable serializable8 = serializableConstantInitializer1.get();
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer9 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable8);
    }

    @Test
    public void ConstantInitializer676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer676");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) ' ');
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        java.io.Serializable serializable6 = serializableConstantInitializer1.get();
        java.lang.Class<?> wildcardClass7 = serializable6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + ' ' + "'", serializable2.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + ' ' + "'", serializable3.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + ' ' + "'", serializable5.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + ' ' + "'", serializable6.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ConstantInitializer677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer677");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        java.lang.Class<?> wildcardClass5 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer6 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass5);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer7 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass5);
        java.io.Serializable serializable8 = serializableConstantInitializer7.getObject();
        java.lang.Class<?> wildcardClass9 = serializableConstantInitializer7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + 100.0d + "'", serializable4.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ConstantInitializer678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer678");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) ' ');
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        java.lang.String str5 = serializableConstantInitializer1.toString();
        java.lang.String str6 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass7 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + ' ' + "'", serializable2.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + ' ' + "'", serializable3.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + ' ' + "'", serializable4.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ConstantInitializer679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer679");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass4 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.GenericDeclaration> genericDeclarationConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass4);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer6 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass4);
        java.io.Serializable serializable7 = serializableConstantInitializer6.get();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer8 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable7);
        java.lang.String str9 = serializableConstantInitializer8.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable7);
    }

    @Test
    public void ConstantInitializer680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer680");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 0.0d);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.lang.String str4 = serializableConstantInitializer3.toString();
        boolean boolean5 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer3);
        java.lang.Class<?> wildcardClass6 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ConstantInitializer681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer681");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 0.0f);
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        java.lang.Class<?> wildcardClass3 = serializable2.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass3);
        java.io.Serializable serializable5 = serializableConstantInitializer4.getObject();
        java.io.Serializable serializable6 = serializableConstantInitializer4.getObject();
        java.lang.String str7 = serializableConstantInitializer4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + 0.0f + "'", serializable2.equals(0.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
    }

    @Test
    public void ConstantInitializer682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer682");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) -1);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.lang.Class<?> wildcardClass4 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass4);
        java.lang.String str6 = serializableConstantInitializer5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (short) -1 + "'", serializable3.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ConstantInitializer683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.ConstantInitializer683");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.Type> typeConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.Type>((java.lang.reflect.Type) wildcardClass2);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass2);
        java.lang.Class<?> wildcardClass5 = serializableConstantInitializer4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }
}

