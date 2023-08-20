
package EqualsBuilder;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EqualsBuilder1 {

    public static boolean debug = false;

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test501");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder3.appendSuper(true);
        java.lang.Boolean boolean6 = equalsBuilder3.build();
        byte[] byteArray7 = null;
        byte[] byteArray8 = new byte[] {};
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder3.append(byteArray7, byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test502");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder3.appendSuper(true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder5.append((int) (short) 10, (int) (short) 1);
        java.lang.Class<?> wildcardClass9 = equalsBuilder5.getClass();
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
            System.out.format("%n%s%n", "EqualsBuilder1.test503");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        equalsBuilder0.reset();
        java.lang.Boolean boolean2 = equalsBuilder0.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.append(true, false);
        java.lang.Class<?> wildcardClass6 = equalsBuilder0.getClass();
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
            System.out.format("%n%s%n", "EqualsBuilder1.test504");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        equalsBuilder0.reset();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder4 = equalsBuilder0.append(1, (int) (short) 10);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder0.append((byte) 100, (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder7);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test505");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(0.0d, (double) (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((byte) -1, (byte) 1);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test506");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        java.lang.Boolean boolean4 = equalsBuilder3.build();
        boolean boolean5 = equalsBuilder3.isEquals();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder3.append((byte) -1, (byte) 100);
        equalsBuilder8.reset();
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
            System.out.format("%n%s%n", "EqualsBuilder1.test507");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(false, false);
        boolean boolean7 = equalsBuilder6.isEquals();
        equalsBuilder6.reset();
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
            System.out.format("%n%s%n", "EqualsBuilder1.test508");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((byte) 100, (byte) 10);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((float) 10, (float) (byte) 1);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test509");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((byte) 0, (byte) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append(100.0f, 100.0f);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test510");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        equalsBuilder0.reset();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder4 = equalsBuilder0.append(1, (int) (short) 10);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder0.append(false, false);
        java.lang.Boolean boolean8 = equalsBuilder7.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test511");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(0.0d, (double) (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((byte) -1, (byte) 1);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test512");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((long) (byte) 100, 10L);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append((long) 1, (long) (short) -1);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test513");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        short[] shortArray5 = new short[] { (short) 1 };
        short[] shortArray6 = new short[] {};
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder0.append(shortArray5, shortArray6);
        equalsBuilder0.reset();
        equalsBuilder0.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder7);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test514");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder2 = equalsBuilder0.appendSuper(true);
        boolean boolean3 = equalsBuilder0.isEquals();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((int) (byte) 10, (int) 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder0.appendSuper(true);
        equalsBuilder0.reset();
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
            System.out.format("%n%s%n", "EqualsBuilder1.test515");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((long) '#', 100L);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append((byte) 0, (byte) 10);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test516");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        equalsBuilder0.reset();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder4 = equalsBuilder0.append(1, (int) (short) 10);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder0.append('#', 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder7);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test517");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        equalsBuilder0.reset();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder4 = equalsBuilder0.append(false, true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder0.append((short) 0, (short) (byte) 1);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test518");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(0.0d, (double) (byte) 0);
        java.lang.Boolean boolean4 = equalsBuilder3.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.appendSuper(true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder3.append((long) (short) -1, 100L);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test519");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((short) (byte) -1, (short) (byte) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((short) (byte) 0, (short) (byte) 10);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test520");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(0.0d, (double) (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((byte) 100, (byte) 0);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test521");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((short) 1, (short) (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder0.appendSuper(true);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test522");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        equalsBuilder0.reset();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder4 = equalsBuilder0.append(10, (int) (byte) 100);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder4.append(' ', 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder7);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test523");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((float) '#', (float) '#');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder3.append(0L, (long) '#');
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
            System.out.format("%n%s%n", "EqualsBuilder1.test524");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((float) (short) 10, (float) (short) 0);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test525");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder1 = new org.apache.commons.lang3.builder.EqualsBuilder();
        long[] longArray3 = new long[] { (-1L) };
        long[] longArray5 = new long[] { (short) 1 };
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder1.append(longArray3, longArray5);
        boolean boolean8 = org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals((java.lang.Object) 100, (java.lang.Object) equalsBuilder1, false);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test526");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(10.0f, (float) ' ');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append((short) 10, (short) 100);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test527");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((short) (byte) -1, (short) (byte) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder3.appendSuper(true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder5.append((float) 100, (float) (byte) 10);
        java.lang.Class<?> wildcardClass9 = equalsBuilder8.getClass();
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
            System.out.format("%n%s%n", "EqualsBuilder1.test528");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        equalsBuilder0.reset();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder4 = equalsBuilder0.append(false, true);
        java.lang.Boolean boolean5 = equalsBuilder0.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder0.append((short) 100, (short) (byte) 1);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test529");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        equalsBuilder0.reset();
        java.lang.Boolean boolean2 = equalsBuilder0.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.append(false, true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder5.append(1, (int) ' ');
        java.lang.Boolean boolean9 = equalsBuilder8.build();
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
            System.out.format("%n%s%n", "EqualsBuilder1.test530");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(0.0d, (double) (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((short) (byte) -1, (short) (byte) 0);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test531");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((short) (byte) -1, (short) (byte) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((short) (byte) 0, (short) (byte) 10);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((short) (byte) -1, (short) -1);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test532");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((short) (byte) -1, (short) (byte) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((-1L), (long) (short) -1);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test533");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder2 = equalsBuilder0.appendSuper(true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder2.append((int) (byte) 100, (int) (short) 1);
        java.lang.Class<?> wildcardClass6 = equalsBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test534");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(0.0d, (double) (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((int) 'a', (int) (short) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder3.append((short) -1, (short) (byte) -1);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test535");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(0.0d, (double) (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.appendSuper(false);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder0.append((double) 1.0f, (double) ' ');
        java.lang.Class<?> wildcardClass9 = equalsBuilder8.getClass();
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
            System.out.format("%n%s%n", "EqualsBuilder1.test536");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder2 = equalsBuilder0.appendSuper(true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder2.append((int) (byte) 100, (int) (short) 1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder5.append((short) (byte) -1, (short) (byte) 10);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test537");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((byte) 0, (byte) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append(100.0f, (float) (-1));
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
            System.out.format("%n%s%n", "EqualsBuilder1.test538");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        java.lang.Boolean boolean4 = equalsBuilder3.build();
        equalsBuilder3.reset();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder3.append((short) (byte) 0, (short) 1);
        java.lang.Boolean boolean9 = equalsBuilder8.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test539");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', 'a');
        java.lang.Class<?> wildcardClass4 = equalsBuilder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test540");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((double) 10, 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test541");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder2 = equalsBuilder0.appendSuper(true);
        boolean boolean3 = equalsBuilder0.isEquals();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((int) (byte) 10, (int) 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((float) (byte) -1, 100.0f);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test542");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((short) -1, (short) (byte) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder0.appendSuper(true);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test543");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((long) '#', (-1L));
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
            System.out.format("%n%s%n", "EqualsBuilder1.test544");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder2 = equalsBuilder0.appendSuper(true);
        boolean boolean5 = org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals((java.lang.Object) equalsBuilder0, (java.lang.Object) "hi!", true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder0.append((byte) 1, (byte) -1);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test545");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        equalsBuilder0.reset();
        java.lang.Boolean boolean2 = equalsBuilder0.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.append(false, true);
        equalsBuilder0.reset();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append((float) (short) 100, (float) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test546");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((long) '#', 100L);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test547");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((float) (short) 100, (float) (byte) 10);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((double) 1, 1.0d);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test548");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', 'a');
        java.lang.Object obj4 = null;
        boolean boolean6 = org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals((java.lang.Object) equalsBuilder3, obj4, false);
        java.lang.Boolean boolean7 = equalsBuilder3.build();
        java.lang.Class<?> wildcardClass8 = equalsBuilder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test549");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((short) (byte) -1, (short) (byte) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((double) (byte) 0, (double) '#');
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
            System.out.format("%n%s%n", "EqualsBuilder1.test550");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        short[] shortArray5 = new short[] { (short) 1 };
        short[] shortArray6 = new short[] {};
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder0.append(shortArray5, shortArray6);
        equalsBuilder7.reset();
        equalsBuilder7.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder7);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test551");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(0.0d, (double) (byte) 0);
        java.lang.Boolean boolean4 = equalsBuilder3.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.appendSuper(true);
        boolean boolean7 = equalsBuilder3.isEquals();
        java.lang.Class<?> wildcardClass8 = equalsBuilder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test552");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(' ', ' ');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append((double) (short) 1, (double) 100L);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test553");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(false, false);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test554");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        long[] longArray2 = new long[] { (-1L) };
        long[] longArray4 = new long[] { (short) 1 };
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.append(longArray2, longArray4);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder5.append((int) '4', (int) '#');
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
            System.out.format("%n%s%n", "EqualsBuilder1.test555");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(' ', ' ');
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
            System.out.format("%n%s%n", "EqualsBuilder1.test556");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        equalsBuilder0.reset();
        java.lang.Boolean boolean2 = equalsBuilder0.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.append(false, true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder5.append((int) (byte) 100, (int) (byte) -1);
        boolean boolean9 = equalsBuilder5.isEquals();
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
            System.out.format("%n%s%n", "EqualsBuilder1.test557");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((long) (short) 0, 0L);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test558");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        equalsBuilder0.reset();
        java.lang.Boolean boolean2 = equalsBuilder0.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.append(false, true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder0.append(100.0f, 1.0f);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test559");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder3.appendSuper(true);
        java.lang.Boolean boolean6 = equalsBuilder3.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder3.appendSuper(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test560");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        equalsBuilder0.reset();
        java.lang.Boolean boolean2 = equalsBuilder0.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.append(true, false);
        java.lang.Object obj6 = null;
        boolean boolean8 = org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals((java.lang.Object) equalsBuilder5, obj6, false);
        boolean boolean9 = equalsBuilder5.isEquals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test561");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        java.lang.Boolean boolean4 = equalsBuilder3.build();
        equalsBuilder3.reset();
        boolean boolean6 = equalsBuilder3.isEquals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test562");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        equalsBuilder0.reset();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder4 = equalsBuilder0.append(false, true);
        java.lang.Boolean boolean5 = equalsBuilder0.build();
        boolean boolean6 = equalsBuilder0.isEquals();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append((double) 1.0f, (double) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test563");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        equalsBuilder0.reset();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder4 = equalsBuilder0.append(1, (int) (short) 10);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder0.append((long) (byte) 100, (-1L));
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder7.appendSuper(false);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test564");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(0.0d, (double) (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((byte) -1, (byte) 1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append((byte) 1, (byte) 0);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test565");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        java.lang.Boolean boolean4 = equalsBuilder3.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder3.append(100L, 1L);
        equalsBuilder3.reset();
        boolean boolean9 = equalsBuilder3.isEquals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test566");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((short) 1, (short) (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((short) (byte) 100, (short) (byte) 0);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test567");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((float) '#', (float) '#');
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
            System.out.format("%n%s%n", "EqualsBuilder1.test568");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        java.lang.Boolean boolean4 = equalsBuilder3.build();
        boolean boolean5 = equalsBuilder3.isEquals();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder3.append((float) (byte) -1, (float) 'a');
        java.lang.Class<?> wildcardClass9 = equalsBuilder8.getClass();
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
            System.out.format("%n%s%n", "EqualsBuilder1.test569");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((float) (short) 10, (float) (short) 0);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test570");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((long) 10, (long) (-1));
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder3.append((-1L), (long) (byte) 10);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test571");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder2 = equalsBuilder0.appendSuper(true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.append((int) (short) 0, (int) (short) 100);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder5.append((long) 0, (long) (byte) 0);
        equalsBuilder8.reset();
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
            System.out.format("%n%s%n", "EqualsBuilder1.test572");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((short) (byte) -1, (short) (byte) -1);
        java.lang.Class<?> wildcardClass4 = equalsBuilder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test573");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        double[] doubleArray1 = null;
        double[] doubleArray5 = new double[] { (short) 10, (short) -1, 0L };
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(doubleArray1, doubleArray5);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append(0.0d, (double) 'a');
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
            System.out.format("%n%s%n", "EqualsBuilder1.test574");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        equalsBuilder0.reset();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder4 = equalsBuilder0.append((long) (short) 10, (long) (-1));
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder0.append((int) '4', 0);
        equalsBuilder7.reset();
        equalsBuilder7.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder7);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test575");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(0.0d, (double) (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.appendSuper(false);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder5.append((float) 100, (float) '#');
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
            System.out.format("%n%s%n", "EqualsBuilder1.test576");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((int) (short) 10, (int) (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((long) (byte) 0, (long) (byte) 100);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test577");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append('#', 'a');
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
            System.out.format("%n%s%n", "EqualsBuilder1.test578");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder3.appendSuper(true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder5.append((short) (byte) 1, (short) (byte) 100);
        java.lang.Boolean boolean9 = equalsBuilder5.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test579");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(0.0d, (double) (byte) 0);
        java.lang.Boolean boolean4 = equalsBuilder3.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder3.append((float) (byte) 1, (float) (byte) 100);
        equalsBuilder3.reset();
        equalsBuilder3.reset();
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
            System.out.format("%n%s%n", "EqualsBuilder1.test580");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        long[] longArray2 = new long[] { (-1L) };
        long[] longArray4 = new long[] { (short) 1 };
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.append(longArray2, longArray4);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder0.append(false, false);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test581");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder2 = equalsBuilder0.appendSuper(true);
        boolean boolean5 = org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals((java.lang.Object) equalsBuilder0, (java.lang.Object) "hi!", true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder0.append((int) '4', (int) (short) 100);
        java.lang.Boolean boolean9 = equalsBuilder0.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test582");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(0.0d, (double) (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((byte) 100, (byte) 0);
        boolean boolean7 = equalsBuilder0.isEquals();
        java.lang.Boolean boolean8 = equalsBuilder0.build();
        java.lang.Boolean boolean9 = equalsBuilder0.build();
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
            System.out.format("%n%s%n", "EqualsBuilder1.test583");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((short) (byte) -1, (short) (byte) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder3.appendSuper(true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder5.append('a', 'a');
        boolean boolean9 = equalsBuilder8.isEquals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test584");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((float) (short) 10, (float) (short) 0);
        java.lang.Object obj7 = null;
        boolean boolean9 = org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals((java.lang.Object) (short) 10, obj7, true);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test585");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder3.appendSuper(true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder5.append((short) (byte) 1, (short) (byte) 100);
        java.lang.Boolean boolean9 = equalsBuilder8.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test586");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder3.appendSuper(true);
        java.lang.Boolean boolean6 = equalsBuilder3.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder3.append((byte) 10, (byte) 100);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test587");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(0.0d, (double) (byte) 0);
        java.lang.Boolean boolean4 = equalsBuilder3.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.appendSuper(true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder3.appendSuper(false);
        java.lang.Class<?> wildcardClass9 = equalsBuilder8.getClass();
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
            System.out.format("%n%s%n", "EqualsBuilder1.test588");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        equalsBuilder0.reset();
        java.lang.Boolean boolean2 = equalsBuilder0.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.append(false, true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder5.append((short) (byte) 0, (short) (byte) 0);
        java.lang.Boolean boolean9 = equalsBuilder8.build();
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
            System.out.format("%n%s%n", "EqualsBuilder1.test589");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder2 = equalsBuilder0.appendSuper(true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder2.append((int) (byte) 100, (int) (short) 1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder5.append((byte) 0, (byte) -1);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test590");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder3.appendSuper(true);
        java.lang.Boolean boolean6 = equalsBuilder5.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder5.append((byte) -1, (byte) -1);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test591");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        boolean[] booleanArray4 = new boolean[] {};
        boolean[] booleanArray5 = new boolean[] {};
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(booleanArray4, booleanArray5);
        equalsBuilder6.reset();
        equalsBuilder6.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test592");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        long[] longArray2 = new long[] { (-1L) };
        long[] longArray4 = new long[] { (short) 1 };
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.append(longArray2, longArray4);
        equalsBuilder5.reset();
        java.lang.Class<?> wildcardClass7 = equalsBuilder5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test593");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        long[] longArray2 = new long[] { (-1L) };
        long[] longArray4 = new long[] { (short) 1 };
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.append(longArray2, longArray4);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder5.append((float) (-1L), (float) 0);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test594");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((byte) 0, (byte) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((double) 1, (double) (short) -1);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test595");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        equalsBuilder0.reset();
        java.lang.Boolean boolean2 = equalsBuilder0.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.append(false, true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder5.append((short) (byte) 0, (short) (byte) 0);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test596");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        boolean boolean4 = equalsBuilder3.isEquals();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder3.append((byte) 10, (byte) -1);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test597");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((float) 100, (float) 1L);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test598");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((short) (byte) -1, (short) (byte) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((-1L), (long) (short) -1);
        boolean boolean7 = equalsBuilder6.isEquals();
        equalsBuilder6.reset();
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
            System.out.format("%n%s%n", "EqualsBuilder1.test599");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder2 = equalsBuilder0.appendSuper(true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder2.append((int) (byte) 100, (int) (short) 1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder5.append((byte) 0, (byte) 1);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test600");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((short) (byte) -1, (short) (byte) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((-1L), (long) (short) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder3.appendSuper(false);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test601");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(1, (int) 'a');
        boolean boolean9 = org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals((java.lang.Object) 1, (java.lang.Object) '4', false);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test602");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((int) (byte) 100, (int) '#');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((double) 0.0f, (double) (short) 0);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test603");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        equalsBuilder0.reset();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder4 = equalsBuilder0.append((long) (byte) -1, 1L);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder0.append((float) (-1L), (float) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder7);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test604");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        java.lang.Boolean boolean4 = equalsBuilder3.build();
        boolean boolean5 = equalsBuilder3.isEquals();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder3.appendSuper(true);
        equalsBuilder7.reset();
        java.lang.Boolean boolean9 = equalsBuilder7.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9.equals(true));
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test605");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(false, false);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append((float) (short) 0, (float) '4');
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
            System.out.format("%n%s%n", "EqualsBuilder1.test606");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((float) '#', (float) '#');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder3.append((short) 0, (short) (byte) 100);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test607");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(0.0d, (double) (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((short) (byte) -1, (short) (byte) 0);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test608");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((long) ' ', (long) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test609");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        equalsBuilder0.reset();
        boolean boolean5 = equalsBuilder0.isEquals();
        java.lang.Boolean boolean6 = equalsBuilder0.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6.equals(true));
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test610");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append('#', 'a');
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
            System.out.format("%n%s%n", "EqualsBuilder1.test611");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        equalsBuilder0.reset();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder0.append((short) -1, (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder7);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test612");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        equalsBuilder0.reset();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder4 = equalsBuilder0.append(10, (int) (byte) 100);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder0.append((double) 10, (double) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder7);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test613");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((short) 10, (short) -1);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test614");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        java.lang.Boolean boolean4 = equalsBuilder3.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder3.append(100L, 1L);
        java.lang.Class<?> wildcardClass8 = equalsBuilder3.getClass();
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
            System.out.format("%n%s%n", "EqualsBuilder1.test615");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((short) 1, (short) (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append((byte) 1, (byte) 0);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test616");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder3.appendSuper(true);
        boolean boolean6 = equalsBuilder3.isEquals();
        java.lang.Boolean boolean7 = equalsBuilder3.build();
        java.lang.Boolean boolean8 = equalsBuilder3.build();
        java.lang.Boolean boolean9 = equalsBuilder3.build();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9.equals(true));
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test617");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(0.0d, (double) (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.appendSuper(false);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder5.append((short) (byte) 100, (short) -1);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test618");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        equalsBuilder0.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test619");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(0.0d, (double) (byte) 0);
        java.lang.Boolean boolean4 = equalsBuilder3.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder3.append((float) (byte) 1, (float) (byte) 100);
        equalsBuilder3.reset();
        java.lang.Class<?> wildcardClass9 = equalsBuilder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test620");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        equalsBuilder0.reset();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder0.append((float) 100, (-1.0f));
        equalsBuilder7.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder7);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test621");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder2 = equalsBuilder0.appendSuper(true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder2.append((int) (byte) 100, (int) (short) 1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder5.append((short) (byte) 10, (short) (byte) 0);
        java.lang.Class<?> wildcardClass9 = equalsBuilder5.getClass();
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
            System.out.format("%n%s%n", "EqualsBuilder1.test622");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((int) (short) 10, (int) (byte) 0);
        java.lang.Boolean boolean4 = equalsBuilder0.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder0.append((float) ' ', (float) 1);
        equalsBuilder0.reset();
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
            System.out.format("%n%s%n", "EqualsBuilder1.test623");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        equalsBuilder0.reset();
        java.lang.Boolean boolean2 = equalsBuilder0.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.append((int) (byte) 1, 100);
        boolean boolean6 = equalsBuilder5.isEquals();
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
            System.out.format("%n%s%n", "EqualsBuilder1.test624");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((byte) 0, (byte) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder0.appendSuper(true);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test625");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((short) (byte) -1, (short) (byte) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder3.appendSuper(true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder5.append(10L, 1L);
        equalsBuilder5.reset();
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
            System.out.format("%n%s%n", "EqualsBuilder1.test626");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder2 = equalsBuilder0.appendSuper(true);
        boolean boolean5 = org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals((java.lang.Object) equalsBuilder0, (java.lang.Object) "hi!", true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder0.append((int) '4', (int) (short) 100);
        java.lang.Class<?> wildcardClass9 = equalsBuilder8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test627");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((int) (byte) 100, (int) '#');
        equalsBuilder3.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test628");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder2 = equalsBuilder0.appendSuper(true);
        boolean boolean3 = equalsBuilder0.isEquals();
        equalsBuilder0.reset();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.appendSuper(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test629");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        equalsBuilder0.reset();
        boolean boolean5 = equalsBuilder0.isEquals();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder0.append('a', ' ');
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
            System.out.format("%n%s%n", "EqualsBuilder1.test630");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((short) 10, (short) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append(100.0d, (double) (-1.0f));
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
            System.out.format("%n%s%n", "EqualsBuilder1.test631");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        equalsBuilder0.reset();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder4 = equalsBuilder0.append(1, (int) (short) 10);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder4.append(0L, (long) (short) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder4.appendSuper(true);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test632");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append(10.0f, (float) (short) 100);
        equalsBuilder3.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test633");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((short) (byte) -1, (short) (byte) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder3.appendSuper(true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder5.append('a', 'a');
        java.lang.Class<?> wildcardClass9 = equalsBuilder5.getClass();
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
            System.out.format("%n%s%n", "EqualsBuilder1.test634");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        equalsBuilder0.reset();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder4 = equalsBuilder0.append((byte) -1, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder4.appendSuper(true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder4.append(false, false);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test635");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        java.lang.Boolean boolean4 = equalsBuilder3.build();
        boolean boolean5 = equalsBuilder3.isEquals();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder3.append((byte) -1, (byte) 100);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test636");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((float) '#', (float) '#');
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
            System.out.format("%n%s%n", "EqualsBuilder1.test637");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        equalsBuilder0.reset();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder4 = equalsBuilder0.append((byte) -1, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder4.append((short) (byte) -1, (short) (byte) -1);
        boolean boolean8 = equalsBuilder4.isEquals();
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
            System.out.format("%n%s%n", "EqualsBuilder1.test638");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        java.lang.Boolean boolean4 = equalsBuilder3.build();
        boolean boolean5 = equalsBuilder3.isEquals();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder3.append('#', 'a');
        java.lang.Class<?> wildcardClass9 = equalsBuilder8.getClass();
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
            System.out.format("%n%s%n", "EqualsBuilder1.test639");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(0.0d, (double) (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((short) (byte) -1, (short) (byte) 0);
        java.lang.Object obj7 = null;
        boolean boolean9 = org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals((java.lang.Object) equalsBuilder6, obj7, false);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test640");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        equalsBuilder0.reset();
        java.lang.Boolean boolean2 = equalsBuilder0.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.append(true, false);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder5.append((byte) 100, (byte) 10);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test641");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder2 = equalsBuilder0.appendSuper(true);
        boolean boolean3 = equalsBuilder0.isEquals();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((int) (byte) 10, (int) 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append(0L, (long) (byte) 0);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test642");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((float) '#', (float) '#');
        boolean boolean7 = equalsBuilder3.isEquals();
        java.lang.Boolean boolean8 = equalsBuilder3.build();
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
            System.out.format("%n%s%n", "EqualsBuilder1.test643");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(true, false);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append(100.0f, (float) 1L);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test644");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        java.lang.Boolean boolean4 = equalsBuilder3.build();
        equalsBuilder3.reset();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder3.append('4', 'a');
        java.lang.Boolean boolean9 = equalsBuilder3.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test645");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        equalsBuilder0.reset();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder4 = equalsBuilder0.append(false, true);
        java.lang.Boolean boolean5 = equalsBuilder0.build();
        boolean boolean6 = equalsBuilder0.isEquals();
        equalsBuilder0.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test646");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder1 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder4 = equalsBuilder1.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder4.append((int) (byte) 100, (int) '#');
        boolean boolean9 = org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals((java.lang.Object) (-1.0f), (java.lang.Object) '#', false);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test647");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((int) (byte) 100, (int) '#');
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
            System.out.format("%n%s%n", "EqualsBuilder1.test648");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        long[] longArray2 = new long[] { (-1L) };
        long[] longArray4 = new long[] { (short) 1 };
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.append(longArray2, longArray4);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder5.append((-1.0d), 100.0d);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test649");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(0.0d, (double) (byte) 0);
        java.lang.Boolean boolean4 = equalsBuilder3.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder3.append((long) (byte) 0, (long) '4');
        boolean boolean8 = equalsBuilder7.isEquals();
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
            System.out.format("%n%s%n", "EqualsBuilder1.test650");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        equalsBuilder0.reset();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder4 = equalsBuilder0.append(false, true);
        java.lang.Boolean boolean5 = equalsBuilder0.build();
        boolean boolean6 = equalsBuilder0.isEquals();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append((long) (-1), 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test651");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        equalsBuilder0.reset();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder4 = equalsBuilder0.append(1, (int) (short) 10);
        java.lang.Boolean boolean5 = equalsBuilder0.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test652");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append(10.0f, (float) (short) 100);
        java.lang.Boolean boolean7 = equalsBuilder3.build();
        boolean boolean8 = equalsBuilder3.isEquals();
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
            System.out.format("%n%s%n", "EqualsBuilder1.test653");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        equalsBuilder0.reset();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder4 = equalsBuilder0.append(false, true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder0.append((short) 0, (short) (byte) 1);
        java.lang.Boolean boolean8 = equalsBuilder7.build();
        java.lang.Boolean boolean9 = equalsBuilder7.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder4);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test654");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder2 = equalsBuilder0.appendSuper(true);
        equalsBuilder0.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder2);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test655");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        java.lang.Boolean boolean4 = equalsBuilder3.build();
        boolean boolean5 = equalsBuilder3.isEquals();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder3.append(100.0f, (float) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test656");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((long) '#', (-1L));
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder3.append((int) (byte) 10, 100);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test657");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(0.0d, (double) (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((short) (byte) -1, (short) (byte) 0);
        java.lang.Boolean boolean7 = equalsBuilder6.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.appendSuper(false);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test658");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((short) 1, (short) (byte) 0);
        equalsBuilder0.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test659");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder2 = equalsBuilder0.appendSuper(true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder2.append((byte) 10, (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test660");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        equalsBuilder0.reset();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.appendSuper(false);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder3.appendSuper(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test661");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        equalsBuilder0.reset();
        java.lang.Boolean boolean2 = equalsBuilder0.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.append((int) (byte) 1, 100);
        java.lang.Boolean boolean6 = equalsBuilder5.build();
        equalsBuilder5.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6.equals(false));
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test662");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        java.lang.Boolean boolean4 = equalsBuilder3.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder3.append(100L, 1L);
        java.lang.Boolean boolean8 = equalsBuilder3.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test663");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        equalsBuilder0.reset();
        java.lang.Boolean boolean2 = equalsBuilder0.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.append(false, true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder0.appendSuper(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder7);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test664");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        equalsBuilder0.reset();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder4 = equalsBuilder0.append((byte) -1, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder0.append('a', '#');
        java.lang.Boolean boolean8 = equalsBuilder0.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test665");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((long) '#', 100L);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test666");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        boolean boolean1 = equalsBuilder0.isEquals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test667");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((int) (byte) 100, (int) '#');
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
            System.out.format("%n%s%n", "EqualsBuilder1.test668");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((short) 1, (short) (byte) 1);
        equalsBuilder6.reset();
        java.lang.Boolean boolean8 = equalsBuilder6.build();
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
            System.out.format("%n%s%n", "EqualsBuilder1.test669");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(0.0d, (double) (byte) 0);
        boolean boolean4 = equalsBuilder0.isEquals();
        equalsBuilder0.reset();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder0.append((double) (byte) -1, (double) (short) 0);
        java.lang.Class<?> wildcardClass9 = equalsBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test670");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder2 = equalsBuilder0.appendSuper(true);
        boolean boolean3 = equalsBuilder0.isEquals();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((short) 0, (short) 10);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((int) (byte) 10, (int) (short) 1);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test671");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(10.0f, (float) ' ');
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
            System.out.format("%n%s%n", "EqualsBuilder1.test672");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((byte) 0, (byte) -1);
        java.lang.Boolean boolean7 = equalsBuilder6.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.appendSuper(false);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test673");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((long) '#', (-1L));
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder3.append((double) '4', (double) (-1));
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
            System.out.format("%n%s%n", "EqualsBuilder1.test674");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder2 = equalsBuilder0.appendSuper(true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.append((byte) 0, (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test675");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        long[] longArray2 = new long[] { (-1L) };
        long[] longArray4 = new long[] { (short) 1 };
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.append(longArray2, longArray4);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder5.append(true, true);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test676");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((short) 10, (short) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((double) 1.0f, 10.0d);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test677");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((long) '#', (-1L));
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
            System.out.format("%n%s%n", "EqualsBuilder1.test678");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder2 = equalsBuilder0.appendSuper(true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.append((int) (short) 0, (int) (short) 100);
        equalsBuilder5.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test679");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((short) (byte) -1, (short) (byte) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder3.appendSuper(true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder3.append((long) 100, (long) (byte) 1);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test680");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        java.lang.Boolean boolean4 = equalsBuilder3.build();
        equalsBuilder3.reset();
        equalsBuilder3.reset();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder3.append((long) (short) 10, 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test681");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder2 = equalsBuilder0.appendSuper(true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.append((int) (short) 0, (int) (short) 100);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder5.append((byte) 10, (byte) -1);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test682");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        equalsBuilder0.reset();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder4 = equalsBuilder0.append(1, (int) (short) 10);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder0.append(false, false);
        equalsBuilder7.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder7);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test683");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(0.0d, (double) (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((short) (byte) -1, (short) (byte) 0);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test684");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        equalsBuilder0.reset();
        java.lang.Boolean boolean2 = equalsBuilder0.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.append((int) (byte) 1, 100);
        equalsBuilder0.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test685");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(0.0d, (double) (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((byte) 100, (byte) 0);
        boolean boolean7 = equalsBuilder0.isEquals();
        boolean boolean8 = equalsBuilder0.isEquals();
        java.lang.Boolean boolean9 = equalsBuilder0.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test686");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        equalsBuilder0.reset();
        java.lang.Boolean boolean2 = equalsBuilder0.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.append((int) (byte) 1, 100);
        java.lang.Boolean boolean6 = equalsBuilder5.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder5.append((byte) 100, (byte) 100);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test687");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder2 = equalsBuilder0.appendSuper(true);
        boolean boolean5 = org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals((java.lang.Object) equalsBuilder0, (java.lang.Object) "hi!", true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder0.append((short) (byte) 0, (short) (byte) 100);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test688");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(0.0d, (double) (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.appendSuper(false);
        boolean boolean6 = equalsBuilder5.isEquals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test689");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((short) 1, (short) (byte) 1);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test690");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', 'a');
        java.lang.Object obj4 = null;
        boolean boolean6 = org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals((java.lang.Object) equalsBuilder3, obj4, false);
        java.lang.Boolean boolean7 = equalsBuilder3.build();
        java.lang.Boolean boolean8 = equalsBuilder3.build();
        boolean boolean9 = equalsBuilder3.isEquals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test691");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(0.0d, (double) (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((short) 1, (short) 10);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test692");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        equalsBuilder0.reset();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder4 = equalsBuilder0.append((byte) -1, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder0.append('a', '#');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.appendSuper(true);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test693");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder3.appendSuper(true);
        boolean boolean6 = equalsBuilder3.isEquals();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder3.appendSuper(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test694");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(0, 100);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test695");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(0.0d, (double) (byte) 0);
        java.lang.Boolean boolean4 = equalsBuilder3.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.appendSuper(true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder3.append(false, true);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test696");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((int) (short) 10, (int) (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((double) 10.0f, (double) (byte) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder3.append((short) (byte) 0, (short) -1);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test697");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((byte) 0, (byte) -1);
        java.lang.Object obj7 = null;
        boolean boolean9 = org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals((java.lang.Object) equalsBuilder0, obj7, true);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test698");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((float) 'a', (float) 100);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test699");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((float) (short) 10, (float) (short) 0);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test700");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        equalsBuilder0.reset();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder4 = equalsBuilder0.append((long) (short) 10, (long) (-1));
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder4.append((double) 10L, (double) 100.0f);
        java.lang.Class<?> wildcardClass8 = equalsBuilder7.getClass();
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
            System.out.format("%n%s%n", "EqualsBuilder1.test701");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((short) -1, (short) (byte) -1);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test702");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((short) 10, (short) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test703");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        equalsBuilder0.reset();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder4 = equalsBuilder0.append((byte) -1, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder4.appendSuper(true);
        boolean boolean7 = equalsBuilder4.isEquals();
        boolean boolean8 = equalsBuilder4.isEquals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder4);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test704");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        equalsBuilder0.reset();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder4 = equalsBuilder0.append((byte) -1, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder4.appendSuper(true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((double) (short) -1, (double) (short) 1);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test705");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        equalsBuilder0.reset();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder4 = equalsBuilder0.append((long) (byte) -1, 1L);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder0.append(0, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder7);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test706");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        equalsBuilder0.reset();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.appendSuper(false);
        equalsBuilder0.reset();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder0.append((short) (byte) 10, (short) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder7);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test707");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        long[] longArray2 = new long[] { (-1L) };
        long[] longArray4 = new long[] { (short) 1 };
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.append(longArray2, longArray4);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder0.append(100, (int) (short) -1);
        boolean boolean9 = equalsBuilder0.isEquals();
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
            System.out.format("%n%s%n", "EqualsBuilder1.test708");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        equalsBuilder0.reset();
        java.lang.Boolean boolean2 = equalsBuilder0.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.append(false, true);
        equalsBuilder0.reset();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append((short) (byte) -1, (short) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test709");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        equalsBuilder0.reset();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder4 = equalsBuilder0.append((long) (byte) -1, 1L);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder0.append((short) 100, (short) (byte) 100);
        equalsBuilder7.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder7);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test710");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.appendSuper(true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder0.append(true, true);
        java.lang.Boolean boolean9 = equalsBuilder8.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9.equals(true));
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test711");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(0.0d, (double) (-1.0f));
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append(100, 1);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test712");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((int) (short) 10, (int) (byte) 0);
        java.lang.Boolean boolean4 = equalsBuilder0.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder0.append((float) ' ', (float) 1);
        java.lang.Class<?> wildcardClass8 = equalsBuilder7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test713");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((int) (byte) -1, (int) (short) 10);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((long) (short) -1, (long) (short) -1);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test714");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((float) 10, (float) (byte) 10);
        equalsBuilder6.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test715");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        boolean boolean4 = equalsBuilder3.isEquals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test716");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        double[] doubleArray1 = null;
        double[] doubleArray5 = new double[] { (short) 10, (short) -1, 0L };
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(doubleArray1, doubleArray5);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append((byte) 10, (byte) -1);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test717");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        equalsBuilder0.reset();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.appendSuper(false);
        equalsBuilder0.reset();
        boolean boolean5 = equalsBuilder0.isEquals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test718");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder2 = equalsBuilder0.appendSuper(true);
        boolean boolean3 = equalsBuilder0.isEquals();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((int) (byte) 10, (int) 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append(false, false);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test719");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder2 = equalsBuilder0.appendSuper(true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder2.append((int) (byte) 100, (int) (short) 1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder5.append((short) (byte) 10, (short) (byte) 0);
        equalsBuilder5.reset();
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
            System.out.format("%n%s%n", "EqualsBuilder1.test720");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((short) (byte) -1, (short) (byte) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((-1L), (long) (short) -1);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test721");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((int) (short) 10, (int) (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((short) 10, (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test722");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(false, false);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append((byte) 0, (byte) 10);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test723");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder2 = equalsBuilder0.appendSuper(true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder2.append((int) (byte) 100, (int) (short) 1);
        boolean boolean6 = equalsBuilder5.isEquals();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder5.append(10, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder2);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test724");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(0.0d, (double) (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((byte) 100, (byte) 0);
        boolean boolean7 = equalsBuilder0.isEquals();
        boolean boolean8 = equalsBuilder0.isEquals();
        java.lang.Class<?> wildcardClass9 = equalsBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test725");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder2 = equalsBuilder0.appendSuper(true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.append((int) (short) 0, (int) (short) 100);
        java.lang.Boolean boolean6 = equalsBuilder5.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder5.append((long) (byte) 1, 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder2);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test726");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(false, false);
        java.lang.Boolean boolean7 = equalsBuilder0.build();
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
            System.out.format("%n%s%n", "EqualsBuilder1.test727");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((int) (short) 10, (int) (byte) 0);
        java.lang.Boolean boolean4 = equalsBuilder0.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder0.append((short) 10, (short) 10);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test728");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((float) (short) 10, (float) (short) 0);
        equalsBuilder0.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test729");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((float) (short) 10, (float) (short) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append((long) ' ', (long) ' ');
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
            System.out.format("%n%s%n", "EqualsBuilder1.test730");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder2 = equalsBuilder0.appendSuper(true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.append((-1), (int) '4');
        boolean boolean6 = equalsBuilder5.isEquals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test731");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        equalsBuilder0.reset();
        java.lang.Boolean boolean2 = equalsBuilder0.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.append((int) (byte) 1, 100);
        java.lang.Boolean boolean6 = equalsBuilder5.build();
        java.lang.Boolean boolean7 = equalsBuilder5.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder5.appendSuper(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test732");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((int) '4', (int) (byte) 0);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test733");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((float) 10, (float) (byte) 10);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test734");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((int) '4', (int) (byte) 0);
        equalsBuilder0.reset();
        java.lang.Boolean boolean8 = equalsBuilder0.build();
        boolean boolean9 = equalsBuilder0.isEquals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test735");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((long) (byte) 100, 10L);
        java.lang.Boolean boolean7 = equalsBuilder6.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.appendSuper(false);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test736");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        equalsBuilder0.reset();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder0.append((byte) 1, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder7.appendSuper(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test737");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        equalsBuilder0.reset();
        java.lang.Boolean boolean2 = equalsBuilder0.build();
        java.lang.Boolean boolean3 = equalsBuilder0.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3.equals(true));
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test738");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(0.0d, (double) (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((byte) -1, (byte) 1);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test739");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        equalsBuilder0.reset();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder4 = equalsBuilder0.append(1, (int) (short) 10);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder4.appendSuper(true);
        java.lang.Boolean boolean7 = equalsBuilder4.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7.equals(false));
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test740");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.appendSuper(true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder0.append(true, true);
        equalsBuilder8.reset();
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
            System.out.format("%n%s%n", "EqualsBuilder1.test741");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder2 = equalsBuilder0.appendSuper(true);
        boolean boolean3 = equalsBuilder0.isEquals();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((int) (short) 1, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test742");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', 'a');
        float[] floatArray4 = new float[] {};
        float[] floatArray5 = new float[] {};
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(floatArray4, floatArray5);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append(true, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test743");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(0.0d, (double) (byte) 0);
        java.lang.Boolean boolean4 = equalsBuilder3.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.appendSuper(true);
        java.lang.Boolean boolean7 = equalsBuilder6.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7.equals(true));
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test744");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(0.0d, (double) (byte) 0);
        java.lang.Boolean boolean4 = equalsBuilder3.build();
        java.lang.Boolean boolean5 = equalsBuilder3.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder3.append(false, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test745");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(0.0d, (double) (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((byte) 0, (byte) -1);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test746");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(0.0d, (double) (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((int) 'a', (int) (short) -1);
        java.lang.Boolean boolean7 = equalsBuilder6.build();
        java.lang.Boolean boolean8 = equalsBuilder6.build();
        java.lang.Boolean boolean9 = equalsBuilder6.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test747");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((short) (byte) -1, (short) (byte) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((short) 100, (short) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test748");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        java.lang.Boolean boolean4 = equalsBuilder3.build();
        equalsBuilder3.reset();
        equalsBuilder3.reset();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder3.append(' ', '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test749");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((float) 'a', (float) 100);
        equalsBuilder3.reset();
        java.lang.Boolean boolean8 = equalsBuilder3.build();
        boolean boolean9 = equalsBuilder3.isEquals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test750");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        equalsBuilder0.reset();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder4 = equalsBuilder0.append(10, (int) (byte) 100);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder0.append((short) (byte) -1, (short) 1);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test751");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder2 = equalsBuilder0.appendSuper(true);
        boolean boolean3 = equalsBuilder0.isEquals();
        equalsBuilder0.reset();
        boolean boolean5 = equalsBuilder0.isEquals();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder0.append(false, false);
        java.lang.Class<?> wildcardClass9 = equalsBuilder8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test752");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((double) 100L, 10.0d);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append((float) 1L, (-1.0f));
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
            System.out.format("%n%s%n", "EqualsBuilder1.test753");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(0.0d, (double) (byte) 0);
        java.lang.Boolean boolean4 = equalsBuilder3.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder3.append((float) (byte) 1, (float) (byte) 100);
        boolean boolean8 = equalsBuilder7.isEquals();
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
            System.out.format("%n%s%n", "EqualsBuilder1.test754");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(0.0d, (double) (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((int) 'a', (int) (short) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder6.appendSuper(true);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test755");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((short) 10, (short) -1);
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
            System.out.format("%n%s%n", "EqualsBuilder1.test756");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        long[] longArray2 = new long[] { (-1L) };
        long[] longArray4 = new long[] { (short) 1 };
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.append(longArray2, longArray4);
        boolean[] booleanArray6 = null;
        boolean[] booleanArray7 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder5.append(booleanArray6, booleanArray7);
        equalsBuilder5.reset();
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
            System.out.format("%n%s%n", "EqualsBuilder1.test757");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        equalsBuilder0.reset();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder4 = equalsBuilder0.append((long) (short) 10, (long) (-1));
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder0.append((int) '4', 0);
        equalsBuilder0.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder7);
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test758");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        equalsBuilder0.reset();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder4 = equalsBuilder0.append((long) (byte) -1, 1L);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder0.append(0.0d, 1.0d);
        java.lang.Boolean boolean8 = equalsBuilder0.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
    }

    @Test
    public void EqualsBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.test759");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((int) (short) 10, (int) (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.appendSuper(false);
        equalsBuilder0.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
    }
}

