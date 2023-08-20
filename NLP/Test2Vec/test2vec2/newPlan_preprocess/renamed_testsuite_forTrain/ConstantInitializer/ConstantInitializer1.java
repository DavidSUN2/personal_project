
package ConstantInitializer;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ConstantInitializer1 {

    public static boolean debug = false;

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test501");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test502");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test503");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test504");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test505");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test506");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test507");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test508");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test509");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 0.0d);
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + 0.0d + "'", serializable2.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + 0.0d + "'", serializable3.equals(0.0d));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test510");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test511");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test512");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test513");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test514");
        java.lang.Comparable<java.lang.String> strComparable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Comparable<java.lang.String>> strComparableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Comparable<java.lang.String>>(strComparable0);
        java.lang.Class<?> wildcardClass2 = strComparableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test515");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test516");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test517");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test518");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test519");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test520");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test521");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test522");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test523");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test524");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test525");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test526");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test527");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test528");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test529");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test530");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test531");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test532");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test533");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test534");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test535");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) true);
        java.lang.Class<?> wildcardClass2 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test536");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test537");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test538");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test539");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test540");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test541");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test542");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test543");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test544");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test545");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test546");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test547");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test548");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test549");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test550");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0f));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (-1.0f) + "'", serializable2.equals((-1.0f)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test551");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test552");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test553");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test554");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) ' ');
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + ' ' + "'", serializable4.equals(' '));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test555");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test556");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test557");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test558");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test559");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test560");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test561");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test562");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test563");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test564");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test565");
        org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.io.Serializable> serializableConcurrentInitializer0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.io.Serializable>> serializableConcurrentInitializerConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.io.Serializable>>(serializableConcurrentInitializer0);
        java.lang.Class<?> wildcardClass2 = serializableConcurrentInitializerConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.GenericDeclaration> genericDeclarationConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass2);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.GenericDeclaration> genericDeclarationConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test566");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test567");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        boolean boolean3 = serializableConstantInitializer1.equals((java.lang.Object) (short) 10);
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = serializableConstantInitializer1.equals(obj4);
        java.io.Serializable serializable6 = serializableConstantInitializer1.get();
        java.lang.String str7 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable8 = serializableConstantInitializer1.getObject();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable8);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test568");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test569");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test570");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test571");
        java.lang.reflect.AnnotatedElement annotatedElement0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.AnnotatedElement> annotatedElementConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.AnnotatedElement>(annotatedElement0);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test572");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test573");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test574");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test575");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test576");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test577");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test578");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test579");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test580");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test581");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (byte) -1);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test582");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test583");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test584");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test585");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) "");
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.lang.String str5 = serializableConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + "" + "'", serializable3.equals(""));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test586");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test587");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test588");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test589");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test590");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test591");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test592");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test593");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test594");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test595");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test596");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test597");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test598");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test599");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test600");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test601");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test602");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test603");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test604");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test605");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test606");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test607");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test608");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test609");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test610");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test611");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test612");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test613");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test614");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test615");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test616");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test617");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test618");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test619");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test620");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        // The following exception was thrown during execution in test generation
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test621");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test622");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test623");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test624");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test625");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 0.0f);
        java.lang.Class<?> wildcardClass2 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass2);
        java.lang.String str4 = serializableConstantInitializer3.toString();
        java.lang.String str5 = serializableConstantInitializer3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test626");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test627");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test628");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test629");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test630");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test631");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test632");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test633");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test634");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test635");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test636");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test637");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test638");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test639");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test640");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test641");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test642");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test643");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test644");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test645");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test646");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test647");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test648");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test649");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test650");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test651");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test652");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test653");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test654");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test655");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test656");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test657");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test658");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test659");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test660");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test661");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test662");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test663");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test664");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test665");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test666");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test667");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test668");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test669");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test670");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test671");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100);
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + 100 + "'", serializable2.equals(100));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test672");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test673");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test674");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test675");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test676");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test677");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test678");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test679");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test680");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test681");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test682");
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
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer1.test683");
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

