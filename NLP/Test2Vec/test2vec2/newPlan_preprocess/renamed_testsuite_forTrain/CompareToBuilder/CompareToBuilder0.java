
package CompareToBuilder;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CompareToBuilder0 {

    public static boolean debug = false;

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test001");
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) 0, obj1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test002");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder1 = new org.apache.commons.lang3.builder.CompareToBuilder();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) 1, (java.lang.Object) compareToBuilder1, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test003");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray3 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray4 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(shortArray3, shortArray4);
        java.lang.Integer int6 = compareToBuilder0.build();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append((short) 10, (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test004");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray3 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray4 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(shortArray3, shortArray4);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder0.append(0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass9 = compareToBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test005");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray3 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray4 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(shortArray3, shortArray4);
        java.lang.Integer int6 = compareToBuilder0.build();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append(true, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test006");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray3 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray4 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(shortArray3, shortArray4);
        java.lang.Integer int6 = compareToBuilder0.build();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append((int) '4', (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test007");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) (byte) 10, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test008");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = new org.apache.commons.lang3.builder.CompareToBuilder();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((java.lang.Object) 1.0d, (java.lang.Object) compareToBuilder5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.lang3.builder.CompareToBuilder cannot be cast to java.lang.Double");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test009");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((float) (-1L), (float) (byte) -1);
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray8 = new byte[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append(byteArray7, byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test010");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) (byte) 100, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test011");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((float) (-1L), (float) (byte) -1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((long) (byte) 1, (long) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test012");
        java.lang.Object obj0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare(obj0, (java.lang.Object) (byte) -1, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test013");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) 10L, (java.lang.Object) (-1), strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test014");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        java.lang.Class<?> wildcardClass4 = compareToBuilder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test015");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder1 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray4 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray5 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder1.append(shortArray4, shortArray5);
        int int7 = compareToBuilder1.toComparison();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) 0L, (java.lang.Object) int7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test016");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) 100.0d, (java.lang.Object) '4', (java.util.Collection<java.lang.String>) strList4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test017");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray3 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray4 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(shortArray3, shortArray4);
        java.lang.Class<?> wildcardClass6 = shortArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test018");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((float) (-1L), (float) (byte) -1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append(false, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test019");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        float[] floatArray6 = new float[] { (short) 1, (byte) 1 };
        float[] floatArray8 = new float[] { 0.0f };
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append(floatArray6, floatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test020");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((int) (short) 1, (int) (short) 1);
        boolean[] booleanArray7 = new boolean[] {};
        boolean[] booleanArray8 = null;
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append(booleanArray7, booleanArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test021");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) 0L, (java.lang.Object) true, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test022");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder1 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray4 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray5 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder1.append(shortArray4, shortArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) (short) 10, (java.lang.Object) shortArray5, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test023");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((int) (short) 1, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((byte) 0, (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test024");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray3 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray4 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(shortArray3, shortArray4);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder5.append((long) '4', (long) (short) 10);
        java.lang.Integer int9 = compareToBuilder5.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9.equals(1));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test025");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((short) (byte) 0, (short) (byte) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append('a', '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test026");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((int) (short) 1, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append((int) (short) 0, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test027");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((short) (byte) 0, (short) (byte) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append((float) 0L, 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test028");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) 1L, (java.lang.Object) 10, strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test029");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray3 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray4 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(shortArray3, shortArray4);
        java.lang.Integer int6 = compareToBuilder0.build();
        java.lang.Class<?> wildcardClass7 = compareToBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test030");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((float) 10, (float) (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append(0L, (long) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test031");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((byte) 10, (byte) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.append(' ', ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test032");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray3 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray4 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(shortArray3, shortArray4);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder0.append((double) (-1.0f), (double) 100);
        int int9 = compareToBuilder8.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test033");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray3 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray4 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(shortArray3, shortArray4);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder5.append((long) '4', (long) (short) 10);
        java.lang.Class<?> wildcardClass9 = compareToBuilder5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test034");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((float) 10, (float) (short) 100);
        int int7 = compareToBuilder6.toComparison();
        java.lang.Class<?> wildcardClass8 = compareToBuilder6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test035");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        double[] doubleArray7 = new double[] { 0L, (short) 10, 10.0d, 10.0f, ' ', (-1.0f) };
        double[] doubleArray8 = new double[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append(doubleArray7, doubleArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test036");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) 100L, (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test037");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray3 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray4 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(shortArray3, shortArray4);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder5.append((int) (byte) 100, (int) 'a');
        java.lang.Integer int9 = compareToBuilder5.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9.equals(1));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test038");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray3 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray4 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(shortArray3, shortArray4);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder0.append((double) (-1.0f), (double) 100);
        java.lang.Class<?> wildcardClass9 = compareToBuilder8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test039");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray3 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray4 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(shortArray3, shortArray4);
        java.lang.Object obj6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) shortArray3, obj6, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test040");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.appendSuper((int) (short) -1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append(100.0d, (double) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test041");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) (short) 0, (java.lang.Object) false, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test042");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((float) ' ', (float) (byte) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append(100, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test043");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) (short) 0, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test044");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj1 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare(obj0, obj1, strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test045");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.appendSuper((int) (short) -1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((byte) 0, (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test046");
        int int2 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) false, (java.lang.Object) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test047");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray3 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray4 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(shortArray3, shortArray4);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder5.append((int) (byte) 100, (int) 'a');
        java.lang.Class<?> wildcardClass9 = compareToBuilder5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test048");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) (short) 100, (java.lang.Object) 10L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test049");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray3 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray4 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(shortArray3, shortArray4);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder5.appendSuper(1);
        int int8 = compareToBuilder7.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test050");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((int) (short) 1, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append((short) 0, (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test051");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((int) (short) 1, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append(' ', 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test052");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray3 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray4 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(shortArray3, shortArray4);
        java.lang.Integer int6 = compareToBuilder0.build();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append((short) 0, (short) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test053");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder3.append(true, true);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.appendSuper(100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test054");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((byte) 10, (byte) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.append((short) 0, (short) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test055");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.appendSuper((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) compareToBuilder6, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test056");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray3 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray4 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(shortArray3, shortArray4);
        java.lang.Class<?> wildcardClass6 = shortArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test057");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((short) (byte) 0, (short) (byte) 0);
        java.lang.Class<?> wildcardClass7 = compareToBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test058");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray3 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray4 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(shortArray3, shortArray4);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder0.append(0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass9 = compareToBuilder8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test059");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder1 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray4 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray5 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder1.append(shortArray4, shortArray5);
        java.lang.Class<?> wildcardClass7 = compareToBuilder1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) 'a', (java.lang.Object) wildcardClass7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test060");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) "", (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test061");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((int) (short) 1, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder6.appendSuper(0);
        java.lang.Integer int9 = compareToBuilder8.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9.equals((-1)));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test062");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder0.append(false, false);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder7.appendSuper(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test063");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray3 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray4 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(shortArray3, shortArray4);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder5.append((long) '4', (long) (short) 10);
        java.lang.Integer int9 = compareToBuilder8.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9.equals(1));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test064");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((float) ' ', (float) (byte) 0);
        int int7 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.appendSuper((int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test065");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder0.append((short) (byte) 10, (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.appendSuper((int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test066");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        java.lang.String[] strArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) compareToBuilder0, (java.lang.Object) "", strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test067");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((float) ' ', (float) (byte) 0);
        int int7 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.appendSuper(100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test068");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray3 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray4 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(shortArray3, shortArray4);
        long[] longArray6 = new long[] {};
        long[] longArray7 = null;
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder0.append(longArray6, longArray7);
        java.lang.Class<?> wildcardClass9 = compareToBuilder8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test069");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray3 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray4 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(shortArray3, shortArray4);
        int int6 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append((short) (byte) 1, (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test070");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((int) (short) 1, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append((int) '#', (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test071");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder0.append((short) (byte) 10, (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.appendSuper((int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test072");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((float) (-1L), (float) (byte) -1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((short) (byte) 10, (short) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test073");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.appendSuper((int) ' ');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((byte) 10, (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test074");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        java.lang.Integer int4 = compareToBuilder0.build();
        short[] shortArray5 = new short[] {};
        short[] shortArray8 = new short[] { (byte) 0, (byte) -1 };
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append(shortArray5, shortArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test075");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray3 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray4 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(shortArray3, shortArray4);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder5.append('#', '4');
        java.lang.Class<?> wildcardClass9 = compareToBuilder5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test076");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((short) (byte) 0, (short) (byte) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((long) 10, (long) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test077");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.appendSuper((int) ' ');
        java.lang.Class<?> wildcardClass7 = compareToBuilder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test078");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((float) (-1L), (float) (byte) -1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append(' ', ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test079");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray3 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray4 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(shortArray3, shortArray4);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder5.append(100, (int) (byte) 1);
        int int9 = compareToBuilder5.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test080");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((byte) 10, (byte) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((int) (byte) 100, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test081");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray3 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray4 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(shortArray3, shortArray4);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder5.append((int) (byte) 100, (int) 'a');
        int int9 = compareToBuilder5.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test082");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.appendSuper((int) ' ');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append(' ', 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test083");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray3 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray4 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(shortArray3, shortArray4);
        int int6 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append(true, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test084");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder1 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder4 = compareToBuilder1.append((int) (short) 0, (int) (short) 1);
        int int5 = compareToBuilder4.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder4.appendSuper((int) (short) -1);
        int int9 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) (short) 1, (java.lang.Object) (short) -1, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test085");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder0.append(false, false);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder7.appendSuper((int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test086");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((float) ' ', (float) (byte) 0);
        java.lang.Class<?> wildcardClass7 = compareToBuilder6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test087");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray3 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray4 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(shortArray3, shortArray4);
        int int6 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append(false, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test088");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((float) (-1L), (float) (byte) -1);
        int int7 = compareToBuilder0.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test089");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append(true, false);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((float) 100, (float) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test090");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.appendSuper((int) ' ');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((byte) -1, (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test091");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((byte) 10, (byte) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.append((long) (short) 100, (long) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test092");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((int) (short) 1, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append((float) (byte) 1, (float) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test093");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append(0L, 100L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.append('4', '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test094");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((float) 10, (float) (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append(' ', '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test095");
        java.lang.Object obj0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare(obj0, (java.lang.Object) 100.0f, (java.util.Collection<java.lang.String>) strList5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test096");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((byte) 10, (byte) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.append('4', '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test097");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((float) (-1L), (float) (byte) -1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder0.appendSuper((-1));
        int int9 = compareToBuilder8.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test098");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((float) 10, (float) (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append(0.0f, (float) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test099");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((short) (byte) 0, (short) (byte) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append((float) (short) 1, (float) 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test100");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray3 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray4 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(shortArray3, shortArray4);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder5.append('#', '4');
        java.lang.Integer int9 = compareToBuilder5.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9.equals(1));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test101");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((float) (-1L), (float) (byte) -1);
        java.lang.Class<?> wildcardClass7 = compareToBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test102");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) "hi!", (java.lang.Object) (short) 0, strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test103");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((byte) 10, (byte) 100);
        java.lang.Class<?> wildcardClass7 = compareToBuilder6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test104");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((int) (short) 1, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append(false, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test105");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        java.lang.Integer int4 = compareToBuilder0.build();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) int4, (java.lang.Object) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4.equals(0));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test106");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.appendSuper((int) (short) -1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((long) (byte) 1, (long) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test107");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((byte) 10, (byte) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((-1L), (long) 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test108");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((short) (byte) 0, (short) (byte) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append((byte) 1, (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test109");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder1 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder4 = compareToBuilder1.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder4.append(0L, (long) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) "hi!", (java.lang.Object) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test110");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray3 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray4 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(shortArray3, shortArray4);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder5.append((int) (byte) 100, (int) 'a');
        int int9 = compareToBuilder8.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test111");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.appendSuper((int) (short) -1);
        java.lang.Integer int7 = compareToBuilder6.build();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.appendSuper(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test112");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append(true, false);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append((byte) -1, (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test113");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.appendSuper((int) (short) -1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.append((float) 100L, (float) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test114");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((float) ' ', (float) (byte) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append(100.0d, (double) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test115");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder1 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder4 = compareToBuilder1.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder1.append(false, true);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) 0.0d, (java.lang.Object) false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test116");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray3 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray4 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(shortArray3, shortArray4);
        long[] longArray6 = new long[] {};
        long[] longArray7 = null;
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder0.append(longArray6, longArray7);
        int int9 = compareToBuilder8.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test117");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((byte) 10, (byte) 100);
        java.lang.Integer int7 = compareToBuilder3.build();
        java.lang.Class<?> wildcardClass8 = compareToBuilder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test118");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((float) (-1L), (float) (byte) -1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder0.appendSuper((-1));
        int int9 = compareToBuilder0.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test119");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray3 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray4 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(shortArray3, shortArray4);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder5.append(true, true);
        int int9 = compareToBuilder8.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test120");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append(false, true);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append('a', '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test121");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder1 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder1.appendSuper((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) 0L, (java.lang.Object) compareToBuilder1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test122");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((float) (-1L), (float) (byte) -1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder0.appendSuper((-1));
        java.lang.Integer int9 = compareToBuilder8.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9.equals((-1)));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test123");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) "hi!", (java.lang.Object) (-1.0f), strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test124");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((float) (short) 100, (float) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((byte) -1, (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test125");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray3 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray4 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(shortArray3, shortArray4);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder5.append(true, true);
        java.lang.Class<?> wildcardClass9 = compareToBuilder5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test126");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) compareToBuilder0, (java.lang.Object) '#', (java.util.Collection<java.lang.String>) strList4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test127");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray3 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray4 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(shortArray3, shortArray4);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder5.append(100, (int) (byte) 1);
        int int9 = compareToBuilder8.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test128");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((byte) 10, (byte) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append('a', 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test129");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.appendSuper((int) (short) -1);
        char[] charArray7 = new char[] {};
        char[] charArray8 = null;
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.append(charArray7, charArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test130");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append(true, false);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append(true, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test131");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare(obj0, (java.lang.Object) 0L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test132");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((byte) 10, (byte) 100);
        char[] charArray7 = new char[] {};
        char[] charArray8 = null;
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.append(charArray7, charArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test133");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder0.append(false, false);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) false, (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test134");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.appendSuper((int) (short) -1);
        int int7 = compareToBuilder3.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test135");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((float) (-1L), (float) (byte) -1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append((float) (short) 0, (float) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test136");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((short) (byte) 0, (short) (byte) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append(10.0f, 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test137");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray3 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray4 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(shortArray3, shortArray4);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder5.append(true, true);
        java.lang.Integer int9 = compareToBuilder5.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9.equals(1));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test138");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((float) 10, (float) (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.append(10, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test139");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.appendSuper((int) ' ');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append(false, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test140");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray3 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray4 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(shortArray3, shortArray4);
        int int6 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append(100, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test141");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((byte) 10, (byte) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((double) 0.0f, (double) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test142");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append(true, false);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((float) (-1), (float) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test143");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append(0L, 100L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((long) (short) 10, (long) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test144");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.appendSuper((int) (short) -1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.append('4', ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test145");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray3 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray4 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(shortArray3, shortArray4);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder0.append((int) (byte) 1, 100);
        java.lang.Class<?> wildcardClass9 = compareToBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test146");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder0.append((short) (byte) 10, (short) 100);
        java.lang.Integer int8 = compareToBuilder7.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8.equals((-1)));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test147");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append(0L, 100L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder6.appendSuper((int) ' ');
        java.lang.Integer int9 = compareToBuilder8.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9.equals((-1)));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test148");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder3.append(false, true);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder7.appendSuper((int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test149");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((float) (short) 100, (float) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((float) (short) -1, 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test150");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append(0L, 100L);
        java.lang.Class<?> wildcardClass7 = compareToBuilder6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test151");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((float) ' ', (float) (byte) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append((float) (short) 100, 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test152");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append(0L, (long) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append(true, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test153");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((float) 10, (float) (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder6.appendSuper((int) ' ');
        java.lang.Class<?> wildcardClass9 = compareToBuilder6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test154");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.appendSuper((int) ' ');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((byte) 100, (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test155");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray3 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray4 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(shortArray3, shortArray4);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder5.append(false, false);
        java.lang.Integer int9 = compareToBuilder8.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9.equals(1));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test156");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        int int1 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.appendSuper((int) '#');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((int) (byte) 1, (int) (short) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((byte) 1, (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test157");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        int int4 = compareToBuilder3.toComparison();
        int int5 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder3.append((short) -1, (short) -1);
        java.lang.Integer int9 = compareToBuilder3.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9.equals(0));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test158");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder1 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray4 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray5 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder1.append(shortArray4, shortArray5);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder6.appendSuper(1);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) '4', (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test159");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((long) 1, (long) (short) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append(true, false);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append((float) 2, (float) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test160");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder3.append(true, true);
        java.lang.Class<?> wildcardClass8 = compareToBuilder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test161");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append(0L, (long) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.append((byte) 0, (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test162");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((float) 10, (float) (short) 100);
        java.lang.Object obj7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) compareToBuilder6, obj7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test163");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder3.append((float) '#', (float) (short) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder7.appendSuper(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test164");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((float) (byte) -1, (float) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) (byte) -1, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test165");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray3 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray4 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(shortArray3, shortArray4);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder0.append((float) (short) 0, (float) '#');
        java.lang.Integer int9 = compareToBuilder0.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9.equals(1));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test166");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((float) (-1L), (float) (byte) -1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append((float) 100, (float) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test167");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.appendSuper((int) ' ');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append('a', '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test168");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((float) (-1L), (float) (byte) -1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append((double) 'a', (double) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test169");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((int) (short) 1, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder6.appendSuper(0);
        int int9 = compareToBuilder6.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test170");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.appendSuper((int) ' ');
        java.lang.Integer int7 = compareToBuilder6.build();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.appendSuper((int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7.equals(32));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test171");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        int int4 = compareToBuilder3.toComparison();
        int int5 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder3.append((long) (short) -1, (long) (-1));
        java.lang.Class<?> wildcardClass9 = compareToBuilder8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test172");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray3 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray4 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(shortArray3, shortArray4);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder0.append((int) (byte) 1, 100);
        int int9 = compareToBuilder8.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test173");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray3 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray4 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(shortArray3, shortArray4);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder0.append((float) (short) 0, (float) '#');
        java.lang.Class<?> wildcardClass9 = compareToBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test174");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((short) (byte) 0, (short) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) compareToBuilder6, (java.lang.Object) 1L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test175");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray3 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray4 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(shortArray3, shortArray4);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder5.append(true, true);
        int int9 = compareToBuilder5.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test176");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray3 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray4 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(shortArray3, shortArray4);
        int int6 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append((float) 10L, (float) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test177");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append(true, false);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((double) 2, (double) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test178");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((float) ' ', (float) (byte) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder6.appendSuper((int) ' ');
        java.lang.Integer int9 = compareToBuilder8.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9.equals(1));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test179");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((float) (short) 100, (float) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((byte) -1, (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test180");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((int) (short) 1, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((float) 1, (float) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test181");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((byte) 10, (byte) 100);
        java.lang.Integer int7 = compareToBuilder3.build();
        int int8 = compareToBuilder3.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test182");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare(obj0, (java.lang.Object) 100.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test183");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.appendSuper((int) (short) -1);
        int int7 = compareToBuilder6.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.appendSuper((-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test184");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        java.lang.Integer int4 = compareToBuilder0.build();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder0.append((int) '4', 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.appendSuper(10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test185");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder0.append(false, false);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder7.appendSuper((int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test186");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray3 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray4 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(shortArray3, shortArray4);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder0.append((double) (-1.0f), (double) 100);
        java.lang.Class<?> wildcardClass9 = compareToBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test187");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        int int4 = compareToBuilder3.toComparison();
        long[] longArray7 = new long[] { 2, ' ' };
        long[] longArray8 = new long[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.append(longArray7, longArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test188");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((long) 1, (long) (short) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder3.appendSuper((int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder3.append((long) 10, 0L);
        java.lang.Class<?> wildcardClass9 = compareToBuilder8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test189");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray3 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray4 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(shortArray3, shortArray4);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder5.append((long) 0, 0L);
        int int9 = compareToBuilder5.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test190");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((float) (short) 100, (float) 100);
        int int7 = compareToBuilder0.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test191");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((float) (-1L), (float) (byte) -1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder0.appendSuper((int) (short) 0);
        java.lang.Integer int9 = compareToBuilder8.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9.equals(0));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test192");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((byte) 10, (byte) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append('a', '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test193");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((short) (byte) 0, (short) (byte) 0);
        int int7 = compareToBuilder6.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.appendSuper((int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test194");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((long) 1, (long) (short) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append(true, false);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((double) (byte) 100, (double) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test195");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        java.lang.Integer int4 = compareToBuilder0.build();
        java.lang.Class<?> wildcardClass5 = compareToBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test196");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder1 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder4 = compareToBuilder1.append((long) 1, (long) (short) 10);
        int int5 = compareToBuilder4.toComparison();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare(obj0, (java.lang.Object) compareToBuilder4, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test197");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder0.append(false, false);
        java.lang.Class<?> wildcardClass8 = compareToBuilder7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test198");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder4 = compareToBuilder0.appendSuper(10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder4.appendSuper(10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((double) 0.0f, (double) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test199");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((byte) 10, (byte) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append(false, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test200");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((short) (byte) 0, (short) (byte) 0);
        java.lang.Integer int7 = compareToBuilder0.build();
        int int8 = compareToBuilder0.toComparison();
        java.lang.Class<?> wildcardClass9 = compareToBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test201");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.appendSuper(2);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append((short) 100, (short) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test202");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((float) ' ', (float) (byte) 0);
        int int7 = compareToBuilder0.toComparison();
        java.lang.Class<?> wildcardClass8 = compareToBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test203");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder3.append(true, true);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder7.appendSuper((int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test204");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder4 = compareToBuilder0.appendSuper(10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder4.appendSuper(10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((short) 10, (short) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test205");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((-1), (-1));
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((byte) 100, (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test206");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.appendSuper(2);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append((short) (byte) 1, (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test207");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((float) (short) 100, (float) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((long) 1, (long) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test208");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray3 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray4 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(shortArray3, shortArray4);
        int int6 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append(0.0d, (double) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test209");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray3 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray4 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(shortArray3, shortArray4);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder5.appendSuper(1);
        java.lang.Integer int8 = compareToBuilder5.build();
        int int9 = compareToBuilder5.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test210");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((byte) 10, (byte) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((-1), (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test211");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((-1), (-1));
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.append((float) (byte) 10, (float) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test212");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.appendSuper((int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.append((byte) 0, (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test213");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (-1.0f), (double) (short) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((long) (byte) -1, 0L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append(false, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test214");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.appendSuper(2);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append((float) (short) -1, (float) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test215");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((long) 1, (long) (short) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((double) 100L, (double) ' ');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.append((byte) 0, (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test216");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append(0L, 100L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder3.appendSuper((int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test217");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray3 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray4 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(shortArray3, shortArray4);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder5.append((long) 0, 0L);
        int int9 = compareToBuilder8.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test218");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((long) (-1), 0L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append((int) (byte) 0, 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test219");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.appendSuper(2);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((int) (short) 0, 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test220");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((long) 1, (long) (short) 10);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder3.append((byte) 0, (byte) 10);
        java.lang.Integer int8 = compareToBuilder3.build();
        int int9 = compareToBuilder3.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test221");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((long) 1, (long) (short) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append(true, false);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append((short) (byte) 100, (short) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test222");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray3 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray4 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(shortArray3, shortArray4);
        int int6 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append((float) 1, (float) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test223");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((float) ' ', (float) (byte) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((long) (byte) 100, 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test224");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        int int1 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.appendSuper((int) '#');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((double) 'a', (double) (byte) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((long) 0, (long) 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test225");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder1 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray4 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray5 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder1.append(shortArray4, shortArray5);
        java.lang.String[] strArray7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) 10.0d, (java.lang.Object) shortArray4, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test226");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((float) (short) 100, (float) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder6.appendSuper((int) (short) 10);
        java.lang.Class<?> wildcardClass9 = compareToBuilder8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test227");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder3.append((long) 35, 1L);
        java.lang.Class<?> wildcardClass8 = compareToBuilder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test228");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.appendSuper(2);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((double) (short) 0, (double) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test229");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        int int1 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.appendSuper((int) '#');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((double) 'a', (double) (byte) 0);
        java.lang.Class<?> wildcardClass7 = compareToBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test230");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.appendSuper(2);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append((float) (short) 100, (float) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test231");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        int int1 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder4 = compareToBuilder0.append((float) (short) 100, (float) (byte) -1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder0.append((short) (byte) -1, (short) (byte) 1);
        java.lang.Class<?> wildcardClass8 = compareToBuilder7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test232");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((float) (-1L), (float) (byte) -1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((-1L), (long) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test233");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder2.append((double) 100, 0.0d);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder5.append((-1L), (long) (short) 1);
        java.lang.Class<?> wildcardClass9 = compareToBuilder5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test234");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.appendSuper((int) (short) -1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append(' ', 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test235");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder1 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder1.appendSuper((int) (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder1.append(false, false);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare(obj0, (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test236");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.appendSuper((int) (short) -1);
        java.lang.Integer int7 = compareToBuilder6.build();
        java.lang.Class<?> wildcardClass8 = compareToBuilder6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test237");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder0.toComparison();
        java.lang.Integer int5 = compareToBuilder0.build();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder0.append(false, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test238");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) 10L, (java.lang.Object) 0.0f, (java.util.Collection<java.lang.String>) strList5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test239");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((float) (-1L), (float) (byte) -1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((float) 100L, 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test240");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((float) 10, (float) (short) 100);
        java.lang.Integer int7 = compareToBuilder3.build();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.appendSuper((-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test241");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append(true, false);
        java.lang.Object obj7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) compareToBuilder0, obj7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test242");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        int int1 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.appendSuper((int) '#');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((int) (byte) 1, (int) (short) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder0.appendSuper(100);
        int int9 = compareToBuilder0.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test243");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(false, false);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder0.append((long) 2, (long) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test244");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append(false, true);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append(100.0d, (double) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test245");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder4 = compareToBuilder0.appendSuper(10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder0.append(' ', 'a');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder7.appendSuper((int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test246");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append(0L, 100L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder6.appendSuper((int) (short) 10);
        java.lang.Class<?> wildcardClass9 = compareToBuilder6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test247");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder4 = compareToBuilder0.appendSuper(10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder4.appendSuper(10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((long) (byte) -1, (long) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test248");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.appendSuper((int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.append((long) ' ', (long) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test249");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append(false, true);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append((byte) 10, (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test250");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.appendSuper((int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append(32, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test251");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.appendSuper((int) (short) -1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.append('a', 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test252");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        java.lang.Integer int4 = compareToBuilder0.build();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder0.append((int) '4', 0);
        int int8 = compareToBuilder7.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test253");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray3 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray4 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(shortArray3, shortArray4);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder5.append(false, false);
        java.lang.Integer int9 = compareToBuilder5.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9.equals(1));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test254");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append(false, true);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append(2, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test255");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.appendSuper((int) ' ');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append('4', ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test256");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((long) 1, (long) (short) 10);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder3.append((byte) 0, (byte) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder7.appendSuper((-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test257");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder4 = compareToBuilder0.appendSuper(10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder0.append(' ', 'a');
        java.lang.Class<?> wildcardClass8 = compareToBuilder7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test258");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((long) 1, (long) (short) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((double) 100L, (double) ' ');
        java.lang.Class<?> wildcardClass7 = compareToBuilder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test259");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((float) 10, (float) (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.append((byte) -1, (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test260");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append(0L, 100L);
        java.lang.Class<?> wildcardClass7 = compareToBuilder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test261");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((float) (byte) -1, (float) ' ');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.appendSuper(100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder0.append('#', 'a');
        int int9 = compareToBuilder0.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test262");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((long) 1, (long) (short) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append(true, false);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append(' ', 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test263");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray3 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray4 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(shortArray3, shortArray4);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder0.append((int) (byte) 1, 100);
        java.lang.Integer int9 = compareToBuilder8.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9.equals(1));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test264");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((float) (-1L), (float) (byte) -1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append((double) 0L, 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test265");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((float) (byte) -1, (float) ' ');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.appendSuper(100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder0.append('a', 'a');
        int int9 = compareToBuilder8.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test266");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append(0L, (long) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((double) (byte) -1, (double) 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test267");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder4 = compareToBuilder0.appendSuper(10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder0.append(' ', 'a');
        java.lang.Class<?> wildcardClass8 = compareToBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test268");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((float) (byte) -1, (float) ' ');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.appendSuper(100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder0.append((double) 100L, (-1.0d));
        java.lang.Integer int9 = compareToBuilder8.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9.equals((-1)));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test269");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        int int1 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.appendSuper((int) '#');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((double) 1L, (double) '4');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.append((int) 'a', (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test270");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (-1.0f), (double) (short) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append('#', '4');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((long) 2, (long) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test271");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((float) (byte) -1, (float) ' ');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((int) (byte) 0, 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((long) (short) -1, (long) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test272");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((float) (byte) -1, (float) ' ');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.appendSuper(100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder0.append('a', 'a');
        java.lang.Integer int9 = compareToBuilder8.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9.equals((-1)));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test273");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((long) (-1), 0L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append('#', '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test274");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((long) (-1), 0L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append((long) (short) 0, (long) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test275");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        int int1 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.appendSuper((int) '#');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((double) (byte) 100, 100.0d);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.append((double) 0, (double) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test276");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder4 = compareToBuilder0.appendSuper(10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder0.append((double) (short) 10, (double) (byte) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder7.appendSuper((int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test277");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 100);
        java.lang.Class<?> wildcardClass3 = compareToBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test278");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((float) 10, (float) (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.append((int) (short) 10, 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test279");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (-1.0f), (double) (short) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append('#', '4');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append((int) (short) 10, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test280");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        java.lang.Integer int4 = compareToBuilder0.build();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder0.append((byte) 1, (byte) 10);
        int int8 = compareToBuilder7.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test281");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder3.toComparison();
        java.lang.Class<?> wildcardClass5 = compareToBuilder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test282");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder0.toComparison();
        java.lang.Integer int5 = compareToBuilder0.build();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder0.append((double) 'a', (double) 2);
        java.lang.Integer int9 = compareToBuilder0.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9.equals((-1)));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test283");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((float) 10, (float) (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder3.appendSuper((int) (byte) 0);
        int int9 = compareToBuilder3.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test284");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.appendSuper((int) (short) -1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append(35, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test285");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.appendSuper((int) (short) -1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder6.appendSuper((int) (short) 10);
        java.lang.Integer int9 = compareToBuilder6.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9.equals((-1)));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test286");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append((float) 100, (float) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder0.append(0.0f, (float) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test287");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((long) 1, (long) (short) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((float) ' ', (float) (short) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.append((double) 10.0f, (double) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test288");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((-1), (-1));
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((int) (byte) 100, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test289");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.appendSuper((int) (short) -1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.append(false, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test290");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray3 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray4 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(shortArray3, shortArray4);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder5.append(100, (int) (byte) 1);
        java.lang.Class<?> wildcardClass9 = compareToBuilder8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test291");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.appendSuper((int) ' ');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((float) 1, (float) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test292");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        int int1 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.appendSuper((int) '#');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((double) 'a', (double) (byte) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append(0, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test293");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((byte) 10, (byte) 100);
        java.lang.Class<?> wildcardClass7 = compareToBuilder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test294");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder4 = compareToBuilder0.appendSuper(10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder4.appendSuper(10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((byte) 0, (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test295");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder3.append((long) 35, 1L);
        int int8 = compareToBuilder7.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test296");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        java.lang.Integer int4 = compareToBuilder0.build();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder0.append((short) 100, (short) 100);
        int int8 = compareToBuilder0.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test297");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((long) 1, (long) (short) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder3.appendSuper((int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder3.append((float) (-1L), (float) (short) 0);
        int int9 = compareToBuilder3.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test298");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((float) (byte) 0, (float) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((byte) 1, (byte) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append(' ', 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test299");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((long) 1, (long) (short) 10);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder3.append((byte) 0, (byte) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder7.appendSuper((int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test300");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        int int4 = compareToBuilder3.toComparison();
        int int5 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder3.append((long) (short) -1, (long) (-1));
        int int9 = compareToBuilder8.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test301");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((long) 1, (long) (short) 10);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder3.append((byte) 0, (byte) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.appendSuper((int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test302");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((int) (short) 1, (int) (short) 1);
        java.lang.Integer int7 = compareToBuilder6.build();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.appendSuper((int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test303");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray3 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray4 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(shortArray3, shortArray4);
        java.lang.Integer int6 = compareToBuilder0.build();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append((long) 2, 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test304");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((long) 1, (long) (short) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((float) ' ', (float) (short) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append('4', '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test305");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.appendSuper((int) (short) -1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append(0.0f, (float) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test306");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((short) (byte) 0, (short) (byte) 0);
        java.lang.Integer int7 = compareToBuilder0.build();
        java.lang.Integer int8 = compareToBuilder0.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8.equals(0));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test307");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((byte) 10, (byte) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.append((int) (short) 10, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test308");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder2.append((double) 100, 0.0d);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder2.append((byte) 10, (byte) 10);
        java.lang.Class<?> wildcardClass9 = compareToBuilder8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test309");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((float) (byte) 0, (float) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((byte) 1, (byte) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append(100.0d, (double) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test310");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((-1), (-1));
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.append((short) 1, (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test311");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append(0L, (long) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.append((float) 100L, (float) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test312");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((float) (short) 100, (float) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append((float) (byte) -1, (float) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test313");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((float) 10, (float) (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder3.appendSuper((int) (byte) 0);
        java.lang.Integer int9 = compareToBuilder3.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9.equals((-1)));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test314");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.appendSuper((int) (short) -1);
        java.lang.Class<?> wildcardClass7 = compareToBuilder6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test315");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.appendSuper((int) ' ');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.append('4', 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test316");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray3 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray4 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(shortArray3, shortArray4);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder5.appendSuper(1);
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) compareToBuilder5, obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test317");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((short) (byte) 0, (short) (byte) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((float) (short) -1, (float) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test318");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder0.toComparison();
        java.lang.Integer int5 = compareToBuilder0.build();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder0.append((byte) 0, (byte) 0);
        int int9 = compareToBuilder8.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test319");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append(0L, 100L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((short) (byte) 1, (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test320");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append(0L, 100L);
        int int7 = compareToBuilder6.toComparison();
        int int8 = compareToBuilder6.toComparison();
        java.lang.Integer int9 = compareToBuilder6.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9.equals((-1)));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test321");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (-1.0f), (double) (short) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((long) (byte) -1, 0L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.append(0.0f, (float) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test322");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder0.toComparison();
        java.lang.Integer int5 = compareToBuilder0.build();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder0.append(32, (int) (byte) 100);
        java.lang.Integer int9 = compareToBuilder8.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9.equals((-1)));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test323");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder3.append((byte) 0, (byte) 100);
        int int8 = compareToBuilder3.toComparison();
        java.lang.Class<?> wildcardClass9 = compareToBuilder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test324");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder2.append((double) 100, 0.0d);
        java.lang.Class<?> wildcardClass6 = compareToBuilder5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test325");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((int) (short) 1, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((long) (short) 10, (long) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test326");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray3 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray4 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(shortArray3, shortArray4);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder0.append(0, (int) (byte) 10);
        int int9 = compareToBuilder0.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test327");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((float) (short) 100, (float) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append((long) (byte) -1, 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test328");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.appendSuper((int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.append((long) (byte) 0, (long) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test329");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.appendSuper((int) ' ');
        java.lang.Integer int7 = compareToBuilder6.build();
        java.lang.Class<?> wildcardClass8 = compareToBuilder6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7.equals(32));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test330");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray3 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray4 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(shortArray3, shortArray4);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder0.append(0, (int) (byte) 10);
        int int9 = compareToBuilder8.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test331");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((long) 1, (long) (short) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder3.appendSuper((int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder3.append((long) 10, 0L);
        java.lang.Integer int9 = compareToBuilder3.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9.equals((-1)));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test332");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (-1.0f), (double) (short) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((long) (byte) -1, 0L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((float) (byte) 0, (float) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test333");
        java.lang.Object obj0 = null;
        java.lang.Object obj1 = null;
        int int3 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare(obj0, obj1, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test334");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((long) 1, (long) (short) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append(true, false);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append((double) (byte) -1, (double) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test335");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((byte) 10, (byte) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.append((byte) 100, (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test336");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (-1.0f), (double) (short) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((short) (byte) 1, (short) -1);
        java.lang.Class<?> wildcardClass7 = compareToBuilder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test337");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        java.lang.Integer int4 = compareToBuilder0.build();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder0.append((short) 100, (short) 100);
        java.lang.Integer int8 = compareToBuilder7.build();
        java.lang.Class<?> wildcardClass9 = compareToBuilder7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test338");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (-1.0f), (double) (short) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append('#', '4');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append((short) (byte) -1, (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test339");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.appendSuper((int) (short) -1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder6.appendSuper((int) (short) 10);
        int int9 = compareToBuilder8.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test340");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        int int1 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.appendSuper((int) '#');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.appendSuper((int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder5.append((long) (byte) 0, (long) 35);
        int int9 = compareToBuilder8.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test341");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((float) (byte) -1, (float) ' ');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.appendSuper(100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder0.append(1L, (long) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test342");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((float) (-1L), (float) (byte) -1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder6.appendSuper((int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test343");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray3 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray4 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(shortArray3, shortArray4);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder5.append((short) (byte) -1, (short) 100);
        java.lang.Class<?> wildcardClass9 = compareToBuilder5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test344");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((int) (short) 1, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder6.appendSuper((int) (short) 100);
        java.lang.Integer int9 = compareToBuilder6.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9.equals((-1)));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test345");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder3.append((byte) 0, (byte) 100);
        java.lang.Class<?> wildcardClass8 = compareToBuilder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test346");
        int int3 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) (byte) 100, (java.lang.Object) (byte) 0, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test347");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((float) (-1L), (float) (byte) -1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder0.appendSuper((-1));
        java.lang.Class<?> wildcardClass9 = compareToBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test348");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (-1.0f), (double) (short) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((long) (byte) -1, 0L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.append(true, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test349");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder4 = compareToBuilder0.appendSuper(10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder4.appendSuper(10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append('4', ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test350");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        java.lang.Integer int4 = compareToBuilder0.build();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder0.append((double) 10, (double) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test351");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((float) (byte) -1, (float) ' ');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((int) (byte) 0, 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append(false, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test352");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder2.append((double) 100, 0.0d);
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder2.append(intArray6, intArray7);
        java.lang.Class<?> wildcardClass9 = intArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test353");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((float) 10, (float) (short) 100);
        int int7 = compareToBuilder6.toComparison();
        java.lang.Integer int8 = compareToBuilder6.build();
        int int9 = compareToBuilder6.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test354");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder4 = compareToBuilder0.appendSuper(10);
        java.lang.Class<?> wildcardClass5 = compareToBuilder4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test355");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(false, false);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder0.append((float) 10L, 10.0f);
        int int9 = compareToBuilder8.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test356");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        int int1 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.appendSuper((int) '#');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((int) (byte) 1, (int) (short) 10);
        java.lang.Class<?> wildcardClass7 = compareToBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test357");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append(true, false);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append('4', 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test358");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder4 = compareToBuilder0.appendSuper(10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder0.append(' ', 'a');
        java.lang.Integer int8 = compareToBuilder7.build();
        java.lang.Class<?> wildcardClass9 = compareToBuilder7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test359");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(false, false);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder5.appendSuper((int) (short) 0);
        java.lang.Integer int8 = compareToBuilder7.build();
        java.lang.Integer int9 = compareToBuilder7.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9.equals(100));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test360");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        int int1 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.appendSuper((int) '#');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.appendSuper((int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder0.append((int) (short) 1, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test361");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray3 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray4 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(shortArray3, shortArray4);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder0.append((float) (short) 0, (float) '#');
        int int9 = compareToBuilder0.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test362");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder2.append((double) 100, 0.0d);
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder2.append(intArray6, intArray7);
        int int9 = compareToBuilder2.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test363");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (-1.0f), (double) (short) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append('#', '4');
        java.lang.Integer int7 = compareToBuilder0.build();
        java.lang.Integer int8 = compareToBuilder0.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8.equals((-1)));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test364");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((byte) 10, (byte) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.append((long) 100, (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test365");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((float) (short) 100, (float) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append(false, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test366");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder1 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder4 = compareToBuilder1.append((int) (short) 0, (int) (short) 1);
        int int5 = compareToBuilder4.toComparison();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) (byte) 1, (java.lang.Object) compareToBuilder4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test367");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((byte) 10, (byte) 100);
        java.lang.Integer int7 = compareToBuilder3.build();
        java.lang.Integer int8 = compareToBuilder3.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8.equals((-1)));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test368");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (-1.0f), (double) (short) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((double) 'a', 0.0d);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((double) 35, (double) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test369");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (-1.0f), (double) (short) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((double) 'a', 0.0d);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder6.appendSuper(2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test370");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((short) (byte) 0, (short) (byte) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((long) 100, (long) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test371");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (-1.0f), (double) (short) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((short) (byte) 1, (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test372");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((long) 1, (long) (short) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder3.appendSuper((int) (short) 1);
        java.lang.Class<?> wildcardClass6 = compareToBuilder5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test373");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        int int1 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder4 = compareToBuilder0.append((byte) -1, (byte) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder0.append((byte) 1, (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test374");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder2.append((double) 100, 0.0d);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder2.append((int) (byte) -1, (int) (byte) 10);
        java.lang.Class<?> wildcardClass9 = compareToBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test375");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (-1.0f), (double) (short) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append('#', '4');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append(10, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test376");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        java.lang.Integer int4 = compareToBuilder3.build();
        int int5 = compareToBuilder3.toComparison();
        java.lang.Class<?> wildcardClass6 = compareToBuilder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test377");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder2.append((double) 100, 0.0d);
        java.lang.Integer int6 = compareToBuilder2.build();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder2.append((long) (byte) -1, 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test378");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((float) (byte) 0, (float) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append(true, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test379");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        int int1 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.appendSuper((int) '#');
        java.lang.Object obj4 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) '#', obj4, (java.util.Collection<java.lang.String>) strList7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test380");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder1 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder4 = compareToBuilder1.append((double) (-1.0f), (double) (short) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder4.append((short) (byte) 1, (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare(obj0, (java.lang.Object) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test381");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((-1), (-1));
        java.lang.Integer int7 = compareToBuilder6.build();
        java.lang.Integer int8 = compareToBuilder6.build();
        int int9 = compareToBuilder6.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test382");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((byte) 10, (byte) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((byte) 10, (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test383");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((float) (short) 100, (float) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder6.appendSuper((int) (short) 10);
        int int9 = compareToBuilder8.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test384");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.appendSuper(1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((-1L), (long) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test385");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        int int1 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder4 = compareToBuilder0.append((byte) -1, (byte) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder4.append((int) (short) 0, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test386");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder3.append('a', ' ');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.appendSuper((int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test387");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(false, false);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder0.append(10.0f, (float) 100L);
        int int9 = compareToBuilder0.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test388");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((long) (short) -1, (long) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((double) (short) 100, 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test389");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((long) '4', (long) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.append((short) (byte) 10, (short) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test390");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder4 = compareToBuilder0.appendSuper(10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder0.append((double) (short) 10, (double) (byte) 10);
        java.lang.Integer int8 = compareToBuilder7.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8.equals(100));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test391");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((byte) -1, (byte) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append('#', '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test392");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((float) (byte) 0, (float) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append(100L, (long) (short) -1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((short) -1, (short) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test393");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((int) (short) 1, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append((float) 100, (float) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test394");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(false, false);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder0.append((float) 10L, 10.0f);
        java.lang.Class<?> wildcardClass9 = compareToBuilder8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test395");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append(0L, 100L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder6.appendSuper((int) (short) 10);
        int int9 = compareToBuilder6.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test396");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(false, false);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder5.append((long) (byte) 10, 100L);
        int int9 = compareToBuilder8.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test397");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray3 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray4 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(shortArray3, shortArray4);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder5.append(false, true);
        java.lang.Class<?> wildcardClass9 = compareToBuilder8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test398");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((long) 1, (long) (short) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append(100.0d, (double) 1L);
        java.lang.Integer int7 = compareToBuilder0.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7.equals((-1)));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test399");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((long) 1, (long) (short) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append(100.0d, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((int) (byte) 1, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test400");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((long) 1, (long) (short) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder3.appendSuper((int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder3.append((float) (-1L), (float) (short) 0);
        java.lang.Integer int9 = compareToBuilder3.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9.equals((-1)));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test401");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (-1.0f), (double) (short) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((long) 'a', (long) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.append((double) (short) 10, (double) 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test402");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((float) (byte) 0, (float) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append(100L, (long) (short) -1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append(10, 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test403");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        int int1 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder4 = compareToBuilder0.append((byte) -1, (byte) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder0.append((long) 2, 10L);
        int int8 = compareToBuilder7.toComparison();
        int int9 = compareToBuilder7.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test404");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((float) ' ', (float) (byte) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((byte) 10, (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test405");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(false, false);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder0.append('#', '4');
        java.lang.Integer int9 = compareToBuilder0.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9.equals(100));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test406");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        int int1 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.appendSuper((int) '#');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((double) (byte) 100, 100.0d);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder6.appendSuper(2);
        java.lang.Class<?> wildcardClass9 = compareToBuilder8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test407");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        java.lang.Integer int4 = compareToBuilder0.build();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder0.append((short) 100, (short) 100);
        java.lang.Class<?> wildcardClass8 = compareToBuilder7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test408");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.appendSuper((int) ' ');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.append((long) 10, (long) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test409");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((long) 1, (long) (short) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder3.appendSuper((int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder3.append((float) (-1L), (float) (short) 0);
        java.lang.Class<?> wildcardClass9 = compareToBuilder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test410");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (-1.0f), (double) (short) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append('#', '4');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append((byte) 1, (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test411");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((float) (byte) -1, (float) ' ');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.appendSuper(100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder0.append((long) 0, (long) (short) 1);
        java.lang.Integer int9 = compareToBuilder8.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9.equals((-1)));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test412");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((long) 1, (long) (short) 10);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder3.append((long) (byte) 0, (long) (-1));
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.appendSuper((int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test413");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder4 = compareToBuilder0.appendSuper(10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder0.append(' ', 'a');
        int int8 = compareToBuilder0.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test414");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder2.append(10, (int) (byte) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder2.append((byte) 10, (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test415");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((float) (byte) 0, (float) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append(100L, (long) (short) -1);
        java.lang.Class<?> wildcardClass7 = compareToBuilder6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test416");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray3 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray4 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(shortArray3, shortArray4);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder5.appendSuper(1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder7.appendSuper(100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test417");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder0.toComparison();
        java.lang.Integer int5 = compareToBuilder0.build();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder0.append((double) 'a', (double) 2);
        int int9 = compareToBuilder0.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test418");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) 1.0d, (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test419");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (-1.0f), (double) (short) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append('#', '4');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append(false, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test420");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        int int4 = compareToBuilder3.toComparison();
        int int5 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder3.append((long) (short) -1, (long) (-1));
        java.lang.Integer int9 = compareToBuilder8.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9.equals(0));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test421");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((float) (byte) 0, (float) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append(100L, (long) (short) -1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append((float) 100, (float) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test422");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((float) (-1L), (float) (byte) -1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder0.appendSuper((int) (short) 0);
        java.lang.Class<?> wildcardClass9 = compareToBuilder8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test423");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder2.append((double) 100, 0.0d);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder5.append(true, false);
        int int9 = compareToBuilder5.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test424");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder2.append(10, (int) (byte) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder2.append('a', 'a');
        int int9 = compareToBuilder2.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test425");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray3 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray4 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(shortArray3, shortArray4);
        java.lang.Integer int6 = compareToBuilder0.build();
        java.lang.Integer int7 = compareToBuilder0.build();
        int int8 = compareToBuilder0.toComparison();
        java.lang.Class<?> wildcardClass9 = compareToBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test426");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((long) 1, (long) (short) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((double) 100L, (double) ' ');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append(100L, (long) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test427");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder2.append((short) (byte) 0, (short) (byte) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder5.append((byte) 100, (byte) 100);
        java.lang.Integer int9 = compareToBuilder5.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9.equals(100));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test428");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder1 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder1.appendSuper((int) (short) 100);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder3.append(100, 35);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare(obj0, (java.lang.Object) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test429");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(false, false);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder0.append(10.0f, (float) 100L);
        java.lang.Integer int9 = compareToBuilder0.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9.equals(100));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test430");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder2.append((double) '#', (double) 10L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder5.append((byte) 100, (byte) 1);
        int int9 = compareToBuilder5.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test431");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((float) (byte) -1, (float) ' ');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.appendSuper(100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder0.append((long) 0, (long) (short) 1);
        java.lang.Class<?> wildcardClass9 = compareToBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test432");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.appendSuper((int) ' ');
        java.lang.Integer int7 = compareToBuilder6.build();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.appendSuper((int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7.equals(32));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test433");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (-1.0f), (double) (short) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((short) (byte) 1, (short) -1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.append(10, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test434");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(false, false);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder0.append(10.0f, (float) 100L);
        java.lang.Integer int9 = compareToBuilder8.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9.equals(100));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test435");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder2.append((double) '#', (double) 10L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder2.append((int) (byte) 10, 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test436");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder0.toComparison();
        java.lang.Integer int5 = compareToBuilder0.build();
        java.lang.Integer int6 = compareToBuilder0.build();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append((-1L), (long) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test437");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        java.lang.Integer int4 = compareToBuilder0.build();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder0.append((short) 100, (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder7.appendSuper(2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test438");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        int int4 = compareToBuilder3.toComparison();
        int int5 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder3.append((long) 2, 0L);
        java.lang.Integer int9 = compareToBuilder3.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9.equals(1));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test439");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        int int1 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder4 = compareToBuilder0.append((byte) -1, (byte) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder4.append(0, 2);
        java.lang.Integer int8 = compareToBuilder4.build();
        java.lang.Class<?> wildcardClass9 = compareToBuilder4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test440");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray3 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray4 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(shortArray3, shortArray4);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder0.append((long) 100, (long) 35);
        java.lang.Class<?> wildcardClass9 = compareToBuilder8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test441");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((long) 1, (long) (short) 10);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder3.append((float) '4', (float) (byte) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.appendSuper((int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test442");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.appendSuper((int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((float) (byte) 0, 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test443");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder2.append((double) 100, 0.0d);
        java.lang.Integer int6 = compareToBuilder2.build();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder2.append((byte) 0, (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test444");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        int int1 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.appendSuper((int) '#');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((double) (byte) 100, 100.0d);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.append(' ', 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test445");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((float) ' ', (float) (byte) 0);
        int int7 = compareToBuilder0.toComparison();
        java.lang.Integer int8 = compareToBuilder0.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8.equals(1));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test446");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((long) 1, (long) (short) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((float) ' ', (float) (short) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((double) 10L, (double) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test447");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append(true, false);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append(2, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test448");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        int int1 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.appendSuper((int) '#');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.appendSuper((int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder5.append((float) 35, (float) (byte) 0);
        java.lang.Class<?> wildcardClass9 = compareToBuilder5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test449");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder0.toComparison();
        java.lang.Integer int5 = compareToBuilder0.build();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder0.append((double) 'a', (double) 2);
        java.lang.Integer int9 = compareToBuilder8.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9.equals((-1)));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test450");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((float) (byte) -1, (float) ' ');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.appendSuper(100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder5.append((byte) 0, (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test451");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        int int1 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.appendSuper((int) '#');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((double) 1L, (double) '4');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((int) (byte) 100, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test452");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((long) 1, (long) (short) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append(true, false);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append((long) 32, 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test453");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((float) (byte) -1, (float) ' ');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.appendSuper(100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder0.append('#', 'a');
        java.lang.Class<?> wildcardClass9 = compareToBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test454");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.appendSuper(2);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append(false, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test455");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder2.append((float) 0, (float) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder5.append(' ', ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test456");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder2.append((double) 100, 0.0d);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder5.append(true, false);
        java.lang.Integer int9 = compareToBuilder5.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9.equals(1));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test457");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((long) '4', (long) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append(' ', '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test458");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((long) 1, (long) (short) 10);
        int int4 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder0.append((int) 'a', (int) ' ');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder7.appendSuper(32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test459");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 100);
        int int3 = compareToBuilder2.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder2.append(100, 35);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder2.append((byte) 10, (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test460");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray3 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray4 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(shortArray3, shortArray4);
        java.lang.Integer int6 = compareToBuilder0.build();
        java.lang.Integer int7 = compareToBuilder0.build();
        int int8 = compareToBuilder0.toComparison();
        java.lang.Integer int9 = compareToBuilder0.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9.equals(1));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test461");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        int int1 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder4 = compareToBuilder0.append((float) (short) 100, (float) (byte) -1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder4.append((float) (short) 1, (float) (-1L));
        java.lang.Integer int8 = compareToBuilder4.build();
        java.lang.Integer int9 = compareToBuilder4.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9.equals(1));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test462");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((float) ' ', (float) (byte) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((double) (short) -1, (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test463");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder2.append(10, (int) (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder2.append((byte) 100, (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test464");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder1 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder1.appendSuper((int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((double) '#', (double) 10L);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare(obj0, (java.lang.Object) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test465");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append(false, true);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append('a', '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test466");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        int int1 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder4 = compareToBuilder0.append((byte) -1, (byte) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder4.append(0, 2);
        int int8 = compareToBuilder7.toComparison();
        int int9 = compareToBuilder7.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test467");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray3 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray4 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(shortArray3, shortArray4);
        java.lang.Integer int6 = compareToBuilder0.build();
        java.lang.Integer int7 = compareToBuilder0.build();
        java.lang.Integer int8 = compareToBuilder0.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8.equals(1));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test468");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 100);
        int int3 = compareToBuilder2.toComparison();
        int int4 = compareToBuilder2.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder2.append('a', 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test469");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder2.append((double) 100, 0.0d);
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder2.append(intArray6, intArray7);
        java.lang.Class<?> wildcardClass9 = compareToBuilder8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test470");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        java.lang.Class<?> wildcardClass4 = compareToBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test471");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray3 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray4 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(shortArray3, shortArray4);
        int int6 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append((float) (byte) 100, (float) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test472");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder2.append((double) 100, 0.0d);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder2.append((byte) 10, (byte) 10);
        java.lang.Integer int9 = compareToBuilder8.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9.equals(1));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test473");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append(0L, (long) 0);
        int int7 = compareToBuilder3.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test474");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder2.append((double) '#', (double) 10L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder5.append((byte) 0, (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test475");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(false, false);
        java.lang.Integer int6 = compareToBuilder0.build();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append(0L, (long) 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test476");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((long) 1, (long) (short) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append(true, false);
        int int7 = compareToBuilder0.toComparison();
        int int8 = compareToBuilder0.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test477");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append(0L, (long) 0);
        java.lang.Class<?> wildcardClass7 = compareToBuilder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test478");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append(false, true);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append(false, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test479");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (-1.0f), (double) (short) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((long) (byte) -1, 0L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.append((byte) 1, (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test480");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((short) (byte) 0, (short) (byte) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((int) (short) -1, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test481");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder4 = compareToBuilder0.appendSuper(10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder4.appendSuper(10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder4.appendSuper((int) (byte) -1);
        java.lang.Integer int9 = compareToBuilder4.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9.equals(100));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test482");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        java.lang.Integer int4 = compareToBuilder0.build();
        int int5 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder0.append((byte) 1, (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test483");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((float) (-1L), (float) (byte) -1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder0.appendSuper((int) (short) 0);
        int int9 = compareToBuilder8.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test484");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((float) (byte) -1, (float) ' ');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.appendSuper(100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder0.append((short) (byte) 1, (short) (byte) 100);
        int int9 = compareToBuilder0.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test485");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        int int1 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.appendSuper((int) '#');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((double) (byte) 100, 100.0d);
        java.lang.Class<?> wildcardClass7 = compareToBuilder6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test486");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder0.toComparison();
        java.lang.Integer int5 = compareToBuilder0.build();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder0.append((byte) 0, (byte) 0);
        java.lang.Integer int9 = compareToBuilder0.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9.equals((-1)));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test487");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((long) '4', (long) 0);
        java.lang.Class<?> wildcardClass7 = compareToBuilder6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test488");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((float) (byte) 0, (float) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append(100L, (long) (short) -1);
        java.lang.Integer int7 = compareToBuilder6.build();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.appendSuper((int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test489");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder2.append((float) 10, (float) (byte) -1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder5.append((double) (-1.0f), (double) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test490");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((long) 1, (long) (short) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append(true, false);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder0.appendSuper((int) (byte) 1);
        java.lang.Integer int9 = compareToBuilder8.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9.equals((-1)));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test491");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        int int1 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder4 = compareToBuilder0.append((float) (short) 100, (float) (byte) -1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder0.append((byte) 0, (byte) 1);
        java.lang.Class<?> wildcardClass8 = compareToBuilder7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test492");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        java.lang.Integer int4 = compareToBuilder0.build();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder0.append((byte) 1, (byte) 10);
        java.lang.Integer int8 = compareToBuilder0.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8.equals((-1)));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test493");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.appendSuper((int) (short) -1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append(false, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test494");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((long) 1, (long) (short) 10);
        int int4 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder0.append((int) 'a', (int) ' ');
        java.lang.Class<?> wildcardClass8 = compareToBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test495");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder2.append(10, (int) (byte) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder2.append('a', 'a');
        java.lang.Integer int9 = compareToBuilder8.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9.equals(1));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test496");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        int int1 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.appendSuper((int) '#');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((double) (byte) 100, 100.0d);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append(false, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test497");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder3.append(true, false);
        int int8 = compareToBuilder3.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test498");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((float) (short) 100, (float) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder6.appendSuper((int) (short) 10);
        java.lang.Integer int9 = compareToBuilder6.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9.equals(10));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test499");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((int) (short) 1, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append((short) (byte) 100, (short) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test500");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray3 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray4 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(shortArray3, shortArray4);
        java.lang.Integer int6 = compareToBuilder0.build();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append((long) 35, (long) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }
}

