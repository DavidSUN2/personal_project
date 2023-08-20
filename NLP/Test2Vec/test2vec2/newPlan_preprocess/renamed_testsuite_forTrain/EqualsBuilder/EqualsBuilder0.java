
package EqualsBuilder;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EqualsBuilder0 {

    public static boolean debug = false;

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test001");
        boolean boolean3 = org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals((java.lang.Object) (-1.0f), (java.lang.Object) 100.0d, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test002");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test003");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test004");
        java.util.Collection<java.lang.String> strCollection2 = null;
        boolean boolean3 = org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals((java.lang.Object) (short) -1, (java.lang.Object) (short) 0, strCollection2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test005");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test006");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test007");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test008");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test009");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test010");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test011");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test012");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test013");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test014");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test015");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test016");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test017");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test018");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test019");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test020");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test021");
        boolean boolean3 = org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals((java.lang.Object) 10.0f, (java.lang.Object) 0, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test022");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test023");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test024");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test025");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test026");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test027");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test028");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test029");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test030");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test031");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test032");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test033");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test034");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test035");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test036");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test037");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test038");
        java.lang.Object obj0 = null;
        boolean boolean3 = org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals(obj0, (java.lang.Object) (-1.0d), false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test039");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test040");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test041");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test042");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test043");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test044");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test045");
        java.lang.Object obj1 = null;
        boolean boolean3 = org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals((java.lang.Object) 1.0d, obj1, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test046");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test047");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test048");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test049");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test050");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test051");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test052");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test053");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test054");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test055");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test056");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test057");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test058");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test059");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test060");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test061");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test062");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test063");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test064");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test065");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test066");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test067");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test068");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test069");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test070");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test071");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test072");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test073");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test074");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test075");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test076");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test077");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test078");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test079");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test080");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test081");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test082");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test083");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test084");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test085");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test086");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test087");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test088");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test089");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test090");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test091");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test092");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test093");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test094");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test095");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test096");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test097");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test098");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test099");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test100");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test101");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test102");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test103");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test104");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test105");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test106");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test107");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test108");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test109");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test110");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test111");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test112");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test113");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test114");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test115");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test116");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test117");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test118");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test119");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test120");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test121");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test122");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test123");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test124");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test125");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test126");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test127");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test128");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test129");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test130");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test131");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test132");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test133");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test134");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test135");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test136");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test137");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test138");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test139");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test140");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test141");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test142");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test143");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test144");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test145");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test146");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test147");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test148");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test149");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test150");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test151");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test152");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test153");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test154");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test155");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test156");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        java.lang.Class<?> wildcardClass4 = equalsBuilder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test157");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test158");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test159");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test160");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test161");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test162");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test163");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test164");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test165");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test166");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test167");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test168");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test169");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test170");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test171");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test172");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test173");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test174");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test175");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test176");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test177");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test178");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test179");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test180");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test181");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test182");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test183");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test184");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test185");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test186");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test187");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test188");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test189");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test190");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test191");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test192");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test193");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test194");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test195");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test196");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test197");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test198");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test199");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test200");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test201");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test202");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test203");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test204");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test205");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test206");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test207");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test208");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test209");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test210");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test211");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test212");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test213");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test214");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test215");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test216");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test217");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test218");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test219");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test220");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test221");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test222");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test223");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test224");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test225");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test226");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test227");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test228");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test229");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test230");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test231");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test232");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test233");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test234");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test235");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test236");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test237");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test238");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test239");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test240");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test241");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test242");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test243");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test244");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test245");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test246");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test247");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test248");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test249");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test250");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test251");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test252");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test253");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test254");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test255");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test256");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test257");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test258");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test259");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test260");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test261");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test262");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test263");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test264");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test265");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test266");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test267");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test268");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test269");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test270");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test271");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test272");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test273");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test274");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test275");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test276");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test277");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test278");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test279");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test280");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test281");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test282");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test283");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test284");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test285");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test286");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test287");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test288");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test289");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test290");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test291");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test292");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test293");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test294");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test295");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test296");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test297");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test298");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test299");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test300");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test301");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test302");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test303");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test304");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test305");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test306");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test307");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test308");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test309");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test310");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test311");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test312");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test313");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test314");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test315");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test316");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test317");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test318");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test319");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test320");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test321");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test322");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test323");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test324");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test325");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test326");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test327");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test328");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test329");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test330");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test331");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test332");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test333");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test334");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test335");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test336");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test337");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test338");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test339");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test340");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test341");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test342");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test343");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test344");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test345");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test346");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test347");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test348");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test349");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test350");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test351");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test352");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test353");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test354");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test355");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test356");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test357");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test358");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test359");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test360");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test361");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test362");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test363");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test364");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test365");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test366");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test367");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test368");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test369");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test370");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test371");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test372");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test373");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test374");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test375");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test376");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test377");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test378");
        java.lang.Object obj0 = null;
        boolean boolean3 = org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals(obj0, (java.lang.Object) 10, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test379");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test380");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test381");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test382");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test383");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test384");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test385");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test386");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test387");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test388");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test389");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test390");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test391");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test392");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test393");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test394");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test395");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test396");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test397");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test398");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test399");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test400");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test401");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test402");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test403");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test404");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test405");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test406");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test407");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test408");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test409");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test410");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test411");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test412");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test413");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test414");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test415");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test416");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test417");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test418");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test419");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test420");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test421");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        equalsBuilder0.reset();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder4 = equalsBuilder0.append((long) (byte) -1, 1L);
        equalsBuilder0.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder4);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test422");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test423");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test424");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test425");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test426");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test427");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test428");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test429");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test430");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test431");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test432");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test433");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test434");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test435");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test436");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test437");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test438");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test439");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test440");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test441");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test442");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test443");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test444");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test445");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test446");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test447");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test448");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test449");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test450");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test451");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test452");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test453");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test454");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test455");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test456");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test457");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test458");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test459");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test460");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder2 = equalsBuilder0.appendSuper(true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.append(false, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test461");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test462");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test463");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test464");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test465");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test466");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test467");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test468");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test469");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test470");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test471");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test472");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test473");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test474");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test475");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test476");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test477");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test478");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test479");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test480");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test481");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test482");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test483");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test484");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test485");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test486");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test487");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test488");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test489");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test490");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test491");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test492");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test493");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test494");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test495");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test496");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test497");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test498");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test499");
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
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test500");
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

