
package CompareToBuilder;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CompareToBuilder1 {

    public static boolean debug = false;

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test501");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test502");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder1 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder4 = compareToBuilder1.append((int) (short) 0, (int) (short) 1);
        int int5 = compareToBuilder4.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder4.append((byte) 0, (byte) 100);
        // The following exception was thrown during execution in test generation
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test503");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test504");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test505");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test506");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test507");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test508");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test509");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test510");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test511");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test512");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test513");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (-1.0f), (double) (short) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append(100L, 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test514");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test515");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test516");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test517");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test518");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test519");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test520");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test521");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test522");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test523");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test524");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test525");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test526");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test527");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test528");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test529");
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) 0L, obj1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test530");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        java.lang.Integer int4 = compareToBuilder3.build();
        java.lang.Class<?> wildcardClass5 = compareToBuilder3.getClass();
        java.lang.Object obj6 = null;
        // The following exception was thrown during execution in test generation
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test531");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test532");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test533");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test534");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test535");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test536");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test537");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test538");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test539");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test540");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test541");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test542");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test543");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test544");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test545");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test546");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test547");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test548");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test549");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test550");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test551");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test552");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test553");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test554");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test555");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test556");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test557");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test558");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test559");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test560");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test561");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test562");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder1 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder4 = compareToBuilder1.append((double) (byte) 1, (double) 1L);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder1.append((float) (-1L), (float) (byte) -1);
        java.lang.Class<?> wildcardClass8 = compareToBuilder7.getClass();
        // The following exception was thrown during execution in test generation
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test563");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test564");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test565");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test566");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test567");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        java.lang.Class<?> wildcardClass4 = compareToBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test568");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test569");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test570");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test571");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test572");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test573");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test574");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test575");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test576");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test577");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((float) (byte) 0, (float) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((byte) 1, (byte) 1);
        // The following exception was thrown during execution in test generation
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test578");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test579");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test580");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test581");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test582");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test583");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test584");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test585");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test586");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test587");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test588");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test589");
        java.lang.Object obj0 = null;
        java.lang.Object obj1 = null;
        java.lang.String[] strArray2 = null;
        int int3 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare(obj0, obj1, strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test590");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test591");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test592");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test593");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test594");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test595");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test596");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test597");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test598");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test599");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test600");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test601");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test602");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test603");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test604");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test605");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test606");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test607");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test608");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test609");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test610");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test611");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test612");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test613");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test614");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test615");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test616");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test617");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test618");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test619");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test620");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test621");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test622");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test623");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test624");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test625");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test626");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test627");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test628");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test629");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test630");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test631");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test632");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test633");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test634");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test635");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test636");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test637");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test638");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test639");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test640");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test641");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test642");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test643");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test644");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test645");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test646");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test647");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test648");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test649");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test650");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test651");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test652");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test653");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test654");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test655");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test656");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test657");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test658");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test659");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test660");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test661");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test662");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test663");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test664");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test665");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test666");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test667");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test668");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test669");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test670");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test671");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test672");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test673");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test674");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append('a', '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test675");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test676");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test677");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test678");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test679");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test680");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test681");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test682");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test683");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test684");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test685");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test686");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test687");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test688");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test689");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test690");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test691");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test692");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test693");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test694");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test695");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test696");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test697");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test698");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test699");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test700");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test701");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test702");
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) (short) 10, obj1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test703");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test704");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test705");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test706");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test707");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test708");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test709");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test710");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test711");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test712");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test713");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test714");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test715");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test716");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test717");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test718");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test719");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test720");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test721");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test722");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test723");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test724");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test725");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test726");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test727");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test728");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test729");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test730");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test731");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test732");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test733");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test734");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test735");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test736");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test737");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test738");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test739");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test740");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test741");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test742");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test743");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test744");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test745");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test746");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test747");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test748");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test749");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test750");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test751");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test752");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test753");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test754");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test755");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test756");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test757");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test758");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test759");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((float) (byte) 0, (float) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((float) (short) 10, (float) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test760");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test761");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test762");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test763");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test764");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test765");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test766");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test767");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test768");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test769");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test770");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test771");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test772");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test773");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (-1.0f), (double) (short) 0);
        int int4 = compareToBuilder0.toComparison();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test774");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test775");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test776");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test777");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test778");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test779");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test780");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test781");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test782");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test783");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test784");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test785");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test786");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test787");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test788");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test789");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test790");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test791");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((float) (byte) -1, (float) ' ');
        java.lang.Integer int4 = compareToBuilder3.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4.equals((-1)));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test792");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test793");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test794");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test795");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test796");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test797");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test798");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test799");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test800");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test801");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test802");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test803");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test804");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test805");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test806");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test807");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test808");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test809");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test810");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test811");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test812");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test813");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test814");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test815");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test816");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test817");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test818");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test819");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test820");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test821");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (-1.0f), (double) (short) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder3.appendSuper((int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test822");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test823");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test824");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((short) 0, (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test825");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test826");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test827");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test828");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test829");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test830");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test831");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test832");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test833");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test834");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test835");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((double) (-1.0f), (double) (short) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append('#', '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test836");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test837");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test838");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test839");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test840");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test841");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test842");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test843");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test844");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test845");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test846");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test847");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test848");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test849");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test850");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) (short) 0, (int) (short) 1);
        int int4 = compareToBuilder0.toComparison();
        java.lang.Integer int5 = compareToBuilder0.build();
        java.lang.Object obj6 = null;
        // The following exception was thrown during execution in test generation
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test851");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test852");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test853");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test854");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test855");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test856");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test857");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test858");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test859");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test860");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test861");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test862");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test863");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test864");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test865");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test866");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test867");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test868");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test869");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test870");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test871");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test872");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test873");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test874");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test875");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test876");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test877");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test878");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test879");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test880");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test881");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare(obj0, (java.lang.Object) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test882");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test883");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test884");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test885");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test886");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test887");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test888");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test889");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test890");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test891");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test892");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test893");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test894");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((float) (byte) 0, (float) (short) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((double) (byte) 1, (double) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test895");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test896");
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
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder1.test897");
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

