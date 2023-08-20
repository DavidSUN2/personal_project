package MethodUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MethodUtils1 {

    public static boolean debug = false;

    @Test
    public void MethodUtils0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0501");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10, '4', (-1), 1.0d };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) '4', "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0502");
        java.lang.Object[] objArray5 = new java.lang.Object[] { "hi!", 0.0f, "" };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 100L, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0503");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils3 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 0, methodUtils3, (-1.0f), (short) 10 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (-1), "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0504");
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 10, 10L, (byte) 100, (-1.0d), (byte) 1, (short) 100 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 0.0f, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0505");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 0.0d, "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0506");
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 'a', 10.0d, obj4, (-1.0d) };
        java.lang.Class<?>[] wildcardClassArray7 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) false, "", objArray6, wildcardClassArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Boolean");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0507");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (short) -1, "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0508");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 10.0d };
        java.lang.Class[] classArray5 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray6 = (java.lang.Class<?>[]) classArray5;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 100, "", objArray3, (java.lang.Class<?>[]) classArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
    }

    @Test
    public void MethodUtils0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0509");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1.0f, '#' };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 10, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0510");
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Object[] objArray5 = new java.lang.Object[] { '#', (-1), obj4 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) 1, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0511");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1L, 10L };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 100.0f, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0512");
        java.lang.Object[] objArray3 = new java.lang.Object[] { "" };
        java.lang.Class[] classArray5 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray6 = (java.lang.Class<?>[]) classArray5;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (-1L), "", objArray3, wildcardClassArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
    }

    @Test
    public void MethodUtils0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0513");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 100L };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 100.0d, "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0514");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 100, 1.0d, (byte) 100 };
        java.lang.Class[] classArray7 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (-1), "", objArray5, wildcardClassArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray8);
    }

    @Test
    public void MethodUtils0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0515");
        java.lang.Object[] objArray2 = null;
        java.lang.Class[] classArray4 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray5 = (java.lang.Class<?>[]) classArray4;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) ' ', "hi!", objArray2, (java.lang.Class<?>[]) classArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray5);
    }

    @Test
    public void MethodUtils0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0516");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils3 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) 1, methodUtils3 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) false, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Boolean");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0517");
        java.lang.Object[] objArray4 = new java.lang.Object[] { true, ' ' };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (-1), "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0518");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 'a', 10.0d, "" };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) '4', "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0519");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass1 = methodUtils0.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100.0d, 100.0f };
        java.lang.Class[] classArray7 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) methodUtils0, "", objArray5, wildcardClassArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: org.apache.commons.lang3.reflect.MethodUtils");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray8);
    }

    @Test
    public void MethodUtils0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0520");
        java.lang.Object[] objArray6 = new java.lang.Object[] { ' ', 1.0d, (short) 100, (short) 100 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (-1L), "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0521");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { obj2, 'a', 1L, obj5 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 10L, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0522");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0f) };
        java.lang.Class[] classArray5 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray6 = (java.lang.Class<?>[]) classArray5;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (-1.0f), "hi!", objArray3, (java.lang.Class<?>[]) classArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
    }

    @Test
    public void MethodUtils0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0523");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) -1, 100.0d };
        java.lang.Class<?>[] wildcardClassArray5 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) 1, "hi!", objArray4, wildcardClassArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0524");
        java.lang.Object[] objArray4 = new java.lang.Object[] { true, (byte) 10 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 10.0d, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0525");
        java.lang.Object[] objArray3 = new java.lang.Object[] { false };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (short) 1, "hi!", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0526");
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10, 1.0d, (short) 100, (-1), 1L, (-1) };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) 10, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0527");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100L, (-1.0f) };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) 10, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0528");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', 0.0f, 'a', (short) -1 };
        java.lang.Class<?>[] wildcardClassArray8 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) wildcardClass1, "hi!", objArray7, wildcardClassArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Class");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0529");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 0, (byte) 0, "" };
        java.lang.Class[] classArray7 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) false, "", objArray5, (java.lang.Class<?>[]) classArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Boolean");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray8);
    }

    @Test
    public void MethodUtils0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0530");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0, false };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (byte) 0, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0531");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils3 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass4 = methodUtils3.getClass();
        org.apache.commons.lang3.reflect.MethodUtils methodUtils7 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray8 = new java.lang.Object[] { false, methodUtils3, 100.0d, (byte) -1, methodUtils7 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) 10, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0532");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1), false };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (byte) 1, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0533");
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 0, (byte) -1, (byte) 0, 0, "hi!" };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 100, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0534");
        java.lang.Object[] objArray5 = new java.lang.Object[] { '#', 100.0f, (-1.0f) };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 10.0d, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0535");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 0, ' ', (-1.0f), (byte) 100 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 10.0d, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0536");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10.0d, 10, '#', ' ', 1.0f };
        java.lang.Class<?>[] wildcardClassArray8 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) -1, "hi!", objArray7, wildcardClassArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0537");
        java.lang.Object[] objArray6 = new java.lang.Object[] { false, (-1L), 100, 0 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 'a', "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0538");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0, "hi!" };
        java.lang.Class[] classArray6 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray7 = (java.lang.Class<?>[]) classArray6;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) 10, "", objArray4, wildcardClassArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray7);
    }

    @Test
    public void MethodUtils0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0539");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 10, (byte) 0, 10.0d, (byte) 100 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 100.0d, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0540");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1, (short) -1 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 10L, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0541");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils5 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray7 = new java.lang.Object[] { '#', 0.0d, "hi!", methodUtils5, '#' };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (-1), "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0542");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 1, 100, 10.0f, 100.0d };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) '4', "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0543");
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100.0d, false, obj4 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) "", "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.String");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0544");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100, (short) 10, (byte) 100 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 10.0d, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0545");
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 100, '#', obj4, (short) 0, 0.0f };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 100.0f, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0546");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10.0d, (short) 100, 1.0d, 0.0d };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (-1.0f), "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0547");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0.0f, '#', (-1.0f) };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 0, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0548");
        java.lang.Object[] objArray6 = new java.lang.Object[] { '#', false, ' ', (short) 100 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 1, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0549");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100, 0.0f };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 100L, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0550");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass3 = methodUtils2.getClass();
        java.lang.Object[] objArray4 = new java.lang.Object[] { methodUtils2 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) '#', "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0551");
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (short) 1, obj4, 10.0d, 100 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) '#', "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0552");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray4 = new java.lang.Object[] { wildcardClass3 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 'a', "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0553");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 100L, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0554");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 10, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0555");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass1 = methodUtils0.getClass();
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) methodUtils0, "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: org.apache.commons.lang3.reflect.MethodUtils");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0556");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass1 = methodUtils0.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) -1, 10L, 0.0d, (byte) 10, ' ' };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) methodUtils0, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: org.apache.commons.lang3.reflect.MethodUtils");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0557");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass3 = methodUtils2.getClass();
        org.apache.commons.lang3.reflect.MethodUtils methodUtils5 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray7 = new java.lang.Object[] { wildcardClass3, "", methodUtils5, 0L };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) false, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Boolean");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0558");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 100.0f, (-1.0d), (byte) 100, 10.0f };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) "", "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.String");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0559");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (short) 100, "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0560");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 0, 1.0f, (byte) 10 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (byte) 10, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0561");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 0.0f, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0562");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray3 = new java.lang.Object[] { 100L };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) methodUtils0, "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: org.apache.commons.lang3.reflect.MethodUtils");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0563");
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0d, 0.0f, (short) -1, 0.0d, (byte) 0, 100.0f };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 10L, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0564");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100L, ' ', (short) 10 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) 10, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0565");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Class[] classArray4 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray5 = (java.lang.Class<?>[]) classArray4;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) "", "hi!", objArray2, (java.lang.Class<?>[]) classArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.String");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray5);
    }

    @Test
    public void MethodUtils0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0566");
        java.lang.Object[] objArray5 = new java.lang.Object[] { '4', 10L, 100.0d };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (-1), "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0567");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray4 = new java.lang.Object[] { wildcardClass3 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) false, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Boolean");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0568");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) '#', "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0569");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0, (-1.0f), '4' };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) 10, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0570");
        java.lang.Object[] objArray3 = new java.lang.Object[] { "hi!" };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 10.0f, "hi!", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0571");
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1.0f), 100, 0.0d, (byte) 1, 0.0f };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 'a', "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0572");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 1, (short) 10, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) false, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Boolean");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0573");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 0 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 10L, "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0574");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 1.0d, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0575");
        java.lang.Object[] objArray3 = new java.lang.Object[] { ' ' };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (-1.0d), "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0576");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0.0f, ' ', (short) 0, "hi!", 1 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(obj0, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Object");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0577");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1.0d, 100L, (short) 100 };
        java.lang.Class[] classArray7 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) 0, "", objArray5, (java.lang.Class<?>[]) classArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray8);
    }

    @Test
    public void MethodUtils0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0578");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray4 = new java.lang.Object[] { obj2 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 100.0d, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0579");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) "", "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.String");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0580");
        java.lang.Object obj0 = null;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 1, '#', 100.0f, obj5 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(obj0, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0581");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 10 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 0.0f, "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0582");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100, (byte) -1 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) 0, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0583");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10, 1.0d, 100L, 0 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) '4', "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0584");
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0, true, (short) 1, (short) -1, (byte) 100, 0.0f };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 1.0f, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0585");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, (short) 0, 'a' };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod(obj0, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Object");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0586");
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 100, 1.0d, 1L, (short) 0, (short) -1 };
        java.lang.Class<?>[] wildcardClassArray8 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) false, "", objArray7, wildcardClassArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Boolean");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0587");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) 1, 1.0f };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (byte) 100, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0588");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1.0f, (byte) 10 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 0.0d, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0589");
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100, "hi!", (short) 10, (-1L), (-1L), true };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 1.0d, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0590");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object[] objArray4 = new java.lang.Object[] { false, 10.0f };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(obj0, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Object");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0591");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass3 = methodUtils2.getClass();
        java.lang.Object[] objArray4 = new java.lang.Object[] { methodUtils2 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 0, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0592");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils3 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass4 = methodUtils3.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { false, wildcardClass4 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) "hi!", "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.String");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0593");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils5 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10.0d, "hi!", 1.0f, methodUtils5, 0.0d };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 0.0d, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0594");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0, 10L, 10.0f, "hi!", (-1L) };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 0.0d, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0595");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 10 };
        java.lang.Class[] classArray5 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray6 = (java.lang.Class<?>[]) classArray5;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 1L, "hi!", objArray3, wildcardClassArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
    }

    @Test
    public void MethodUtils0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0596");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils5 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) -1, (-1L), 100.0d, methodUtils5, 'a' };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) ' ', "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0597");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1, 10L };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 'a', "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0598");
        java.lang.Object obj0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100.0f, (byte) 100 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod(obj0, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0599");
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 0, (short) 1, 0.0d, 10L, 10.0d };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) 100, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0600");
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, wildcardClass4, (short) 10, "", (short) 100 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (byte) -1, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0601");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass1 = methodUtils0.getClass();
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) 0 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) wildcardClass1, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Class");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0602");
        java.lang.Object[] objArray4 = new java.lang.Object[] { '4', 100.0f };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) "", "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.String");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0603");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1.0f, 1.0d };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) 10, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0604");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10.0f, true, 1L, 0.0f };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) '4', "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0605");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 'a', "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0606");
        java.lang.Object[] objArray8 = new java.lang.Object[] { '4', 0L, (byte) 10, (byte) 0, 1.0d, 10L };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) false, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Boolean");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0607");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) 10, "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0608");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 1L };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) 0, "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0609");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 10.0d, 0.0f };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 100L, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0610");
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 10, 10L, (short) 0, ' ', (byte) 100, (-1) };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 0, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0611");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray6 = new java.lang.Object[] { methodUtils2, false, (byte) 100, (short) 1 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 100, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0612");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 10, (-1L) };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (-1.0f), "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0613");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { obj2, (short) 0, "", '#' };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 10.0f, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0614");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 100.0f };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 10, "hi!", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0615");
        java.lang.Object obj0 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0.0d, 1.0f, 0.0f, 'a', false, 1 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod(obj0, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0616");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray3 = new java.lang.Object[] { methodUtils2 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) 1, "hi!", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0617");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100.0d, 100.0f, 10L };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (short) 10, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0618");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 100 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 1, "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0619");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass3 = methodUtils2.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { methodUtils2, 1, (short) -1, false };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (short) -1, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0620");
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1.0f), true, (-1), 'a', 100.0f, 0L };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 0L, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0621");
        java.lang.Object obj0 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Class<?>[] wildcardClassArray3 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod(obj0, "hi!", objArray2, wildcardClassArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0622");
        java.lang.Object obj0 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { '#', (byte) -1, obj4, (-1.0d), (-1.0d) };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(obj0, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0623");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0.0f, (-1L), 10L };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) false, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Boolean");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0624");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 1, 0L, "", (-1) };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 0.0d, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0625");
        java.lang.Object[] objArray6 = new java.lang.Object[] { "hi!", 1.0d, 0.0d, (byte) -1 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) '#', "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0626");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils4 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 100, (byte) 0, methodUtils4, 10.0d };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 1L, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0627");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { obj2, 0.0d, 100.0d };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) "hi!", "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.String");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0628");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray3 = new java.lang.Object[] { methodUtils2 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 100, "hi!", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0629");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10L, 10.0d, (short) 0 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 1L, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0630");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 0L };
        java.lang.Class[] classArray5 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray6 = (java.lang.Class<?>[]) classArray5;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (-1), "hi!", objArray3, (java.lang.Class<?>[]) classArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
    }

    @Test
    public void MethodUtils0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0631");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0L, (-1.0d), (short) 10 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) '#', "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0632");
        java.lang.Object[] objArray7 = new java.lang.Object[] { false, 10.0f, (byte) 1, 0.0f, (byte) 1 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 10, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0633");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1.0f, "hi!", 1.0d, 0.0d };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 10.0d, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0634");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1L, (byte) 100, (short) 100, 0L };
        java.lang.Class<?>[] wildcardClassArray7 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) "hi!", "hi!", objArray6, wildcardClassArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.String");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0635");
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 1, '4', (short) 0, (byte) 100, (short) 1, 0L };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 0.0f, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0636");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) -1, 1.0d, ' ' };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) methodUtils0, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: org.apache.commons.lang3.reflect.MethodUtils");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0637");
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) -1, true, (byte) 0, (short) 100, (short) 0 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) 0, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0638");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils3 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1.0f, methodUtils3, 0L, (-1L) };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 1L, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0639");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1L), (short) 0, 0.0d, (short) 0 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (-1.0f), "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0640");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0.0f, 1.0d, 1.0d, 0.0d, 100.0f };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) '#', "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0641");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1), (short) 100 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (-1.0d), "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0642");
        java.lang.Object[] objArray7 = new java.lang.Object[] { ' ', (byte) -1, (-1.0f), '4', 0.0d };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) '4', "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0643");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1) };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 100.0d, "hi!", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0644");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (byte) -1, "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0645");
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100.0d, (-1.0d), '#', obj5, '#', 1.0d };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 0.0f, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0646");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 100.0d, "hi!", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0647");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Class<?>[] wildcardClassArray3 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 0.0f, "", objArray2, wildcardClassArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0648");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1.0d), true };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (-1L), "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0649");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 100 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) 10, "hi!", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0650");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 10.0d, (byte) 0 };
        java.lang.Class[] classArray6 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray7 = (java.lang.Class<?>[]) classArray6;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 0.0f, "hi!", objArray4, wildcardClassArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray7);
    }

    @Test
    public void MethodUtils0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0651");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 0.0f, "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0652");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) 100, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0653");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils4 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100L, (-1), methodUtils4, 100.0f, 1.0f, (short) 0 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) '4', "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0654");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100.0f, (short) 0 };
        java.lang.Class<?>[] wildcardClassArray5 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 1L, "hi!", objArray4, wildcardClassArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0655");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) '#', "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0656");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils7 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1.0d), false, (-1.0d), 100.0f, 'a', methodUtils7 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) "hi!", "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.String");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0657");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10, 100.0f, 0, 10L };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 'a', "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0658");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (-1), "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0659");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 1, (short) 1, true, (short) 0 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) 100, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0660");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray5 = new java.lang.Object[] { methodUtils2, true, 10.0f };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) "", "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.String");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0661");
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) 1, obj3 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) -1, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0662");
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1.0f), 1L, 'a', 10.0d, 1.0d };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 1.0f, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0663");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (-1L), "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0664");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (-1.0d), "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0665");
        java.lang.Object[] objArray3 = new java.lang.Object[] { true };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) 0, "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0666");
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 0, wildcardClass4, 0, 0.0f, 0 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (short) 0, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0667");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass3 = methodUtils2.getClass();
        org.apache.commons.lang3.reflect.MethodUtils methodUtils4 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass5 = methodUtils4.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { wildcardClass3, wildcardClass5, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (-1), "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0668");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 1.0f, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0669");
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1.0d, 0, 100.0f, 'a', 10L, "hi!" };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (short) 100, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0670");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) 0, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0671");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1.0d, 0L, 0.0d, 0.0d, (-1L) };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 10, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0672");
        java.lang.Object obj0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { "hi!", 10 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(obj0, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0673");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { obj2, 1.0f, (short) -1, obj5, (-1.0d), obj7 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 10.0d, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0674");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils3 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0L, methodUtils3 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 'a', "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0675");
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", (short) 100, obj4, 1.0f };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 1L, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0676");
        java.lang.Object obj0 = null;
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(obj0, "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0677");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Class<?>[] wildcardClassArray3 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) '4', "", objArray2, wildcardClassArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0678");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 100, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0679");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0L, 10L };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 0.0f, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0680");
        java.lang.Object[] objArray4 = new java.lang.Object[] { false, 'a' };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (-1.0d), "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0681");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0, 1.0f };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 1, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0682");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1.0f, (-1.0d), ' ', 1L };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (byte) 1, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0683");
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { "", '4', obj4, '4', 1.0d };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 10.0d, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0684");
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0L, 10.0f, (short) 10, (short) 0, "", 10 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (-1.0f), "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0685");
        java.lang.Object[] objArray2 = null;
        java.lang.Class[] classArray4 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray5 = (java.lang.Class<?>[]) classArray4;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 1, "", objArray2, wildcardClassArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray5);
    }

    @Test
    public void MethodUtils0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0686");
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (-1.0d), obj3, 10.0d };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 1.0d, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0687");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 0, (-1L) };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) 1, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0688");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 0.0d, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0689");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (-1.0f), "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0690");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) "", "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.String");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0691");
        java.lang.Object[] objArray5 = new java.lang.Object[] { '4', "hi!", true };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 0.0d, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0692");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 10L, 1.0d };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) -1, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0693");
        java.lang.Object[] objArray5 = new java.lang.Object[] { "hi!", (byte) 100, '4' };
        java.lang.Class[] classArray7 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) true, "", objArray5, (java.lang.Class<?>[]) classArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Boolean");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray8);
    }

    @Test
    public void MethodUtils0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0694");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100.0d, 100L };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 'a', "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0695");
        java.lang.Object[] objArray4 = new java.lang.Object[] { false, 100.0d };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 1, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0696");
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) -1, 0L, 100.0f, (byte) 100, "hi!", 1.0d };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (-1.0f), "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0697");
        java.lang.Object[] objArray3 = new java.lang.Object[] { true };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (short) 1, "hi!", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0698");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1.0d, true, 1.0d, (short) -1 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (-1L), "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0699");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { wildcardClass3, '#', (-1L), (-1.0d) };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 1.0f, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0700");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 100 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) false, "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Boolean");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0701");
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 0, (-1L), (short) -1, 1.0f, "hi!" };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 1L, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0702");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 1L };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 100.0d, "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0703");
        java.lang.Object[] objArray6 = new java.lang.Object[] { "hi!", (short) 100, 0, 100.0d };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (short) 0, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0704");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 10, (short) -1 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) "hi!", "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.String");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0705");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100L, (byte) 10, true, (byte) 1, (-1.0f) };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 10.0f, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0706");
        java.lang.Object[] objArray8 = new java.lang.Object[] { ' ', 100L, 1, (short) 100, ' ', 1 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (-1L), "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0707");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 1.0f };
        java.lang.Class<?>[] wildcardClassArray4 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (short) 1, "", objArray3, wildcardClassArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0708");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 10, 'a' };
        java.lang.Class<?>[] wildcardClassArray5 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 0L, "", objArray4, wildcardClassArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0709");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 1L, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0710");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 10L };
        java.lang.Class[] classArray5 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray6 = (java.lang.Class<?>[]) classArray5;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 10, "hi!", objArray3, (java.lang.Class<?>[]) classArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
    }

    @Test
    public void MethodUtils0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0711");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Class[] classArray4 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray5 = (java.lang.Class<?>[]) classArray4;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) false, "hi!", objArray2, (java.lang.Class<?>[]) classArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Boolean");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray5);
    }

    @Test
    public void MethodUtils0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0712");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) 0, 10.0f };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 100L, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0713");
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { "hi!", obj3, (-1.0d), 0.0f, true };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) true, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Boolean");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0714");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 10L, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0715");
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1L), wildcardClass4, 10 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 100.0f, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0716");
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 1, (byte) 100, (short) -1, (short) 1, 10, 0.0f };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 0L, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0717");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) 10, 0 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 100, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0718");
        java.lang.Object[] objArray7 = new java.lang.Object[] { ' ', ' ', 100L, 10.0d, 10L };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (-1.0d), "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0719");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils4 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0.0d, "", methodUtils4, (byte) 10 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 1L, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0720");
        java.lang.Object[] objArray8 = new java.lang.Object[] { '4', 100.0d, (short) 10, '#', (-1.0d), (-1.0d) };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) 100, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0721");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 10, 0.0d, ' ' };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (short) 100, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0722");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { obj2, 0L };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) true, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Boolean");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0723");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 100L };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 0, "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0724");
        java.lang.Object[] objArray8 = new java.lang.Object[] { '4', (byte) 1, 'a', (-1), ' ', 1 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 1.0f, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0725");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0, 0L };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 10L, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0726");
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 10, 10.0f, 'a', (short) 0, (-1.0d) };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 1.0d, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0727");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils3 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass4 = methodUtils3.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (-1L), wildcardClass4 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) 100, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0728");
        java.lang.Object[] objArray5 = new java.lang.Object[] { ' ', (-1.0d), 1.0f };
        java.lang.Class[] classArray7 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) '#', "", objArray5, wildcardClassArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray8);
    }

    @Test
    public void MethodUtils0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0729");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils5 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0, 10L, 0L, methodUtils5, 0.0f, 100 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 10, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0730");
        java.lang.Object[] objArray4 = new java.lang.Object[] { "hi!", '4' };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 100, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0731");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass1 = methodUtils0.getClass();
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        java.lang.Class[] classArray5 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray6 = (java.lang.Class<?>[]) classArray5;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) wildcardClass1, "", objArray3, wildcardClassArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Class");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
    }

    @Test
    public void MethodUtils0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0732");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0.0d, 1, (short) 0, (short) 10, 1L };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 100.0d, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0733");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) 10, 100.0d };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) true, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Boolean");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0734");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10L, 100.0d, '4' };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (byte) 0, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0735");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100.0f, 100.0f };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(obj0, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Object");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0736");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 0, 100, (short) -1, (-1) };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) 10, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0737");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100.0f, true };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(obj0, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Object");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0738");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) "hi!", "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.String");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0739");
        java.lang.Object[] objArray7 = new java.lang.Object[] { false, (short) 1, 10.0d, "hi!", "hi!" };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 10.0d, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0740");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils6 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass7 = methodUtils6.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 10, (byte) 1, 10, 100L, methodUtils6 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 10, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0741");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 100, (-1), 1 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 'a', "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0742");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) true, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Boolean");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0743");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object[] objArray4 = new java.lang.Object[] { "hi!", obj3 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod(obj0, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Object");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0744");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils3 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass4 = methodUtils3.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { true, wildcardClass4, (byte) 1 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 10.0d, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0745");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 100, 10, 10.0f, ' ' };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 1L, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0746");
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) -1, (short) 10, (short) 100, (byte) 10, 10.0f };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) '#', "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0747");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1L, (short) 10 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) true, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Boolean");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0748");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass1 = methodUtils0.getClass();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1.0d };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) wildcardClass1, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Class");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0749");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object[] objArray6 = new java.lang.Object[] { obj2, obj3, '4', (byte) 100 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) '4', "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0750");
        java.lang.Object[] objArray3 = new java.lang.Object[] { '4' };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (-1.0d), "hi!", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0751");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0f) };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) true, "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Boolean");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0752");
        java.lang.Object[] objArray2 = null;
        java.lang.Class[] classArray4 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray5 = (java.lang.Class<?>[]) classArray4;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) '4', "hi!", objArray2, wildcardClassArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray5);
    }

    @Test
    public void MethodUtils0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0753");
        java.lang.Object[] objArray7 = new java.lang.Object[] { ' ', (byte) 10, (byte) 0, 10.0f, "hi!" };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) 10, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0754");
        java.lang.Object[] objArray3 = new java.lang.Object[] { '4' };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 10.0f, "hi!", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0755");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) -1, 1L, 10L };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) methodUtils0, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: org.apache.commons.lang3.reflect.MethodUtils");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0756");
        java.lang.Object[] objArray4 = new java.lang.Object[] { '4', 10.0f };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 1, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0757");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Class<?>[] wildcardClassArray3 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (-1.0f), "", objArray2, wildcardClassArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0758");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils3 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100.0f, methodUtils3 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 10, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0759");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass3 = methodUtils2.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { wildcardClass3, (byte) 0, (short) 0, 1.0f, false };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(obj0, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0760");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 100L, "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0761");
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1), (short) 1, 'a', obj5, "hi!", 100.0d };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) 10, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0762");
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { '#', wildcardClass4 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 1.0d, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0763");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1L, '#', true, '4', 10.0f };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 100.0d, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0764");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 10.0f, ' ' };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 1.0d, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0765");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (short) 100, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0766");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0L, (short) 10, (-1.0f), 0L, 'a' };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 10, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0767");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(obj0, "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Object");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0768");
        java.lang.Object obj0 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { "", 100.0f, false, 0L, 10.0d };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod(obj0, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0769");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass1 = methodUtils0.getClass();
        org.apache.commons.lang3.reflect.MethodUtils methodUtils5 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray6 = new java.lang.Object[] { false, "hi!", methodUtils5 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) wildcardClass1, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Class");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0770");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils4 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass5 = methodUtils4.getClass();
        org.apache.commons.lang3.reflect.MethodUtils methodUtils6 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100L, true, wildcardClass5, methodUtils6, '#' };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) "", "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.String");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0771");
        java.lang.Object[] objArray6 = new java.lang.Object[] { '#', 10.0f, (short) -1, 0 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) "hi!", "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.String");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0772");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray6 = new java.lang.Object[] { methodUtils2, 1L, 10.0f, (short) -1 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 0.0d, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0773");
        java.lang.Object obj0 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { '4', 10.0d, 0, (short) 10, 10.0f };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod(obj0, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0774");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 1.0f, "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0775");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils4 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray8 = new java.lang.Object[] { false, '#', methodUtils4, false, ' ', (short) 100 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (short) -1, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0776");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (-1), "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0777");
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1), obj3, (-1), 1 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (-1.0d), "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0778");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1.0f, (-1.0f), (-1.0d) };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 100.0d, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0779");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 0, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0780");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0L, (byte) 0, 100, "" };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (-1L), "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0781");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils3 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray5 = new java.lang.Object[] { '#', methodUtils3, "" };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) ' ', "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0782");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 1.0d };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (short) -1, "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0783");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 100.0d };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (byte) 1, "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0784");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1.0f, '4', 1, '#' };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) 0, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0785");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 1L };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) 1, "hi!", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0786");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100L, 100L };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) 0, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0787");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass3 = methodUtils2.getClass();
        java.lang.Object[] objArray4 = new java.lang.Object[] { wildcardClass3 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) true, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Boolean");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0788");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { wildcardClass3, (byte) -1, 0L };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 'a', "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0789");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 100L, (short) 10, 1.0d };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) wildcardClass1, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Class");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0790");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 10.0d };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (byte) 0, "hi!", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0791");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (-1), "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0792");
        java.lang.Object[] objArray8 = new java.lang.Object[] { '4', "hi!", (-1.0d), (byte) 100, 10.0d, (-1) };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) -1, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0793");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Class<?>[] wildcardClassArray3 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) ' ', "", objArray2, wildcardClassArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0794");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils3 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass4 = methodUtils3.getClass();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', methodUtils3, 1, obj6, (short) 10 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) ' ', "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0795");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils3 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0, methodUtils3 };
        java.lang.Class<?>[] wildcardClassArray5 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 100L, "", objArray4, wildcardClassArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0796");
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1L), (-1L), (short) -1, obj5, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) false, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Boolean");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0797");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100.0d, '#' };
        java.lang.Class<?>[] wildcardClassArray5 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 100.0f, "", objArray4, wildcardClassArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0798");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 1, (byte) -1, 100.0d, (-1.0f) };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) false, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Boolean");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0799");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10.0d, (byte) 100, 1 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 10.0f, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0800");
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) -1, (short) 10, 10, obj5 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 'a', "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0801");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) methodUtils0, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: org.apache.commons.lang3.reflect.MethodUtils");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0802");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray6 = new java.lang.Object[] { obj2, 'a', "", "" };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 'a', "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0803");
        java.lang.Object[] objArray5 = new java.lang.Object[] { '4', 1L, true };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 100.0d, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0804");
        java.lang.Object[] objArray5 = new java.lang.Object[] { '#', 10.0d, (-1L) };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 100, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0805");
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1L), (-1.0d), 0, (-1), obj6, 100 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 'a', "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0806");
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) -1, obj3, (short) 100, 1, 1.0d, 1.0d };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 100L, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0807");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 0, (byte) 10 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (byte) 100, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0808");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1), 1L, '#', 10.0d };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) ' ', "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0809");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils4 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100, 100.0d, methodUtils4 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 100.0f, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0810");
        java.lang.Object[] objArray3 = new java.lang.Object[] { "hi!" };
        java.lang.Class[] classArray5 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray6 = (java.lang.Class<?>[]) classArray5;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (byte) 1, "hi!", objArray3, (java.lang.Class<?>[]) classArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
    }

    @Test
    public void MethodUtils0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0811");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(obj0, "hi!", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Object");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0812");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils5 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 1, ' ', 0L, methodUtils5, 'a', (short) 1 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (-1), "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0813");
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 0, ' ', (-1), 10.0f, ' ', (-1.0d) };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) -1, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0814");
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100, 100L, 0.0d, 1, "", (short) -1 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) ' ', "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0815");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) -1, (short) 1 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 100, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0816");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils5 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10, 1, 10.0f, methodUtils5 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (-1.0f), "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0817");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0L, (byte) 0, 100.0f, 10.0f, (byte) 0 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) 10, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0818");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass1 = methodUtils0.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 100, (byte) 100, 0L };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) methodUtils0, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: org.apache.commons.lang3.reflect.MethodUtils");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0819");
        java.lang.Object[] objArray3 = new java.lang.Object[] { "" };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) '4', "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0820");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10.0d, (short) 1, 10.0f, 100L, (byte) 100 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 0.0d, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0821");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0L, (byte) 10 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (-1L), "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0822");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 10 };
        java.lang.Class[] classArray5 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray6 = (java.lang.Class<?>[]) classArray5;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) ' ', "", objArray3, wildcardClassArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
    }

    @Test
    public void MethodUtils0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0823");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.apache.commons.lang3.reflect.MethodUtils methodUtils3 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass4 = methodUtils3.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { methodUtils3 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod(obj0, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Object");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0824");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) 0, true };
        java.lang.Class<?>[] wildcardClassArray5 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 100L, "hi!", objArray4, wildcardClassArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0825");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) -1, 0 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) wildcardClass1, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Class");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0826");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Class[] classArray4 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray5 = (java.lang.Class<?>[]) classArray4;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 10.0f, "hi!", objArray2, (java.lang.Class<?>[]) classArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray5);
    }

    @Test
    public void MethodUtils0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0827");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10.0d, 10.0f, 1L };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (-1L), "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0828");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1.0d, 10.0d, (short) -1 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (byte) 10, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0829");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) 100, "hi!" };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) "hi!", "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.String");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0830");
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', wildcardClass4, '#', (-1) };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 10.0f, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0831");
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100.0d, 100.0f, ' ', (byte) 100, (byte) 10, obj7 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) 10, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0832");
        java.lang.Object[] objArray4 = new java.lang.Object[] { '4', 1.0d };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (-1L), "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0833");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100, ' ', (byte) -1, '4', 0 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) 10, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0834");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { obj2, (byte) 100 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 100.0d, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0835");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 10, (short) 0 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) '#', "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0836");
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 10, obj3, (short) 0 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) "hi!", "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.String");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0837");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 0.0d, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0838");
        java.lang.Object obj0 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) -1, 0.0d, ' ', '4' };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod(obj0, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0839");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 100.0d };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 100.0f, "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0840");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray5 = new java.lang.Object[] { methodUtils2, 1, (byte) -1 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 10.0d, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0841");
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) -1, 'a', (byte) 100, 10.0d, (-1.0d) };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (byte) 100, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0842");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0L, 10 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) methodUtils0, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: org.apache.commons.lang3.reflect.MethodUtils");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0843");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, (-1.0f), (short) 1 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 0, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0844");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (byte) 100, "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0845");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 1, (short) 1, (byte) 0 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) ' ', "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0846");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Class[] classArray4 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray5 = (java.lang.Class<?>[]) classArray4;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (byte) -1, "hi!", objArray2, wildcardClassArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray5);
    }

    @Test
    public void MethodUtils0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0847");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 1L, "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0848");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10.0d, 10.0d, (short) 100 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (byte) 100, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0849");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass3 = methodUtils2.getClass();
        org.apache.commons.lang3.reflect.MethodUtils methodUtils5 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray6 = new java.lang.Object[] { wildcardClass3, (short) 0, methodUtils5 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 10, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0850");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 'a', (-1.0d), 10 };
        java.lang.Class[] classArray7 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) "hi!", "", objArray5, (java.lang.Class<?>[]) classArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.String");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray8);
    }

    @Test
    public void MethodUtils0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0851");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 10, (-1.0d), (-1.0f), "hi!", (byte) 100, 1.0f };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(obj0, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Object");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0852");
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", '4', 100, (short) 100 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (byte) -1, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0853");
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1L), 0.0f, 0.0d, (byte) 100, false, (byte) 100 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) '4', "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0854");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1, ' ', 1.0f, (short) 1, (short) 100 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 'a', "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0855");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Class[] classArray4 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray5 = (java.lang.Class<?>[]) classArray4;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) 0, "", objArray2, (java.lang.Class<?>[]) classArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray5);
    }

    @Test
    public void MethodUtils0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0856");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100.0f, 0.0d, 10.0f };
        java.lang.Class[] classArray7 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 100L, "hi!", objArray5, (java.lang.Class<?>[]) classArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray8);
    }

    @Test
    public void MethodUtils0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0857");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0.0f, (byte) 1 };
        java.lang.Class[] classArray6 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray7 = (java.lang.Class<?>[]) classArray6;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 10.0f, "", objArray4, wildcardClassArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray7);
    }

    @Test
    public void MethodUtils0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0858");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Class[] classArray4 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray5 = (java.lang.Class<?>[]) classArray4;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 100.0d, "hi!", objArray2, (java.lang.Class<?>[]) classArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray5);
    }

    @Test
    public void MethodUtils0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0859");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100.0f, (byte) 10 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) 10, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0860");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1.0f, (short) 10, "hi!" };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) '#', "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0861");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (byte) -1, "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0862");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 0L };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 10, "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0863");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray5 = new java.lang.Object[] { obj2, 1L, (-1L) };
        java.lang.Class[] classArray7 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 100.0d, "", objArray5, (java.lang.Class<?>[]) classArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray8);
    }

    @Test
    public void MethodUtils0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0864");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) -1, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0865");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass1 = methodUtils0.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { '#', 1L };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) wildcardClass1, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Class");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0866");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 100.0f };
        java.lang.Class<?>[] wildcardClassArray4 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 10L, "", objArray3, wildcardClassArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0867");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, 1.0d, 100L };
        java.lang.Class<?>[] wildcardClassArray6 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) 1, "hi!", objArray5, wildcardClassArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0868");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 100, false, (short) 1 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 'a', "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0869");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils3 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100, methodUtils3, (short) 100, 0.0f, '4' };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) false, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Boolean");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0870");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 10.0f, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0871");
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 10, "hi!", 100.0d, 100L, 1.0d };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 1, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0872");
        java.lang.Object[] objArray5 = new java.lang.Object[] { '4', (short) 10, (byte) 10 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (byte) 100, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0873");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils3 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass4 = methodUtils3.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1L), wildcardClass4, 10, 0.0d };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (-1), "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0874");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils3 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass4 = methodUtils3.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { '#', wildcardClass4, 10.0f };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) 1, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0875");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) -1, '#' };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (byte) 100, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0876");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray5 = new java.lang.Object[] { obj2, '4', "hi!" };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 1.0d, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0877");
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100L, 10.0f, 0.0d, 100.0f, (-1.0d), 'a' };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 1L, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0878");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1.0d, 1.0f };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) 10, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0879");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) -1 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (byte) -1, "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0880");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 0 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) ' ', "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0881");
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1L), (short) 1, 1, 100.0f, 1L, true };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (short) 0, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0882");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray3 = new java.lang.Object[] { methodUtils2 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) '#', "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0883");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 10.0f, true };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 10, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0884");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1.0f, 1L, 0L, (byte) 100 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (short) 1, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0885");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0.0d, 100.0f, (byte) 100 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 100, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0886");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils4 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 10, (short) 0, methodUtils4, '4', (byte) 1 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 100, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0887");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) -1, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0888");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 10 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 100, "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0889");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 1, 100.0d };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (short) 10, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0890");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 10, ' ', (byte) 0 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) false, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Boolean");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0891");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0, (short) 100, 10 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) '4', "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0892");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) -1, (short) 0 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) "", "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.String");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0893");
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100.0f, obj3, 100.0f, (short) 0, (byte) 1 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 0, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0894");
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 1, true, obj4, false, 1 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) -1, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0895");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 10.0f };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) wildcardClass1, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Class");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0896");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) 10, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0897");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0.0d, (-1.0f), false, (-1.0d) };
        java.lang.Class<?>[] wildcardClassArray7 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 10, "", objArray6, wildcardClassArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0898");
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 1, (byte) 0, (byte) 100, 0.0d, (short) -1 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 1.0f, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0899");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 0.0d };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (byte) 10, "hi!", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0900");
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1.0d, (short) 1, wildcardClass5 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (short) 0, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0901");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100L, 100.0f };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) false, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Boolean");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0902");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass1 = methodUtils0.getClass();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { "", wildcardClass5, '4', obj7 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) wildcardClass1, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Class");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0903");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1.0f, (-1.0f) };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 1.0f, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0904");
        java.lang.Object obj0 = null;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0.0d, (short) 10, (short) 0, wildcardClass6, 'a' };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(obj0, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0905");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 10.0f };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) "", "hi!", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.String");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0906");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) methodUtils0, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: org.apache.commons.lang3.reflect.MethodUtils");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0907");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 'a', ' ', 1.0f };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 10.0d, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0908");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 1L };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (-1), "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0909");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass3 = methodUtils2.getClass();
        java.lang.Object[] objArray4 = new java.lang.Object[] { wildcardClass3 };
        java.lang.Class[] classArray6 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray7 = (java.lang.Class<?>[]) classArray6;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (byte) 10, "hi!", objArray4, wildcardClassArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray7);
    }

    @Test
    public void MethodUtils0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0910");
        java.lang.Object[] objArray4 = new java.lang.Object[] { '4', (short) 100 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (short) -1, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0911");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0.0f, (byte) 10 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) '4', "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0912");
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "hi!", 1, obj4, (-1L) };
        java.lang.Class<?>[] wildcardClassArray7 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (short) -1, "hi!", objArray6, wildcardClassArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0913");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 1.0f, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0914");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (-1), "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0915");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod(obj0, "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Object");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0916");
        java.lang.Object[] objArray4 = new java.lang.Object[] { '4', 10.0d };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) true, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Boolean");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0917");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 100, "", 0.0f, (byte) 10 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) '#', "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0918");
        java.lang.Object[] objArray6 = new java.lang.Object[] { "hi!", ' ', (short) -1, ' ' };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 1.0f, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0919");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Class<?>[] wildcardClassArray3 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 100, "", objArray2, wildcardClassArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0920");
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 'a', obj3 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (short) 10, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0921");
        java.lang.Object[] objArray6 = new java.lang.Object[] { true, (byte) 1, 0.0f, 0.0f };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 100, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0922");
        java.lang.Object[] objArray5 = new java.lang.Object[] { "", (short) 10, (-1L) };
        java.lang.Class<?>[] wildcardClassArray6 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) 10, "", objArray5, wildcardClassArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0923");
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 100, 1.0f, 'a', (byte) 0, wildcardClass7 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 0.0f, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0924");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass1 = methodUtils0.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100, 10.0d, false, (short) 10, 'a' };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) wildcardClass1, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Class");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0925");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0.0f, (byte) -1, 1, true, (byte) 1 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) "", "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.String");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0926");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 1L };
        java.lang.Class[] classArray5 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray6 = (java.lang.Class<?>[]) classArray5;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) '#', "hi!", objArray3, wildcardClassArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
    }

    @Test
    public void MethodUtils0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0927");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass1 = methodUtils0.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (-1), (byte) 10 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) methodUtils0, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: org.apache.commons.lang3.reflect.MethodUtils");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0928");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (-1.0d), (byte) 10, 1L };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) 10, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0929");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10.0f, false, 100.0f, 0L, 'a' };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (-1.0d), "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0930");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (byte) 100, "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0931");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 100, (short) 100, 10L };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (-1.0f), "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0932");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 'a', "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0933");
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 10, (byte) 10, (byte) 100, (-1), 1L, (short) -1 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) "", "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.String");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0934");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 0.0d };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) 1, "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0935");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray7 = new java.lang.Object[] { methodUtils2, (byte) 1, (byte) 1, "", 'a' };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) 100, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0936");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 10, 1L, 'a' };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 1, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0937");
        java.lang.Object[] objArray4 = new java.lang.Object[] { "hi!", (byte) 100 };
        java.lang.Class[] classArray6 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray7 = (java.lang.Class<?>[]) classArray6;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 0.0f, "hi!", objArray4, wildcardClassArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray7);
    }

    @Test
    public void MethodUtils0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0938");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass3 = methodUtils2.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { methodUtils2, 10.0d, false };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (-1.0f), "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0939");
        java.lang.Object obj0 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 'a' };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod(obj0, "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0940");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { obj2, obj4, (short) 1 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) true, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Boolean");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0941");
        java.lang.Object[] objArray3 = new java.lang.Object[] { "hi!" };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 100L, "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0942");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object[] objArray3 = new java.lang.Object[] { ' ' };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod(obj0, "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Object");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0943");
        java.lang.Object[] objArray4 = new java.lang.Object[] { '#', false };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 1.0f, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0944");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Class[] classArray4 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray5 = (java.lang.Class<?>[]) classArray4;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (short) 10, "", objArray2, (java.lang.Class<?>[]) classArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray5);
    }

    @Test
    public void MethodUtils0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0945");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass3 = methodUtils2.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { wildcardClass3, 100.0d, '#', (-1L) };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) 1, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0946");
        java.lang.Object[] objArray4 = new java.lang.Object[] { true, 0L };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) 10, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0947");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0.0d, 100, (-1L), false };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (short) 10, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0948");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Class[] classArray4 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray5 = (java.lang.Class<?>[]) classArray4;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (byte) 100, "", objArray2, wildcardClassArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray5);
    }

    @Test
    public void MethodUtils0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0949");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0.0d, (short) 0 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) '4', "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0950");
        java.lang.Object[] objArray7 = new java.lang.Object[] { '4', (short) 100, (short) 100, 0, '4' };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 10.0f, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0951");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 100.0f, 1.0d, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) '4', "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0952");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 'a' };
        java.lang.Class[] classArray5 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray6 = (java.lang.Class<?>[]) classArray5;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 10.0d, "hi!", objArray3, (java.lang.Class<?>[]) classArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
    }

    @Test
    public void MethodUtils0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0953");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', 0L };
        java.lang.Class[] classArray6 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray7 = (java.lang.Class<?>[]) classArray6;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 0L, "hi!", objArray4, wildcardClassArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray7);
    }

    @Test
    public void MethodUtils0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0954");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 100, 10.0d };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (-1L), "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0955");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils7 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 'a', (short) 1, 1L, 0L, 0.0f, methodUtils7 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (short) 100, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0956");
        java.lang.Object obj2 = new java.lang.Object();
        org.apache.commons.lang3.reflect.MethodUtils methodUtils4 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass5 = methodUtils4.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { obj2, (byte) -1, wildcardClass5 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (byte) -1, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0957");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 'a', ' ', '4', "hi!" };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (byte) -1, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0958");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1, (short) 0, 10.0f };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) methodUtils0, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: org.apache.commons.lang3.reflect.MethodUtils");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0959");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 100.0d };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 0, "hi!", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0960");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) -1 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 0, "hi!", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0961");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) ' ', "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0962");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(obj0, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Object");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0963");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 10, "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0964");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1, (short) 100 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(obj0, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Object");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0965");
        java.lang.Object[] objArray8 = new java.lang.Object[] { false, 0L, false, 10.0d, true, ' ' };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 1.0f, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0966");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0.0d, (byte) 0, "" };
        java.lang.Class[] classArray7 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) '#', "", objArray5, wildcardClassArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray8);
    }

    @Test
    public void MethodUtils0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0967");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils4 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 100L, "", methodUtils4, 0L };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 100L, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0968");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100.0d, (byte) -1 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 10, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0969");
        java.lang.Object[] objArray4 = new java.lang.Object[] { true, 100.0f };
        java.lang.Class[] classArray6 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray7 = (java.lang.Class<?>[]) classArray6;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) ' ', "hi!", objArray4, wildcardClassArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray7);
    }

    @Test
    public void MethodUtils0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0970");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 100, 100, true, ' ' };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) false, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Boolean");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0971");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100, "hi!" };
        java.lang.Class[] classArray6 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray7 = (java.lang.Class<?>[]) classArray6;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) 10, "", objArray4, (java.lang.Class<?>[]) classArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray7);
    }

    @Test
    public void MethodUtils0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0972");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 0, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0973");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass3 = methodUtils2.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { methodUtils2, 100, (-1), (short) 0 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (short) 0, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0974");
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1), 0L, "hi!", 0.0f, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (-1.0d), "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0975");
        java.lang.Object obj0 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { false };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod(obj0, "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0976");
        java.lang.Object obj0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(obj0, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0977");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0.0d, true };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (byte) -1, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0978");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1), (-1.0f), 10, ' ' };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 1, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0979");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 10, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0980");
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object[] objArray6 = new java.lang.Object[] { false, obj3, 10.0d, (byte) 100 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (short) 100, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0981");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 100, (short) 10, 100L, 0.0f };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 10.0d, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0982");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray5 = new java.lang.Object[] { obj2, (byte) 10, (-1L) };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 100.0f, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0983");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 100.0d, (byte) 100, true, (-1L) };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 0.0d, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0984");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils5 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100.0d, 10.0f, 10L, methodUtils5, (-1) };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) ' ', "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0985");
        java.lang.Object[] objArray8 = new java.lang.Object[] { "hi!", (short) -1, (byte) 1, 10L, (-1.0f), 10.0f };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) 1, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0986");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, (short) 10, 0.0d, '#' };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 100, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0987");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1.0f, (byte) -1, (short) -1, '4' };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (-1.0d), "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0988");
        java.lang.Object[] objArray3 = new java.lang.Object[] { "hi!" };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (-1), "hi!", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0989");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (short) 1, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0990");
        java.lang.Object[] objArray3 = new java.lang.Object[] { true };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) '4', "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0991");
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0, '4', 1L, ' ', "", obj7 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 100L, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0992");
        java.lang.Object obj0 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { false, 1, 100.0d, '#', (-1.0d) };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod(obj0, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0993");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass1 = methodUtils0.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) -1, 1, 10L, (-1L), true };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) methodUtils0, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: org.apache.commons.lang3.reflect.MethodUtils");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0994");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 10, 0L, 10.0f };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 0, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0995");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 100.0d, 100.0f, (-1), "hi!" };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 100, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0996");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) -1, (short) 1, '4' };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 10.0d, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0997");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100.0d, 100L, (short) 10 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) 100, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0998");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100, ' ' };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 0, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils0999");
        java.lang.Object[] objArray7 = new java.lang.Object[] { '#', 100.0f, "hi!", (short) 100, "" };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 'a', "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils1.MethodUtils1000");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray7 = new java.lang.Object[] { methodUtils2, 0.0d, 100.0f, 1.0d, (short) -1 };
        java.lang.Class<?>[] wildcardClassArray8 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) 0, "", objArray7, wildcardClassArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }
}

