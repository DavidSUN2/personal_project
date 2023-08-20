
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
            System.out.format("%n%s%n", "CompareToBuilder0.test01");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) 1, (java.lang.Object) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test02");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        char[] charArray4 = new char[] { 'a', 'a', 'a' };
        char[] charArray5 = new char[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append(charArray4, charArray5);
        java.lang.Class<?> wildcardClass7 = charArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test03");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        char[] charArray4 = new char[] { 'a', 'a', 'a' };
        char[] charArray5 = new char[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append(charArray4, charArray5);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append((short) (byte) 1, (short) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test04");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!" };
        int int5 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) (-1.0f), (java.lang.Object) 0.0f, strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test05");
        int int3 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) 10L, (java.lang.Object) 1L, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test06");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        char[] charArray4 = new char[] { 'a', 'a', 'a' };
        char[] charArray5 = new char[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append(charArray4, charArray5);
        int int7 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.appendSuper((int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
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
            System.out.format("%n%s%n", "CompareToBuilder0.test07");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) 0, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test08");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) 1.0f, (java.lang.Object) (byte) 0, (java.util.Collection<java.lang.String>) strList5);
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
            System.out.format("%n%s%n", "CompareToBuilder0.test09");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) (-1.0d), (java.lang.Object) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test10");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) 1.0f, (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test11");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append(' ', 'a');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((double) 10L, (double) ' ');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((float) 100, (float) (short) -1);
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
            System.out.format("%n%s%n", "CompareToBuilder0.test12");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) 'a', (java.lang.Object) (short) 0, (java.util.Collection<java.lang.String>) strList4);
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
            System.out.format("%n%s%n", "CompareToBuilder0.test13");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        char[] charArray4 = new char[] { 'a', 'a', 'a' };
        char[] charArray5 = new char[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append(charArray4, charArray5);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append((short) (byte) 100, (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test14");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append(' ', 'a');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((double) 10L, (double) ' ');
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
            System.out.format("%n%s%n", "CompareToBuilder0.test15");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((java.lang.Object) 0, (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to java.lang.Integer");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test16");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        char[] charArray4 = new char[] { 'a', 'a', 'a' };
        char[] charArray5 = new char[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append(charArray4, charArray5);
        java.lang.Class<?> wildcardClass7 = charArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test17");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) ' ', (int) (byte) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((double) 0L, (double) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) compareToBuilder6, (java.lang.Object) ' ', true);
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
            System.out.format("%n%s%n", "CompareToBuilder0.test18");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) ' ', (int) (byte) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((double) 0L, (double) 10);
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
            System.out.format("%n%s%n", "CompareToBuilder0.test19");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append(' ', 'a');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((double) 10L, (double) ' ');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append((java.lang.Object) (byte) 0, (java.lang.Object) 0);
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
            System.out.format("%n%s%n", "CompareToBuilder0.test20");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        char[] charArray4 = new char[] { 'a', 'a', 'a' };
        char[] charArray5 = new char[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append(charArray4, charArray5);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((double) 0L, (double) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test21");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append(' ', 'a');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((double) 10.0f, (double) 1);
        long[] longArray7 = new long[] {};
        long[] longArray8 = new long[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append(longArray7, longArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
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
            System.out.format("%n%s%n", "CompareToBuilder0.test22");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append(' ', 'a');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((byte) -1, (byte) 1);
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
            System.out.format("%n%s%n", "CompareToBuilder0.test23");
        java.lang.String[] strArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) 0L, (java.lang.Object) "hi!", strArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test24");
        java.lang.Object obj1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            int int7 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) 10.0f, obj1, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test25");
        java.lang.String[] strArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) (byte) -1, (java.lang.Object) '#', strArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test26");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder1 = new org.apache.commons.lang3.builder.CompareToBuilder();
        char[] charArray5 = new char[] { 'a', 'a', 'a' };
        char[] charArray6 = new char[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder1.append(charArray5, charArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) 0L, (java.lang.Object) compareToBuilder1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test27");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append(' ', 'a');
        int[] intArray6 = new int[] { (-1), (byte) 1 };
        int[] intArray8 = new int[] { 0 };
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.append(intArray6, intArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test28");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder1 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder4 = compareToBuilder1.append(' ', 'a');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder4.append((float) (-1), (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) 10.0d, (java.lang.Object) compareToBuilder7, false);
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
            System.out.format("%n%s%n", "CompareToBuilder0.test29");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append(' ', 'a');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((double) 10.0f, (double) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append((double) ' ', (double) (short) 10);
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
            System.out.format("%n%s%n", "CompareToBuilder0.test30");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) ' ', (int) (byte) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((double) 0L, (double) 10);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.append(0, (int) (byte) 1);
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
            System.out.format("%n%s%n", "CompareToBuilder0.test31");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append(' ', 'a');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((double) 10.0f, (double) 1);
        java.lang.Object[] objArray7 = new java.lang.Object[] {};
        java.lang.Object[] objArray8 = null;
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append(objArray7, objArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test32");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append(' ', 'a');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((double) 10.0f, (double) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append((long) (byte) 1, (long) (byte) 1);
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
            System.out.format("%n%s%n", "CompareToBuilder0.test33");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append(' ', 'a');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((byte) -1, (byte) 1);
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
            System.out.format("%n%s%n", "CompareToBuilder0.test34");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) ' ', (int) (byte) 100);
        boolean[] booleanArray7 = new boolean[] { true, false, false };
        boolean[] booleanArray8 = new boolean[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append(booleanArray7, booleanArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test35");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        char[] charArray4 = new char[] { 'a', 'a', 'a' };
        char[] charArray5 = new char[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append(charArray4, charArray5);
        int int7 = compareToBuilder0.toComparison();
        java.lang.Integer int8 = compareToBuilder0.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
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
            System.out.format("%n%s%n", "CompareToBuilder0.test36");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder1 = new org.apache.commons.lang3.builder.CompareToBuilder();
        char[] charArray5 = new char[] { 'a', 'a', 'a' };
        char[] charArray6 = new char[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder1.append(charArray5, charArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) 10, (java.lang.Object) compareToBuilder7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder7);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test37");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder1 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder4 = compareToBuilder1.append((int) ' ', (int) (byte) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder7 = compareToBuilder4.append((int) (byte) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) 1L, (java.lang.Object) (byte) 0);
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
            System.out.format("%n%s%n", "CompareToBuilder0.test38");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append(' ', 'a');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((float) (-1), (-1.0f));
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.append((double) (byte) 100, (double) (byte) 10);
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
            System.out.format("%n%s%n", "CompareToBuilder0.test39");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) (-1), (java.lang.Object) 100L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test40");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder1 = new org.apache.commons.lang3.builder.CompareToBuilder();
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) -1 };
        byte[] byteArray5 = new byte[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder1.append(byteArray4, byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare(obj0, (java.lang.Object) compareToBuilder1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test41");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append(' ', 'a');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((double) 10L, (double) ' ');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append((double) (short) 1, 100.0d);
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
            System.out.format("%n%s%n", "CompareToBuilder0.test42");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) -1 };
        byte[] byteArray4 = new byte[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(byteArray3, byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) compareToBuilder0, (java.lang.Object) 10L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test43");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) ' ', (int) (byte) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((byte) 100, (byte) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((short) (byte) 0, (short) 0);
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
            System.out.format("%n%s%n", "CompareToBuilder0.test44");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append(' ', 'a');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((float) (-1), (-1.0f));
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.append(0.0d, (double) 1L);
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
            System.out.format("%n%s%n", "CompareToBuilder0.test45");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) -1 };
        byte[] byteArray4 = new byte[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(byteArray3, byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) byteArray4, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test46");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) ' ', (int) (byte) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append(10, (int) (byte) 0);
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
            System.out.format("%n%s%n", "CompareToBuilder0.test47");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        char[] charArray4 = new char[] { 'a', 'a', 'a' };
        char[] charArray5 = new char[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append(charArray4, charArray5);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((int) '#', (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test48");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        char[] charArray4 = new char[] { 'a', 'a', 'a' };
        char[] charArray5 = new char[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append(charArray4, charArray5);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append(0.0d, (double) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test49");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) ' ', (int) (byte) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((byte) 100, (byte) 1);
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
            System.out.format("%n%s%n", "CompareToBuilder0.test50");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) ' ', (int) (byte) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((byte) 100, (byte) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.append((short) (byte) -1, (short) (byte) 100);
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
            System.out.format("%n%s%n", "CompareToBuilder0.test51");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) ' ', (int) (byte) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((int) (byte) 1, (int) (byte) 0);
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
            System.out.format("%n%s%n", "CompareToBuilder0.test52");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) -1 };
        byte[] byteArray4 = new byte[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(byteArray3, byteArray4);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder5.append('a', '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder8);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test53");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append(' ', 'a');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((byte) -1, (byte) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder3.append((long) (short) 10, (-1L));
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
            System.out.format("%n%s%n", "CompareToBuilder0.test54");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) -1 };
        byte[] byteArray4 = new byte[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder5 = compareToBuilder0.append(byteArray3, byteArray4);
        int int6 = compareToBuilder5.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder5.append((int) (byte) 0, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
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
            System.out.format("%n%s%n", "CompareToBuilder0.test55");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        char[] charArray4 = new char[] { 'a', 'a', 'a' };
        char[] charArray5 = new char[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append(charArray4, charArray5);
        java.lang.Class<?> wildcardClass7 = compareToBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test56");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) ' ', (int) (byte) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append(10, (int) (byte) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((double) '4', 100.0d);
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
            System.out.format("%n%s%n", "CompareToBuilder0.test57");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) ' ', (int) (byte) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append(10, (int) (byte) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((short) 0, (short) (byte) -1);
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
            System.out.format("%n%s%n", "CompareToBuilder0.test58");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append(' ', 'a');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((double) 10.0f, (double) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append((short) (byte) -1, (short) 0);
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
            System.out.format("%n%s%n", "CompareToBuilder0.test59");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        int int6 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) 10L, (java.lang.Object) 1L, (java.util.Collection<java.lang.String>) strList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test60");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append(' ', 'a');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((long) (-1), (long) (byte) 10);
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
            System.out.format("%n%s%n", "CompareToBuilder0.test61");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append(' ', 'a');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((float) (-1), (-1.0f));
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
            System.out.format("%n%s%n", "CompareToBuilder0.test62");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append(' ', 'a');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((byte) -1, (byte) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((long) 100, (long) (byte) -1);
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
            System.out.format("%n%s%n", "CompareToBuilder0.test63");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) ' ', (int) (byte) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((int) (byte) 1, (int) (byte) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((byte) 100, (byte) 0);
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
            System.out.format("%n%s%n", "CompareToBuilder0.test64");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        char[] charArray4 = new char[] { 'a', 'a', 'a' };
        char[] charArray5 = new char[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append(charArray4, charArray5);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder0.append((short) 1, (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test65");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        char[] charArray4 = new char[] { 'a', 'a', 'a' };
        char[] charArray5 = new char[] {};
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append(charArray4, charArray5);
        java.lang.Class<?> wildcardClass7 = compareToBuilder6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test66");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append(' ', 'a');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((byte) 0, (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test67");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        int int1 = compareToBuilder0.toComparison();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder4 = compareToBuilder0.append((short) (byte) 100, (short) 0);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.appendSuper((int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test68");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append(' ', 'a');
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append((double) 10.0f, (double) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) compareToBuilder0, (java.lang.Object) 100, true);
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
            System.out.format("%n%s%n", "CompareToBuilder0.test69");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append(false, false);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder0.append(' ', '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
    }

    @Test
    public void CompareToBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompareToBuilder0.test70");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder3 = compareToBuilder0.append((int) ' ', (int) (byte) 100);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder6 = compareToBuilder3.append((byte) 100, (byte) 1);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder9 = compareToBuilder6.append((byte) -1, (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(compareToBuilder9);
    }
}

