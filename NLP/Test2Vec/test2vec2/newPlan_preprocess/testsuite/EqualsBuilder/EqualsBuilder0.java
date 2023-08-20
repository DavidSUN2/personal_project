package EqualsBuilder;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EqualsBuilder0 {

    public static boolean debug = false;

    @Test
    public void EqualsBuilder001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder001");
        boolean boolean3 = org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals((java.lang.Object) (-1.0f), (java.lang.Object) 100.0d, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void EqualsBuilder002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder002");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void EqualsBuilder003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder003");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        boolean boolean3 = org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals((java.lang.Object) 1, (java.lang.Object) (byte) 1, strArray2);
        java.lang.Class<?> wildcardClass4 = strArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void EqualsBuilder004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder004");
        java.util.Collection<java.lang.String> strCollection2 = null;
        boolean boolean3 = org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals((java.lang.Object) (short) -1, (java.lang.Object) (short) 0, strCollection2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void EqualsBuilder005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder005");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder5.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder3.append((java.lang.Object) (short) 0, (java.lang.Object) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder006");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((short) 10, (short) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append((double) (-1), (double) 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder007");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((int) '4', (int) (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append('a', '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder008");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(false, false);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((float) 'a', (float) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder009");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        boolean boolean7 = org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals((java.lang.Object) 1L, (java.lang.Object) true, (java.util.Collection<java.lang.String>) strList5);
        java.lang.Class<?> wildcardClass8 = strList5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void EqualsBuilder010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder010");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        short[] shortArray3 = new short[] { (byte) 10, (byte) -1 };
        short[] shortArray7 = new short[] { (short) 10, (byte) 0, (short) 1 };
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder0.append(shortArray3, shortArray7);
        java.lang.Class<?> wildcardClass9 = equalsBuilder8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void EqualsBuilder011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder011");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(false, false);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((short) 100, (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder012");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(false, false);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append((long) 1, (long) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder013");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((int) '4', (int) (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append((int) (short) 100, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder014");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((short) -1, (short) (byte) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((int) (byte) 1, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder015");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        double[] doubleArray1 = null;
        double[] doubleArray5 = new double[] { (short) 10, (short) -1, 0L };
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(doubleArray1, doubleArray5);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((double) (short) 10, 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder016");
        java.lang.Object obj1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        boolean boolean7 = org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals((java.lang.Object) (-1), obj1, (java.util.Collection<java.lang.String>) strList5);
        java.lang.Class<?> wildcardClass8 = strList5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void EqualsBuilder017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder017");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(' ', ' ');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append((int) (byte) 0, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder018");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((short) 10, (short) -1);
        java.lang.Class<?> wildcardClass7 = equalsBuilder6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EqualsBuilder019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder019");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((short) 10, (short) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append(true, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder020");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((short) 10, (short) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append(1, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder021");
        boolean boolean3 = org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals((java.lang.Object) 10.0f, (java.lang.Object) 0, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void EqualsBuilder022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder022");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((int) '4', (int) (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder0.appendSuper(false);
        equalsBuilder0.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
    }

    @Test
    public void EqualsBuilder023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder023");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(' ', ' ');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((float) (byte) 10, (float) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder024");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((int) '4', (int) (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder0.appendSuper(false);
        boolean boolean9 = equalsBuilder0.isEquals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void EqualsBuilder025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder025");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((long) '#', (-1L));
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append('4', 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder026");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(false, false);
        boolean boolean7 = equalsBuilder6.isEquals();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.appendSuper(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder027");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((short) -1, (short) (byte) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append((double) 1L, (double) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder028");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        char[] charArray4 = new char[] {};
        char[] charArray6 = new char[] { 'a' };
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder0.append(charArray4, charArray6);
        boolean boolean8 = equalsBuilder0.isEquals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void EqualsBuilder029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder029");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((short) 10, (short) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append((double) 0.0f, (double) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder030");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(' ', ' ');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append('#', '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder031");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((long) '#', (-1L));
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder3.append((int) (byte) 1, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder032");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        short[] shortArray3 = new short[] { (byte) 10, (byte) -1 };
        short[] shortArray7 = new short[] { (short) 10, (byte) 0, (short) 1 };
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder0.append(shortArray3, shortArray7);
        java.lang.Boolean boolean9 = equalsBuilder0.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void EqualsBuilder033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder033");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((long) '#', (-1L));
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((byte) 1, (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder034");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((long) '#', (-1L));
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder6.appendSuper(false);
        equalsBuilder6.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
    }

    @Test
    public void EqualsBuilder035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder035");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((int) '4', (int) (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append('a', 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder036");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((short) 1, (short) (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((long) (byte) 100, (long) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder037");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((short) 1, (short) (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append('#', ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder038");
        java.lang.Object obj0 = null;
        boolean boolean3 = org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals(obj0, (java.lang.Object) (-1.0d), false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void EqualsBuilder039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder039");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder1 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder4 = equalsBuilder1.append((byte) 0, (byte) 0);
        boolean[] booleanArray5 = new boolean[] {};
        boolean[] booleanArray6 = new boolean[] {};
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder1.append(booleanArray5, booleanArray6);
        boolean boolean9 = org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals((java.lang.Object) 0L, (java.lang.Object) booleanArray5, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void EqualsBuilder040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder040");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append(10.0f, (float) (short) 100);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder3.append('#', '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder041");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        char[] charArray4 = new char[] {};
        char[] charArray6 = new char[] { 'a' };
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder0.append(charArray4, charArray6);
        java.lang.Class<?> wildcardClass8 = equalsBuilder7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void EqualsBuilder042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder042");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((long) '#', (-1L));
        boolean boolean7 = equalsBuilder3.isEquals();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder3.appendSuper(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder043");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((float) 'a', (float) 100);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder3.append((double) ' ', (double) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder044");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append('#', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append(0.0d, (double) (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder045");
        java.lang.Object obj1 = null;
        boolean boolean3 = org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals((java.lang.Object) 1.0d, obj1, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void EqualsBuilder046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder046");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        double[] doubleArray1 = null;
        double[] doubleArray5 = new double[] { (short) 10, (short) -1, 0L };
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(doubleArray1, doubleArray5);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append('a', 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder047");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((long) '#', (-1L));
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append('#', 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder048");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(' ', ' ');
        java.lang.Class<?> wildcardClass7 = equalsBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EqualsBuilder049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder049");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((short) -1, (short) (byte) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append((float) (byte) 10, (float) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder050");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((long) (short) 0, 0L);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((double) 0.0f, 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder051");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((long) '#', (-1L));
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder6.appendSuper(false);
        boolean boolean9 = equalsBuilder6.isEquals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void EqualsBuilder052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder052");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((short) -1, (short) (byte) -1);
        equalsBuilder0.reset();
        equalsBuilder0.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
    }

    @Test
    public void EqualsBuilder053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder053");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder1 = new org.apache.commons.lang3.builder.EqualsBuilder();
        long[] longArray3 = new long[] { (-1L) };
        long[] longArray5 = new long[] { (short) 1 };
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder1.append(longArray3, longArray5);
        boolean boolean8 = org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals((java.lang.Object) (short) 0, (java.lang.Object) longArray5, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void EqualsBuilder054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder054");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append('#', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((long) (short) 1, (long) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder055");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((short) 1, (short) (byte) 0);
        boolean boolean7 = equalsBuilder6.isEquals();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.appendSuper(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder056");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((float) 'a', (float) 100);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((double) '#', (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder057");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((short) -1, (short) (byte) -1);
        java.lang.Class<?> wildcardClass7 = equalsBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EqualsBuilder058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder058");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(' ', ' ');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append((float) 1, (float) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder059");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((short) -1, (short) (byte) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append('a', '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder060");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((byte) 100, (byte) 10);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append('#', 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder061");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((short) 10, (short) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder6.appendSuper(false);
        boolean boolean9 = equalsBuilder8.isEquals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void EqualsBuilder062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder062");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        boolean[] booleanArray4 = new boolean[] {};
        boolean[] booleanArray5 = new boolean[] {};
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(booleanArray4, booleanArray5);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append((double) 100, (double) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder063");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append('#', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder3.append('a', '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder064");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        long[] longArray2 = new long[] { (-1L) };
        long[] longArray4 = new long[] { (short) 1 };
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.append(longArray2, longArray4);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder5.append((int) '4', (int) '#');
        equalsBuilder8.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
    }

    @Test
    public void EqualsBuilder065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder065");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((int) '4', (int) (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append(0, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder066");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((long) (short) 0, 0L);
        java.lang.Class<?> wildcardClass7 = equalsBuilder6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EqualsBuilder067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder067");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((float) 'a', (float) 100);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder3.append((float) 0, (float) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder068");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append('#', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append(true, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder069");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((short) 10, (short) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder6.appendSuper(false);
        boolean boolean9 = equalsBuilder6.isEquals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void EqualsBuilder070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder070");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        boolean[] booleanArray4 = new boolean[] {};
        boolean[] booleanArray5 = new boolean[] {};
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(booleanArray4, booleanArray5);
        java.lang.Class<?> wildcardClass7 = booleanArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EqualsBuilder071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder071");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(' ', ' ');
        java.lang.Boolean boolean7 = equalsBuilder6.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7.equals(true));
    }

    @Test
    public void EqualsBuilder072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder072");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((long) '#', (-1L));
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder6.appendSuper(false);
        java.lang.Class<?> wildcardClass9 = equalsBuilder8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void EqualsBuilder073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder073");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((short) 1, (short) (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append(' ', '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder074");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((long) '#', (-1L));
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append(100, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder075");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((short) 1, (short) (byte) 1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append((double) (short) 1, (double) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder076");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        char[] charArray4 = new char[] {};
        char[] charArray6 = new char[] { 'a' };
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder0.append(charArray4, charArray6);
        java.lang.Class<?> wildcardClass8 = charArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void EqualsBuilder077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder077");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((long) '#', (-1L));
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder3.append((double) (byte) 1, (double) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder078");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        boolean boolean7 = org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals((java.lang.Object) (short) 100, (java.lang.Object) (short) 1, (java.util.Collection<java.lang.String>) strList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void EqualsBuilder079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder079");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((int) '4', (int) (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append((int) 'a', (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder080");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        java.lang.Boolean boolean4 = equalsBuilder3.build();
        boolean boolean5 = equalsBuilder3.isEquals();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder3.append('#', 'a');
        java.lang.Class<?> wildcardClass9 = equalsBuilder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void EqualsBuilder081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder081");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((int) '4', (int) (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append((float) '#', (float) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder082");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        double[] doubleArray1 = null;
        double[] doubleArray5 = new double[] { (short) 10, (short) -1, 0L };
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(doubleArray1, doubleArray5);
        java.lang.String[] strArray8 = new java.lang.String[] {};
        boolean boolean9 = org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals((java.lang.Object) equalsBuilder0, (java.lang.Object) (short) 0, strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void EqualsBuilder083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder083");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((short) -1, (short) (byte) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((int) (short) -1, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder084");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((short) 1, (short) (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((-1L), (long) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder085");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        short[] shortArray3 = new short[] { (byte) 10, (byte) -1 };
        short[] shortArray7 = new short[] { (short) 10, (byte) 0, (short) 1 };
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder0.append(shortArray3, shortArray7);
        java.lang.Class<?> wildcardClass9 = shortArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void EqualsBuilder086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder086");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        boolean[] booleanArray4 = new boolean[] {};
        boolean[] booleanArray5 = new boolean[] {};
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(booleanArray4, booleanArray5);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((long) 0, (long) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder087");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(' ', ' ');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder6.appendSuper(false);
        java.lang.Boolean boolean9 = equalsBuilder8.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void EqualsBuilder088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder088");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append('#', 'a');
        boolean boolean7 = equalsBuilder3.isEquals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void EqualsBuilder089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder089");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        long[] longArray2 = new long[] { (-1L) };
        long[] longArray4 = new long[] { (short) 1 };
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.append(longArray2, longArray4);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder0.append((short) 1, (short) (byte) 1);
        java.lang.Class<?> wildcardClass9 = equalsBuilder8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void EqualsBuilder090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder090");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((int) '4', (int) (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder0.appendSuper(false);
        java.lang.Class<?> wildcardClass9 = equalsBuilder8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void EqualsBuilder091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder091");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        equalsBuilder0.reset();
        java.lang.Class<?> wildcardClass5 = equalsBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void EqualsBuilder092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder092");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((short) 10, (short) -1);
        boolean boolean9 = org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals((java.lang.Object) equalsBuilder6, (java.lang.Object) (short) 0, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void EqualsBuilder093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder093");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((short) -1, (short) (byte) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append((short) 1, (short) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder094");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append('#', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder6.appendSuper(false);
        boolean boolean9 = equalsBuilder6.isEquals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void EqualsBuilder095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder095");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        char[] charArray4 = new char[] {};
        char[] charArray6 = new char[] { 'a' };
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder0.append(charArray4, charArray6);
        java.lang.Class<?> wildcardClass8 = charArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void EqualsBuilder096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder096");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder1 = new org.apache.commons.lang3.builder.EqualsBuilder();
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        boolean boolean6 = org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals(obj0, (java.lang.Object) equalsBuilder1, (java.util.Collection<java.lang.String>) strList4);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder1.append((double) (byte) 100, 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder097");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(false, false);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append((int) (short) 0, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder098");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append('#', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder6.appendSuper(false);
        equalsBuilder8.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
    }

    @Test
    public void EqualsBuilder099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder099");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(false, false);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((byte) -1, (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder100");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder1 = new org.apache.commons.lang3.builder.EqualsBuilder();
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        boolean boolean6 = org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals(obj0, (java.lang.Object) equalsBuilder1, (java.util.Collection<java.lang.String>) strList4);
        java.lang.Class<?> wildcardClass7 = equalsBuilder1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EqualsBuilder101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder101");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((short) 1, (short) (byte) 1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append(true, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder102");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        double[] doubleArray1 = null;
        double[] doubleArray5 = new double[] { (short) 10, (short) -1, 0L };
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(doubleArray1, doubleArray5);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder6.appendSuper(true);
        boolean boolean9 = equalsBuilder6.isEquals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void EqualsBuilder103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder103");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((long) (byte) 100, 10L);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((byte) 0, (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder104");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((short) 10, (short) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder6.appendSuper(false);
        java.lang.Class<?> wildcardClass9 = equalsBuilder8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void EqualsBuilder105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder105");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        short[] shortArray3 = new short[] { (byte) 10, (byte) -1 };
        short[] shortArray7 = new short[] { (short) 10, (byte) 0, (short) 1 };
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder0.append(shortArray3, shortArray7);
        equalsBuilder0.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
    }

    @Test
    public void EqualsBuilder106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder106");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append('#', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder3.appendSuper(false);
        java.lang.Boolean boolean9 = equalsBuilder3.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void EqualsBuilder107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder107");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append(10.0f, (float) (short) 100);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append(true, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder108");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((short) 1, (short) (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append(false, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder109");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        boolean[] booleanArray4 = new boolean[] {};
        boolean[] booleanArray5 = new boolean[] {};
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(booleanArray4, booleanArray5);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append(false, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder110");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((long) (short) 0, 0L);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder6.appendSuper(false);
        java.lang.Class<?> wildcardClass9 = equalsBuilder8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void EqualsBuilder111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder111");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((byte) 100, (byte) 10);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((float) 0, (float) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder112");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        double[] doubleArray1 = null;
        double[] doubleArray5 = new double[] { (short) 10, (short) -1, 0L };
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(doubleArray1, doubleArray5);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder6.appendSuper(true);
        equalsBuilder6.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
    }

    @Test
    public void EqualsBuilder113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder113");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((double) 100L, 10.0d);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append('a', '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder114");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((long) '#', (-1L));
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder3.append((byte) 1, (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder115");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((double) 100L, 10.0d);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((long) (-1), 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder116");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append('#', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder3.append((byte) 0, (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder117");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        java.lang.Boolean boolean4 = equalsBuilder3.build();
        boolean boolean5 = equalsBuilder3.isEquals();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder3.append((float) (byte) -1, (float) 'a');
        boolean boolean9 = equalsBuilder3.isEquals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void EqualsBuilder118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder118");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder3.appendSuper(true);
        int[] intArray6 = new int[] {};
        int[] intArray8 = new int[] { 0 };
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder5.append(intArray6, intArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder119");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((double) 100L, 10.0d);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append(true, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder120");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((long) (short) 0, 0L);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((double) 1L, (double) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder121");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((long) '#', (-1L));
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((byte) 10, (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder122");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((byte) 100, (byte) 10);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append((short) (byte) 100, (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder123");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(0.0d, (double) (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((int) 'a', (int) (short) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder3.append(true, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder124");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((short) 1, (short) (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append((byte) 0, (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder125");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((short) 1, (short) (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append((double) 10L, (double) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder126");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((long) '#', 100L);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((long) 0, (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder127");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((long) '#', 100L);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((byte) 100, (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder128");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((byte) 100, (byte) 10);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append((byte) 0, (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder129");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((short) -1, (short) (byte) -1);
        equalsBuilder0.reset();
        java.lang.Boolean boolean8 = equalsBuilder0.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8.equals(true));
    }

    @Test
    public void EqualsBuilder130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder130");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((double) 100L, 10.0d);
        java.lang.Class<?> wildcardClass7 = equalsBuilder6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EqualsBuilder131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder131");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder1 = new org.apache.commons.lang3.builder.EqualsBuilder();
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        boolean boolean6 = org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals(obj0, (java.lang.Object) equalsBuilder1, (java.util.Collection<java.lang.String>) strList4);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder1.append((long) '#', 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder132");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(' ', ' ');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder6.appendSuper(false);
        boolean boolean9 = equalsBuilder6.isEquals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void EqualsBuilder133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder133");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder3.appendSuper(true);
        boolean boolean6 = equalsBuilder3.isEquals();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder3.append((short) (byte) -1, (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder134");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append('#', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder6.appendSuper(false);
        java.lang.Boolean boolean9 = equalsBuilder8.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void EqualsBuilder135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder135");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((short) 1, (short) (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append((long) (short) -1, (long) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder136");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append('#', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder3.append((long) (-1), (long) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder137");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((long) (byte) 100, 10L);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder6.appendSuper(true);
        boolean boolean9 = equalsBuilder8.isEquals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void EqualsBuilder138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder138");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((float) (short) 10, (float) (short) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append((float) '4', (float) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder139");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((int) '4', (int) (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((byte) 10, (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder140");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        java.lang.Boolean boolean4 = equalsBuilder3.build();
        boolean boolean5 = equalsBuilder3.isEquals();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder3.appendSuper(true);
        java.lang.Class<?> wildcardClass8 = equalsBuilder7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void EqualsBuilder141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder141");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((int) '4', (int) (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((short) (byte) 1, (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder142");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(0.0d, (double) (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((int) 'a', (int) (short) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder3.append((int) (short) 10, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder143");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(0.0d, (double) (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((int) 'a', (int) (short) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder3.append((float) 1, (float) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder144");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((float) 'a', (float) 100);
        java.lang.Boolean boolean7 = equalsBuilder6.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7.equals(false));
    }

    @Test
    public void EqualsBuilder145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder145");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        double[] doubleArray1 = null;
        double[] doubleArray5 = new double[] { (short) 10, (short) -1, 0L };
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(doubleArray1, doubleArray5);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append((byte) -1, (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder146");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((double) 100L, 10.0d);
        boolean boolean7 = equalsBuilder0.isEquals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void EqualsBuilder147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder147");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        boolean[] booleanArray4 = new boolean[] {};
        boolean[] booleanArray5 = new boolean[] {};
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(booleanArray4, booleanArray5);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((short) 1, (short) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder148");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((byte) 100, (byte) 10);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append((byte) 0, (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder149");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        java.lang.Boolean boolean4 = equalsBuilder3.build();
        boolean boolean5 = equalsBuilder3.isEquals();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder3.appendSuper(true);
        boolean boolean8 = equalsBuilder7.isEquals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void EqualsBuilder150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder150");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append('#', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append(10.0d, (double) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder151");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        long[] longArray2 = new long[] { (-1L) };
        long[] longArray4 = new long[] { (short) 1 };
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.append(longArray2, longArray4);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder5.append(true, true);
        java.lang.Boolean boolean9 = equalsBuilder8.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void EqualsBuilder152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder152");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append('#', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder3.appendSuper(false);
        java.lang.Class<?> wildcardClass9 = equalsBuilder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void EqualsBuilder153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder153");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((short) -1, (short) (byte) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append((float) 100, (float) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder154");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append('#', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((byte) 1, (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder155");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((long) (byte) 100, 10L);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder0.appendSuper(false);
        java.lang.Boolean boolean9 = equalsBuilder0.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void EqualsBuilder156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder156");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        java.lang.Class<?> wildcardClass4 = equalsBuilder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void EqualsBuilder157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder157");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((short) -1, (short) (byte) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((long) '#', 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder158");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(' ', ' ');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append('4', '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder159");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((long) (byte) 100, 10L);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder6.appendSuper(true);
        java.lang.Class<?> wildcardClass9 = equalsBuilder6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void EqualsBuilder160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder160");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((short) 1, (short) (byte) 1);
        java.lang.Class<?> wildcardClass7 = equalsBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EqualsBuilder161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder161");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        java.lang.Boolean boolean4 = equalsBuilder3.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder3.append((short) 0, (short) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder7);
    }

    @Test
    public void EqualsBuilder162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder162");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((short) 1, (short) (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((byte) 10, (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder163");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(false, false);
        boolean boolean7 = equalsBuilder0.isEquals();
        equalsBuilder0.reset();
        equalsBuilder0.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void EqualsBuilder164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder164");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        long[] longArray2 = new long[] { (-1L) };
        long[] longArray4 = new long[] { (short) 1 };
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.append(longArray2, longArray4);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder5.append((short) (byte) 0, (short) -1);
        boolean boolean9 = equalsBuilder5.isEquals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void EqualsBuilder165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder165");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        java.lang.Boolean boolean4 = equalsBuilder3.build();
        boolean boolean5 = equalsBuilder3.isEquals();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder3.appendSuper(true);
        java.lang.Class<?> wildcardClass8 = equalsBuilder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void EqualsBuilder166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder166");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        double[] doubleArray1 = null;
        double[] doubleArray5 = new double[] { (short) 10, (short) -1, 0L };
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(doubleArray1, doubleArray5);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder6.appendSuper(true);
        equalsBuilder8.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
    }

    @Test
    public void EqualsBuilder167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder167");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append(10.0f, (float) (short) 100);
        java.lang.Class<?> wildcardClass7 = equalsBuilder6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EqualsBuilder168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder168");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        java.lang.Class<?> wildcardClass4 = equalsBuilder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void EqualsBuilder169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder169");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append(10.0f, (float) (short) 100);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder3.append(1.0d, (double) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder170");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((byte) 0, (byte) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append('a', 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder171");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append('#', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder6.appendSuper(false);
        boolean boolean9 = equalsBuilder8.isEquals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void EqualsBuilder172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder172");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((short) 10, (short) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((short) 1, (short) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder173");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((long) (byte) 100, 10L);
        java.lang.Class<?> wildcardClass7 = equalsBuilder6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EqualsBuilder174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder174");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((long) (byte) 100, 10L);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder0.appendSuper(false);
        java.lang.Boolean boolean9 = equalsBuilder8.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void EqualsBuilder175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder175");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        short[] shortArray5 = new short[] { (short) 1 };
        short[] shortArray6 = new short[] {};
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder0.append(shortArray5, shortArray6);
        java.lang.Class<?> wildcardClass8 = shortArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void EqualsBuilder176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder176");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(' ', ' ');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder6.appendSuper(false);
        equalsBuilder8.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
    }

    @Test
    public void EqualsBuilder177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder177");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((int) '4', (int) (byte) 0);
        equalsBuilder0.reset();
        java.lang.Boolean boolean8 = equalsBuilder0.build();
        equalsBuilder0.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8.equals(true));
    }

    @Test
    public void EqualsBuilder178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder178");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((short) 1, (short) (byte) 1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append(100, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder179");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        double[] doubleArray1 = null;
        double[] doubleArray5 = new double[] { (short) 10, (short) -1, 0L };
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(doubleArray1, doubleArray5);
        equalsBuilder0.reset();
        java.lang.Boolean boolean8 = equalsBuilder0.build();
        java.lang.Boolean boolean9 = equalsBuilder0.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9.equals(true));
    }

    @Test
    public void EqualsBuilder180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder180");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((int) '4', (int) (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder6.appendSuper(false);
        boolean boolean9 = equalsBuilder6.isEquals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void EqualsBuilder181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder181");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((double) 100L, 10.0d);
        java.lang.Class<?> wildcardClass7 = equalsBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EqualsBuilder182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder182");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((float) 'a', (float) 100);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder3.append((double) 1.0f, (double) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder183");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((short) -1, (short) (byte) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append((float) '#', 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder184");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        java.lang.Boolean boolean4 = equalsBuilder3.build();
        boolean boolean5 = equalsBuilder3.isEquals();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder3.append((byte) -1, (byte) 100);
        equalsBuilder3.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
    }

    @Test
    public void EqualsBuilder185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder185");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((long) (short) 0, 0L);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((short) (byte) 1, (short) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder186");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((long) (byte) 100, 10L);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder0.appendSuper(false);
        boolean boolean9 = equalsBuilder8.isEquals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void EqualsBuilder187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder187");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append('#', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder3.append(true, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder188");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(' ', ' ');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder6.appendSuper(false);
        java.lang.Class<?> wildcardClass9 = equalsBuilder6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void EqualsBuilder189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder189");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((long) (byte) 100, 10L);
        int[] intArray7 = null;
        int[] intArray8 = new int[] {};
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append(intArray7, intArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder190");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append(10.0f, (float) (short) 100);
        equalsBuilder6.reset();
        boolean boolean8 = equalsBuilder6.isEquals();
        java.lang.Class<?> wildcardClass9 = equalsBuilder6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void EqualsBuilder191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder191");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(0.0d, (double) (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((int) 'a', (int) (short) -1);
        java.lang.Class<?> wildcardClass7 = equalsBuilder6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EqualsBuilder192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder192");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        long[] longArray2 = new long[] { (-1L) };
        long[] longArray4 = new long[] { (short) 1 };
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.append(longArray2, longArray4);
        boolean[] booleanArray6 = null;
        boolean[] booleanArray7 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder5.append(booleanArray6, booleanArray7);
        java.lang.Boolean boolean9 = equalsBuilder8.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void EqualsBuilder193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder193");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((long) '#', (-1L));
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder3.append((byte) -1, (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder194");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((byte) 0, (byte) 1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append(100.0d, (double) 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder195");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        double[] doubleArray1 = null;
        double[] doubleArray5 = new double[] { (short) 10, (short) -1, 0L };
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(doubleArray1, doubleArray5);
        boolean boolean7 = equalsBuilder0.isEquals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void EqualsBuilder196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder196");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((int) '4', (int) (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((float) (byte) 0, (float) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder197");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder3.appendSuper(true);
        java.lang.Boolean boolean6 = equalsBuilder3.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder3.append((long) (short) -1, (long) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder198");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((short) 10, (short) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((short) (byte) 0, (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder199");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder3.appendSuper(true);
        boolean boolean6 = equalsBuilder3.isEquals();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder3.append((long) 1, (long) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder200");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((float) (short) 10, (float) (short) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append((byte) -1, (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder201");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder2 = equalsBuilder0.appendSuper(true);
        boolean boolean5 = org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals((java.lang.Object) equalsBuilder0, (java.lang.Object) "hi!", true);
        java.lang.Class<?> wildcardClass6 = equalsBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void EqualsBuilder202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder202");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(' ', ' ');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((int) '4', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder203");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        double[] doubleArray1 = null;
        double[] doubleArray5 = new double[] { (short) 10, (short) -1, 0L };
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(doubleArray1, doubleArray5);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append(0L, (long) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder204");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        short[] shortArray5 = new short[] { (short) 1 };
        short[] shortArray6 = new short[] {};
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder0.append(shortArray5, shortArray6);
        java.lang.Boolean boolean8 = equalsBuilder0.build();
        boolean boolean9 = equalsBuilder0.isEquals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void EqualsBuilder205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder205");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((float) 100, (float) 1L);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((-1L), 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder206");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        double[] doubleArray1 = null;
        double[] doubleArray5 = new double[] { (short) 10, (short) -1, 0L };
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(doubleArray1, doubleArray5);
        equalsBuilder0.reset();
        java.lang.Boolean boolean8 = equalsBuilder0.build();
        java.lang.Class<?> wildcardClass9 = equalsBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void EqualsBuilder207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder207");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        java.lang.Object obj4 = null;
        java.lang.String[] strArray7 = new java.lang.String[] {};
        boolean boolean8 = org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals((java.lang.Object) 1, (java.lang.Object) (byte) 1, strArray7);
        boolean boolean9 = org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals((java.lang.Object) floatArray1, obj4, strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void EqualsBuilder208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder208");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((float) (short) 10, (float) (short) 0);
        java.lang.Class<?> wildcardClass7 = equalsBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EqualsBuilder209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder209");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(0.0d, (double) (byte) 0);
        boolean boolean4 = equalsBuilder0.isEquals();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder0.append((int) (byte) 10, (int) (short) -1);
        java.lang.Class<?> wildcardClass8 = equalsBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void EqualsBuilder210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder210");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        long[] longArray2 = new long[] { (-1L) };
        long[] longArray4 = new long[] { (short) 1 };
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.append(longArray2, longArray4);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder5.append((short) (byte) 0, (short) -1);
        java.lang.Boolean boolean9 = equalsBuilder8.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void EqualsBuilder211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder211");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(0.0d, (double) (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((short) 1, (short) 10);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder3.append((float) (short) 100, (float) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder212");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        equalsBuilder0.reset();
        boolean boolean5 = equalsBuilder0.isEquals();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder0.append(0.0f, (float) (byte) 1);
        boolean boolean9 = equalsBuilder0.isEquals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void EqualsBuilder213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder213");
        java.lang.Object obj0 = null;
        java.lang.Object obj1 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        boolean boolean6 = org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals(obj0, obj1, (java.util.Collection<java.lang.String>) strList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void EqualsBuilder214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder214");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((long) (byte) 100, 10L);
        equalsBuilder6.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
    }

    @Test
    public void EqualsBuilder215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder215");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        equalsBuilder0.reset();
        java.lang.Boolean boolean2 = equalsBuilder0.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.append(false, true);
        java.lang.Class<?> wildcardClass6 = equalsBuilder5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void EqualsBuilder216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder216");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((short) 10, (short) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append((byte) 10, (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder217");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(false, false);
        boolean boolean7 = equalsBuilder0.isEquals();
        java.lang.Boolean boolean8 = equalsBuilder0.build();
        equalsBuilder0.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8.equals(true));
    }

    @Test
    public void EqualsBuilder218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder218");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(false, false);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append((byte) 1, (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder219");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((float) 100, (float) 1L);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder3.append((double) (byte) -1, (double) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder220");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        long[] longArray2 = new long[] { (-1L) };
        long[] longArray4 = new long[] { (short) 1 };
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.append(longArray2, longArray4);
        boolean[] booleanArray6 = null;
        boolean[] booleanArray7 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder5.append(booleanArray6, booleanArray7);
        boolean boolean9 = equalsBuilder5.isEquals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void EqualsBuilder221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder221");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((float) 'a', (float) 100);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder3.append((int) (byte) 100, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder222");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', 'a');
        java.lang.Object obj4 = null;
        boolean boolean6 = org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals((java.lang.Object) equalsBuilder3, obj4, false);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder3.append((int) (short) 100, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder223");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((-1.0f), (float) 10L);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append(false, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder224");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((float) 'a', (float) 100);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder3.append(true, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder225");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((float) 'a', (float) 100);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder3.append(0, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder226");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(0.0d, (double) (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((byte) 100, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append((long) ' ', (long) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder227");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        double[] doubleArray1 = null;
        double[] doubleArray5 = new double[] { (short) 10, (short) -1, 0L };
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(doubleArray1, doubleArray5);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((float) 10, (float) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder228");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append('#', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder6.appendSuper(false);
        java.lang.Boolean boolean9 = equalsBuilder6.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void EqualsBuilder229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder229");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append('#', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder3.appendSuper(false);
        java.lang.Boolean boolean9 = equalsBuilder8.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void EqualsBuilder230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder230");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(' ', ' ');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((byte) 0, (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder231");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(0.0d, (double) (byte) 0);
        boolean boolean4 = equalsBuilder0.isEquals();
        equalsBuilder0.reset();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder0.append(false, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
    }

    @Test
    public void EqualsBuilder232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder232");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder3.appendSuper(true);
        java.lang.Boolean boolean6 = equalsBuilder3.build();
        equalsBuilder3.reset();
        java.lang.Boolean boolean8 = equalsBuilder3.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8.equals(true));
    }

    @Test
    public void EqualsBuilder233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder233");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(' ', ' ');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((short) 0, (short) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder234");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((short) 10, (short) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append((byte) 10, (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder235");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((float) 'a', (float) 100);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((byte) -1, (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder236");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(0.0d, (double) (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((int) 'a', (int) (short) -1);
        equalsBuilder3.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
    }

    @Test
    public void EqualsBuilder237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder237");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((long) (byte) 100, 10L);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append(true, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder238");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((byte) 100, (byte) 10);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append((double) (-1), (double) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder239");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((byte) 0, (byte) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder6.appendSuper(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
    }

    @Test
    public void EqualsBuilder240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder240");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(0.0d, (double) (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((int) 'a', (int) (short) -1);
        java.lang.Boolean boolean7 = equalsBuilder6.build();
        boolean boolean8 = equalsBuilder6.isEquals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void EqualsBuilder241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder241");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((byte) 100, (byte) 10);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((short) 100, (short) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder242");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((byte) 0, (byte) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((double) (-1), (double) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder243");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append('#', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((-1.0f), (float) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder244");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(false, false);
        java.lang.Class<?> wildcardClass7 = equalsBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EqualsBuilder245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder245");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        java.lang.Boolean boolean4 = equalsBuilder3.build();
        boolean boolean5 = equalsBuilder3.isEquals();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder3.append((byte) -1, (byte) 100);
        java.lang.Boolean boolean9 = equalsBuilder3.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void EqualsBuilder246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder246");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((byte) 0, (byte) 1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((long) (byte) -1, (long) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder247");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(10.0f, (float) ' ');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((byte) 100, (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder248");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder3.appendSuper(true);
        java.lang.Boolean boolean6 = equalsBuilder3.build();
        equalsBuilder3.reset();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder3.appendSuper(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder249");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((long) '#', (-1L));
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append(false, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder250");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((short) (byte) -1, (short) (byte) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((double) (byte) 0, (double) '#');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append((short) 100, (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder251");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(' ', ' ');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((double) 1L, (double) 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder252");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        java.lang.Boolean boolean4 = equalsBuilder3.build();
        boolean boolean5 = equalsBuilder3.isEquals();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder3.append('#', 'a');
        equalsBuilder3.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
    }

    @Test
    public void EqualsBuilder253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder253");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        equalsBuilder0.reset();
        java.lang.Boolean boolean2 = equalsBuilder0.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.append(false, true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder5.append(1, (int) ' ');
        java.lang.Class<?> wildcardClass9 = equalsBuilder5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void EqualsBuilder254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder254");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((float) (short) 10, (float) (short) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append((double) 100L, (double) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder255");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', 'a');
        java.lang.Object obj4 = null;
        boolean boolean6 = org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals((java.lang.Object) equalsBuilder3, obj4, false);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder3.append((long) (-1), 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder256");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((short) (byte) -1, (short) (byte) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((double) (byte) 0, (double) '#');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append('#', '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder257");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        equalsBuilder0.reset();
        boolean boolean5 = equalsBuilder0.isEquals();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder0.append(0.0f, (float) (byte) 1);
        boolean boolean9 = equalsBuilder8.isEquals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void EqualsBuilder258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder258");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append('#', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((int) '#', (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder259");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append('#', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder3.append(false, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder260");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(10.0f, (float) ' ');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append('4', ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder261");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder3.appendSuper(true);
        java.lang.Boolean boolean6 = equalsBuilder3.build();
        java.lang.Boolean boolean7 = equalsBuilder3.build();
        boolean boolean8 = equalsBuilder3.isEquals();
        java.lang.Boolean boolean9 = equalsBuilder3.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9.equals(true));
    }

    @Test
    public void EqualsBuilder262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder262");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        equalsBuilder0.reset();
        java.lang.Boolean boolean2 = equalsBuilder0.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.append(false, true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder5.append(1, (int) ' ');
        equalsBuilder5.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
    }

    @Test
    public void EqualsBuilder263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder263");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(' ', ' ');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append(true, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder264");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(10.0f, (float) ' ');
        java.lang.Object[] objArray7 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] {};
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append(objArray7, objArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder265");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(0.0d, (double) (byte) 0);
        boolean boolean4 = equalsBuilder0.isEquals();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder0.append((int) (byte) 10, (int) (short) -1);
        java.lang.Boolean boolean8 = equalsBuilder7.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
    }

    @Test
    public void EqualsBuilder266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder266");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((double) 100L, 10.0d);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((short) 1, (short) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder267");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((long) (byte) 100, 10L);
        boolean boolean7 = equalsBuilder0.isEquals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void EqualsBuilder268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder268");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((long) (byte) 100, 10L);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder6.appendSuper(true);
        equalsBuilder6.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
    }

    @Test
    public void EqualsBuilder269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder269");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((short) (byte) -1, (short) (byte) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((double) (byte) 0, (double) '#');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append((long) '4', (long) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder270");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((byte) 0, (byte) 1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append((byte) 0, (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder271");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder2 = equalsBuilder0.appendSuper(true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.append((int) (short) 0, (int) (short) 100);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder0.append(10.0f, (float) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
    }

    @Test
    public void EqualsBuilder272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder272");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(10.0f, (float) ' ');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((float) (byte) 0, (float) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder273");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(0.0d, (double) (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((short) 1, (short) 10);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder3.append((short) (byte) 100, (short) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder274");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((short) -1, (short) (byte) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((byte) 100, (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder275");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder3.appendSuper(true);
        boolean boolean6 = equalsBuilder3.isEquals();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder3.append('#', 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder276");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((short) 1, (short) (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append('#', '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder277");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((int) '4', (int) (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder0.appendSuper(false);
        java.lang.Boolean boolean9 = equalsBuilder8.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void EqualsBuilder278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder278");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder2 = equalsBuilder0.appendSuper(true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder2.append((int) (byte) 100, (int) (short) 1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder5.append((float) 0, 0.0f);
        java.lang.Boolean boolean9 = equalsBuilder5.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void EqualsBuilder279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder279");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder3.appendSuper(true);
        boolean boolean6 = equalsBuilder3.isEquals();
        java.lang.Boolean boolean7 = equalsBuilder3.build();
        java.lang.Boolean boolean8 = equalsBuilder3.build();
        equalsBuilder3.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8.equals(true));
    }

    @Test
    public void EqualsBuilder280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder280");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((long) '#', 100L);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append(false, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder281");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(1, (int) 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append(' ', ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder282");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        short[] shortArray3 = new short[] { (byte) 10, (byte) -1 };
        short[] shortArray7 = new short[] { (short) 10, (byte) 0, (short) 1 };
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder0.append(shortArray3, shortArray7);
        java.lang.Class<?> wildcardClass9 = shortArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void EqualsBuilder283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder283");
        java.lang.Object obj0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] {};
        boolean boolean5 = org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals((java.lang.Object) 1, (java.lang.Object) (byte) 1, strArray4);
        boolean boolean6 = org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals(obj0, (java.lang.Object) (short) 1, strArray4);
        java.lang.Class<?> wildcardClass7 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EqualsBuilder284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder284");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        java.lang.Boolean boolean4 = equalsBuilder3.build();
        boolean boolean5 = equalsBuilder3.isEquals();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder3.appendSuper(true);
        equalsBuilder3.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder7);
    }

    @Test
    public void EqualsBuilder285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder285");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((short) -1, (short) (byte) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((double) (byte) 0, (double) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder286");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((byte) 100, (byte) 10);
        boolean boolean7 = equalsBuilder6.isEquals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void EqualsBuilder287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder287");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append(10.0f, (float) (short) 100);
        equalsBuilder6.reset();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.appendSuper(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder288");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        long[] longArray2 = new long[] { (-1L) };
        long[] longArray4 = new long[] { (short) 1 };
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.append(longArray2, longArray4);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder0.append((short) 1, (short) (byte) 1);
        equalsBuilder8.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
    }

    @Test
    public void EqualsBuilder289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder289");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append(10.0f, (float) (short) 100);
        equalsBuilder6.reset();
        boolean boolean8 = equalsBuilder6.isEquals();
        equalsBuilder6.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void EqualsBuilder290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder290");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(0.0d, (double) (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((byte) 100, (byte) 0);
        java.lang.Boolean boolean7 = equalsBuilder6.build();
        java.lang.Boolean boolean8 = equalsBuilder6.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
    }

    @Test
    public void EqualsBuilder291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder291");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder2 = equalsBuilder0.appendSuper(true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.append((int) (short) 0, (int) (short) 100);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder0.append(100.0d, (double) (short) 1);
        boolean boolean9 = equalsBuilder8.isEquals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void EqualsBuilder292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder292");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((long) '#', (-1L));
        boolean boolean7 = equalsBuilder3.isEquals();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder3.appendSuper(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder293");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        long[] longArray2 = new long[] { (-1L) };
        long[] longArray4 = new long[] { (short) 1 };
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.append(longArray2, longArray4);
        java.lang.Boolean boolean6 = equalsBuilder5.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder5.append((double) 1.0f, (double) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder294");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        double[] doubleArray1 = null;
        double[] doubleArray5 = new double[] { (short) 10, (short) -1, 0L };
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(doubleArray1, doubleArray5);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((byte) 10, (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder295");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        long[] longArray2 = new long[] { (-1L) };
        long[] longArray4 = new long[] { (short) 1 };
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.append(longArray2, longArray4);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder0.append(false, false);
        boolean boolean9 = equalsBuilder8.isEquals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void EqualsBuilder296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder296");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((short) 10, (short) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((short) -1, (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder297");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        boolean boolean4 = equalsBuilder3.isEquals();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder3.append((short) 0, (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder7);
    }

    @Test
    public void EqualsBuilder298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder298");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(0.0d, (double) (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((int) 'a', (int) (short) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((short) -1, (short) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder299");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(0.0d, (double) (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((int) 'a', (int) (short) -1);
        java.lang.Class<?> wildcardClass7 = equalsBuilder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EqualsBuilder300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder300");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        java.lang.Boolean boolean4 = equalsBuilder3.build();
        boolean boolean5 = equalsBuilder3.isEquals();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder3.append((long) ' ', (long) (short) 0);
        boolean boolean9 = equalsBuilder8.isEquals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void EqualsBuilder301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder301");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder3.appendSuper(true);
        boolean boolean6 = equalsBuilder3.isEquals();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder3.append((byte) 0, (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder302");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        java.lang.Boolean boolean4 = equalsBuilder3.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder3.append(100L, 1L);
        java.lang.Class<?> wildcardClass8 = equalsBuilder7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void EqualsBuilder303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder303");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        java.lang.Boolean boolean4 = equalsBuilder3.build();
        boolean boolean5 = equalsBuilder3.isEquals();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder3.append((byte) -1, (byte) 100);
        java.lang.Boolean boolean9 = equalsBuilder8.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void EqualsBuilder304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder304");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((byte) 0, (byte) 1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append((short) 10, (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder305");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(0.0d, (double) (byte) 0);
        boolean boolean4 = equalsBuilder0.isEquals();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder0.append((int) (byte) 10, (int) (short) -1);
        boolean boolean8 = equalsBuilder7.isEquals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void EqualsBuilder306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder306");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(' ', ' ');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append(false, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder307");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(10.0f, (float) ' ');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append(100, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder308");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(' ', ' ');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append(false, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder309");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder2 = equalsBuilder0.appendSuper(true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder2.append((int) (byte) 100, (int) (short) 1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder5.append((float) 0, 100.0f);
        boolean boolean9 = equalsBuilder5.isEquals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void EqualsBuilder310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder310");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(0.0d, (double) (byte) 0);
        boolean boolean4 = equalsBuilder0.isEquals();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder0.append(false, true);
        java.lang.Boolean boolean8 = equalsBuilder0.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
    }

    @Test
    public void EqualsBuilder311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder311");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append(10.0f, (float) (short) 100);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder3.append((float) 10, (float) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder312");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(' ', ' ');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append(1L, 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder313");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((short) (byte) -1, (short) (byte) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((-1L), (long) (short) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((byte) 10, (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder314");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        char[] charArray4 = new char[] {};
        char[] charArray6 = new char[] { 'a' };
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder0.append(charArray4, charArray6);
        equalsBuilder7.reset();
        equalsBuilder7.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder7);
    }

    @Test
    public void EqualsBuilder315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder315");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        equalsBuilder0.reset();
        java.lang.Boolean boolean2 = equalsBuilder0.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.append(false, true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder5.append((int) (byte) 100, (int) (byte) -1);
        equalsBuilder8.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
    }

    @Test
    public void EqualsBuilder316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder316");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        boolean[] booleanArray4 = new boolean[] {};
        boolean[] booleanArray5 = new boolean[] {};
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(booleanArray4, booleanArray5);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((double) (byte) -1, 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder317");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(0.0d, (double) (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((int) 'a', (int) (short) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append(' ', 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder318");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(10.0f, (float) ' ');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((float) 100L, (float) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder319");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((long) (byte) 100, 10L);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append((float) (short) 1, (float) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder320");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append(10.0f, (float) (short) 100);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((float) (byte) 10, 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder321");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((short) (byte) -1, (short) (byte) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((-1L), (long) (short) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder3.append((byte) 10, (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder322");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        java.lang.Boolean boolean4 = equalsBuilder3.build();
        boolean boolean5 = equalsBuilder3.isEquals();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder3.append((short) (byte) 100, (short) 0);
        java.lang.Boolean boolean9 = equalsBuilder8.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void EqualsBuilder323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder323");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((long) (byte) 100, 10L);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder0.appendSuper(false);
        equalsBuilder0.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
    }

    @Test
    public void EqualsBuilder324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder324");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(0.0d, (double) (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((byte) 100, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append(true, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder325");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((double) 100L, 10.0d);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append(' ', 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder326");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((int) '4', (int) (byte) 0);
        equalsBuilder0.reset();
        equalsBuilder0.reset();
        boolean boolean9 = equalsBuilder0.isEquals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void EqualsBuilder327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder327");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((int) (short) 10, (int) (byte) 0);
        java.lang.Boolean boolean4 = equalsBuilder0.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder0.append((short) -1, (short) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder7);
    }

    @Test
    public void EqualsBuilder328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder328");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append('#', 'a');
        java.lang.Boolean boolean7 = equalsBuilder6.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7.equals(false));
    }

    @Test
    public void EqualsBuilder329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder329");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((long) '#', (-1L));
        double[] doubleArray7 = null;
        double[] doubleArray8 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder3.append(doubleArray7, doubleArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder330");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((short) 1, (short) (byte) 1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append(100, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder331");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(0.0d, (double) (byte) 0);
        java.lang.Boolean boolean4 = equalsBuilder3.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.appendSuper(true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder3.appendSuper(false);
        java.lang.Class<?> wildcardClass9 = equalsBuilder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void EqualsBuilder332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder332");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        long[] longArray2 = new long[] { (-1L) };
        long[] longArray4 = new long[] { (short) 1 };
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.append(longArray2, longArray4);
        boolean[] booleanArray6 = null;
        boolean[] booleanArray7 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder5.append(booleanArray6, booleanArray7);
        boolean boolean9 = equalsBuilder8.isEquals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void EqualsBuilder333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder333");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(0.0d, (double) (byte) 0);
        boolean boolean4 = equalsBuilder0.isEquals();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder0.append(false, true);
        java.lang.Class<?> wildcardClass8 = equalsBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void EqualsBuilder334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder334");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        short[] shortArray5 = new short[] { (short) 1 };
        short[] shortArray6 = new short[] {};
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder0.append(shortArray5, shortArray6);
        java.lang.Boolean boolean8 = equalsBuilder0.build();
        java.lang.Boolean boolean9 = equalsBuilder0.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void EqualsBuilder335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder335");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((long) '#', (-1L));
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append(true, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder336");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(10.0f, (float) ' ');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((double) (short) 10, (double) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder337");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((double) 100L, 10.0d);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append((short) (byte) 10, (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder338");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(10.0f, (float) ' ');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append(0, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder339");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(0.0d, (double) (byte) 0);
        java.lang.Boolean boolean4 = equalsBuilder3.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.appendSuper(true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((double) 10.0f, (double) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder340");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append('#', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder3.append((float) (short) 10, (float) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder341");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(10.0f, (float) ' ');
        boolean boolean7 = equalsBuilder0.isEquals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void EqualsBuilder342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder342");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder2 = equalsBuilder0.appendSuper(true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder2.append((int) (byte) 100, (int) (short) 1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder5.appendSuper(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder7);
    }

    @Test
    public void EqualsBuilder343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder343");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(0.0d, (double) (byte) 0);
        java.lang.Boolean boolean4 = equalsBuilder3.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.appendSuper(true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder3.append((long) (short) 100, (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder344");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((byte) 0, (byte) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append(1, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder345");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((short) 1, (short) (byte) 1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append('#', 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder346");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((short) (byte) -1, (short) (byte) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((-1L), (long) (short) -1);
        java.lang.Class<?> wildcardClass7 = equalsBuilder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EqualsBuilder347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder347");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((short) -1, (short) (byte) -1);
        equalsBuilder0.reset();
        boolean boolean8 = equalsBuilder0.isEquals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void EqualsBuilder348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder348");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((short) (byte) -1, (short) (byte) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((double) (byte) 0, (double) '#');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append(0L, (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder349");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((long) (byte) 100, 10L);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder0.appendSuper(false);
        boolean boolean9 = equalsBuilder0.isEquals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void EqualsBuilder350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder350");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder3.appendSuper(true);
        java.lang.Boolean boolean6 = equalsBuilder3.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder3.append((float) 100, 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder351");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((long) (byte) 100, 10L);
        java.lang.Class<?> wildcardClass7 = equalsBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EqualsBuilder352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder352");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder1 = new org.apache.commons.lang3.builder.EqualsBuilder();
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        boolean boolean6 = org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals(obj0, (java.lang.Object) equalsBuilder1, (java.util.Collection<java.lang.String>) strList4);
        java.lang.Boolean boolean7 = equalsBuilder1.build();
        boolean boolean8 = equalsBuilder1.isEquals();
        boolean boolean9 = equalsBuilder1.isEquals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void EqualsBuilder353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder353");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        java.lang.Boolean boolean4 = equalsBuilder3.build();
        boolean boolean5 = equalsBuilder3.isEquals();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder3.appendSuper(true);
        java.lang.Boolean boolean8 = equalsBuilder3.build();
        boolean boolean9 = equalsBuilder3.isEquals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void EqualsBuilder354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder354");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((short) (byte) -1, (short) (byte) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((short) (byte) 0, (short) (byte) 10);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder3.append((short) (byte) 1, (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder355");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((short) -1, (short) (byte) -1);
        equalsBuilder0.reset();
        java.lang.Class<?> wildcardClass8 = equalsBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void EqualsBuilder356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder356");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((byte) 0, (byte) 1);
        long[] longArray7 = null;
        long[] longArray8 = new long[] {};
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append(longArray7, longArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder357");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        equalsBuilder0.reset();
        java.lang.Boolean boolean2 = equalsBuilder0.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.append(true, false);
        java.lang.Boolean boolean6 = equalsBuilder0.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append('4', 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder358");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        java.lang.Boolean boolean4 = equalsBuilder3.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder3.append(100L, 1L);
        equalsBuilder3.reset();
        java.lang.Boolean boolean9 = equalsBuilder3.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9.equals(true));
    }

    @Test
    public void EqualsBuilder359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder359");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder2 = equalsBuilder0.appendSuper(true);
        boolean boolean3 = equalsBuilder0.isEquals();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((int) (byte) 10, (int) 'a');
        java.lang.Class<?> wildcardClass7 = equalsBuilder6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EqualsBuilder360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder360");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(0.0d, (double) (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.appendSuper(false);
        java.lang.Class<?> wildcardClass6 = equalsBuilder5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void EqualsBuilder361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder361");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((float) 100, (float) 1L);
        java.lang.Boolean boolean7 = equalsBuilder6.build();
        equalsBuilder6.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7.equals(false));
    }

    @Test
    public void EqualsBuilder362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder362");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        equalsBuilder0.reset();
        boolean boolean5 = equalsBuilder0.isEquals();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder0.appendSuper(true);
        java.lang.Class<?> wildcardClass8 = equalsBuilder7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void EqualsBuilder363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder363");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((short) 1, (short) (byte) 1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append('a', '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder364");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(' ', ' ');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append((byte) 10, (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder365");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        equalsBuilder0.reset();
        java.lang.Boolean boolean2 = equalsBuilder0.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.append(false, true);
        boolean boolean6 = equalsBuilder5.isEquals();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder5.append((float) (-1L), (float) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder366");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((short) 1, (short) (byte) 0);
        java.lang.Boolean boolean7 = equalsBuilder0.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.appendSuper(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder367");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        equalsBuilder0.reset();
        java.lang.Boolean boolean2 = equalsBuilder0.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.append(false, true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder5.append((short) (byte) 100, (short) 0);
        equalsBuilder8.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
    }

    @Test
    public void EqualsBuilder368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder368");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder1 = new org.apache.commons.lang3.builder.EqualsBuilder();
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        boolean boolean6 = org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals(obj0, (java.lang.Object) equalsBuilder1, (java.util.Collection<java.lang.String>) strList4);
        double[] doubleArray7 = null;
        double[] doubleArray8 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder1.append(doubleArray7, doubleArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder369");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((float) (short) 10, (float) (short) 0);
        java.lang.Boolean boolean7 = equalsBuilder6.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7.equals(false));
    }

    @Test
    public void EqualsBuilder370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder370");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((long) (byte) 100, 10L);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder0.appendSuper(false);
        java.lang.Class<?> wildcardClass9 = equalsBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void EqualsBuilder371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder371");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((double) 100L, 10.0d);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((byte) 10, (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder372");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(0.0d, (double) (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((byte) 100, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder0.appendSuper(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
    }

    @Test
    public void EqualsBuilder373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder373");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        java.lang.Boolean boolean4 = equalsBuilder3.build();
        boolean boolean5 = equalsBuilder3.isEquals();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder3.append('#', 'a');
        java.lang.Boolean boolean9 = equalsBuilder8.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void EqualsBuilder374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder374");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        double[] doubleArray1 = null;
        double[] doubleArray5 = new double[] { (short) 10, (short) -1, 0L };
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(doubleArray1, doubleArray5);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append(100, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder375");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        equalsBuilder0.reset();
        boolean boolean5 = equalsBuilder0.isEquals();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder0.append(0.0f, (float) (byte) 1);
        java.lang.Boolean boolean9 = equalsBuilder0.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void EqualsBuilder376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder376");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append(10.0f, (float) (short) 100);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder3.append(false, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder377");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((long) (short) 0, 0L);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((byte) 10, (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder378");
        java.lang.Object obj0 = null;
        boolean boolean3 = org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals(obj0, (java.lang.Object) 10, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void EqualsBuilder379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder379");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder3.appendSuper(true);
        boolean boolean6 = equalsBuilder3.isEquals();
        java.lang.Boolean boolean7 = equalsBuilder3.build();
        boolean boolean8 = equalsBuilder3.isEquals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void EqualsBuilder380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder380");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        long[] longArray2 = new long[] { (-1L) };
        long[] longArray4 = new long[] { (short) 1 };
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.append(longArray2, longArray4);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder5.append((int) '4', (int) '#');
        boolean boolean9 = equalsBuilder5.isEquals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void EqualsBuilder381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder381");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        equalsBuilder0.reset();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder4 = equalsBuilder0.append(false, true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder0.append((short) 0, (short) (byte) 1);
        boolean boolean8 = equalsBuilder0.isEquals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void EqualsBuilder382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder382");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((short) (byte) -1, (short) (byte) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((double) (byte) 0, (double) '#');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((double) 0.0f, (double) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder383");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        char[] charArray4 = new char[] {};
        char[] charArray6 = new char[] { 'a' };
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder0.append(charArray4, charArray6);
        java.lang.Boolean boolean8 = equalsBuilder7.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
    }

    @Test
    public void EqualsBuilder384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder384");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder2 = equalsBuilder0.appendSuper(true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder2.append((int) (byte) 100, (int) (short) 1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder5.append('4', 'a');
        java.lang.Class<?> wildcardClass9 = equalsBuilder8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void EqualsBuilder385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder385");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        equalsBuilder0.reset();
        java.lang.Boolean boolean2 = equalsBuilder0.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.append(false, true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder0.append((long) (byte) 10, (long) (byte) 100);
        equalsBuilder0.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
    }

    @Test
    public void EqualsBuilder386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder386");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        java.lang.Boolean boolean4 = equalsBuilder3.build();
        equalsBuilder3.reset();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder3.appendSuper(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder7);
    }

    @Test
    public void EqualsBuilder387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder387");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((byte) 100, (byte) 10);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder6.appendSuper(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
    }

    @Test
    public void EqualsBuilder388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder388");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((float) (short) 10, (float) (short) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append((int) (short) 0, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder389");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        long[] longArray2 = new long[] { (-1L) };
        long[] longArray4 = new long[] { (short) 1 };
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.append(longArray2, longArray4);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder0.append(false, false);
        java.lang.Class<?> wildcardClass9 = equalsBuilder8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void EqualsBuilder390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder390");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder2 = equalsBuilder0.appendSuper(true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder2.append((int) (byte) 100, (int) (short) 1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder5.append('4', 'a');
        boolean boolean9 = equalsBuilder5.isEquals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void EqualsBuilder391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder391");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder3.appendSuper(true);
        boolean boolean6 = equalsBuilder3.isEquals();
        boolean boolean7 = equalsBuilder3.isEquals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void EqualsBuilder392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder392");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(0.0d, (double) (byte) 0);
        java.lang.Boolean boolean4 = equalsBuilder3.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder3.append((float) (byte) 1, (float) (byte) 100);
        boolean boolean8 = equalsBuilder3.isEquals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void EqualsBuilder393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder393");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((short) -1, (short) (byte) -1);
        boolean boolean7 = equalsBuilder0.isEquals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void EqualsBuilder394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder394");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((float) 100, (float) 1L);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append(10L, 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder395");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((long) (short) 0, 0L);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((long) (short) 100, (long) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder396");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append('#', 'a');
        boolean boolean7 = equalsBuilder6.isEquals();
        java.lang.Class<?> wildcardClass8 = equalsBuilder6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void EqualsBuilder397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder397");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append(10.0f, (float) (short) 100);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((long) (byte) 0, (long) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder398");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        long[] longArray2 = new long[] { (-1L) };
        long[] longArray4 = new long[] { (short) 1 };
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.append(longArray2, longArray4);
        boolean[] booleanArray6 = null;
        boolean[] booleanArray7 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder5.append(booleanArray6, booleanArray7);
        java.lang.Class<?> wildcardClass9 = equalsBuilder5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void EqualsBuilder399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder399");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append('#', 'a');
        boolean boolean7 = equalsBuilder6.isEquals();
        java.lang.Boolean boolean8 = equalsBuilder6.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
    }

    @Test
    public void EqualsBuilder400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder400");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((short) -1, (short) (byte) -1);
        boolean boolean7 = equalsBuilder6.isEquals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void EqualsBuilder401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder401");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        equalsBuilder0.reset();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder4 = equalsBuilder0.append((byte) -1, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder4.append((int) (short) 100, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder7);
    }

    @Test
    public void EqualsBuilder402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder402");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((float) 'a', (float) 100);
        boolean boolean7 = equalsBuilder3.isEquals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void EqualsBuilder403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder403");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((short) 1, (short) (byte) 1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append(10, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder404");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append('#', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder3.append((short) 0, (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder405");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((long) '#', 100L);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append((short) 100, (short) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder406");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        equalsBuilder0.reset();
        java.lang.Boolean boolean2 = equalsBuilder0.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.append(true, false);
        boolean boolean6 = equalsBuilder0.isEquals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void EqualsBuilder407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder407");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder2 = equalsBuilder0.appendSuper(true);
        boolean boolean3 = equalsBuilder0.isEquals();
        java.lang.Class<?> wildcardClass4 = equalsBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void EqualsBuilder408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder408");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        equalsBuilder0.reset();
        java.lang.Boolean boolean2 = equalsBuilder0.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.append(true, false);
        java.lang.Class<?> wildcardClass6 = equalsBuilder5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void EqualsBuilder409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder409");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        equalsBuilder0.reset();
        java.lang.Boolean boolean2 = equalsBuilder0.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.append(true, false);
        java.lang.Boolean boolean6 = equalsBuilder0.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append((short) 0, (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder410");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        equalsBuilder0.reset();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder4 = equalsBuilder0.append((long) (byte) -1, 1L);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder0.append((short) 100, (short) (byte) 100);
        java.lang.Class<?> wildcardClass8 = equalsBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void EqualsBuilder411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder411");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((long) '#', 100L);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append((byte) -1, (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder412");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append(10.0f, (float) (short) 100);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append(false, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder413");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((float) 'a', (float) 100);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((double) (byte) 1, (double) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder414");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((byte) 0, (byte) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((byte) 1, (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder415");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder3.appendSuper(true);
        java.lang.Boolean boolean6 = equalsBuilder3.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder3.append(1.0d, (double) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder416");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder1 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder4 = equalsBuilder1.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder1.append(' ', ' ');
        boolean boolean9 = org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals(obj0, (java.lang.Object) equalsBuilder7, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void EqualsBuilder417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder417");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(10.0f, (float) ' ');
        java.lang.Boolean boolean7 = equalsBuilder0.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7.equals(false));
    }

    @Test
    public void EqualsBuilder418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder418");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((int) (short) 10, (int) (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((double) 10.0f, (double) (byte) -1);
        boolean boolean7 = equalsBuilder6.isEquals();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.appendSuper(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder419");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((short) 1, (short) (byte) 0);
        java.lang.Boolean boolean7 = equalsBuilder0.build();
        java.lang.Boolean boolean8 = equalsBuilder0.build();
        java.lang.Class<?> wildcardClass9 = equalsBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void EqualsBuilder420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder420");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((short) -1, (short) (byte) -1);
        java.lang.Boolean boolean7 = equalsBuilder6.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.appendSuper(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder421");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        equalsBuilder0.reset();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder4 = equalsBuilder0.append((long) (byte) -1, 1L);
        equalsBuilder0.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder4);
    }

    @Test
    public void EqualsBuilder422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder422");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        equalsBuilder0.reset();
        boolean boolean5 = equalsBuilder0.isEquals();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder0.append(0.0f, (float) (byte) 1);
        java.lang.Class<?> wildcardClass9 = equalsBuilder8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void EqualsBuilder423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder423");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        java.lang.Boolean boolean4 = equalsBuilder3.build();
        boolean boolean5 = equalsBuilder3.isEquals();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder3.append((float) (byte) -1, (float) 'a');
        java.lang.Boolean boolean9 = equalsBuilder3.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void EqualsBuilder424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder424");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder2 = equalsBuilder0.appendSuper(true);
        boolean boolean3 = equalsBuilder0.isEquals();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((int) (byte) 10, (int) 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder0.appendSuper(true);
        equalsBuilder8.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
    }

    @Test
    public void EqualsBuilder425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder425");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder2 = equalsBuilder0.appendSuper(true);
        boolean boolean5 = org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals((java.lang.Object) equalsBuilder0, (java.lang.Object) "hi!", true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder0.append((short) 100, (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
    }

    @Test
    public void EqualsBuilder426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder426");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((int) '4', (int) (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder6.appendSuper(false);
        equalsBuilder6.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
    }

    @Test
    public void EqualsBuilder427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder427");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((long) (byte) 100, 10L);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder6.appendSuper(true);
        java.lang.Boolean boolean9 = equalsBuilder6.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void EqualsBuilder428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder428");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((byte) 100, (byte) 10);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((byte) -1, (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder429");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        double[] doubleArray1 = null;
        double[] doubleArray5 = new double[] { (short) 10, (short) -1, 0L };
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(doubleArray1, doubleArray5);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder6.appendSuper(false);
        equalsBuilder8.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
    }

    @Test
    public void EqualsBuilder430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder430");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((short) 1, (short) (byte) 0);
        boolean boolean7 = equalsBuilder0.isEquals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void EqualsBuilder431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder431");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((float) (short) 100, (float) (byte) 10);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append(false, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder432");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder2 = equalsBuilder0.appendSuper(true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.append((int) (short) 0, (int) (short) 100);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder0.append('4', 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
    }

    @Test
    public void EqualsBuilder433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder433");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder2 = equalsBuilder0.appendSuper(true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.append((int) (short) 0, (int) (short) 100);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder0.append(100.0d, (double) (short) 1);
        java.lang.Boolean boolean9 = equalsBuilder8.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void EqualsBuilder434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder434");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        equalsBuilder0.reset();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder4 = equalsBuilder0.append(false, true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder0.append((short) 0, (short) (byte) 1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.appendSuper(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder435");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(0.0d, (double) (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((byte) 100, (byte) 0);
        java.lang.Class<?> wildcardClass7 = equalsBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EqualsBuilder436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder436");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        short[] shortArray5 = new short[] { (short) 1 };
        short[] shortArray6 = new short[] {};
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder0.append(shortArray5, shortArray6);
        equalsBuilder0.reset();
        boolean boolean9 = equalsBuilder0.isEquals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void EqualsBuilder437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder437");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(false, false);
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray8 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append(byteArray7, byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder438");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((byte) 0, (byte) 1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append(10L, (long) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder439");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((long) '#', (-1L));
        boolean boolean7 = equalsBuilder6.isEquals();
        boolean boolean8 = equalsBuilder6.isEquals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void EqualsBuilder440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder440");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        java.lang.Boolean boolean4 = equalsBuilder3.build();
        boolean boolean5 = equalsBuilder3.isEquals();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder3.append(100.0f, (float) (byte) 100);
        equalsBuilder3.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
    }

    @Test
    public void EqualsBuilder441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder441");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        boolean boolean6 = org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals((java.lang.Object) (byte) -1, (java.lang.Object) (byte) 100, (java.util.Collection<java.lang.String>) strList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void EqualsBuilder442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder442");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(0.0d, (double) (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((int) 'a', (int) (short) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder3.append('a', ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder443");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        java.lang.Boolean boolean4 = equalsBuilder3.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder3.append((byte) 1, (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder7);
    }

    @Test
    public void EqualsBuilder444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder444");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((int) '4', (int) (byte) 0);
        equalsBuilder0.reset();
        equalsBuilder0.reset();
        equalsBuilder0.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
    }

    @Test
    public void EqualsBuilder445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder445");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder3.appendSuper(true);
        java.lang.Boolean boolean6 = equalsBuilder5.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder5.append(10, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder446");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((short) (byte) -1, (short) (byte) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((short) (byte) 0, (short) (byte) 10);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder3.append('a', '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder447");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        equalsBuilder0.reset();
        java.lang.Boolean boolean2 = equalsBuilder0.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.append(false, true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder5.append((short) (byte) 1, (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
    }

    @Test
    public void EqualsBuilder448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder448");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        equalsBuilder0.reset();
        java.lang.Boolean boolean2 = equalsBuilder0.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.append(false, true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder0.append((int) '#', (int) (byte) 1);
        boolean boolean9 = equalsBuilder8.isEquals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void EqualsBuilder449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder449");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((float) 'a', (float) 100);
        equalsBuilder3.reset();
        java.lang.Boolean boolean8 = equalsBuilder3.build();
        java.lang.Boolean boolean9 = equalsBuilder3.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9.equals(true));
    }

    @Test
    public void EqualsBuilder450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder450");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder2 = equalsBuilder0.appendSuper(true);
        boolean boolean3 = equalsBuilder0.isEquals();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((int) (byte) 10, (int) 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder0.appendSuper(true);
        java.lang.Class<?> wildcardClass9 = equalsBuilder8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void EqualsBuilder451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder451");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((byte) 0, (byte) -1);
        equalsBuilder0.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
    }

    @Test
    public void EqualsBuilder452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder452");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder2 = equalsBuilder0.appendSuper(true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.append((int) (short) 0, (int) (short) 100);
        java.lang.Class<?> wildcardClass6 = equalsBuilder0.getClass();
        java.lang.Object obj7 = null;
        boolean boolean9 = org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals((java.lang.Object) equalsBuilder0, obj7, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void EqualsBuilder453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder453");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        equalsBuilder0.reset();
        boolean boolean5 = equalsBuilder0.isEquals();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder0.append(true, true);
        equalsBuilder0.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
    }

    @Test
    public void EqualsBuilder454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder454");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        equalsBuilder0.reset();
        java.lang.Boolean boolean2 = equalsBuilder0.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.append(false, true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder5.append((int) (byte) 100, (int) (byte) -1);
        java.lang.Class<?> wildcardClass9 = equalsBuilder5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void EqualsBuilder455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder455");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((double) 100L, 10.0d);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((int) (short) 1, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder456");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(' ', ' ');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder6.appendSuper(false);
        java.lang.Boolean boolean9 = equalsBuilder6.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void EqualsBuilder457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder457");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', 'a');
        java.lang.Object obj4 = null;
        boolean boolean6 = org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals((java.lang.Object) equalsBuilder3, obj4, false);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder3.append((long) (short) 100, 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder458");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((float) 100, (float) 1L);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((byte) 10, (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder459");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder2 = equalsBuilder0.appendSuper(true);
        boolean boolean3 = equalsBuilder0.isEquals();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((int) (byte) 10, (int) 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append(false, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder460");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder2 = equalsBuilder0.appendSuper(true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.append(false, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
    }

    @Test
    public void EqualsBuilder461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder461");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((long) '#', 100L);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((double) (short) -1, 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder462");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(false, false);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((long) 'a', 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder463");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((short) (byte) -1, (short) (byte) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder3.appendSuper(true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder3.append((double) 1L, (double) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
    }

    @Test
    public void EqualsBuilder464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder464");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((short) (byte) -1, (short) (byte) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((double) (byte) 0, (double) '#');
        java.lang.Class<?> wildcardClass7 = equalsBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EqualsBuilder465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder465");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((float) (short) 10, (float) (short) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((int) (short) -1, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder466");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder3.appendSuper(true);
        java.lang.Boolean boolean6 = equalsBuilder3.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder3.append((double) (byte) -1, 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder467");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((byte) 100, (byte) 10);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append(true, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder468");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((long) (byte) 100, 10L);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append('4', 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder469");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append(10.0f, (float) (short) 100);
        java.lang.Class<?> wildcardClass7 = equalsBuilder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EqualsBuilder470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder470");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        equalsBuilder0.reset();
        java.lang.Boolean boolean2 = equalsBuilder0.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.append(true, false);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder0.append((byte) 0, (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
    }

    @Test
    public void EqualsBuilder471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder471");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((long) '#', 100L);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append((double) '#', (double) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder472");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(false, false);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append('4', '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder473");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder2 = equalsBuilder0.appendSuper(true);
        boolean boolean3 = equalsBuilder0.isEquals();
        equalsBuilder0.reset();
        java.lang.Class<?> wildcardClass5 = equalsBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void EqualsBuilder474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder474");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        equalsBuilder0.reset();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder4 = equalsBuilder0.append((byte) -1, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder4.appendSuper(true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append('#', ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder475");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        equalsBuilder0.reset();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder4 = equalsBuilder0.append((long) (byte) -1, 1L);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder4.append(10.0f, (float) (byte) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder7.appendSuper(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder476");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((long) '#', (-1L));
        boolean boolean7 = equalsBuilder6.isEquals();
        java.lang.Boolean boolean8 = equalsBuilder6.build();
        java.lang.Boolean boolean9 = equalsBuilder6.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void EqualsBuilder477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder477");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder2 = equalsBuilder0.appendSuper(true);
        boolean boolean3 = equalsBuilder0.isEquals();
        equalsBuilder0.reset();
        boolean boolean5 = equalsBuilder0.isEquals();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder0.append((byte) -1, (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
    }

    @Test
    public void EqualsBuilder478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder478");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        equalsBuilder0.reset();
        java.lang.Boolean boolean2 = equalsBuilder0.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.append(true, false);
        java.lang.Boolean boolean6 = equalsBuilder0.build();
        java.lang.Boolean boolean7 = equalsBuilder0.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7.equals(false));
    }

    @Test
    public void EqualsBuilder479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder479");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        double[] doubleArray1 = null;
        double[] doubleArray5 = new double[] { (short) 10, (short) -1, 0L };
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(doubleArray1, doubleArray5);
        equalsBuilder0.reset();
        java.lang.Class<?> wildcardClass8 = equalsBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void EqualsBuilder480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder480");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((int) '4', (int) (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append('#', ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder481");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        equalsBuilder0.reset();
        boolean boolean5 = equalsBuilder0.isEquals();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder0.appendSuper(true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.appendSuper(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder482");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((byte) 0, (byte) 1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append((byte) 0, (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder483");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(true, false);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((long) '#', (long) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder484");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((byte) 0, (byte) 1);
        java.lang.Boolean boolean7 = equalsBuilder6.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7.equals(false));
    }

    @Test
    public void EqualsBuilder485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder485");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((float) 100, (float) 1L);
        java.lang.Boolean boolean7 = equalsBuilder3.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7.equals(false));
    }

    @Test
    public void EqualsBuilder486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder486");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder2 = equalsBuilder0.appendSuper(true);
        boolean boolean5 = org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals((java.lang.Object) equalsBuilder0, (java.lang.Object) "hi!", true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder0.append((int) (byte) 0, 100);
        boolean boolean9 = equalsBuilder0.isEquals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void EqualsBuilder487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder487");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        equalsBuilder0.reset();
        java.lang.Boolean boolean2 = equalsBuilder0.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.append(false, true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder0.append((int) '#', (int) (byte) 1);
        java.lang.Boolean boolean9 = equalsBuilder0.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void EqualsBuilder488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder488");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder2 = equalsBuilder0.appendSuper(true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder2.append((int) (byte) 100, (int) (short) 1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder5.append((float) 0, 100.0f);
        java.lang.Boolean boolean9 = equalsBuilder8.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void EqualsBuilder489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder489");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        boolean[] booleanArray4 = new boolean[] {};
        boolean[] booleanArray5 = new boolean[] {};
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(booleanArray4, booleanArray5);
        boolean boolean7 = equalsBuilder0.isEquals();
        java.lang.Boolean boolean8 = equalsBuilder0.build();
        java.lang.Boolean boolean9 = equalsBuilder0.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9.equals(true));
    }

    @Test
    public void EqualsBuilder490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder490");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        boolean[] booleanArray4 = new boolean[] {};
        boolean[] booleanArray5 = new boolean[] {};
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(booleanArray4, booleanArray5);
        equalsBuilder6.reset();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.appendSuper(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder491");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((long) (byte) 100, 10L);
        boolean[] booleanArray7 = null;
        boolean[] booleanArray8 = new boolean[] {};
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append(booleanArray7, booleanArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder492");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((long) '#', (-1L));
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder3.append((byte) 10, (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder493");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(0.0d, (double) (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((byte) 100, (byte) 0);
        boolean boolean7 = equalsBuilder6.isEquals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void EqualsBuilder494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder494");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((int) (short) 10, (int) (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((double) 10.0f, (double) (byte) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((double) (short) 10, (double) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder495");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder2 = equalsBuilder0.appendSuper(true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.append((int) (short) 0, (int) (short) 100);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder0.append((short) (byte) 10, (short) 10);
        java.lang.Boolean boolean9 = equalsBuilder8.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void EqualsBuilder496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder496");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((short) 1, (short) (byte) 1);
        java.lang.Boolean boolean7 = equalsBuilder6.build();
        java.lang.Class<?> wildcardClass8 = equalsBuilder6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void EqualsBuilder497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder497");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder3.appendSuper(true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder3.append((byte) 10, (byte) -1);
        java.lang.Class<?> wildcardClass9 = equalsBuilder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void EqualsBuilder498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder498");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        double[] doubleArray1 = null;
        double[] doubleArray5 = new double[] { (short) 10, (short) -1, 0L };
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(doubleArray1, doubleArray5);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder6.appendSuper(true);
        java.lang.Boolean boolean9 = equalsBuilder8.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void EqualsBuilder499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder499");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        equalsBuilder0.reset();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder4 = equalsBuilder0.append((long) (short) 10, (long) (-1));
        java.lang.Boolean boolean5 = equalsBuilder4.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder4.append((short) 0, (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
    }

    @Test
    public void EqualsBuilder500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.EqualsBuilder500");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(false, false);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append((double) 0, (double) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }
}

