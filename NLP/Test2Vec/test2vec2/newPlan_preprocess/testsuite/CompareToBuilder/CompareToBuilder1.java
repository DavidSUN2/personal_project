package CompareToBuilder;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CompareToBuilder1 {

    public static boolean debug = false;

    @Test
    public void CompareToBuilder501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder501");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((-1), (-1));
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.append((short) (byte) 10, (short) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder502");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder1 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder4 = compareToBuilder1.append((int) (short) 0, (int) (short) 1);
        int int5 = compareToBuilder4.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder4.append((byte) 0, (byte) 100);
        // The following exception was thrown during execution in CompareToBuilder generation
        try {
            int int9 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare(obj0, (java.lang.Object) compareToBuilder4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
    }

    @Test
    public void CompareToBuilder503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder503");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append(false, true);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append(10.0f, (float) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder504");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        java.lang.Integer int4 = compareToBuilder0.build();
        float[] floatArray7 = new float[] { (byte) -1, (short) 0 };
        float[] floatArray8 = null;
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append(floatArray7, floatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder505");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder2.append((double) 100, 0.0d);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder2.append((int) (byte) -1, (int) (byte) 10);
        java.lang.Integer int9 = compareToBuilder2.build();
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
    public void CompareToBuilder506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder506");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append((float) 100, (float) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder0.append((float) (byte) 0, (float) (short) 100);
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
    public void CompareToBuilder507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder507");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((long) 1, (long) (short) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder3.appendSuper((int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder5.append(0, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
    }

    @Test
    public void CompareToBuilder508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder508");
        java.lang.Object obj0 = null;
        java.lang.Object obj1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        int int7 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare(obj0, obj1, (java.util.Collection<java.lang.String>) strList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void CompareToBuilder509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder509");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder0.append((double) (byte) 1, (double) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
    }

    @Test
    public void CompareToBuilder510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder510");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        int int1 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.appendSuper((int) '#');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((double) 1L, (double) '4');
        int int7 = compareToBuilder3.toComparison();
        java.lang.Class<?> wildcardClass8 = compareToBuilder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CompareToBuilder511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder511");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        int int1 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.appendSuper((int) '#');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((double) (byte) 100, 100.0d);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append('a', ' ');
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
    public void CompareToBuilder512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder512");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        int int4 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder0.append((long) (byte) 100, (long) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
    }

    @Test
    public void CompareToBuilder513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder513");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (-1.0f), (double) (short) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append(100L, 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
    }

    @Test
    public void CompareToBuilder514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder514");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((float) (short) 100, (float) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((float) 100, 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder515");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append(0L, 100L);
        int int7 = compareToBuilder6.toComparison();
        java.lang.Integer int8 = compareToBuilder6.build();
        java.lang.Integer int9 = compareToBuilder6.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9.equals((-1)));
    }

    @Test
    public void CompareToBuilder516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder516");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (-1.0f), (double) (short) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((short) -1, (short) 10);
        int int7 = compareToBuilder6.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void CompareToBuilder517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder517");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        java.lang.Integer int4 = compareToBuilder0.build();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder0.append((short) 0, (short) (byte) 1);
        java.lang.Integer int8 = compareToBuilder7.build();
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
    public void CompareToBuilder518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder518");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((long) 1, (long) (short) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder3.appendSuper((int) (short) 1);
        java.lang.Integer int6 = compareToBuilder3.build();
        java.lang.Integer int7 = compareToBuilder3.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7.equals((-1)));
    }

    @Test
    public void CompareToBuilder519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder519");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.appendSuper((int) ' ');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((int) '#', 100);
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
    public void CompareToBuilder520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder520");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder3.append((int) '#', 32);
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
    public void CompareToBuilder521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder521");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((long) 1, (long) (short) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder3.appendSuper((int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder3.append(10, (int) ' ');
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
    public void CompareToBuilder522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder522");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.appendSuper(1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((int) (byte) 1, (int) 'a');
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
    public void CompareToBuilder523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder523");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(false, false);
        java.lang.Integer int6 = compareToBuilder0.build();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder0.appendSuper((int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
    }

    @Test
    public void CompareToBuilder524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder524");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((int) (short) 1, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder0.appendSuper((int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
    }

    @Test
    public void CompareToBuilder525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder525");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (-1.0f), (double) (short) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((short) -1, (short) 10);
        java.lang.Class<?> wildcardClass7 = compareToBuilder6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CompareToBuilder526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder526");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder4 = compareToBuilder0.appendSuper(10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder4.appendSuper(10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder4.append((float) (-1), (float) 2);
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
    public void CompareToBuilder527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder527");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((long) 1, (long) (short) 10);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder3.append((float) '4', (float) (byte) 1);
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
    public void CompareToBuilder528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder528");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        int int1 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.appendSuper((int) '#');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((double) 'a', (double) (byte) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((long) 'a', (-1L));
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
    public void CompareToBuilder529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder529");
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in CompareToBuilder generation
        try {
            int int3 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) 0L, obj1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompareToBuilder530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder530");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        java.lang.Integer int4 = compareToBuilder3.build();
        java.lang.Class<?> wildcardClass5 = compareToBuilder3.getClass();
        java.lang.Object obj6 = null;
        // The following exception was thrown during execution in CompareToBuilder generation
        try {
            int int7 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) wildcardClass5, obj6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void CompareToBuilder531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder531");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(false, false);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder0.append('#', '4');
        java.lang.Class<?> wildcardClass9 = compareToBuilder0.getClass();
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
    public void CompareToBuilder532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder532");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((byte) 10, (byte) 100);
        int int7 = compareToBuilder3.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void CompareToBuilder533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder533");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        java.lang.Integer int4 = compareToBuilder0.build();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder0.append((float) ' ', (float) (-1));
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
    public void CompareToBuilder534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder534");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        int int1 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.appendSuper((int) '#');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((double) 'a', (double) (byte) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append(true, false);
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
    public void CompareToBuilder535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder535");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.appendSuper((int) (short) -1);
        int int7 = compareToBuilder6.toComparison();
        java.lang.Integer int8 = compareToBuilder6.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8.equals((-1)));
    }

    @Test
    public void CompareToBuilder536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder536");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((long) (-1), 0L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((double) (short) 0, (double) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder537");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((long) (-1), 0L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder6.appendSuper((int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
    }

    @Test
    public void CompareToBuilder538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder538");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        java.lang.Integer int4 = compareToBuilder0.build();
        java.lang.Class<?> wildcardClass5 = compareToBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void CompareToBuilder539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder539");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append((float) 100, (float) 100);
        java.lang.Integer int6 = compareToBuilder5.build();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder5.append(' ', 'a');
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
    public void CompareToBuilder540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder540");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder3.append((float) '#', (float) (short) 0);
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
    public void CompareToBuilder541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder541");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.appendSuper((int) (short) -1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder6.appendSuper((int) (short) -1);
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
    public void CompareToBuilder542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder542");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (-1.0f), (double) (short) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((short) -1, (short) 10);
        java.lang.Integer int7 = compareToBuilder0.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7.equals((-1)));
    }

    @Test
    public void CompareToBuilder543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder543");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((int) (short) 1, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append((byte) 10, (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder544");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((float) (byte) 0, (float) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((byte) 100, (byte) -1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append(false, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder545");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((float) ' ', (float) (byte) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append(0.0d, (double) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder546");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.appendSuper((int) (short) -1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.append((short) 0, (short) (byte) -1);
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
    public void CompareToBuilder547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder547");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.appendSuper((int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((byte) 100, (byte) 10);
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
    public void CompareToBuilder548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder548");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((float) (short) 100, (float) 100);
        java.lang.Integer int7 = compareToBuilder6.build();
        java.lang.Integer int8 = compareToBuilder6.build();
        int int9 = compareToBuilder6.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void CompareToBuilder549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder549");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((long) '4', (long) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.append((long) (byte) -1, (long) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder550");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder2.append((double) 100, 0.0d);
        int int6 = compareToBuilder5.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder5.append((float) 'a', (float) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder551");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (-1.0f), (double) (short) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append(true, false);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder6.appendSuper(2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
    }

    @Test
    public void CompareToBuilder552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder552");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(false, false);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder5.append(true, false);
        int int9 = compareToBuilder5.toComparison();
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
    public void CompareToBuilder553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder553");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.appendSuper((int) (short) -1);
        java.lang.Integer int7 = compareToBuilder6.build();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.appendSuper(35);
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
    public void CompareToBuilder554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder554");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((short) 0, (short) (byte) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append(false, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder555");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder2.append(2, (int) '4');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder2.append((-1.0d), (double) 32);
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
    public void CompareToBuilder556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder556");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder2.append((double) 100, 0.0d);
        int int6 = compareToBuilder5.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder5.append((short) (byte) 0, (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder557");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.appendSuper(1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append(false, false);
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
    public void CompareToBuilder558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder558");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append((float) 100, (float) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder5.appendSuper(0);
        java.lang.Integer int8 = compareToBuilder7.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8.equals(100));
    }

    @Test
    public void CompareToBuilder559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder559");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        int int1 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder4 = compareToBuilder0.append((float) (short) 100, (float) (byte) -1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder4.append((float) (short) 1, (float) (-1L));
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder7.appendSuper((int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder560");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.appendSuper((int) (short) 1);
        java.lang.Integer int7 = compareToBuilder3.build();
        java.lang.Class<?> wildcardClass8 = compareToBuilder3.getClass();
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
    public void CompareToBuilder561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder561");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray3 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray4 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(shortArray3, shortArray4);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder5.appendSuper(1);
        int int8 = compareToBuilder5.toComparison();
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
    public void CompareToBuilder562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder562");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder1 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder4 = compareToBuilder1.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder1.append((float) (-1L), (float) (byte) -1);
        java.lang.Class<?> wildcardClass8 = compareToBuilder7.getClass();
        // The following exception was thrown during execution in CompareToBuilder generation
        try {
            int int9 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) false, (java.lang.Object) compareToBuilder7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CompareToBuilder563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder563");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((long) 1, (long) (short) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((long) (byte) 100, (long) (short) 10);
        int int7 = compareToBuilder3.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void CompareToBuilder564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder564");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        int int4 = compareToBuilder3.toComparison();
        java.lang.Integer int5 = compareToBuilder3.build();
        java.lang.Class<?> wildcardClass6 = compareToBuilder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void CompareToBuilder565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder565");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((long) 1, (long) (short) 10);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder3.append((long) (byte) 0, (long) (-1));
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
    public void CompareToBuilder566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder566");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder3.append((int) '#', 32);
        java.lang.Integer int8 = compareToBuilder3.build();
        java.lang.Integer int9 = compareToBuilder3.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9.equals((-1)));
    }

    @Test
    public void CompareToBuilder567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder567");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        java.lang.Class<?> wildcardClass4 = compareToBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void CompareToBuilder568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder568");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((float) (byte) 0, (float) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((byte) 1, (byte) 1);
        java.lang.Integer int7 = compareToBuilder3.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7.equals((-1)));
    }

    @Test
    public void CompareToBuilder569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder569");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((byte) 10, (byte) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.append((double) 100L, (double) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder570");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((float) (byte) -1, (float) ' ');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append(0.0d, (double) (byte) -1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append('4', ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder571");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((long) 1, (long) (short) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder3.appendSuper((int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder5.append((int) (short) 100, 0);
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
    public void CompareToBuilder572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder572");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((float) (byte) 0, (float) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append(100L, (long) (short) -1);
        java.lang.Integer int7 = compareToBuilder6.build();
        int int8 = compareToBuilder6.toComparison();
        int int9 = compareToBuilder6.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void CompareToBuilder573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder573");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((float) (byte) -1, (float) ' ');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((int) (byte) 0, 1);
        java.lang.Class<?> wildcardClass7 = compareToBuilder6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CompareToBuilder574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder574");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray3 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray4 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(shortArray3, shortArray4);
        int int6 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append('#', '#');
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
    public void CompareToBuilder575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder575");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.appendSuper(2);
        int int7 = compareToBuilder6.toComparison();
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
    public void CompareToBuilder576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder576");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(false, false);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder5.append(' ', ' ');
        int int9 = compareToBuilder5.toComparison();
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
    public void CompareToBuilder577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder577");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((float) (byte) 0, (float) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((byte) 1, (byte) 1);
        // The following exception was thrown during execution in CompareToBuilder generation
        try {
            int int8 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) (byte) 1, (java.lang.Object) '#');
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
    public void CompareToBuilder578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder578");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((float) (-1L), (float) (byte) -1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append(true, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder579");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((long) 1, (long) (short) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append(100.0d, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder6.appendSuper(32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
    }

    @Test
    public void CompareToBuilder580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder580");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(false, false);
        java.lang.Integer int6 = compareToBuilder0.build();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append((short) (byte) 10, (short) 0);
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
    public void CompareToBuilder581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder581");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((long) 1, (long) (short) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append(1.0f, (float) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append((short) (byte) 1, (short) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder582");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.appendSuper((int) (short) -1);
        java.lang.Integer int7 = compareToBuilder3.build();
        int int8 = compareToBuilder3.toComparison();
        java.lang.Class<?> wildcardClass9 = compareToBuilder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompareToBuilder583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder583");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder0.append('#', ' ');
        java.lang.Integer int8 = compareToBuilder0.build();
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
    public void CompareToBuilder584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder584");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((long) 1, (long) (short) 10);
        int int4 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder0.append((int) 'a', (int) ' ');
        java.lang.Integer int8 = compareToBuilder0.build();
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
    public void CompareToBuilder585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder585");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray3 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray4 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(shortArray3, shortArray4);
        java.lang.Integer int6 = compareToBuilder0.build();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder0.appendSuper((int) (byte) 1);
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
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9.equals(1));
    }

    @Test
    public void CompareToBuilder586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder586");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((int) (short) 1, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder6.appendSuper((int) (short) 100);
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
    public void CompareToBuilder587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder587");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        int int1 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder4 = compareToBuilder0.append((byte) -1, (byte) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder0.append((long) 2, 10L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder7.appendSuper((-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder588");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append(0L, 100L);
        int int7 = compareToBuilder6.toComparison();
        int int8 = compareToBuilder6.toComparison();
        int int9 = compareToBuilder6.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void CompareToBuilder589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder589");
        java.lang.Object obj0 = null;
        java.lang.Object obj1 = null;
        java.lang.String[] strArray2 = null;
        int int3 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare(obj0, obj1, strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void CompareToBuilder590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder590");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((long) 1, (long) (short) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append(true, false);
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
    public void CompareToBuilder591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder591");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        int int1 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder4 = compareToBuilder0.append((byte) -1, (byte) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder4.append(0, 2);
        int int8 = compareToBuilder7.toComparison();
        java.lang.Integer int9 = compareToBuilder7.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9.equals((-1)));
    }

    @Test
    public void CompareToBuilder592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder592");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((float) (byte) -1, (float) ' ');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((int) (byte) 0, 1);
        int int7 = compareToBuilder6.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.appendSuper((-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder593");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((double) 35, 0.0d);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append(2, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder594");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder2.append((double) '#', (double) 10L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder2.appendSuper(35);
        int int8 = compareToBuilder7.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void CompareToBuilder595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder595");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (-1.0f), (double) (short) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((short) -1, (short) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append((double) '4', 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder596");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((float) (byte) -1, (float) ' ');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.appendSuper(100);
        java.lang.Class<?> wildcardClass6 = compareToBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void CompareToBuilder597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder597");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (-1.0f), (double) (short) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((long) (byte) -1, 0L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.append(1.0d, (double) (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder598");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((long) (short) -1, (long) (short) 1);
        java.lang.Class<?> wildcardClass7 = compareToBuilder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CompareToBuilder599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder599");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.appendSuper((int) (short) -1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((short) 1, (short) (byte) 0);
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
    public void CompareToBuilder600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder600");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 100);
        int int3 = compareToBuilder2.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder2.append(100, 35);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder2.append((float) (short) 1, (float) ' ');
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
    public void CompareToBuilder601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder601");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder2.append(10, (int) (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder2.append(1, 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
    }

    @Test
    public void CompareToBuilder602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder602");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((short) (byte) 0, (short) (byte) 0);
        java.lang.Integer int7 = compareToBuilder0.build();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.appendSuper((int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder603");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((long) 1, (long) (short) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append(100.0d, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append((short) (byte) -1, (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder604");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append(true, false);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append((short) 10, (short) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder605");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (-1.0f), (double) (short) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append('#', '4');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append(false, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder606");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder0.append('#', ' ');
        java.lang.Integer int8 = compareToBuilder7.build();
        java.lang.Integer int9 = compareToBuilder7.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9.equals((-1)));
    }

    @Test
    public void CompareToBuilder607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder607");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((float) (byte) 0, (float) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((byte) 1, (byte) 1);
        java.lang.Class<?> wildcardClass7 = compareToBuilder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CompareToBuilder608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder608");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        int int1 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.appendSuper((int) '#');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((double) (byte) 100, 100.0d);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder6.appendSuper(2);
        java.lang.Integer int9 = compareToBuilder6.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9.equals(35));
    }

    @Test
    public void CompareToBuilder609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder609");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.appendSuper(100);
        int int7 = compareToBuilder6.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void CompareToBuilder610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder610");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        java.lang.Integer int4 = compareToBuilder3.build();
        java.lang.Integer int5 = compareToBuilder3.build();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder3.append(false, false);
        java.lang.Integer int9 = compareToBuilder8.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9.equals((-1)));
    }

    @Test
    public void CompareToBuilder611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder611");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        int int1 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.appendSuper((int) '#');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((int) (byte) 1, (int) (short) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append((byte) -1, (byte) 10);
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
    public void CompareToBuilder612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder612");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((float) (byte) 0, (float) (short) 1);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder3.append(100L, (long) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
    }

    @Test
    public void CompareToBuilder613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder613");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((double) 35, 0.0d);
        java.lang.Class<?> wildcardClass7 = compareToBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CompareToBuilder614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder614");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((float) (byte) -1, (float) ' ');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append(0.0d, (double) (byte) -1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append(10L, (long) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder615");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder0.toComparison();
        java.lang.Class<?> wildcardClass5 = compareToBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void CompareToBuilder616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder616");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        int int1 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.appendSuper((int) '#');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((double) 'a', (double) (byte) 0);
        java.lang.Integer int7 = compareToBuilder6.build();
        java.lang.Class<?> wildcardClass8 = compareToBuilder6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7.equals(35));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CompareToBuilder617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder617");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) 100, (double) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((float) 2, (float) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append((double) 100L, 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder618");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder2.append((short) (byte) 0, (short) (byte) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder2.append((int) '#', (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
    }

    @Test
    public void CompareToBuilder619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder619");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (-1.0f), (double) (short) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((double) 'a', 0.0d);
        int int7 = compareToBuilder6.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void CompareToBuilder620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder620");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((-1), (-1));
        java.lang.Integer int7 = compareToBuilder6.build();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.appendSuper((int) (short) 0);
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
    public void CompareToBuilder621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder621");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 100);
        int int3 = compareToBuilder2.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder2.append(100, 35);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder2.append(true, false);
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
    public void CompareToBuilder622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder622");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((long) 1, (long) (short) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append(1.0f, (float) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append(0, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder623");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray3 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray4 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(shortArray3, shortArray4);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder0.append((long) 100, (long) 35);
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
    public void CompareToBuilder624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder624");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((float) (byte) 0, (float) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append(100L, (long) (short) -1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((long) (short) 1, (long) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder625");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (-1.0f), (double) (short) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((short) -1, (short) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append((byte) 0, (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder626");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.appendSuper(100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append(2, (int) (short) -1);
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
    public void CompareToBuilder627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder627");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (-1.0f), (double) (short) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((long) (byte) -1, 0L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append(true, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder628");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder2.append(10, (int) (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder2.append((double) '4', 100.0d);
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
    public void CompareToBuilder629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder629");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append(true, false);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append((double) (short) 1, (double) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder630");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray3 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray4 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(shortArray3, shortArray4);
        java.lang.Integer int6 = compareToBuilder0.build();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append((short) 1, (short) 100);
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
    public void CompareToBuilder631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder631");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((long) 1, (long) (short) 10);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder3.append((long) (byte) 0, (long) (-1));
        int int8 = compareToBuilder7.toComparison();
        java.lang.Class<?> wildcardClass9 = compareToBuilder7.getClass();
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
    public void CompareToBuilder632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder632");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        int int1 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.appendSuper((int) '#');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.appendSuper((int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder0.append('#', 'a');
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
    public void CompareToBuilder633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder633");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder0.toComparison();
        java.lang.Integer int5 = compareToBuilder0.build();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder0.append((byte) 10, (byte) 0);
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
    public void CompareToBuilder634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder634");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        int int1 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder4 = compareToBuilder0.append((byte) -1, (byte) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder0.append((double) (byte) 0, (double) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
    }

    @Test
    public void CompareToBuilder635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder635");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((byte) 10, (byte) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((short) 100, (short) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder636");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((long) 1, (long) (short) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((double) 100L, (double) ' ');
        java.lang.Class<?> wildcardClass7 = compareToBuilder6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CompareToBuilder637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder637");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (-1.0f), (double) (short) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((long) (byte) -1, 0L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder6.appendSuper((int) '#');
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
    public void CompareToBuilder638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder638");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (-1.0f), (double) (short) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((long) 'a', (long) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append(0.0f, 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder639");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.appendSuper(100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.append((float) (short) 0, (float) (byte) 0);
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
    public void CompareToBuilder640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder640");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((-1), (-1));
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder3.appendSuper(1);
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
    public void CompareToBuilder641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder641");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((float) ' ', (float) (byte) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append((int) (byte) 100, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder642");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        boolean[] booleanArray7 = new boolean[] { true, true, false };
        boolean[] booleanArray8 = null;
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append(booleanArray7, booleanArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder643");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (-1.0f), (double) (short) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((long) (byte) -1, 0L);
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
    public void CompareToBuilder644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder644");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        int int1 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.appendSuper((int) '#');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((int) (byte) 1, (int) (short) 10);
        java.lang.Integer int7 = compareToBuilder6.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7.equals(35));
    }

    @Test
    public void CompareToBuilder645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder645");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder2.append(10, (int) (short) 100);
        java.lang.Integer int6 = compareToBuilder2.build();
        java.lang.Class<?> wildcardClass7 = compareToBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CompareToBuilder646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder646");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        int int4 = compareToBuilder3.toComparison();
        int int5 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder3.append((short) -1, (short) -1);
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
    public void CompareToBuilder647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder647");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        int int1 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder4 = compareToBuilder0.append((byte) -1, (byte) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder0.append('a', 'a');
        java.lang.Integer int8 = compareToBuilder0.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8.equals((-1)));
    }

    @Test
    public void CompareToBuilder648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder648");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((long) 1, (long) (short) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((long) (byte) 100, (long) (short) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.append(0L, (long) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder649");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(' ', ' ');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder5.append((-1L), (long) 1);
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
    public void CompareToBuilder650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder650");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder2.append((short) (byte) 0, (short) (byte) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder5.append((byte) 1, (byte) 0);
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
    public void CompareToBuilder651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder651");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder3.append(false, true);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.appendSuper((int) '#');
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
    public void CompareToBuilder652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder652");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((float) (-1L), (float) (byte) -1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append(false, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder653");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((-1), (-1));
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((int) (byte) 100, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder654");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        int int1 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder4 = compareToBuilder0.append((byte) -1, (byte) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder4.append((long) (-1), 0L);
        int int8 = compareToBuilder7.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void CompareToBuilder655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder655");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        int int1 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.appendSuper((int) '#');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.appendSuper((int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder5.appendSuper((int) (byte) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder5.appendSuper((int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder656");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder4 = compareToBuilder0.appendSuper(10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder4.appendSuper(10);
        int int7 = compareToBuilder6.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void CompareToBuilder657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder657");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        int int1 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder4 = compareToBuilder0.append((float) (short) 100, (float) (byte) -1);
        java.lang.Class<?> wildcardClass5 = compareToBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void CompareToBuilder658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder658");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        java.lang.Integer int4 = compareToBuilder3.build();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder3.append((byte) 10, (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
    }

    @Test
    public void CompareToBuilder659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder659");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append((float) 100, (float) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder5.append((byte) 1, (byte) 0);
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
    public void CompareToBuilder660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder660");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        java.lang.Integer int4 = compareToBuilder3.build();
        int int5 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder3.appendSuper((int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
    }

    @Test
    public void CompareToBuilder661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder661");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (-1.0f), (double) (short) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((double) 'a', 0.0d);
        java.lang.Class<?> wildcardClass7 = compareToBuilder6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CompareToBuilder662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder662");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((float) (byte) -1, (float) ' ');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((int) (byte) 0, 1);
        int int7 = compareToBuilder3.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void CompareToBuilder663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder663");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(false, false);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder0.append(10.0f, (float) 100L);
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
    public void CompareToBuilder664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder664");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(' ', ' ');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder0.append((double) 35, (double) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
    }

    @Test
    public void CompareToBuilder665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder665");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        int int1 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.appendSuper((int) '#');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.appendSuper((int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder0.append(1.0d, (double) (byte) 10);
        java.lang.Class<?> wildcardClass9 = compareToBuilder8.getClass();
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
    public void CompareToBuilder666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder666");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append(' ', 'a');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append(false, false);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((double) (-1L), (double) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder667");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        int int1 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.appendSuper((int) '#');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((double) (byte) 100, 100.0d);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append(false, false);
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
    public void CompareToBuilder668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder668");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((float) (-1L), (float) (byte) -1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append(1, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder669");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) 100, (double) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((int) (short) 1, (int) (short) -1);
        java.lang.Integer int7 = compareToBuilder3.build();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.appendSuper((int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder670");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        java.lang.Integer int4 = compareToBuilder3.build();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder3.append((long) (byte) 0, (long) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
    }

    @Test
    public void CompareToBuilder671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder671");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((float) 10, (float) (short) 100);
        java.lang.Class<?> wildcardClass7 = compareToBuilder6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CompareToBuilder672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder672");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (-1.0f), (double) (short) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((long) 'a', (long) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.append((double) '#', (double) 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder673");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((long) 1, (long) (short) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder3.appendSuper((int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder3.append((float) (-1L), (float) (short) 0);
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
    public void CompareToBuilder674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder674");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append('a', '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
    }

    @Test
    public void CompareToBuilder675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder675");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        int int1 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.appendSuper((int) '#');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.appendSuper((int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder5.appendSuper((int) (byte) 10);
        java.lang.Integer int8 = compareToBuilder7.build();
        java.lang.Class<?> wildcardClass9 = compareToBuilder7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8.equals(35));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompareToBuilder676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder676");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append(0L, (long) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.append((byte) -1, (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder677");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((int) (short) 1, (int) (short) 1);
        int int7 = compareToBuilder6.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void CompareToBuilder678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder678");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((byte) -1, (byte) 10);
        int int7 = compareToBuilder3.toComparison();
        int int8 = compareToBuilder3.toComparison();
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
    public void CompareToBuilder679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder679");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder2.append((float) 0, (float) 1);
        java.lang.Class<?> wildcardClass6 = compareToBuilder5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void CompareToBuilder680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder680");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.appendSuper(1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.append('#', '4');
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
    public void CompareToBuilder681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder681");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray3 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray4 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(shortArray3, shortArray4);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder0.append(true, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
    }

    @Test
    public void CompareToBuilder682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder682");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((long) 1, (long) (short) 10);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder3.append((float) '4', (float) (byte) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder7.appendSuper(10);
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
    public void CompareToBuilder683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder683");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        int int1 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder4 = compareToBuilder0.append((float) (short) 100, (float) (byte) -1);
        int int5 = compareToBuilder4.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder4.append(0.0f, 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
    }

    @Test
    public void CompareToBuilder684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder684");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((long) '4', (long) 0);
        java.lang.Integer int7 = compareToBuilder6.build();
        java.lang.Class<?> wildcardClass8 = compareToBuilder6.getClass();
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
    public void CompareToBuilder685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder685");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (-1.0f), (double) (short) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((short) (byte) 1, (short) -1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.append((short) 0, (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder686");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (-1.0f), (double) (short) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((short) (byte) 1, (short) -1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.append(10, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder687");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        java.lang.Integer int4 = compareToBuilder0.build();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder0.append((short) 0, (short) (byte) 1);
        int int8 = compareToBuilder0.toComparison();
        java.lang.Integer int9 = compareToBuilder0.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9.equals((-1)));
    }

    @Test
    public void CompareToBuilder688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder688");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder4 = compareToBuilder0.appendSuper(10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder4.appendSuper(10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder4.append('4', ' ');
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
    public void CompareToBuilder689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder689");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        int int1 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder4 = compareToBuilder0.append((float) (short) 100, (float) (byte) -1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder0.append(100, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
    }

    @Test
    public void CompareToBuilder690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder690");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        java.lang.Integer int4 = compareToBuilder0.build();
        java.lang.Integer int5 = compareToBuilder0.build();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder0.append(true, true);
        java.lang.Class<?> wildcardClass9 = compareToBuilder8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompareToBuilder691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder691");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        int int1 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.appendSuper((int) '#');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((-1L), 0L);
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
    public void CompareToBuilder692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder692");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((-1), (-1));
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.append((double) 1, (double) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder693");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        java.lang.Integer int4 = compareToBuilder0.build();
        java.lang.Integer int5 = compareToBuilder0.build();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder0.append((byte) 0, (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
    }

    @Test
    public void CompareToBuilder694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder694");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        int int1 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.appendSuper((int) '#');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((double) (byte) 100, 100.0d);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.append((double) 10, (double) 0L);
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
    public void CompareToBuilder695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder695");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder2.append((double) '#', (double) 10L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder2.appendSuper(35);
        java.lang.Class<?> wildcardClass8 = compareToBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CompareToBuilder696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder696");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((float) (-1L), (float) (byte) -1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((byte) -1, (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder697");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((short) 0, (short) (byte) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append(true, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder698");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) 100, (double) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((int) (short) 1, (int) (short) -1);
        java.lang.Integer int7 = compareToBuilder6.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7.equals(1));
    }

    @Test
    public void CompareToBuilder699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder699");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((short) 0, (short) (byte) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append((float) (short) 1, (float) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder700");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((float) (byte) -1, (float) ' ');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((int) (byte) 0, 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.append('4', '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder701");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder2.append(10, (int) (short) 100);
        java.lang.Integer int6 = compareToBuilder2.build();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder2.append(true, false);
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
    public void CompareToBuilder702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder702");
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in CompareToBuilder generation
        try {
            int int3 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) (short) 10, obj1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompareToBuilder703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder703");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 100);
        int int3 = compareToBuilder2.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder2.append(100, 35);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((long) (byte) -1, (long) (short) 100);
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
    public void CompareToBuilder704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder704");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((long) 1, (long) (short) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((long) (byte) 100, (long) (short) 10);
        java.lang.Integer int7 = compareToBuilder3.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7.equals((-1)));
    }

    @Test
    public void CompareToBuilder705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder705");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.appendSuper(2);
        java.lang.Integer int7 = compareToBuilder0.build();
        int int8 = compareToBuilder0.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void CompareToBuilder706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder706");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (-1.0f), (double) (short) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((double) 'a', 0.0d);
        java.lang.Integer int7 = compareToBuilder6.build();
        java.lang.Integer int8 = compareToBuilder6.build();
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
    public void CompareToBuilder707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder707");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray3 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray4 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(shortArray3, shortArray4);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder5.append((short) (byte) -1, (short) 100);
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
    public void CompareToBuilder708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder708");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        java.lang.Integer int4 = compareToBuilder0.build();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder0.append(100.0d, (double) 1);
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
    public void CompareToBuilder709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder709");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((long) 1, (long) (short) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append(true, false);
        java.lang.Integer int7 = compareToBuilder0.build();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.appendSuper((int) (short) 100);
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
    public void CompareToBuilder710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder710");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append(0L, (long) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.append(10L, (long) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder711");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.appendSuper((int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
    }

    @Test
    public void CompareToBuilder712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder712");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (-1.0f), (double) (short) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((short) -1, (short) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append((byte) 100, (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder713");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        int int1 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder4 = compareToBuilder0.append((float) (short) 100, (float) (byte) -1);
        int int5 = compareToBuilder4.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder4.append((double) (short) 0, 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
    }

    @Test
    public void CompareToBuilder714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder714");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append(0L, (long) 0);
        java.lang.Integer int7 = compareToBuilder6.build();
        int int8 = compareToBuilder6.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void CompareToBuilder715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder715");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray3 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray4 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(shortArray3, shortArray4);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder5.append((long) '4', (long) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
    }

    @Test
    public void CompareToBuilder716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder716");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((long) 1, (long) (short) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder3.appendSuper((int) (short) 1);
        java.lang.Integer int6 = compareToBuilder3.build();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.append((int) (short) 100, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder717");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder3.append((float) '#', (float) (short) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder7.appendSuper(35);
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
    public void CompareToBuilder718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder718");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((float) (byte) -1, (float) ' ');
        java.lang.Integer int4 = compareToBuilder0.build();
        java.lang.Integer int5 = compareToBuilder0.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5.equals((-1)));
    }

    @Test
    public void CompareToBuilder719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder719");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        java.lang.Integer int4 = compareToBuilder0.build();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder0.append(100.0d, (double) 1);
        int int8 = compareToBuilder0.toComparison();
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
    public void CompareToBuilder720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder720");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder2.append((short) (byte) 0, (short) (byte) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder5.append((int) (byte) 100, 2);
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
    public void CompareToBuilder721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder721");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((double) 35, 0.0d);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((long) 100, (long) 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder722");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.appendSuper(2);
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
    public void CompareToBuilder723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder723");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((-1), (-1));
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder6.appendSuper((int) (short) 100);
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
    public void CompareToBuilder724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder724");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((short) (byte) 0, (short) (byte) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder0.appendSuper((int) (short) 10);
        int int9 = compareToBuilder0.toComparison();
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
    public void CompareToBuilder725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder725");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.appendSuper(2);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append((long) 32, 0L);
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
    public void CompareToBuilder726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder726");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder3.append((float) '#', (float) (short) 0);
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
    public void CompareToBuilder727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder727");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        int int1 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder4 = compareToBuilder0.append(0.0f, 0.0f);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder0.append((-1.0f), (float) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
    }

    @Test
    public void CompareToBuilder728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder728");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.appendSuper(1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.append('4', '4');
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
    public void CompareToBuilder729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder729");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((byte) -1, (byte) 10);
        java.lang.Integer int7 = compareToBuilder6.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7.equals((-1)));
    }

    @Test
    public void CompareToBuilder730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder730");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((long) 1, (long) (short) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append(1.0f, (float) 10);
        java.lang.Integer int7 = compareToBuilder6.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7.equals((-1)));
    }

    @Test
    public void CompareToBuilder731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder731");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((float) (byte) 0, (float) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((byte) 1, (byte) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder6.appendSuper((int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
    }

    @Test
    public void CompareToBuilder732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder732");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((float) (byte) 0, (float) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((byte) 1, (byte) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder3.appendSuper(2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
    }

    @Test
    public void CompareToBuilder733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder733");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        int int1 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder4 = compareToBuilder0.append((byte) -1, (byte) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder0.append(' ', 'a');
        int int8 = compareToBuilder0.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void CompareToBuilder734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder734");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((short) 0, (short) (byte) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append((byte) -1, (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder735");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 100);
        int int3 = compareToBuilder2.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder2.append(100, 35);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((long) ' ', (long) (byte) 0);
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
    public void CompareToBuilder736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder736");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((long) 1, (long) (short) 10);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder3.append((byte) 0, (byte) 10);
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
    public void CompareToBuilder737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder737");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        int int4 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder0.append((int) (short) 0, (int) (short) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder7.appendSuper(10);
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
    public void CompareToBuilder738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder738");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (-1.0f), (double) (short) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((long) 'a', (long) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append(1, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder739");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        int int1 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.appendSuper((int) '#');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((-1L), 0L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append((long) (short) 1, (long) '4');
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
    public void CompareToBuilder740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder740");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder0.append('#', ' ');
        java.lang.Integer int8 = compareToBuilder7.build();
        int int9 = compareToBuilder7.toComparison();
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
    public void CompareToBuilder741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder741");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((byte) 10, (byte) 100);
        java.lang.Object[] objArray7 = new java.lang.Object[] {};
        java.lang.Object[] objArray8 = new java.lang.Object[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append(objArray7, objArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder742");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        int int1 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.appendSuper((int) '#');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.appendSuper((int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder5.append((short) 0, (short) 1);
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
    public void CompareToBuilder743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder743");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder3.append((long) 35, (long) '#');
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
    public void CompareToBuilder744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder744");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append(0L, (long) 0);
        java.lang.Integer int7 = compareToBuilder6.build();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.appendSuper((int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder745");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((byte) -1, (byte) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.append(0L, (long) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder746");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((long) 1, (long) (short) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((float) ' ', (float) (short) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.append((byte) 100, (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder747");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (-1.0f), (double) (short) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((short) (byte) 1, (short) -1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder3.appendSuper((int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
    }

    @Test
    public void CompareToBuilder748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder748");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        int int1 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder4 = compareToBuilder0.append((float) (short) 100, (float) (byte) -1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder0.append((short) (byte) -1, (short) (byte) 1);
        java.lang.Integer int8 = compareToBuilder0.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8.equals(1));
    }

    @Test
    public void CompareToBuilder749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder749");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((long) 1, (long) (short) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append(true, false);
        java.lang.Integer int7 = compareToBuilder6.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7.equals((-1)));
    }

    @Test
    public void CompareToBuilder750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder750");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((long) 1, (long) (short) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder3.appendSuper((int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder5.append((int) (short) 100, 0);
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
    public void CompareToBuilder751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder751");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((float) 10, (float) (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append('4', '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder752");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (-1.0f), (double) (short) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append(true, false);
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
    public void CompareToBuilder753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder753");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((long) (-1), 0L);
        int int7 = compareToBuilder6.toComparison();
        java.lang.Integer int8 = compareToBuilder6.build();
        java.lang.Class<?> wildcardClass9 = compareToBuilder6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompareToBuilder754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder754");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder2.append((short) (byte) 0, (short) (byte) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder2.append(35, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
    }

    @Test
    public void CompareToBuilder755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder755");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (-1.0f), (double) (short) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((double) 'a', 0.0d);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append((-1.0d), (double) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder756");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append(0L, 100L);
        java.lang.Integer int7 = compareToBuilder3.build();
        java.lang.Integer int8 = compareToBuilder3.build();
        java.lang.Class<?> wildcardClass9 = compareToBuilder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompareToBuilder757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder757");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((long) 1, (long) (short) 10);
        int int4 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder0.append((double) 0.0f, (double) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
    }

    @Test
    public void CompareToBuilder758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder758");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append(0L, 100L);
        java.lang.Integer int7 = compareToBuilder3.build();
        java.lang.Integer int8 = compareToBuilder3.build();
        java.lang.Integer int9 = compareToBuilder3.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9.equals((-1)));
    }

    @Test
    public void CompareToBuilder759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder759");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((float) (byte) 0, (float) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((float) (short) 10, (float) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
    }

    @Test
    public void CompareToBuilder760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder760");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((long) 1, (long) (short) 10);
        int int4 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.appendSuper(35);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append(' ', ' ');
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
    public void CompareToBuilder761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder761");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 100);
        int int3 = compareToBuilder2.toComparison();
        int int4 = compareToBuilder2.toComparison();
        java.lang.Class<?> wildcardClass5 = compareToBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void CompareToBuilder762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder762");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        int int1 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder4 = compareToBuilder0.append(0.0f, 0.0f);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder0.append('#', ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
    }

    @Test
    public void CompareToBuilder763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder763");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder2.append((double) 100, 0.0d);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder5.append(true, false);
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
    public void CompareToBuilder764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder764");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (-1.0f), (double) (short) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append(true, false);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append((long) (byte) 100, (long) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder765");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((-1), (-1));
        java.lang.Class<?> wildcardClass7 = compareToBuilder6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CompareToBuilder766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder766");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder2.append(10, (int) (byte) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder5.append(true, true);
        int int9 = compareToBuilder8.toComparison();
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
    public void CompareToBuilder767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder767");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder4 = compareToBuilder0.appendSuper(10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder4.append(false, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
    }

    @Test
    public void CompareToBuilder768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder768");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder4 = compareToBuilder0.appendSuper(10);
        int int5 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder0.append((byte) 10, (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
    }

    @Test
    public void CompareToBuilder769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder769");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        int int1 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.appendSuper((int) '#');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((double) (byte) 100, 100.0d);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((short) 0, (short) (byte) 10);
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
    public void CompareToBuilder770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder770");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray3 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray4 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(shortArray3, shortArray4);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder5.append((float) 1L, (float) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
    }

    @Test
    public void CompareToBuilder771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder771");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((-1), (-1));
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
    public void CompareToBuilder772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder772");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        int int1 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder4 = compareToBuilder0.append((byte) -1, (byte) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.appendSuper((int) ' ');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((float) 0, (float) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder773");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (-1.0f), (double) (short) 0);
        int int4 = compareToBuilder0.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void CompareToBuilder774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder774");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((float) (byte) -1, (float) ' ');
        int int4 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder0.append((long) (short) 100, (long) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
    }

    @Test
    public void CompareToBuilder775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder775");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        int int1 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder4 = compareToBuilder0.append((byte) -1, (byte) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder0.append((long) 2, 10L);
        int int8 = compareToBuilder0.toComparison();
        java.lang.Integer int9 = compareToBuilder0.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9.equals((-1)));
    }

    @Test
    public void CompareToBuilder776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder776");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        int int1 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.appendSuper((int) '#');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((int) (byte) 1, (int) (short) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((double) (short) 0, (double) 10.0f);
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
    public void CompareToBuilder777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder777");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append(0L, (long) 0);
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
    public void CompareToBuilder778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder778");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((long) (short) -1, (long) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((short) (byte) 0, (short) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder779");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((long) 1, (long) (short) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((float) ' ', (float) (short) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.append(false, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder780");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder3.append((short) 1, (short) (byte) 1);
        java.lang.Integer int8 = compareToBuilder3.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8.equals(0));
    }

    @Test
    public void CompareToBuilder781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder781");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder0.toComparison();
        java.lang.Integer int5 = compareToBuilder0.build();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder0.append((byte) 0, (byte) 0);
        java.lang.Class<?> wildcardClass9 = compareToBuilder8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompareToBuilder782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder782");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder4 = compareToBuilder0.appendSuper(10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder4.appendSuper(10);
        int int7 = compareToBuilder4.toComparison();
        java.lang.Integer int8 = compareToBuilder4.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8.equals(100));
    }

    @Test
    public void CompareToBuilder783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder783");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((float) (byte) 0, (float) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((byte) 100, (byte) -1);
        java.lang.Integer int7 = compareToBuilder0.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7.equals((-1)));
    }

    @Test
    public void CompareToBuilder784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder784");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((short) 0, (short) (byte) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append(true, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder785");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        java.lang.Integer int4 = compareToBuilder3.build();
        java.lang.Integer int5 = compareToBuilder3.build();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder3.append(true, true);
        java.lang.Class<?> wildcardClass9 = compareToBuilder8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompareToBuilder786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder786");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((long) 1, (long) (short) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((float) ' ', (float) (short) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.append(true, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder787");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((float) (byte) -1, (float) ' ');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((int) (byte) 0, 1);
        java.lang.Integer int7 = compareToBuilder6.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7.equals((-1)));
    }

    @Test
    public void CompareToBuilder788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder788");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray3 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray4 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(shortArray3, shortArray4);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder5.append(100, (int) (byte) 1);
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
    public void CompareToBuilder789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder789");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 100);
        int int3 = compareToBuilder2.toComparison();
        int int4 = compareToBuilder2.toComparison();
        int int5 = compareToBuilder2.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder2.append((float) ' ', (float) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
    }

    @Test
    public void CompareToBuilder790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder790");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.appendSuper((int) ' ');
        java.lang.Integer int7 = compareToBuilder3.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7.equals(32));
    }

    @Test
    public void CompareToBuilder791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder791");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((float) (byte) -1, (float) ' ');
        java.lang.Integer int4 = compareToBuilder3.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4.equals((-1)));
    }

    @Test
    public void CompareToBuilder792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder792");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((long) 1, (long) (short) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((double) 100L, (double) ' ');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((float) 0, (float) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder793");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append(0L, 100L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder6.appendSuper((int) (short) 10);
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
    public void CompareToBuilder794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder794");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append(32, 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder3.appendSuper((int) (byte) 0);
        java.lang.Integer int6 = compareToBuilder3.build();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.append(0.0f, (float) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder795");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append(0L, (long) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append('#', '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder796");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder4 = compareToBuilder0.appendSuper(10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder4.append((short) 100, (short) (byte) -1);
        java.lang.Class<?> wildcardClass8 = compareToBuilder4.getClass();
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
    public void CompareToBuilder797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder797");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (-1.0f), (double) (short) 0);
        java.lang.Integer int4 = compareToBuilder3.build();
        java.lang.Class<?> wildcardClass5 = compareToBuilder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void CompareToBuilder798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder798");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (-1.0f), (double) (short) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((long) 'a', (long) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append(' ', 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder799");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 100);
        int int3 = compareToBuilder2.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder2.append(100, 35);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder2.append((byte) 10, (byte) 10);
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
    public void CompareToBuilder800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder800");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append(32, 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder3.appendSuper((int) (byte) 0);
        java.lang.Integer int6 = compareToBuilder3.build();
        java.lang.Integer int7 = compareToBuilder3.build();
        java.lang.Integer int8 = compareToBuilder3.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
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
    public void CompareToBuilder801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder801");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder4 = compareToBuilder0.appendSuper(10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder4.appendSuper(10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder4.append(0.0d, (double) 2);
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
    public void CompareToBuilder802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder802");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((float) ' ', (float) (byte) 0);
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
    public void CompareToBuilder803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder803");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((long) 1, (long) (short) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append(true, true);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append((short) 1, (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder804");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.appendSuper(100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((double) 100, (double) 0);
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
    public void CompareToBuilder805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder805");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((long) '4', (long) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((long) (byte) -1, (long) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder806");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(' ', ' ');
        java.lang.Integer int6 = compareToBuilder5.build();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder5.append((long) (byte) 0, 0L);
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
    public void CompareToBuilder807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder807");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((float) (byte) -1, (float) ' ');
        int int4 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder0.append(false, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
    }

    @Test
    public void CompareToBuilder808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder808");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        int int1 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder4 = compareToBuilder0.append((byte) -1, (byte) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.appendSuper((int) ' ');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((byte) -1, (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder809");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((float) (byte) 0, (float) (short) 1);
        java.lang.Integer int4 = compareToBuilder3.build();
        java.lang.Integer int5 = compareToBuilder3.build();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder3.append((short) 0, (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
    }

    @Test
    public void CompareToBuilder810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder810");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder2.append((double) 100, 0.0d);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder2.append((double) 32, 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
    }

    @Test
    public void CompareToBuilder811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder811");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.appendSuper((int) (short) 1);
        java.lang.Integer int7 = compareToBuilder3.build();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.appendSuper((int) '#');
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
    public void CompareToBuilder812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder812");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((-1), (-1));
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((long) 0, (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder813");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder4 = compareToBuilder0.appendSuper(10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder4.appendSuper(10);
        java.lang.Integer int7 = compareToBuilder4.build();
        int int8 = compareToBuilder4.toComparison();
        java.lang.Class<?> wildcardClass9 = compareToBuilder4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompareToBuilder814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder814");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((short) 0, (short) (byte) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append((long) (short) -1, 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder815");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (-1.0f), (double) (short) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((short) -1, (short) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder6.appendSuper(2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
    }

    @Test
    public void CompareToBuilder816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder816");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        java.lang.Integer int4 = compareToBuilder3.build();
        int int5 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder3.append(100, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
    }

    @Test
    public void CompareToBuilder817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder817");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(false, false);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder5.appendSuper((int) (short) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder7.appendSuper((int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder818");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (-1.0f), (double) (short) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((long) 'a', (long) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((double) (byte) 10, 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder819");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append(0L, 100L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.append((-1.0f), (float) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder820");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((long) 1, (long) (short) 10);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder3.append((float) '4', (float) (byte) 1);
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
    public void CompareToBuilder821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder821");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (-1.0f), (double) (short) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder3.appendSuper((int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
    }

    @Test
    public void CompareToBuilder822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder822");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((long) 1, (long) (short) 10);
        int int4 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.appendSuper(35);
        java.lang.Integer int7 = compareToBuilder0.build();
        java.lang.Class<?> wildcardClass8 = compareToBuilder0.getClass();
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
    public void CompareToBuilder823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder823");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((float) (byte) 0, (float) (short) 1);
        java.lang.Integer int4 = compareToBuilder3.build();
        java.lang.Integer int5 = compareToBuilder3.build();
        java.lang.Class<?> wildcardClass6 = compareToBuilder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void CompareToBuilder824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder824");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((short) 0, (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
    }

    @Test
    public void CompareToBuilder825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder825");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((short) 0, (short) (byte) 1);
        int int7 = compareToBuilder0.toComparison();
        java.lang.Class<?> wildcardClass8 = compareToBuilder0.getClass();
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
    public void CompareToBuilder826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder826");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        int int4 = compareToBuilder3.toComparison();
        int int5 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder3.append((long) (short) -1, (long) (-1));
        java.lang.Class<?> wildcardClass9 = compareToBuilder3.getClass();
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
    public void CompareToBuilder827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder827");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder2.append(10, (int) (byte) 1);
        java.lang.Integer int6 = compareToBuilder2.build();
        int int7 = compareToBuilder2.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void CompareToBuilder828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder828");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((long) 1, (long) (short) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((long) (byte) 100, (long) (short) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.append((float) 10L, (float) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder829");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((float) (-1L), (float) (byte) -1);
        java.lang.Integer int7 = compareToBuilder0.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7.equals(0));
    }

    @Test
    public void CompareToBuilder830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder830");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder2.append((double) '#', (double) 10L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder5.append((double) 100, (double) 2);
        int int9 = compareToBuilder8.toComparison();
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
    public void CompareToBuilder831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder831");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        int int1 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder4 = compareToBuilder0.append((byte) -1, (byte) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder0.append((long) 2, 10L);
        java.lang.Integer int8 = compareToBuilder0.build();
        java.lang.Integer int9 = compareToBuilder0.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9.equals((-1)));
    }

    @Test
    public void CompareToBuilder832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder832");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((float) 10, (float) (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append(1.0f, (float) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder833");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder2.append((double) '#', (double) 10L);
        java.lang.Class<?> wildcardClass6 = compareToBuilder5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void CompareToBuilder834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder834");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        java.lang.Integer int4 = compareToBuilder0.build();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder0.append(0.0f, 100.0f);
        java.lang.Integer int8 = compareToBuilder7.build();
        java.lang.Class<?> wildcardClass9 = compareToBuilder7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompareToBuilder835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder835");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (-1.0f), (double) (short) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append('#', '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
    }

    @Test
    public void CompareToBuilder836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder836");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((short) (byte) 0, (short) (byte) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder0.appendSuper((int) (short) 10);
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
    public void CompareToBuilder837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder837");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((float) (short) 100, (float) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder6.appendSuper(10);
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
    public void CompareToBuilder838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder838");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (-1.0f), (double) (short) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((long) (byte) -1, 0L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.append((float) 'a', (float) 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder839");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.appendSuper((int) (short) -1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append('#', ' ');
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
    public void CompareToBuilder840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder840");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (-1.0f), (double) (short) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append(true, false);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((long) (byte) 100, (long) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder841");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        int int4 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder0.append((int) (short) 0, (int) (short) 0);
        java.lang.Integer int8 = compareToBuilder0.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8.equals(0));
    }

    @Test
    public void CompareToBuilder842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder842");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.appendSuper(100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.append(0, (int) '#');
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
    public void CompareToBuilder843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder843");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append(32, 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder3.appendSuper((int) (byte) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder5.append((float) (byte) 0, (float) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
    }

    @Test
    public void CompareToBuilder844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder844");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder2.append(10, (int) (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder5.append('#', '4');
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
    public void CompareToBuilder845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder845");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (-1.0f), (double) (short) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((double) 'a', 0.0d);
        double[] doubleArray7 = null;
        double[] doubleArray8 = new double[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append(doubleArray7, doubleArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder846");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        java.lang.Integer int4 = compareToBuilder3.build();
        java.lang.Integer int5 = compareToBuilder3.build();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder3.append((byte) -1, (byte) 1);
        int int9 = compareToBuilder8.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void CompareToBuilder847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder847");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append(0L, (long) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((double) 'a', (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder848");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        java.lang.Integer int4 = compareToBuilder3.build();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.appendSuper(10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
    }

    @Test
    public void CompareToBuilder849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder849");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.appendSuper(2);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append(0, (int) (byte) 100);
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
    public void CompareToBuilder850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder850");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder0.toComparison();
        java.lang.Integer int5 = compareToBuilder0.build();
        java.lang.Object obj6 = null;
        // The following exception was thrown during execution in CompareToBuilder generation
        try {
            int int8 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) compareToBuilder0, obj6, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5.equals((-1)));
    }

    @Test
    public void CompareToBuilder851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder851");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder0.toComparison();
        java.lang.Integer int5 = compareToBuilder0.build();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder0.append((byte) 0, (byte) 0);
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
    public void CompareToBuilder852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder852");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(' ', ' ');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder0.append(false, false);
        java.lang.Integer int9 = compareToBuilder0.build();
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
    public void CompareToBuilder853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder853");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((float) ' ', (float) (byte) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder6.appendSuper((int) (byte) 100);
        int int9 = compareToBuilder8.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void CompareToBuilder854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder854");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.appendSuper((int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder6.appendSuper(35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
    }

    @Test
    public void CompareToBuilder855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder855");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        int int1 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder4 = compareToBuilder0.append((byte) -1, (byte) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder0.append('a', 'a');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder7.appendSuper(1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder856");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder2.append(2, (int) '4');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder5.append(false, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
    }

    @Test
    public void CompareToBuilder857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder857");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        int int1 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder4 = compareToBuilder0.append((float) (short) 100, (float) (byte) -1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder0.append(' ', '#');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.appendSuper(1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder858");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        int int1 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder4 = compareToBuilder0.append((byte) -1, (byte) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder4.append((long) (-1), 0L);
        java.lang.Class<?> wildcardClass8 = compareToBuilder4.getClass();
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
    public void CompareToBuilder859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder859");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(' ', ' ');
        java.lang.Integer int6 = compareToBuilder5.build();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder5.append((long) '4', 10L);
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
    public void CompareToBuilder860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder860");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((float) (byte) 0, (float) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((byte) 1, (byte) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.append((short) 0, (short) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder861");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((float) (byte) 0, (float) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((byte) 1, (byte) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((int) '#', (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder862");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) 100, (double) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((int) (short) 1, (int) (short) -1);
        java.lang.Integer int7 = compareToBuilder3.build();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.appendSuper((int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder863");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append(true, false);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder0.appendSuper((int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
    }

    @Test
    public void CompareToBuilder864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder864");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((float) (byte) 0, (float) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append(100L, (long) (short) -1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder6.appendSuper(35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
    }

    @Test
    public void CompareToBuilder865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder865");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((float) (byte) 0, (float) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((byte) 100, (byte) -1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((short) 0, (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder866");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((float) (byte) -1, (float) ' ');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append('#', 'a');
        java.lang.Integer int7 = compareToBuilder6.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7.equals((-1)));
    }

    @Test
    public void CompareToBuilder867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder867");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((float) (byte) -1, (float) ' ');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((int) (byte) 0, 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((short) 1, (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder868");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((long) 1, (long) (short) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((float) ' ', (float) (short) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder3.appendSuper((int) (short) -1);
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
    public void CompareToBuilder869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder869");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.appendSuper((int) (short) -1);
        java.lang.Integer int7 = compareToBuilder3.build();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.appendSuper((int) (short) 10);
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
    public void CompareToBuilder870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder870");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        int int1 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.appendSuper((int) '#');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((int) (byte) 1, (int) (short) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder0.appendSuper(100);
        java.lang.Integer int9 = compareToBuilder0.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9.equals(35));
    }

    @Test
    public void CompareToBuilder871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder871");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((float) (byte) -1, (float) ' ');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append(0.0d, (double) (byte) -1);
        java.lang.Class<?> wildcardClass7 = compareToBuilder6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CompareToBuilder872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder872");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append(false, true);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append(0.0f, (float) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder873");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder4 = compareToBuilder0.appendSuper(10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder0.append(' ', 'a');
        int int8 = compareToBuilder7.toComparison();
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
    public void CompareToBuilder874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder874");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        int int1 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.appendSuper((int) '#');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((double) 'a', (double) (byte) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder0.appendSuper((int) (byte) 10);
        java.lang.Integer int9 = compareToBuilder0.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9.equals(35));
    }

    @Test
    public void CompareToBuilder875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder875");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((float) (byte) -1, (float) ' ');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.appendSuper(100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder0.append((float) (short) 10, (float) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
    }

    @Test
    public void CompareToBuilder876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder876");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder4 = compareToBuilder0.appendSuper(10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder4.append((short) 100, (short) (byte) -1);
        int int8 = compareToBuilder7.toComparison();
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
    public void CompareToBuilder877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder877");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((long) 1, (long) (short) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((long) (byte) 100, (long) (short) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append(0.0d, (double) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder878");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 1);
        int int3 = compareToBuilder2.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder2.append(1L, (long) 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
    }

    @Test
    public void CompareToBuilder879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder879");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder3.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder3.append(true, true);
        java.lang.Integer int8 = compareToBuilder3.build();
        java.lang.Class<?> wildcardClass9 = compareToBuilder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompareToBuilder880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder880");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        java.lang.Integer int4 = compareToBuilder0.build();
        java.lang.Integer int5 = compareToBuilder0.build();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder0.append((long) 100, (long) 'a');
        java.lang.Class<?> wildcardClass9 = compareToBuilder8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompareToBuilder881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder881");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in CompareToBuilder generation
        try {
            int int3 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare(obj0, (java.lang.Object) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompareToBuilder882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder882");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder2.append((double) 100, 0.0d);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder5.append(true, false);
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
    public void CompareToBuilder883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder883");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((-1), (-1));
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.append(0.0f, (float) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder884");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((float) (byte) -1, (float) ' ');
        int int4 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder0.append((double) 100.0f, (double) 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
    }

    @Test
    public void CompareToBuilder885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder885");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((float) (short) 100, (float) 100);
        java.lang.Integer int7 = compareToBuilder6.build();
        java.lang.Integer int8 = compareToBuilder6.build();
        java.lang.Class<?> wildcardClass9 = compareToBuilder6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CompareToBuilder886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder886");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        int int1 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.appendSuper((int) '#');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((-1L), 0L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append('#', ' ');
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
    public void CompareToBuilder887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder887");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((long) 1, (long) (short) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append(100.0d, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append((int) (short) 100, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder888");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray3 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray4 = new short[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(shortArray3, shortArray4);
        java.lang.Integer int6 = compareToBuilder0.build();
        int int7 = compareToBuilder0.toComparison();
        java.lang.Class<?> wildcardClass8 = compareToBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CompareToBuilder889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder889");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((long) 1, (long) (short) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((float) ' ', (float) (short) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.append(false, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder890");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((float) (byte) -1, (float) ' ');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append(0.0d, (double) (byte) -1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append(' ', 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder891");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        int int1 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder4 = compareToBuilder0.append((byte) -1, (byte) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.appendSuper((int) ' ');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder0.appendSuper(0);
        int int9 = compareToBuilder0.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void CompareToBuilder892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder892");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(false, false);
        int int6 = compareToBuilder5.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder5.append((float) '#', (float) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder893");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder2.append((float) 0, (float) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder5.append((float) (short) 1, (float) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
    }

    @Test
    public void CompareToBuilder894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder894");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((float) (byte) 0, (float) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((double) (byte) 1, (double) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
    }

    @Test
    public void CompareToBuilder895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder895");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        int int1 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.appendSuper((int) '#');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((double) 1L, (double) '4');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.append(false, false);
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
    public void CompareToBuilder896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder896");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((long) 1, (long) (short) 10);
        int int4 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder0.append((long) 1, (long) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
    }

    @Test
    public void CompareToBuilder897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.CompareToBuilder897");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder2 = compareToBuilder0.appendSuper((int) (short) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(false, false);
        int int6 = compareToBuilder5.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder5.append(100.0f, 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }
}

