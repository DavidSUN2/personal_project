package CompareToBuilder;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CompareToBuilder0 {

    public static boolean debug = false;

    @Test
    public void CompareToBuilder001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder001");
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in CompareToBuilder generation
        try {
            int int3 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) 0, obj1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompareToBuilder002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder002");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder1 = new org.apache.commons.lang3.builder.CompareToBuilder();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "" };
        // The following exception was thrown during execution in CompareToBuilder generation
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
    public void CompareToBuilder003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder003");
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
    public void CompareToBuilder004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder004");
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
    public void CompareToBuilder005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder005");
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
    public void CompareToBuilder006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder006");
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
    public void CompareToBuilder007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder007");
        // The following exception was thrown during execution in CompareToBuilder generation
        try {
            int int2 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) (byte) 10, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompareToBuilder008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder008");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = new org.apache.commons.lang3.builder.CompareToBuilder();
        // The following exception was thrown during execution in CompareToBuilder generation
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
    public void CompareToBuilder009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder009");
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
    public void CompareToBuilder010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder010");
        // The following exception was thrown during execution in CompareToBuilder generation
        try {
            int int2 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) (byte) 100, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompareToBuilder011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder011");
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
    public void CompareToBuilder012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder012");
        java.lang.Object obj0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        // The following exception was thrown during execution in CompareToBuilder generation
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
    public void CompareToBuilder013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder013");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "" };
        // The following exception was thrown during execution in CompareToBuilder generation
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
    public void CompareToBuilder014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder014");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        java.lang.Class<?> wildcardClass4 = compareToBuilder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void CompareToBuilder015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder015");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder1 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray4 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray5 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder1.append(shortArray4, shortArray5);
        int int7 = compareToBuilder1.toComparison();
        // The following exception was thrown during execution in CompareToBuilder generation
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
    public void CompareToBuilder016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder016");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        // The following exception was thrown during execution in CompareToBuilder generation
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
    public void CompareToBuilder017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder017");
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
    public void CompareToBuilder018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder018");
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
    public void CompareToBuilder019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder019");
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
    public void CompareToBuilder020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder020");
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
    public void CompareToBuilder021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder021");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!" };
        // The following exception was thrown during execution in CompareToBuilder generation
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
    public void CompareToBuilder022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder022");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder1 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray4 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray5 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder1.append(shortArray4, shortArray5);
        // The following exception was thrown during execution in CompareToBuilder generation
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
    public void CompareToBuilder023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder023");
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
    public void CompareToBuilder024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder024");
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
    public void CompareToBuilder025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder025");
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
    public void CompareToBuilder026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder026");
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
    public void CompareToBuilder027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder027");
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
    public void CompareToBuilder028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder028");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        // The following exception was thrown during execution in CompareToBuilder generation
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
    public void CompareToBuilder029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder029");
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
    public void CompareToBuilder030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder030");
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
    public void CompareToBuilder031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder031");
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
    public void CompareToBuilder032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder032");
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
    public void CompareToBuilder033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder033");
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
    public void CompareToBuilder034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder034");
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
    public void CompareToBuilder035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder035");
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
    public void CompareToBuilder036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder036");
        // The following exception was thrown during execution in CompareToBuilder generation
        try {
            int int2 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) 100L, (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompareToBuilder037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder037");
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
    public void CompareToBuilder038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder038");
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
    public void CompareToBuilder039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder039");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray3 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray4 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(shortArray3, shortArray4);
        java.lang.Object obj6 = null;
        // The following exception was thrown during execution in CompareToBuilder generation
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
    public void CompareToBuilder040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder040");
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
    public void CompareToBuilder041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder041");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "" };
        // The following exception was thrown during execution in CompareToBuilder generation
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
    public void CompareToBuilder042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder042");
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
    public void CompareToBuilder043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder043");
        // The following exception was thrown during execution in CompareToBuilder generation
        try {
            int int2 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) (short) 0, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompareToBuilder044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder044");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj1 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        // The following exception was thrown during execution in CompareToBuilder generation
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
    public void CompareToBuilder045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder045");
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
    public void CompareToBuilder046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder046");
        int int2 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) false, (java.lang.Object) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void CompareToBuilder047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder047");
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
    public void CompareToBuilder048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder048");
        // The following exception was thrown during execution in CompareToBuilder generation
        try {
            int int3 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) (short) 100, (java.lang.Object) 10L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompareToBuilder049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder049");
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
    public void CompareToBuilder050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder050");
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
    public void CompareToBuilder051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder051");
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
    public void CompareToBuilder052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder052");
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
    public void CompareToBuilder053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder053");
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
    public void CompareToBuilder054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder054");
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
    public void CompareToBuilder055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder055");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.appendSuper((int) (short) -1);
        // The following exception was thrown during execution in CompareToBuilder generation
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
    public void CompareToBuilder056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder056");
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
    public void CompareToBuilder057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder057");
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
    public void CompareToBuilder058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder058");
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
    public void CompareToBuilder059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder059");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder1 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray4 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray5 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder1.append(shortArray4, shortArray5);
        java.lang.Class<?> wildcardClass7 = compareToBuilder1.getClass();
        // The following exception was thrown during execution in CompareToBuilder generation
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
    public void CompareToBuilder060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder060");
        // The following exception was thrown during execution in CompareToBuilder generation
        try {
            int int2 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) "", (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompareToBuilder061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder061");
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
    public void CompareToBuilder062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder062");
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
    public void CompareToBuilder063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder063");
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
    public void CompareToBuilder064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder064");
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
    public void CompareToBuilder065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder065");
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
    public void CompareToBuilder066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder066");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        java.lang.String[] strArray5 = null;
        // The following exception was thrown during execution in CompareToBuilder generation
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
    public void CompareToBuilder067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder067");
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
    public void CompareToBuilder068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder068");
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
    public void CompareToBuilder069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder069");
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
    public void CompareToBuilder070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder070");
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
    public void CompareToBuilder071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder071");
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
    public void CompareToBuilder072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder072");
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
    public void CompareToBuilder073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder073");
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
    public void CompareToBuilder074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder074");
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
    public void CompareToBuilder075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder075");
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
    public void CompareToBuilder076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder076");
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
    public void CompareToBuilder077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder077");
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
    public void CompareToBuilder078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder078");
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
    public void CompareToBuilder079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder079");
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
    public void CompareToBuilder080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder080");
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
    public void CompareToBuilder081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder081");
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
    public void CompareToBuilder082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder082");
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
    public void CompareToBuilder083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder083");
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
    public void CompareToBuilder084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder084");
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
    public void CompareToBuilder085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder085");
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
    public void CompareToBuilder086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder086");
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
    public void CompareToBuilder087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder087");
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
    public void CompareToBuilder088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder088");
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
    public void CompareToBuilder089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder089");
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
    public void CompareToBuilder090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder090");
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
    public void CompareToBuilder091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder091");
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
    public void CompareToBuilder092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder092");
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
    public void CompareToBuilder093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder093");
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
    public void CompareToBuilder094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder094");
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
    public void CompareToBuilder095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder095");
        java.lang.Object obj0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        // The following exception was thrown during execution in CompareToBuilder generation
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
    public void CompareToBuilder096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder096");
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
    public void CompareToBuilder097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder097");
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
    public void CompareToBuilder098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder098");
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
    public void CompareToBuilder099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder099");
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
    public void CompareToBuilder100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder100");
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
    public void CompareToBuilder101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder101");
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
    public void CompareToBuilder102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder102");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!" };
        // The following exception was thrown during execution in CompareToBuilder generation
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
    public void CompareToBuilder103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder103");
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
    public void CompareToBuilder104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder104");
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
    public void CompareToBuilder105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder105");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        java.lang.Integer int4 = compareToBuilder0.build();
        // The following exception was thrown during execution in CompareToBuilder generation
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
    public void CompareToBuilder106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder106");
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
    public void CompareToBuilder107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder107");
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
    public void CompareToBuilder108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder108");
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
    public void CompareToBuilder109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder109");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder1 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder4 = compareToBuilder1.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder4.append(0L, (long) 0);
        // The following exception was thrown during execution in CompareToBuilder generation
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
    public void CompareToBuilder110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder110");
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
    public void CompareToBuilder111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder111");
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
    public void CompareToBuilder112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder112");
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
    public void CompareToBuilder113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder113");
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
    public void CompareToBuilder114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder114");
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
    public void CompareToBuilder115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder115");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder1 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder4 = compareToBuilder1.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder1.append(false, true);
        // The following exception was thrown during execution in CompareToBuilder generation
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
    public void CompareToBuilder116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder116");
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
    public void CompareToBuilder117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder117");
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
    public void CompareToBuilder118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder118");
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
    public void CompareToBuilder119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder119");
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
    public void CompareToBuilder120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder120");
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
    public void CompareToBuilder121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder121");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder1 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder1.appendSuper((int) (short) 100);
        // The following exception was thrown during execution in CompareToBuilder generation
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
    public void CompareToBuilder122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder122");
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
    public void CompareToBuilder123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder123");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        // The following exception was thrown during execution in CompareToBuilder generation
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
    public void CompareToBuilder124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder124");
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
    public void CompareToBuilder125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder125");
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
    public void CompareToBuilder126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder126");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        // The following exception was thrown during execution in CompareToBuilder generation
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
    public void CompareToBuilder127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder127");
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
    public void CompareToBuilder128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder128");
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
    public void CompareToBuilder129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder129");
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
    public void CompareToBuilder130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder130");
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
    public void CompareToBuilder131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder131");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in CompareToBuilder generation
        try {
            int int3 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare(obj0, (java.lang.Object) 0L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompareToBuilder132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder132");
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
    public void CompareToBuilder133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder133");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder0.append(false, false);
        // The following exception was thrown during execution in CompareToBuilder generation
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
    public void CompareToBuilder134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder134");
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
    public void CompareToBuilder135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder135");
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
    public void CompareToBuilder136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder136");
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
    public void CompareToBuilder137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder137");
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
    public void CompareToBuilder138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder138");
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
    public void CompareToBuilder139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder139");
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
    public void CompareToBuilder140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder140");
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
    public void CompareToBuilder141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder141");
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
    public void CompareToBuilder142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder142");
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
    public void CompareToBuilder143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder143");
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
    public void CompareToBuilder144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder144");
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
    public void CompareToBuilder145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder145");
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
    public void CompareToBuilder146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder146");
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
    public void CompareToBuilder147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder147");
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
    public void CompareToBuilder148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder148");
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
    public void CompareToBuilder149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder149");
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
    public void CompareToBuilder150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder150");
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
    public void CompareToBuilder151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder151");
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
    public void CompareToBuilder152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder152");
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
    public void CompareToBuilder153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder153");
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
    public void CompareToBuilder154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder154");
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
    public void CompareToBuilder155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder155");
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
    public void CompareToBuilder156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder156");
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
    public void CompareToBuilder157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder157");
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
    public void CompareToBuilder158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder158");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder1 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray4 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray5 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder1.append(shortArray4, shortArray5);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder6.appendSuper(1);
        // The following exception was thrown during execution in CompareToBuilder generation
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
    public void CompareToBuilder159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder159");
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
    public void CompareToBuilder160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder160");
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
    public void CompareToBuilder161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder161");
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
    public void CompareToBuilder162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder162");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((float) 10, (float) (short) 100);
        java.lang.Object obj7 = null;
        // The following exception was thrown during execution in CompareToBuilder generation
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
    public void CompareToBuilder163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder163");
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
    public void CompareToBuilder164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder164");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((float) (byte) -1, (float) ' ');
        // The following exception was thrown during execution in CompareToBuilder generation
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
    public void CompareToBuilder165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder165");
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
    public void CompareToBuilder166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder166");
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
    public void CompareToBuilder167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder167");
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
    public void CompareToBuilder168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder168");
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
    public void CompareToBuilder169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder169");
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
    public void CompareToBuilder170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder170");
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
    public void CompareToBuilder171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder171");
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
    public void CompareToBuilder172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder172");
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
    public void CompareToBuilder173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder173");
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
    public void CompareToBuilder174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder174");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((short) (byte) 0, (short) (byte) 0);
        // The following exception was thrown during execution in CompareToBuilder generation
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
    public void CompareToBuilder175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder175");
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
    public void CompareToBuilder176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder176");
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
    public void CompareToBuilder177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder177");
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
    public void CompareToBuilder178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder178");
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
    public void CompareToBuilder179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder179");
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
    public void CompareToBuilder180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder180");
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
    public void CompareToBuilder181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder181");
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
    public void CompareToBuilder182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder182");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in CompareToBuilder generation
        try {
            int int3 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare(obj0, (java.lang.Object) 100.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompareToBuilder183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder183");
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
    public void CompareToBuilder184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder184");
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
    public void CompareToBuilder185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder185");
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
    public void CompareToBuilder186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder186");
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
    public void CompareToBuilder187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder187");
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
    public void CompareToBuilder188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder188");
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
    public void CompareToBuilder189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder189");
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
    public void CompareToBuilder190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder190");
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
    public void CompareToBuilder191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder191");
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
    public void CompareToBuilder192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder192");
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
    public void CompareToBuilder193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder193");
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
    public void CompareToBuilder194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder194");
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
    public void CompareToBuilder195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder195");
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
    public void CompareToBuilder196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder196");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder1 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder4 = compareToBuilder1.append((long) 1, (long) (short) 10);
        int int5 = compareToBuilder4.toComparison();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        // The following exception was thrown during execution in CompareToBuilder generation
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
    public void CompareToBuilder197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder197");
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
    public void CompareToBuilder198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder198");
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
    public void CompareToBuilder199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder199");
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
    public void CompareToBuilder200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder200");
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
    public void CompareToBuilder201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder201");
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
    public void CompareToBuilder202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder202");
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
    public void CompareToBuilder203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder203");
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
    public void CompareToBuilder204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder204");
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
    public void CompareToBuilder205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder205");
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
    public void CompareToBuilder206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder206");
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
    public void CompareToBuilder207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder207");
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
    public void CompareToBuilder208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder208");
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
    public void CompareToBuilder209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder209");
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
    public void CompareToBuilder210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder210");
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
    public void CompareToBuilder211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder211");
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
    public void CompareToBuilder212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder212");
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
    public void CompareToBuilder213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder213");
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
    public void CompareToBuilder214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder214");
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
    public void CompareToBuilder215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder215");
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
    public void CompareToBuilder216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder216");
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
    public void CompareToBuilder217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder217");
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
    public void CompareToBuilder218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder218");
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
    public void CompareToBuilder219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder219");
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
    public void CompareToBuilder220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder220");
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
    public void CompareToBuilder221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder221");
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
    public void CompareToBuilder222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder222");
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
    public void CompareToBuilder223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder223");
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
    public void CompareToBuilder224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder224");
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
    public void CompareToBuilder225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder225");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder1 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray4 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray5 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder1.append(shortArray4, shortArray5);
        java.lang.String[] strArray7 = null;
        // The following exception was thrown during execution in CompareToBuilder generation
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
    public void CompareToBuilder226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder226");
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
    public void CompareToBuilder227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder227");
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
    public void CompareToBuilder228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder228");
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
    public void CompareToBuilder229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder229");
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
    public void CompareToBuilder230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder230");
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
    public void CompareToBuilder231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder231");
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
    public void CompareToBuilder232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder232");
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
    public void CompareToBuilder233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder233");
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
    public void CompareToBuilder234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder234");
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
    public void CompareToBuilder235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder235");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder1 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder1.appendSuper((int) (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder1.append(false, false);
        // The following exception was thrown during execution in CompareToBuilder generation
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
    public void CompareToBuilder236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder236");
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
    public void CompareToBuilder237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder237");
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
    public void CompareToBuilder238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder238");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        // The following exception was thrown during execution in CompareToBuilder generation
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
    public void CompareToBuilder239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder239");
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
    public void CompareToBuilder240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder240");
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
    public void CompareToBuilder241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder241");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append(true, false);
        java.lang.Object obj7 = null;
        // The following exception was thrown during execution in CompareToBuilder generation
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
    public void CompareToBuilder242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder242");
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
    public void CompareToBuilder243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder243");
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
    public void CompareToBuilder244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder244");
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
    public void CompareToBuilder245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder245");
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
    public void CompareToBuilder246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder246");
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
    public void CompareToBuilder247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder247");
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
    public void CompareToBuilder248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder248");
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
    public void CompareToBuilder249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder249");
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
    public void CompareToBuilder250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder250");
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
    public void CompareToBuilder251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder251");
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
    public void CompareToBuilder252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder252");
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
    public void CompareToBuilder253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder253");
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
    public void CompareToBuilder254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder254");
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
    public void CompareToBuilder255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder255");
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
    public void CompareToBuilder256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder256");
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
    public void CompareToBuilder257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder257");
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
    public void CompareToBuilder258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder258");
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
    public void CompareToBuilder259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder259");
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
    public void CompareToBuilder260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder260");
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
    public void CompareToBuilder261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder261");
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
    public void CompareToBuilder262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder262");
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
    public void CompareToBuilder263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder263");
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
    public void CompareToBuilder264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder264");
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
    public void CompareToBuilder265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder265");
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
    public void CompareToBuilder266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder266");
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
    public void CompareToBuilder267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder267");
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
    public void CompareToBuilder268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder268");
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
    public void CompareToBuilder269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder269");
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
    public void CompareToBuilder270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder270");
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
    public void CompareToBuilder271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder271");
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
    public void CompareToBuilder272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder272");
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
    public void CompareToBuilder273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder273");
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
    public void CompareToBuilder274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder274");
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
    public void CompareToBuilder275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder275");
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
    public void CompareToBuilder276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder276");
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
    public void CompareToBuilder277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder277");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 100);
        java.lang.Class<?> wildcardClass3 = compareToBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void CompareToBuilder278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder278");
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
    public void CompareToBuilder279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder279");
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
    public void CompareToBuilder280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder280");
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
    public void CompareToBuilder281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder281");
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
    public void CompareToBuilder282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder282");
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
    public void CompareToBuilder283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder283");
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
    public void CompareToBuilder284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder284");
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
    public void CompareToBuilder285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder285");
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
    public void CompareToBuilder286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder286");
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
    public void CompareToBuilder287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder287");
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
    public void CompareToBuilder288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder288");
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
    public void CompareToBuilder289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder289");
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
    public void CompareToBuilder290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder290");
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
    public void CompareToBuilder291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder291");
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
    public void CompareToBuilder292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder292");
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
    public void CompareToBuilder293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder293");
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
    public void CompareToBuilder294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder294");
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
    public void CompareToBuilder295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder295");
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
    public void CompareToBuilder296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder296");
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
    public void CompareToBuilder297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder297");
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
    public void CompareToBuilder298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder298");
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
    public void CompareToBuilder299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder299");
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
    public void CompareToBuilder300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder300");
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
    public void CompareToBuilder301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder301");
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
    public void CompareToBuilder302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder302");
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
    public void CompareToBuilder303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder303");
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
    public void CompareToBuilder304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder304");
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
    public void CompareToBuilder305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder305");
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
    public void CompareToBuilder306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder306");
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
    public void CompareToBuilder307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder307");
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
    public void CompareToBuilder308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder308");
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
    public void CompareToBuilder309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder309");
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
    public void CompareToBuilder310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder310");
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
    public void CompareToBuilder311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder311");
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
    public void CompareToBuilder312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder312");
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
    public void CompareToBuilder313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder313");
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
    public void CompareToBuilder314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder314");
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
    public void CompareToBuilder315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder315");
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
    public void CompareToBuilder316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder316");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray3 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray4 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(shortArray3, shortArray4);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder5.appendSuper(1);
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in CompareToBuilder generation
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
    public void CompareToBuilder317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder317");
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
    public void CompareToBuilder318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder318");
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
    public void CompareToBuilder319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder319");
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
    public void CompareToBuilder320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder320");
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
    public void CompareToBuilder321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder321");
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
    public void CompareToBuilder322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder322");
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
    public void CompareToBuilder323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder323");
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
    public void CompareToBuilder324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder324");
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
    public void CompareToBuilder325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder325");
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
    public void CompareToBuilder326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder326");
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
    public void CompareToBuilder327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder327");
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
    public void CompareToBuilder328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder328");
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
    public void CompareToBuilder329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder329");
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
    public void CompareToBuilder330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder330");
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
    public void CompareToBuilder331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder331");
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
    public void CompareToBuilder332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder332");
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
    public void CompareToBuilder333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder333");
        java.lang.Object obj0 = null;
        java.lang.Object obj1 = null;
        int int3 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare(obj0, obj1, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void CompareToBuilder334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder334");
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
    public void CompareToBuilder335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder335");
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
    public void CompareToBuilder336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder336");
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
    public void CompareToBuilder337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder337");
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
    public void CompareToBuilder338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder338");
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
    public void CompareToBuilder339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder339");
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
    public void CompareToBuilder340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder340");
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
    public void CompareToBuilder341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder341");
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
    public void CompareToBuilder342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder342");
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
    public void CompareToBuilder343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder343");
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
    public void CompareToBuilder344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder344");
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
    public void CompareToBuilder345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder345");
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
    public void CompareToBuilder346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder346");
        int int3 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) (byte) 100, (java.lang.Object) (byte) 0, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void CompareToBuilder347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder347");
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
    public void CompareToBuilder348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder348");
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
    public void CompareToBuilder349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder349");
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
    public void CompareToBuilder350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder350");
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
    public void CompareToBuilder351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder351");
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
    public void CompareToBuilder352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder352");
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
    public void CompareToBuilder353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder353");
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
    public void CompareToBuilder354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder354");
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
    public void CompareToBuilder355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder355");
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
    public void CompareToBuilder356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder356");
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
    public void CompareToBuilder357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder357");
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
    public void CompareToBuilder358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder358");
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
    public void CompareToBuilder359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder359");
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
    public void CompareToBuilder360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder360");
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
    public void CompareToBuilder361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder361");
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
    public void CompareToBuilder362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder362");
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
    public void CompareToBuilder363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder363");
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
    public void CompareToBuilder364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder364");
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
    public void CompareToBuilder365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder365");
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
    public void CompareToBuilder366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder366");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder1 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder4 = compareToBuilder1.append((int) (short) 0, (int) (short) 1);
        int int5 = compareToBuilder4.toComparison();
        // The following exception was thrown during execution in CompareToBuilder generation
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
    public void CompareToBuilder367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder367");
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
    public void CompareToBuilder368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder368");
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
    public void CompareToBuilder369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder369");
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
    public void CompareToBuilder370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder370");
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
    public void CompareToBuilder371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder371");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (-1.0f), (double) (short) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((short) (byte) 1, (short) -1);
        // The following exception was thrown during execution in CompareToBuilder generation
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
    public void CompareToBuilder372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder372");
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
    public void CompareToBuilder373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder373");
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
    public void CompareToBuilder374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder374");
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
    public void CompareToBuilder375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder375");
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
    public void CompareToBuilder376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder376");
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
    public void CompareToBuilder377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder377");
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
    public void CompareToBuilder378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder378");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((float) (byte) 0, (float) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append(true, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
    }

    @Test
    public void CompareToBuilder379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder379");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        int int1 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.appendSuper((int) '#');
        java.lang.Object obj4 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        // The following exception was thrown during execution in CompareToBuilder generation
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
    public void CompareToBuilder380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder380");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder1 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder4 = compareToBuilder1.append((double) (-1.0f), (double) (short) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder4.append((short) (byte) 1, (short) -1);
        // The following exception was thrown during execution in CompareToBuilder generation
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
    public void CompareToBuilder381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder381");
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
    public void CompareToBuilder382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder382");
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
    public void CompareToBuilder383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder383");
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
    public void CompareToBuilder384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder384");
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
    public void CompareToBuilder385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder385");
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
    public void CompareToBuilder386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder386");
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
    public void CompareToBuilder387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder387");
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
    public void CompareToBuilder388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder388");
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
    public void CompareToBuilder389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder389");
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
    public void CompareToBuilder390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder390");
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
    public void CompareToBuilder391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder391");
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
    public void CompareToBuilder392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder392");
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
    public void CompareToBuilder393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder393");
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
    public void CompareToBuilder394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder394");
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
    public void CompareToBuilder395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder395");
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
    public void CompareToBuilder396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder396");
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
    public void CompareToBuilder397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder397");
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
    public void CompareToBuilder398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder398");
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
    public void CompareToBuilder399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder399");
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
    public void CompareToBuilder400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder400");
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
    public void CompareToBuilder401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder401");
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
    public void CompareToBuilder402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder402");
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
    public void CompareToBuilder403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder403");
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
    public void CompareToBuilder404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder404");
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
    public void CompareToBuilder405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder405");
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
    public void CompareToBuilder406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder406");
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
    public void CompareToBuilder407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder407");
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
    public void CompareToBuilder408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder408");
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
    public void CompareToBuilder409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder409");
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
    public void CompareToBuilder410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder410");
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
    public void CompareToBuilder411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder411");
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
    public void CompareToBuilder412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder412");
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
    public void CompareToBuilder413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder413");
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
    public void CompareToBuilder414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder414");
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
    public void CompareToBuilder415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder415");
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
    public void CompareToBuilder416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder416");
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
    public void CompareToBuilder417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder417");
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
    public void CompareToBuilder418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder418");
        // The following exception was thrown during execution in CompareToBuilder generation
        try {
            int int2 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) 1.0d, (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompareToBuilder419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder419");
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
    public void CompareToBuilder420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder420");
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
    public void CompareToBuilder421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder421");
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
    public void CompareToBuilder422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder422");
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
    public void CompareToBuilder423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder423");
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
    public void CompareToBuilder424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder424");
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
    public void CompareToBuilder425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder425");
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
    public void CompareToBuilder426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder426");
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
    public void CompareToBuilder427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder427");
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
    public void CompareToBuilder428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder428");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder1 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder1.appendSuper((int) (short) 100);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder3.append(100, 35);
        // The following exception was thrown during execution in CompareToBuilder generation
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
    public void CompareToBuilder429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder429");
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
    public void CompareToBuilder430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder430");
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
    public void CompareToBuilder431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder431");
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
    public void CompareToBuilder432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder432");
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
    public void CompareToBuilder433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder433");
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
    public void CompareToBuilder434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder434");
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
    public void CompareToBuilder435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder435");
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
    public void CompareToBuilder436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder436");
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
    public void CompareToBuilder437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder437");
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
    public void CompareToBuilder438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder438");
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
    public void CompareToBuilder439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder439");
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
    public void CompareToBuilder440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder440");
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
    public void CompareToBuilder441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder441");
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
    public void CompareToBuilder442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder442");
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
    public void CompareToBuilder443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder443");
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
    public void CompareToBuilder444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder444");
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
    public void CompareToBuilder445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder445");
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
    public void CompareToBuilder446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder446");
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
    public void CompareToBuilder447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder447");
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
    public void CompareToBuilder448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder448");
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
    public void CompareToBuilder449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder449");
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
    public void CompareToBuilder450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder450");
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
    public void CompareToBuilder451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder451");
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
    public void CompareToBuilder452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder452");
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
    public void CompareToBuilder453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder453");
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
    public void CompareToBuilder454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder454");
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
    public void CompareToBuilder455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder455");
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
    public void CompareToBuilder456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder456");
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
    public void CompareToBuilder457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder457");
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
    public void CompareToBuilder458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder458");
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
    public void CompareToBuilder459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder459");
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
    public void CompareToBuilder460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder460");
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
    public void CompareToBuilder461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder461");
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
    public void CompareToBuilder462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder462");
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
    public void CompareToBuilder463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder463");
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
    public void CompareToBuilder464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder464");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder1 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder1.appendSuper((int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((double) '#', (double) 10L);
        // The following exception was thrown during execution in CompareToBuilder generation
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
    public void CompareToBuilder465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder465");
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
    public void CompareToBuilder466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder466");
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
    public void CompareToBuilder467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder467");
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
    public void CompareToBuilder468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder468");
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
    public void CompareToBuilder469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder469");
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
    public void CompareToBuilder470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder470");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        java.lang.Class<?> wildcardClass4 = compareToBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void CompareToBuilder471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder471");
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
    public void CompareToBuilder472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder472");
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
    public void CompareToBuilder473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder473");
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
    public void CompareToBuilder474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder474");
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
    public void CompareToBuilder475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder475");
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
    public void CompareToBuilder476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder476");
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
    public void CompareToBuilder477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder477");
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
    public void CompareToBuilder478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder478");
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
    public void CompareToBuilder479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder479");
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
    public void CompareToBuilder480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder480");
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
    public void CompareToBuilder481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder481");
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
    public void CompareToBuilder482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder482");
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
    public void CompareToBuilder483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder483");
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
    public void CompareToBuilder484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder484");
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
    public void CompareToBuilder485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder485");
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
    public void CompareToBuilder486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder486");
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
    public void CompareToBuilder487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder487");
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
    public void CompareToBuilder488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder488");
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
    public void CompareToBuilder489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder489");
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
    public void CompareToBuilder490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder490");
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
    public void CompareToBuilder491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder491");
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
    public void CompareToBuilder492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder492");
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
    public void CompareToBuilder493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder493");
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
    public void CompareToBuilder494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder494");
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
    public void CompareToBuilder495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder495");
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
    public void CompareToBuilder496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder496");
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
    public void CompareToBuilder497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder497");
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
    public void CompareToBuilder498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder498");
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
    public void CompareToBuilder499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder499");
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
    public void CompareToBuilder500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.CompareToBuilder500");
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

