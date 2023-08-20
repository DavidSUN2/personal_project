package EqualsBuilder;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EqualsBuilder0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test01");
        boolean boolean3 = org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals((java.lang.Object) 100.0d, (java.lang.Object) 10, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test02");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        boolean boolean7 = org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals((java.lang.Object) 1.0d, (java.lang.Object) (short) 100, (java.util.Collection<java.lang.String>) strList5);
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
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test03");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        boolean boolean5 = org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals((java.lang.Object) (short) 0, (java.lang.Object) ' ', strArray4);
        boolean boolean6 = org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals((java.lang.Object) 0.0f, (java.lang.Object) "hi!", strArray4);
        boolean boolean9 = org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals((java.lang.Object) 0.0f, (java.lang.Object) 10L, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test04");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((-1), (int) (short) 10);
        long[] longArray5 = new long[] { (byte) 0 };
        long[] longArray6 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder3.append(longArray5, longArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder7);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test05");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((-1), (int) (short) 10);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((long) '4', 0L);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append((double) 10L, (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test06");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((-1), (int) (short) 10);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(true, false);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append((int) (short) 0, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test07");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((-1), (int) (short) 10);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(true, false);
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append(intArray7, intArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test08");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        java.lang.Class<?> wildcardClass1 = equalsBuilder0.getClass();
        java.lang.Object obj2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] {};
        boolean boolean6 = org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals((java.lang.Object) (short) 0, (java.lang.Object) ' ', strArray5);
        boolean boolean7 = org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals((java.lang.Object) equalsBuilder0, obj2, strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test09");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((-1), (int) (short) 10);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((long) '4', 0L);
        equalsBuilder6.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test10");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((-1), (int) (short) 10);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(true, false);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((byte) 100, (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test11");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', ' ');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((short) (byte) 10, (short) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append(0, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test12");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((-1), (int) (short) 10);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((short) (byte) -1, (short) (byte) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder3.append((float) 100L, (float) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test13");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((-1), (int) (short) 10);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((long) '4', 0L);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append((short) (byte) 0, (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test14");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', ' ');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder3.appendSuper(true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder3.append((byte) 1, (byte) -1);
        equalsBuilder3.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test15");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        double[] doubleArray1 = null;
        double[] doubleArray3 = new double[] { 1.0d };
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder4 = equalsBuilder0.append(doubleArray1, doubleArray3);
        equalsBuilder0.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder4);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test16");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', ' ');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder3.appendSuper(false);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder5.append((long) (byte) 0, (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test17");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((int) (byte) 10, (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = equalsBuilder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test18");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        boolean boolean6 = org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals((java.lang.Object) 10.0f, (java.lang.Object) (byte) 100, (java.util.Collection<java.lang.String>) strList4);
        java.lang.Class<?> wildcardClass7 = strList4.getClass();
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
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test19");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder1 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder4 = equalsBuilder1.append('a', ' ');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder4.appendSuper(false);
        java.lang.String[] strArray7 = null;
        boolean boolean8 = org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals(obj0, (java.lang.Object) equalsBuilder6, strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test20");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', ' ');
        java.lang.Boolean boolean4 = equalsBuilder3.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder3.append((short) 0, (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder7);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test21");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        boolean boolean5 = org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals((java.lang.Object) (short) 0, (java.lang.Object) ' ', strArray4);
        boolean boolean6 = org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals((java.lang.Object) 0.0f, (java.lang.Object) "hi!", strArray4);
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
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test22");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', ' ');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder3.appendSuper(false);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder5.append((float) (short) 10, (float) (byte) 100);
        boolean boolean9 = equalsBuilder8.isEquals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test23");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((int) (byte) 10, (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = equalsBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test24");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((int) (byte) 10, (int) (byte) 1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((byte) 0, (byte) 10);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder0.appendSuper(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test25");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', ' ');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder3.appendSuper(true);
        equalsBuilder5.reset();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder5.append(false, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test26");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', ' ');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder3.appendSuper(true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder3.append('4', '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test27");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((-1), (int) (short) 10);
        equalsBuilder0.reset();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder0.append((byte) -1, (byte) 0);
        java.lang.Class<?> wildcardClass8 = equalsBuilder7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test28");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((int) (byte) 10, (int) (byte) 1);
        boolean boolean6 = org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals((java.lang.Object) (byte) 10, (java.lang.Object) (byte) 1, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test29");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', ' ');
        double[] doubleArray5 = new double[] { 0 };
        double[] doubleArray7 = new double[] { (-1L) };
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder3.append(doubleArray5, doubleArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test30");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        java.lang.Class<?> wildcardClass1 = equalsBuilder0.getClass();
        java.lang.String[] strArray5 = new java.lang.String[] {};
        boolean boolean6 = org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals((java.lang.Object) (short) 0, (java.lang.Object) ' ', strArray5);
        boolean boolean7 = org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals((java.lang.Object) equalsBuilder0, (java.lang.Object) 100, strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test31");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', ' ');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder3.appendSuper(true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder3.append((byte) 1, (byte) -1);
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
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test32");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((int) (byte) 10, (int) (byte) 1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((float) (short) 0, (float) (byte) 0);
        equalsBuilder6.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test33");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', ' ');
        byte[] byteArray4 = null;
        byte[] byteArray6 = new byte[] { (byte) 10 };
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder3.append(byteArray4, byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder7);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test34");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', ' ');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder3.appendSuper(true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder3.append((short) 0, (short) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test35");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', ' ');
        equalsBuilder0.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test36");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((int) (byte) 10, (int) (byte) 1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((double) ' ', (double) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test37");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        boolean boolean8 = org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals((java.lang.Object) 10.0f, (java.lang.Object) (byte) 100, (java.util.Collection<java.lang.String>) strList6);
        boolean boolean9 = org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals((java.lang.Object) 10.0f, (java.lang.Object) 10.0d, (java.util.Collection<java.lang.String>) strList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test38");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', ' ');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder3.appendSuper(true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder5.append(0.0d, (double) 1.0f);
        equalsBuilder8.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test39");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((-1), (int) (short) 10);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((short) (byte) -1, (short) (byte) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append(' ', '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test40");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((-1), (int) (short) 10);
        equalsBuilder0.reset();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.appendSuper(false);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append(0, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test41");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((-1), (int) (short) 10);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(true, false);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append((byte) 0, (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test42");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((int) (byte) 10, (int) (byte) 1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((long) 100, (long) 'a');
        java.lang.Class<?> wildcardClass7 = equalsBuilder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test43");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', ' ');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(true, false);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append((long) ' ', (long) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test44");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', ' ');
        java.lang.Boolean boolean4 = equalsBuilder3.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder3.append(10, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder7);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test45");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', ' ');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(true, false);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((short) 0, (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test46");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', ' ');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(0, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test47");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((-1), (int) (short) 10);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((long) '4', 0L);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append('4', '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test48");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((-1), (int) (short) 10);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((short) (byte) -1, (short) (byte) -1);
        java.lang.Boolean boolean7 = equalsBuilder6.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.appendSuper(true);
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
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test49");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        double[] doubleArray1 = null;
        double[] doubleArray3 = new double[] { 1.0d };
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder4 = equalsBuilder0.append(doubleArray1, doubleArray3);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.appendSuper(false);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append((byte) -1, (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test50");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((-1), (int) (short) 10);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((long) '4', 0L);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append(0L, (long) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test51");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((-1), (int) (short) 10);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((long) '4', 0L);
        java.lang.Class<?> wildcardClass7 = equalsBuilder6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test52");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((-1), (int) (short) 10);
        equalsBuilder0.reset();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.appendSuper(false);
        java.lang.Boolean boolean7 = equalsBuilder6.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7.equals(false));
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test53");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', ' ');
        java.lang.Boolean boolean4 = equalsBuilder3.build();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder3.append((short) -1, (short) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder7);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test54");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        double[] doubleArray1 = null;
        double[] doubleArray3 = new double[] { 1.0d };
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder4 = equalsBuilder0.append(doubleArray1, doubleArray3);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.appendSuper(false);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append(true, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test55");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', ' ');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder3.appendSuper(false);
        equalsBuilder5.reset();
        java.lang.Boolean boolean7 = equalsBuilder5.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7.equals(true));
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test56");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', ' ');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((short) (byte) 10, (short) 0);
        java.lang.Class<?> wildcardClass7 = equalsBuilder6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test57");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((-1), (int) (short) 10);
        equalsBuilder0.reset();
        boolean boolean5 = equalsBuilder0.isEquals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test58");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', ' ');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder3.appendSuper(false);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder5.append((float) (short) 10, (float) (byte) 100);
        equalsBuilder8.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test59");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', ' ');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((short) (byte) 10, (short) 0);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder6.append((long) (byte) 100, (long) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test60");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((-1), (int) (short) 10);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.appendSuper(true);
        java.lang.Class<?> wildcardClass6 = equalsBuilder5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test61");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((int) (byte) 10, (int) (byte) 1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((byte) 0, (byte) 10);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append((long) ' ', (long) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test62");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((-1), (int) (short) 10);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder0.appendSuper(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test63");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((int) (byte) 10, (int) (byte) 1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((long) 100, (long) 'a');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder3.append((double) 0.0f, (double) 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test64");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((-1), (int) (short) 10);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((short) (byte) -1, (short) (byte) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder3.append((byte) 100, (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test65");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((int) (byte) 10, (int) (byte) 1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append((byte) 0, (byte) 10);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append((long) (short) -1, (long) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test66");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((-1), (int) (short) 10);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(true, false);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append((long) '#', (long) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test67");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((-1), (int) (short) 10);
        equalsBuilder0.reset();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder0.append((byte) 10, (byte) 1);
        java.lang.Boolean boolean8 = equalsBuilder7.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test68");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        double[] doubleArray1 = null;
        double[] doubleArray3 = new double[] { 1.0d };
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder4 = equalsBuilder0.append(doubleArray1, doubleArray3);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.appendSuper(false);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder0.append((long) (short) 1, 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test69");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', ' ');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder5 = equalsBuilder3.appendSuper(true);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder8 = equalsBuilder3.append((byte) 1, (byte) -1);
        boolean boolean9 = equalsBuilder8.isEquals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test70");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((-1), (int) (short) 10);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((short) (byte) -1, (short) (byte) -1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder9 = equalsBuilder3.append((short) 10, (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder9);
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test71");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        double[] doubleArray1 = null;
        double[] doubleArray3 = new double[] { 1.0d };
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder4 = equalsBuilder0.append(doubleArray1, doubleArray3);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder7 = equalsBuilder4.append((long) 10, (long) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder7);
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test72");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append((int) (byte) 10, (int) (byte) 1);
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder3.append((long) (short) 100, 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test73");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', ' ');
        boolean boolean4 = equalsBuilder0.isEquals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EqualsBuilder0.test74");
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder0 = new org.apache.commons.lang3.builder.EqualsBuilder();
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder3 = equalsBuilder0.append('a', ' ');
        org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder6 = equalsBuilder0.append(0.0f, 0.0f);
        equalsBuilder6.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equalsBuilder6);
    }
}

