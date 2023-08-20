package EqualsBuilder;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EqualsBuilder1 {

    public static boolean debug = false;

    @Test
    public void EqualsBuilder501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder501");
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
    public void EqualsBuilder502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder502");
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
    public void EqualsBuilder503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder503");
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
    public void EqualsBuilder504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder504");
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
    public void EqualsBuilder505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder505");
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
    public void EqualsBuilder506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder506");
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
    public void EqualsBuilder507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder507");
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
    public void EqualsBuilder508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder508");
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
    public void EqualsBuilder509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder509");
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
    public void EqualsBuilder510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder510");
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
    public void EqualsBuilder511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder511");
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
    public void EqualsBuilder512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder512");
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
    public void EqualsBuilder513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder513");
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
    public void EqualsBuilder514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder514");
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
    public void EqualsBuilder515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder515");
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
    public void EqualsBuilder516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder516");
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
    public void EqualsBuilder517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder517");
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
    public void EqualsBuilder518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder518");
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
    public void EqualsBuilder519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder519");
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
    public void EqualsBuilder520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder520");
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
    public void EqualsBuilder521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder521");
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
    public void EqualsBuilder522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder522");
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
    public void EqualsBuilder523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder523");
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
    public void EqualsBuilder524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder524");
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
    public void EqualsBuilder525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder525");
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
    public void EqualsBuilder526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder526");
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
    public void EqualsBuilder527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder527");
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
    public void EqualsBuilder528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder528");
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
    public void EqualsBuilder529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder529");
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
    public void EqualsBuilder530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder530");
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
    public void EqualsBuilder531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder531");
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
    public void EqualsBuilder532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder532");
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
    public void EqualsBuilder533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder533");
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
    public void EqualsBuilder534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder534");
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
    public void EqualsBuilder535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder535");
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
    public void EqualsBuilder536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder536");
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
    public void EqualsBuilder537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder537");
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
    public void EqualsBuilder538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder538");
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
    public void EqualsBuilder539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder539");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', 'a');
        java.lang.Class<?> wildcardClass4 = equalsBuilder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void EqualsBuilder540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder540");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((byte) 0, (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((double) 10, 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
    }

    @Test
    public void EqualsBuilder541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder541");
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
    public void EqualsBuilder542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder542");
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
    public void EqualsBuilder543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder543");
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
    public void EqualsBuilder544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder544");
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
    public void EqualsBuilder545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder545");
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
    public void EqualsBuilder546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder546");
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
    public void EqualsBuilder547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder547");
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
    public void EqualsBuilder548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder548");
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
    public void EqualsBuilder549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder549");
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
    public void EqualsBuilder550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder550");
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
    public void EqualsBuilder551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder551");
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
    public void EqualsBuilder552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder552");
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
    public void EqualsBuilder553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder553");
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
    public void EqualsBuilder554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder554");
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
    public void EqualsBuilder555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder555");
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
    public void EqualsBuilder556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder556");
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
    public void EqualsBuilder557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder557");
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
    public void EqualsBuilder558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder558");
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
    public void EqualsBuilder559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder559");
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
    public void EqualsBuilder560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder560");
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
    public void EqualsBuilder561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder561");
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
    public void EqualsBuilder562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder562");
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
    public void EqualsBuilder563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder563");
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
    public void EqualsBuilder564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder564");
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
    public void EqualsBuilder565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder565");
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
    public void EqualsBuilder566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder566");
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
    public void EqualsBuilder567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder567");
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
    public void EqualsBuilder568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder568");
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
    public void EqualsBuilder569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder569");
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
    public void EqualsBuilder570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder570");
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
    public void EqualsBuilder571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder571");
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
    public void EqualsBuilder572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder572");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((short) (byte) -1, (short) (byte) -1);
        java.lang.Class<?> wildcardClass4 = equalsBuilder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void EqualsBuilder573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder573");
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
    public void EqualsBuilder574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder574");
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
    public void EqualsBuilder575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder575");
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
    public void EqualsBuilder576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder576");
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
    public void EqualsBuilder577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder577");
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
    public void EqualsBuilder578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder578");
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
    public void EqualsBuilder579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder579");
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
    public void EqualsBuilder580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder580");
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
    public void EqualsBuilder581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder581");
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
    public void EqualsBuilder582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder582");
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
    public void EqualsBuilder583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder583");
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
    public void EqualsBuilder584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder584");
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
    public void EqualsBuilder585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder585");
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
    public void EqualsBuilder586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder586");
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
    public void EqualsBuilder587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder587");
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
    public void EqualsBuilder588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder588");
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
    public void EqualsBuilder589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder589");
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
    public void EqualsBuilder590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder590");
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
    public void EqualsBuilder591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder591");
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
    public void EqualsBuilder592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder592");
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
    public void EqualsBuilder593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder593");
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
    public void EqualsBuilder594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder594");
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
    public void EqualsBuilder595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder595");
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
    public void EqualsBuilder596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder596");
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
    public void EqualsBuilder597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder597");
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
    public void EqualsBuilder598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder598");
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
    public void EqualsBuilder599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder599");
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
    public void EqualsBuilder600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder600");
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
    public void EqualsBuilder601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder601");
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
    public void EqualsBuilder602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder602");
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
    public void EqualsBuilder603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder603");
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
    public void EqualsBuilder604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder604");
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
    public void EqualsBuilder605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder605");
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
    public void EqualsBuilder606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder606");
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
    public void EqualsBuilder607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder607");
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
    public void EqualsBuilder608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder608");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((long) ' ', (long) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
    }

    @Test
    public void EqualsBuilder609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder609");
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
    public void EqualsBuilder610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder610");
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
    public void EqualsBuilder611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder611");
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
    public void EqualsBuilder612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder612");
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
    public void EqualsBuilder613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder613");
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
    public void EqualsBuilder614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder614");
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
    public void EqualsBuilder615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder615");
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
    public void EqualsBuilder616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder616");
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
    public void EqualsBuilder617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder617");
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
    public void EqualsBuilder618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder618");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        float[] floatArray1 = null;
        float[] floatArray2 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append(floatArray1, floatArray2);
        equalsBuilder0.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
    }

    @Test
    public void EqualsBuilder619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder619");
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
    public void EqualsBuilder620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder620");
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
    public void EqualsBuilder621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder621");
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
    public void EqualsBuilder622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder622");
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
    public void EqualsBuilder623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder623");
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
    public void EqualsBuilder624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder624");
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
    public void EqualsBuilder625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder625");
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
    public void EqualsBuilder626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder626");
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
    public void EqualsBuilder627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder627");
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
    public void EqualsBuilder628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder628");
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
    public void EqualsBuilder629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder629");
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
    public void EqualsBuilder630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder630");
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
    public void EqualsBuilder631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder631");
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
    public void EqualsBuilder632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder632");
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
    public void EqualsBuilder633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder633");
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
    public void EqualsBuilder634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder634");
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
    public void EqualsBuilder635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder635");
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
    public void EqualsBuilder636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder636");
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
    public void EqualsBuilder637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder637");
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
    public void EqualsBuilder638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder638");
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
    public void EqualsBuilder639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder639");
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
    public void EqualsBuilder640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder640");
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
    public void EqualsBuilder641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder641");
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
    public void EqualsBuilder642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder642");
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
    public void EqualsBuilder643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder643");
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
    public void EqualsBuilder644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder644");
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
    public void EqualsBuilder645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder645");
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
    public void EqualsBuilder646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder646");
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
    public void EqualsBuilder647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder647");
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
    public void EqualsBuilder648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder648");
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
    public void EqualsBuilder649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder649");
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
    public void EqualsBuilder650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder650");
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
    public void EqualsBuilder651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder651");
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
    public void EqualsBuilder652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder652");
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
    public void EqualsBuilder653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder653");
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
    public void EqualsBuilder654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder654");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder2 = equalsBuilder0.appendSuper(true);
        equalsBuilder0.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder2);
    }

    @Test
    public void EqualsBuilder655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder655");
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
    public void EqualsBuilder656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder656");
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
    public void EqualsBuilder657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder657");
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
    public void EqualsBuilder658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder658");
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
    public void EqualsBuilder659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder659");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder2 = equalsBuilder0.appendSuper(true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder2.append((byte) 10, (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
    }

    @Test
    public void EqualsBuilder660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder660");
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
    public void EqualsBuilder661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder661");
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
    public void EqualsBuilder662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder662");
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
    public void EqualsBuilder663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder663");
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
    public void EqualsBuilder664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder664");
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
    public void EqualsBuilder665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder665");
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
    public void EqualsBuilder666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder666");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        boolean boolean1 = equalsBuilder0.isEquals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void EqualsBuilder667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder667");
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
    public void EqualsBuilder668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder668");
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
    public void EqualsBuilder669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder669");
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
    public void EqualsBuilder670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder670");
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
    public void EqualsBuilder671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder671");
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
    public void EqualsBuilder672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder672");
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
    public void EqualsBuilder673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder673");
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
    public void EqualsBuilder674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder674");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder2 = equalsBuilder0.appendSuper(true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.append((byte) 0, (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
    }

    @Test
    public void EqualsBuilder675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder675");
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
    public void EqualsBuilder676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder676");
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
    public void EqualsBuilder677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder677");
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
    public void EqualsBuilder678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder678");
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
    public void EqualsBuilder679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder679");
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
    public void EqualsBuilder680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder680");
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
    public void EqualsBuilder681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder681");
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
    public void EqualsBuilder682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder682");
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
    public void EqualsBuilder683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder683");
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
    public void EqualsBuilder684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder684");
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
    public void EqualsBuilder685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder685");
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
    public void EqualsBuilder686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder686");
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
    public void EqualsBuilder687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder687");
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
    public void EqualsBuilder688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder688");
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
    public void EqualsBuilder689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder689");
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
    public void EqualsBuilder690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder690");
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
    public void EqualsBuilder691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder691");
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
    public void EqualsBuilder692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder692");
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
    public void EqualsBuilder693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder693");
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
    public void EqualsBuilder694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder694");
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
    public void EqualsBuilder695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder695");
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
    public void EqualsBuilder696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder696");
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
    public void EqualsBuilder697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder697");
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
    public void EqualsBuilder698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder698");
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
    public void EqualsBuilder699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder699");
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
    public void EqualsBuilder700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder700");
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
    public void EqualsBuilder701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder701");
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
    public void EqualsBuilder702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder702");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((short) 10, (short) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
    }

    @Test
    public void EqualsBuilder703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder703");
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
    public void EqualsBuilder704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder704");
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
    public void EqualsBuilder705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder705");
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
    public void EqualsBuilder706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder706");
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
    public void EqualsBuilder707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder707");
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
    public void EqualsBuilder708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder708");
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
    public void EqualsBuilder709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder709");
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
    public void EqualsBuilder710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder710");
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
    public void EqualsBuilder711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder711");
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
    public void EqualsBuilder712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder712");
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
    public void EqualsBuilder713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder713");
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
    public void EqualsBuilder714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder714");
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
    public void EqualsBuilder715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder715");
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
    public void EqualsBuilder716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder716");
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
    public void EqualsBuilder717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder717");
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
    public void EqualsBuilder718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder718");
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
    public void EqualsBuilder719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder719");
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
    public void EqualsBuilder720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder720");
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
    public void EqualsBuilder721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder721");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((int) (short) 10, (int) (byte) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((short) 10, (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
    }

    @Test
    public void EqualsBuilder722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder722");
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
    public void EqualsBuilder723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder723");
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
    public void EqualsBuilder724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder724");
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
    public void EqualsBuilder725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder725");
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
    public void EqualsBuilder726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder726");
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
    public void EqualsBuilder727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder727");
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
    public void EqualsBuilder728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder728");
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
    public void EqualsBuilder729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder729");
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
    public void EqualsBuilder730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder730");
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
    public void EqualsBuilder731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder731");
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
    public void EqualsBuilder732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder732");
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
    public void EqualsBuilder733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder733");
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
    public void EqualsBuilder734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder734");
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
    public void EqualsBuilder735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder735");
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
    public void EqualsBuilder736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder736");
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
    public void EqualsBuilder737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder737");
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
    public void EqualsBuilder738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder738");
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
    public void EqualsBuilder739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder739");
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
    public void EqualsBuilder740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder740");
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
    public void EqualsBuilder741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder741");
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
    public void EqualsBuilder742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder742");
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
    public void EqualsBuilder743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder743");
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
    public void EqualsBuilder744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder744");
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
    public void EqualsBuilder745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder745");
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
    public void EqualsBuilder746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder746");
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
    public void EqualsBuilder747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder747");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((short) (byte) -1, (short) (byte) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((short) 100, (short) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
    }

    @Test
    public void EqualsBuilder748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder748");
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
    public void EqualsBuilder749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder749");
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
    public void EqualsBuilder750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder750");
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
    public void EqualsBuilder751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder751");
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
    public void EqualsBuilder752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder752");
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
    public void EqualsBuilder753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder753");
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
    public void EqualsBuilder754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder754");
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
    public void EqualsBuilder755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder755");
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
    public void EqualsBuilder756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder756");
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
    public void EqualsBuilder757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder757");
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
    public void EqualsBuilder758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder758");
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
    public void EqualsBuilder759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder1.EqualsBuilder759");
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

