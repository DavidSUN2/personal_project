package MethodUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MethodUtils0 {

    public static boolean debug = false;

    @Test
    public void MethodUtils0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0001");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 10, 10.0d };
        java.lang.Class<?>[] wildcardClassArray5 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) false, "hi!", objArray4, wildcardClassArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Boolean");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0002");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) '4', "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0003");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils4 = new org.apache.commons.lang3.reflect.MethodUtils();
        org.apache.commons.lang3.reflect.MethodUtils methodUtils5 = new org.apache.commons.lang3.reflect.MethodUtils();
        org.apache.commons.lang3.reflect.MethodUtils methodUtils6 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray7 = new java.lang.Object[] { "hi!", 0, methodUtils4, methodUtils5, methodUtils6 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 10.0f, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0004");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10, "hi!", 100.0d, (-1.0d), '4' };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) 0, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0005");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) -1, 0, 0L };
        java.lang.Class[] classArray7 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (-1.0f), "hi!", objArray5, (java.lang.Class<?>[]) classArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Float");
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
    public void MethodUtils0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0006");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Class[] classArray4 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray5 = (java.lang.Class<?>[]) classArray4;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) ' ', "", objArray2, (java.lang.Class<?>[]) classArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Character");
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
    public void MethodUtils0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0007");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100, "", 0 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) 100, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0008");
        java.lang.reflect.Method method0 = null;
        java.lang.reflect.Method method1 = org.apache.commons.lang3.reflect.MethodUtils.getAccessibleMethod(method0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(method1);
    }

    @Test
    public void MethodUtils0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0009");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100.0d, (short) 100 };
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
    public void MethodUtils0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0010");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) true, "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Boolean");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0011");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils3 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 0, methodUtils3, ' ' };
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
    public void MethodUtils0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0012");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1.0d), 100, 10L, (byte) 1 };
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
    public void MethodUtils0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0013");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) -1 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (-1.0f), "hi!", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0014");
        java.lang.Object[] objArray5 = new java.lang.Object[] { '#', 0.0f, (short) 100 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 100L, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0015");
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100.0d, 10L, 1, 0L, (-1.0d), (byte) 0 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (-1.0d), "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0016");
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 1, 100.0f, (byte) 1, 100, 0.0d, 0.0d };
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
    public void MethodUtils0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0017");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100, 1L, 1, '#', false };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) 0, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0018");
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10, (short) 1, 100L, (byte) -1, 10L, 1.0f };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (-1.0f), "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0019");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1.0d, 'a' };
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
    public void MethodUtils0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0020");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1L), 10.0f, (short) 0, (short) -1, 1, true };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod(obj0, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Object");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0021");
        java.lang.Object obj0 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0.0f, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod(obj0, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0022");
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", obj3, (-1.0f), (byte) 1 };
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
    public void MethodUtils0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0023");
        java.lang.Object[] objArray5 = new java.lang.Object[] { true, "", 1.0f };
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
    public void MethodUtils0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0024");
        java.lang.Object[] objArray3 = new java.lang.Object[] { "hi!" };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 0.0d, "hi!", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0025");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1L, (short) 0, (short) 0, 'a' };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 10.0d, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0026");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 10.0d };
        java.lang.Class[] classArray5 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray6 = (java.lang.Class<?>[]) classArray5;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (-1L), "hi!", objArray3, wildcardClassArray6);
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
    public void MethodUtils0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0027");
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 10, 1, 0.0d, false, (-1.0f), (-1) };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 100, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0028");
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1L), obj3, 10.0d, (short) -1, (byte) -1 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) 100, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0029");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (-1.0d), (byte) 10, '4' };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 0.0f, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0030");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) 0, 10 };
        java.lang.Class[] classArray6 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray7 = (java.lang.Class<?>[]) classArray6;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 0.0d, "", objArray4, wildcardClassArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
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
    public void MethodUtils0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0031");
        java.lang.Object[] objArray4 = new java.lang.Object[] { "", 1.0d };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 0L, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0032");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) -1, 100.0f, (short) 1, (-1.0d), (short) 0 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(obj0, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Object");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0033");
        java.lang.Object[] objArray7 = new java.lang.Object[] { "hi!", false, 1L, "hi!", 100.0d };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 1, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0034");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (byte) 1, "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0035");
        java.lang.Object[] objArray4 = new java.lang.Object[] { true, 10.0d };
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
    public void MethodUtils0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0036");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1L, true, 1.0f };
        java.lang.Class[] classArray7 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 0L, "", objArray5, wildcardClassArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Long");
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
    public void MethodUtils0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0037");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) 1, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0038");
        java.lang.Object[] objArray2 = null;
        java.lang.Class<?>[] wildcardClassArray3 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) "hi!", "", objArray2, wildcardClassArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.String");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0039");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils3 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 'a', methodUtils3, (byte) -1 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 0L, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0040");
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 1, (short) 1, wildcardClass5, (byte) 100, (-1.0f) };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 10L, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0041");
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1), (byte) 10, "hi!", (byte) 10, obj6 };
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
    public void MethodUtils0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0042");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) 100, 100 };
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
    public void MethodUtils0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0043");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Class<?>[] wildcardClassArray3 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) '#', "hi!", objArray2, wildcardClassArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0044");
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100.0d, (short) 100, 1.0d, '#', (-1), 0.0f };
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
    public void MethodUtils0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0045");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) -1, 10L };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 1L, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0046");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 10 };
        java.lang.Class[] classArray5 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray6 = (java.lang.Class<?>[]) classArray5;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 0, "hi!", objArray3, wildcardClassArray6);
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
    public void MethodUtils0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0047");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) '#', "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0048");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (byte) 10, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0049");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils6 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10.0f, 1.0f, 100, ' ', methodUtils6 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 10.0d, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0050");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0L, 'a', 10L };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 1.0f, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0051");
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1), "hi!", (short) 0, obj5 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 10L, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0052");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1, (byte) 10, 0L };
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
    public void MethodUtils0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0053");
        java.lang.Object obj0 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) -1 };
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
    public void MethodUtils0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0054");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 100L, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0055");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Class[] classArray4 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray5 = (java.lang.Class<?>[]) classArray4;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) 100, "", objArray2, wildcardClassArray5);
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
    public void MethodUtils0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0056");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 0L };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 0.0d, "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0057");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) 1, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0058");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10.0d, 10.0d, (-1.0f) };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (short) -1, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0059");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { obj2, (byte) 100, 100.0d, 10.0f, '#' };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 100L, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0060");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (-1.0d), "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0061");
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1.0d, (-1L), obj4, (byte) 0, false };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 100, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0062");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0, 'a' };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (short) 10, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0063");
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", false, (-1.0f), 0L };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (-1), "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0064");
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1.0f, 10.0d, false, 0.0f, 1L, (byte) -1 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (short) 1, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0065");
        java.lang.Object obj0 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 100, (short) 10, (short) 10, 0.0d, "" };
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
    public void MethodUtils0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0066");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 10, 10L, (-1.0f) };
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
    public void MethodUtils0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0067");
        java.lang.Object[] objArray7 = new java.lang.Object[] { true, 1L, 0, 0L, (byte) 10 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (byte) 1, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0068");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 0 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) 10, "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0069");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 1.0f, "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0070");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) methodUtils0, "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: org.apache.commons.lang3.reflect.MethodUtils");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0071");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils6 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10L, false, (short) 0, 100.0f, methodUtils6, '#' };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) -1, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0072");
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100.0d, (byte) 100, "", (byte) -1, 1.0f, (-1) };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 100.0d, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0073");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) -1, (byte) 0, (short) -1 };
        java.lang.Class[] classArray7 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (short) 10, "hi!", objArray5, (java.lang.Class<?>[]) classArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Short");
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
    public void MethodUtils0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0074");
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1.0d, obj3 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 0.0d, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0075");
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0L, 'a', 10.0f, (short) -1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) "", "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.String");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0076");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', (short) -1, 10L, 10.0d, (byte) 100 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 1.0d, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0077");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { obj2, (byte) 10, (byte) 1, 1L, ' ' };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (-1.0f), "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0078");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) -1, 1L, (byte) 100, 1.0f };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 0, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0079");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 10, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0080");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 1.0f, "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0081");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100, (byte) 10 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 0.0f, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0082");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 100L, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0083");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray5 = new java.lang.Object[] { obj2, (-1), true };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) -1, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0084");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1), (byte) 0 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 0L, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0085");
        java.lang.Object obj0 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { true };
        java.lang.Class[] classArray5 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray6 = (java.lang.Class<?>[]) classArray5;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(obj0, "", objArray3, (java.lang.Class<?>[]) classArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void MethodUtils0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0086");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) -1, true, 'a', 10L };
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
    public void MethodUtils0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0087");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) 0, "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0088");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray6 = new java.lang.Object[] { methodUtils2, 100.0d, (short) 100, 10.0d };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 0, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0089");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 'a' };
        java.lang.Class[] classArray5 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray6 = (java.lang.Class<?>[]) classArray5;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 100.0d, "", objArray3, (java.lang.Class<?>[]) classArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
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
    public void MethodUtils0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0090");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Class<?>[] wildcardClassArray3 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (-1), "hi!", objArray2, wildcardClassArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0091");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray3 = new java.lang.Object[] { methodUtils2 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 1L, "hi!", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0092");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 100, "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0093");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 0, 100.0f, ' ' };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 0.0f, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0094");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 1.0f, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0095");
        java.lang.Object[] objArray4 = new java.lang.Object[] { false, false };
        java.lang.Class[] classArray6 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray7 = (java.lang.Class<?>[]) classArray6;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) -1, "", objArray4, (java.lang.Class<?>[]) classArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
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
    public void MethodUtils0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0096");
        java.lang.Object[] objArray6 = new java.lang.Object[] { '4', (-1.0f), false, 10.0d };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 'a', "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0097");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 100, 0.0d, (byte) 10, 1L };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) wildcardClass1, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Class");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0098");
        java.lang.Object obj0 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 10, true, (-1.0f), 0.0d, 100L, 'a' };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod(obj0, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0099");
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) -1, obj3, (short) 1, 1 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 10.0f, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0100");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { false, "", obj4 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) methodUtils0, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: org.apache.commons.lang3.reflect.MethodUtils");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0101");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 10.0f };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) ' ', "hi!", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0102");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 100L, 100L, "" };
        java.lang.Class<?>[] wildcardClassArray7 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) wildcardClass1, "hi!", objArray6, wildcardClassArray7);
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
    public void MethodUtils0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0103");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 1, (byte) 10, 10L, false };
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
    public void MethodUtils0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0104");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0, (-1L), (-1.0f) };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 1, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0105");
        java.lang.Object[] objArray3 = new java.lang.Object[] { "hi!" };
        java.lang.Class[] classArray5 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray6 = (java.lang.Class<?>[]) classArray5;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (short) 0, "hi!", objArray3, (java.lang.Class<?>[]) classArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Short");
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
    public void MethodUtils0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0106");
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { "hi!", 0, obj4, (short) -1, (short) -1 };
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
    public void MethodUtils0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0107");
        java.lang.Object[] objArray5 = new java.lang.Object[] { '4', (byte) -1, 1L };
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
    public void MethodUtils0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0108");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) -1, (short) 10, ' ' };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(obj0, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Object");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0109");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 100, 0, (byte) 0, "" };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) methodUtils0, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: org.apache.commons.lang3.reflect.MethodUtils");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0110");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 10.0d, "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0111");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils6 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass7 = methodUtils6.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1), (-1L), false, ' ', methodUtils6 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (short) 100, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0112");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1, 10 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) false, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Boolean");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0113");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 100, true, 0.0d };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 10.0d, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0114");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { obj2, 10, 0.0d };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) methodUtils0, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: org.apache.commons.lang3.reflect.MethodUtils");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0115");
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 1, "", 1, '4', (short) 10, (-1) };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) ' ', "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0116");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1.0f), false };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) "hi!", "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.String");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0117");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass3 = methodUtils2.getClass();
        org.apache.commons.lang3.reflect.MethodUtils methodUtils6 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray8 = new java.lang.Object[] { methodUtils2, 10L, 'a', methodUtils6, (byte) -1 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 0.0f, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0118");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { obj2, 100.0d, 10L, obj5, 0 };
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
    public void MethodUtils0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0119");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, (short) 100, '#', "hi!" };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 'a', "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0120");
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10L, wildcardClass4 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (byte) 0, "hi!", objArray5);
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
    public void MethodUtils0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0121");
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", wildcardClass4, (short) 100 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (short) -1, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0122");
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) -1, (-1L), '#', obj5 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) 100, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0123");
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1.0d), (short) 1, 10.0d, (byte) 1, 100.0f, 0L };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 10.0d, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0124");
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 100, (short) 1, '#', (-1L), 'a', "hi!" };
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
    public void MethodUtils0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0125");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 1.0d, "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0126");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass1 = methodUtils0.getClass();
        java.lang.Object[] objArray3 = null;
        java.lang.Class[] classArray5 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray6 = (java.lang.Class<?>[]) classArray5;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) methodUtils0, "hi!", objArray3, wildcardClassArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: org.apache.commons.lang3.reflect.MethodUtils");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
    }

    @Test
    public void MethodUtils0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0127");
        java.lang.Object[] objArray3 = new java.lang.Object[] { ' ' };
        java.lang.Class[] classArray5 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray6 = (java.lang.Class<?>[]) classArray5;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (byte) 0, "hi!", objArray3, (java.lang.Class<?>[]) classArray5);
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
    public void MethodUtils0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0128");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 10.0d, "hi!" };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 0L, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0129");
        java.lang.Object obj0 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0d, "hi!", "hi!", (short) 100, (-1.0d), 10.0f };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(obj0, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0130");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Class[] classArray4 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray5 = (java.lang.Class<?>[]) classArray4;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) 10, "", objArray2, (java.lang.Class<?>[]) classArray4);
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
    public void MethodUtils0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0131");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (-1.0f), "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0132");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100L, 0.0d, "", 100.0d, 1.0f };
        java.lang.Class<?>[] wildcardClassArray8 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod(obj0, "hi!", objArray7, wildcardClassArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Object");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0133");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils4 = new org.apache.commons.lang3.reflect.MethodUtils();
        org.apache.commons.lang3.reflect.MethodUtils methodUtils5 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass6 = methodUtils5.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100, (byte) 10, methodUtils4, methodUtils5, 1L };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 10, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0134");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils6 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0d, true, true, (-1.0f), methodUtils6, (-1.0d) };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (-1L), "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0135");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) -1, ' ', 1, ' ' };
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
    public void MethodUtils0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0136");
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1L), 10.0d, "", 0L, '4', 0.0f };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) ' ', "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0137");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 0 };
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
    public void MethodUtils0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0138");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10L, 100L, 10.0f };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (-1), "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0139");
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { ' ', (short) 100, wildcardClass5, 0.0d, 10.0d };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) -1, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0140");
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0f, 10L, ' ', (-1.0d), 10.0f, 0 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) 100, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0141");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { methodUtils2, 1, 1, obj5, '4' };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (-1L), "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0142");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 0.0f, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0143");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 100.0d, "hi!", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0144");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1, (byte) 10 };
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
    public void MethodUtils0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0145");
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1L, 0.0f, 0.0f, ' ', (short) 100, 10.0d };
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
    public void MethodUtils0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0146");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10, true, 0.0d, (-1L) };
        java.lang.Class<?>[] wildcardClassArray7 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 'a', "", objArray6, wildcardClassArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0147");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 0, (byte) 10 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) '#', "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0148");
        java.lang.Object obj0 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0.0f, 10.0d, 100L };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod(obj0, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0149");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 0.0d, "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0150");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        java.lang.Class[] classArray5 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray6 = (java.lang.Class<?>[]) classArray5;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) wildcardClass1, "", objArray3, (java.lang.Class<?>[]) classArray5);
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
    public void MethodUtils0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0151");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1.0f, (byte) 100, (short) 10 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) '4', "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0152");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10L, (byte) -1, '4' };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 0.0f, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0153");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 1, 10.0f, (byte) 10, 100.0d };
        java.lang.Class<?>[] wildcardClassArray7 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) 1, "hi!", objArray6, wildcardClassArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0154");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) "", "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.String");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0155");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) "hi!", "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.String");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0156");
        java.lang.Object obj0 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod(obj0, "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0157");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1L, (-1), "hi!" };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 1.0f, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0158");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10L, "", obj5 };
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
    public void MethodUtils0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0159");
        java.lang.Object[] objArray5 = new java.lang.Object[] { "hi!", '#', (-1.0f) };
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
    public void MethodUtils0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0160");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils3 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0L, methodUtils3, 'a', (-1.0d) };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 10L, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0161");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 100.0f, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0162");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100L, (byte) 10, (short) 1 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 10, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0163");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0L, 0L, 100L };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 'a', "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0164");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 10.0d, 0.0f };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 0.0f, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0165");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 1, 0.0f, 'a' };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) ' ', "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0166");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 100L, "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0167");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) -1, 1.0d, (-1L), (short) 0 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 0L, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0168");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 100, 1.0f, "hi!", (byte) 0 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 0.0d, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0169");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod(obj0, "hi!", objArray3);
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
    public void MethodUtils0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0170");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 1 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) '#', "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0171");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 1, (byte) 1, (byte) -1 };
        java.lang.Class<?>[] wildcardClassArray6 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) 100, "hi!", objArray5, wildcardClassArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0172");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) ' ', "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0173");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass3 = methodUtils2.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { methodUtils2, (byte) 0 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 10L, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0174");
        java.lang.Object[] objArray3 = new java.lang.Object[] { '#' };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (-1.0d), "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0175");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray6 = new java.lang.Object[] { methodUtils2, 0.0d, (-1), (short) 1 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 10, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0176");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 100.0d, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0177");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Class[] classArray4 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray5 = (java.lang.Class<?>[]) classArray4;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (-1L), "hi!", objArray2, wildcardClassArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
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
    public void MethodUtils0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0178");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 'a', "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0179");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 1 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) 10, "hi!", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0180");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (short) 1, "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0181");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { methodUtils2, 100L, 100.0f, obj5, (short) 10, (byte) 1 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 1.0d, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0182");
        java.lang.Object obj0 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 'a', (-1.0d), 10L, 10 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(obj0, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0183");
        java.lang.Object[] objArray3 = new java.lang.Object[] { true };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 0.0f, "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0184");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { methodUtils2, obj3, 1.0f, 0.0f, 0.0d };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) 10, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0185");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) -1, true, 10.0d, 10L, (-1L) };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) methodUtils0, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: org.apache.commons.lang3.reflect.MethodUtils");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0186");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 0, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0187");
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '4', '#', (-1), (short) -1, (byte) 0, obj7 };
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
    public void MethodUtils0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0188");
        java.lang.Object[] objArray5 = new java.lang.Object[] { true, (short) 1, (-1) };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 100, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0189");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils3 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass4 = methodUtils3.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { "hi!", wildcardClass4, "hi!", 10L, "hi!" };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) false, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Boolean");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0190");
        java.lang.Object obj0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 10.0f, "hi!" };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod(obj0, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0191");
        java.lang.Object[] objArray4 = new java.lang.Object[] { "", 1.0f };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (-1.0f), "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0192");
        java.lang.Object obj0 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', 100.0d, 100.0d, (byte) 1, 10 };
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
    public void MethodUtils0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0193");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1.0d, "hi!", 100L };
        java.lang.Class[] classArray7 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 0.0d, "hi!", objArray5, (java.lang.Class<?>[]) classArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Double");
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
    public void MethodUtils0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0194");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 1L };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (-1.0f), "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0195");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 'a', "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0196");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 10.0f };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (byte) 100, "hi!", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0197");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0.0f, 0.0d, (-1L), 1, (byte) 100 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 10L, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0198");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Class[] classArray4 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray5 = (java.lang.Class<?>[]) classArray4;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 1L, "hi!", objArray2, (java.lang.Class<?>[]) classArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
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
    public void MethodUtils0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0199");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0L, "" };
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
    public void MethodUtils0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0200");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 'a', 0, (byte) 10, 100L };
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
    public void MethodUtils0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0201");
        java.lang.Object[] objArray5 = new java.lang.Object[] { true, 0, '#' };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 1L, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0202");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) false, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Boolean");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0203");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0.0f, (short) 10, '4', (byte) -1 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 0L, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0204");
        java.lang.Object[] objArray8 = new java.lang.Object[] { ' ', 100.0d, 100.0f, "", (short) -1, 1L };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 10.0f, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0205");
        java.lang.Object[] objArray2 = null;
        java.lang.Class<?>[] wildcardClassArray3 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 10L, "", objArray2, wildcardClassArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0206");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1L) };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 10.0d, "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0207");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 0L, "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0208");
        java.lang.Object[] objArray4 = new java.lang.Object[] { '#', '#' };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 1.0d, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0209");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100, 100 };
        java.lang.Class[] classArray6 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray7 = (java.lang.Class<?>[]) classArray6;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 1.0d, "hi!", objArray4, wildcardClassArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Double");
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
    public void MethodUtils0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0210");
        java.lang.Object[] objArray7 = new java.lang.Object[] { "", 0L, (short) -1, 0.0f, (byte) 1 };
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
    public void MethodUtils0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0211");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { wildcardClass4, 0.0f };
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
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0212");
        java.lang.Object[] objArray6 = new java.lang.Object[] { ' ', (byte) 100, (byte) 10, 0 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (-1), "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0213");
        java.lang.Object[] objArray3 = new java.lang.Object[] { ' ' };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) 100, "hi!", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0214");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { obj2, 10.0f, 10.0d, true, ' ', (short) 0 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) -1, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0215");
        java.lang.Object obj2 = new java.lang.Object();
        org.apache.commons.lang3.reflect.MethodUtils methodUtils5 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray6 = new java.lang.Object[] { obj2, (short) 10, 10L, methodUtils5 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (-1), "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0216");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 1L, "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0217");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 10.0d };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) wildcardClass1, "hi!", objArray4);
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
    public void MethodUtils0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0218");
        java.lang.Object[] objArray6 = new java.lang.Object[] { ' ', (short) -1, (byte) 100, false };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) 0, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0219");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 1, (-1.0d), (byte) 1 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) ' ', "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0220");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils3 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass4 = methodUtils3.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { ' ', methodUtils3, "" };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 0, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0221");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 1.0d, "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0222");
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1L, obj3, (byte) 100 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 0, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0223");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (-1L), "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0224");
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 1, (byte) 10, 1, 0, (short) 1 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) false, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Boolean");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0225");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Class<?>[] wildcardClassArray3 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(obj0, "hi!", objArray2, wildcardClassArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Object");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0226");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1L) };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 10L, "hi!", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0227");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 100 };
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
    public void MethodUtils0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0228");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 10, "hi!", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0229");
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1.0f), (short) 100, (short) -1, 'a', (short) 10 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 0.0f, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0230");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100, 100.0f, 1L, (short) 100, 1L };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod(obj0, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Object");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0231");
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100L, obj3 };
        java.lang.Class<?>[] wildcardClassArray5 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (short) 0, "hi!", objArray4, wildcardClassArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0232");
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) -1, 1.0f, true, (byte) 100, '#', 0.0d };
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
    public void MethodUtils0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0233");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { wildcardClass3, (short) -1, (-1.0d), (short) 100, 'a' };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 0L, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0234");
        java.lang.Object[] objArray8 = new java.lang.Object[] { "", '4', '4', 1, 100, '4' };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) -1, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0235");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 10 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 1, "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0236");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) true, "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Boolean");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0237");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1.0d, (byte) 100, 0L, (byte) 1 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) '#', "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0238");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100L, (byte) -1 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 10.0d, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0239");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Class[] classArray4 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray5 = (java.lang.Class<?>[]) classArray4;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) '4', "", objArray2, wildcardClassArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Character");
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
    public void MethodUtils0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0240");
        java.lang.Object[] objArray3 = new java.lang.Object[] { false };
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
    public void MethodUtils0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0241");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 10 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (-1), "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0242");
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0.0d, (short) -1, 100L, "", '4', (-1) };
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
    public void MethodUtils0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0243");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils5 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass6 = methodUtils5.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0L, (byte) 1, (byte) 100, methodUtils5, (short) 10 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 10, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0244");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 10.0f, "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0245");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils4 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray7 = new java.lang.Object[] { true, "", methodUtils4, (short) 10, 10.0f };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (short) 10, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0246");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(obj0, "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Object");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0247");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ' ', (-1.0f) };
        java.lang.Class[] classArray6 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray7 = (java.lang.Class<?>[]) classArray6;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) '4', "", objArray4, wildcardClassArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Character");
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
    public void MethodUtils0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0248");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Class[] classArray4 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray5 = (java.lang.Class<?>[]) classArray4;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) true, "", objArray2, (java.lang.Class<?>[]) classArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Boolean");
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
    public void MethodUtils0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0249");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 10, "hi!", (byte) 10 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 0, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0250");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) "hi!", "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.String");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0251");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (short) 100, "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0252");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils3 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass4 = methodUtils3.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10, methodUtils3, 0.0d };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 10.0d, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0253");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { obj2, 10L, (short) 1, (-1.0f) };
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
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0254");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 'a', 10.0d, 0.0d, (byte) 1 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) "", "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.String");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0255");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 10L, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0256");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (byte) 1, "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0257");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 100.0d };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 10.0d, "hi!", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0258");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 1, true };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 0L, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0259");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1.0d, '4', (byte) 0 };
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
    public void MethodUtils0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0260");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1, 10, (byte) 100, "" };
        java.lang.Class<?>[] wildcardClassArray7 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 10.0d, "hi!", objArray6, wildcardClassArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0261");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0.0f, (short) 1, "" };
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
    public void MethodUtils0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0262");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Class[] classArray4 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray5 = (java.lang.Class<?>[]) classArray4;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (-1.0f), "hi!", objArray2, (java.lang.Class<?>[]) classArray4);
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
    public void MethodUtils0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0263");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ' ', (byte) 100 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 10.0f, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0264");
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100, 10L, (byte) 1, (-1.0f), 1, "hi!" };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) "", "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.String");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0265");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils3 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 100, methodUtils3, 100L, (byte) 100, (byte) 0, obj7 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 10, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0266");
        java.lang.Object[] objArray5 = new java.lang.Object[] { ' ', "hi!", '4' };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (-1.0d), "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0267");
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0L, 10.0f, '#', 100L, 100.0d, 100.0d };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (-1), "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0268");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (-1L), "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0269");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0.0d, (short) 100 };
        java.lang.Class[] classArray6 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray7 = (java.lang.Class<?>[]) classArray6;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 10L, "hi!", objArray4, wildcardClassArray7);
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
    public void MethodUtils0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0270");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 100, 0L };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 10.0f, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0271");
        java.lang.Object obj0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { wildcardClass3, 1.0f, (byte) -1, 1.0d, 0L };
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
    public void MethodUtils0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0272");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0L, (short) 1, ' ', '4', false };
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
    public void MethodUtils0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0273");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { obj2, (short) -1, true, obj6 };
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
    public void MethodUtils0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0274");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray4 = new java.lang.Object[] { wildcardClass3 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(obj0, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Object");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0275");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d) };
        java.lang.Class[] classArray5 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray6 = (java.lang.Class<?>[]) classArray5;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 10.0f, "", objArray3, (java.lang.Class<?>[]) classArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
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
    public void MethodUtils0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0276");
        java.lang.Object[] objArray2 = null;
        java.lang.Class[] classArray4 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray5 = (java.lang.Class<?>[]) classArray4;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (-1.0f), "", objArray2, wildcardClassArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray5);
    }

    @Test
    public void MethodUtils0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0277");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { wildcardClass3, ' ' };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) 0, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0278");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) -1 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (-1.0f), "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0279");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1, false, (byte) 10, 10.0d };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 1.0d, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0280");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 1L, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0281");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) "", "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.String");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0282");
        java.lang.Object obj0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 10, 0.0f };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(obj0, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0283");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1.0f), 0.0d, 100L, 1L };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) wildcardClass1, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Class");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0284");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10.0d, 10, (short) 1 };
        java.lang.Class[] classArray7 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) 1, "hi!", objArray5, (java.lang.Class<?>[]) classArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Short");
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
    public void MethodUtils0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0285");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10L, 10L, 100L };
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
    public void MethodUtils0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0286");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1), 10.0d, (short) 100, (short) 0 };
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
    public void MethodUtils0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0287");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0, (byte) 10, 10.0d };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) "hi!", "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.String");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0288");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0.0f, 0, (-1) };
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
    public void MethodUtils0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0289");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0.0d, 100.0f, 1 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (short) 1, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0290");
        java.lang.Object[] objArray5 = new java.lang.Object[] { ' ', 1.0f, (short) 1 };
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
    public void MethodUtils0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0291");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { wildcardClass3, "", (short) 100, (-1.0f), (byte) -1 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) "hi!", "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.String");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0292");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 100.0f, (-1.0f), (short) 1, (short) -1 };
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
    public void MethodUtils0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0293");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100.0d, 0.0d, (short) 100, "hi!", "hi!" };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 1L, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0294");
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1), 1.0d, '4', 0.0f, (byte) 0, (short) 0 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (byte) 10, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0295");
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, obj3, 1.0d, (short) 1, 'a', obj7 };
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
    public void MethodUtils0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0296");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass1 = methodUtils0.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 'a', (-1L) };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) methodUtils0, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: org.apache.commons.lang3.reflect.MethodUtils");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0297");
        java.lang.Object obj0 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10, (short) 100, 0L, 0L, '#', 10.0f };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(obj0, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0298");
        java.lang.Object[] objArray6 = new java.lang.Object[] { true, (byte) 0, '4', (-1.0f) };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 10L, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0299");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils3 = new org.apache.commons.lang3.reflect.MethodUtils();
        org.apache.commons.lang3.reflect.MethodUtils methodUtils4 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1.0d), methodUtils3, methodUtils4, '4' };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 100.0f, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0300");
        java.lang.Object[] objArray3 = new java.lang.Object[] { '#' };
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
    public void MethodUtils0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0301");
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 1, (short) -1, 100.0d, 1L, (-1.0d) };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 'a', "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0302");
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1.0f), 100L, (short) -1, 0, 10 };
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
    public void MethodUtils0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0303");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) -1, 0.0d, (short) 0 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(obj0, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Object");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0304");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 1L, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0305");
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10L, 100, 1, (short) 10, true, 1.0f };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) "", "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.String");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0306");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils3 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1.0f, methodUtils3 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 100L, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0307");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils4 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) -1, 10.0d, methodUtils4, 10 };
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
    public void MethodUtils0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0308");
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 100, wildcardClass4, '4' };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (short) 100, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0309");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) 10, "hi!" };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 1L, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0310");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod(obj0, "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Object");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0311");
        java.lang.Object obj0 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod(obj0, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0312");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        org.apache.commons.lang3.reflect.MethodUtils methodUtils4 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray6 = new java.lang.Object[] { wildcardClass3, methodUtils4, "" };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) "hi!", "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.String");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0313");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) "", "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.String");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0314");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 100.0d, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0315");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0.0d, 100.0d, (byte) 0 };
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
    public void MethodUtils0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0316");
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1.0f), 'a', obj4, '#', 1L };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (short) 0, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0317");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0.0d, 10L };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) ' ', "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0318");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Class[] classArray4 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray5 = (java.lang.Class<?>[]) classArray4;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 100.0f, "hi!", objArray2, (java.lang.Class<?>[]) classArray4);
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
    public void MethodUtils0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0319");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 100, 'a', 10.0d, 10L, 1.0d };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod(obj0, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Object");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0320");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object[] objArray6 = new java.lang.Object[] { methodUtils2, 1.0f, (-1.0f), obj5 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 10.0f, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0321");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0, (short) 10, (byte) 10 };
        java.lang.Class[] classArray7 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 0, "hi!", objArray5, (java.lang.Class<?>[]) classArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Integer");
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
    public void MethodUtils0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0322");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 100, (-1L), 100.0d };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 0.0f, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0323");
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.apache.commons.lang3.reflect.MethodUtils methodUtils5 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10L, wildcardClass4, methodUtils5 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 100L, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0324");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 10, 100.0d };
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
    public void MethodUtils0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0325");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 0L };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) "hi!", "hi!", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.String");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0326");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 100, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0327");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils5 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1L, 0.0f, (short) 10, methodUtils5 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) true, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Boolean");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0328");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0.0d, 0, 'a', "" };
        java.lang.Class<?>[] wildcardClassArray7 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) "", "hi!", objArray6, wildcardClassArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.String");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0329");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray6 = new java.lang.Object[] { false, (-1.0f), 1L, 100.0d };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) methodUtils0, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: org.apache.commons.lang3.reflect.MethodUtils");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0330");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray4 = new java.lang.Object[] { wildcardClass3 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) true, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Boolean");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0331");
        java.lang.Object[] objArray7 = new java.lang.Object[] { "hi!", 100, (byte) 10, 10.0d, 1 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) "hi!", "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.String");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0332");
        java.lang.Object[] objArray4 = new java.lang.Object[] { "", 10.0d };
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
    public void MethodUtils0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0333");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1), wildcardClass5, (byte) 100 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) wildcardClass1, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Class");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0334");
        java.lang.Object obj0 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(obj0, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0335");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 0 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 10L, "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0336");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) 0, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0337");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 1 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (short) 0, "hi!", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0338");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) -1 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) '#', "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0339");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0, (-1L) };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 10.0f, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0340");
        java.lang.Object obj0 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(obj0, "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0341");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1), (short) 100, (short) 0, 1 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 0, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0342");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 100.0d, 0.0d, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) 1, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0343");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass3 = methodUtils2.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { methodUtils2, "hi!" };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (short) 10, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0344");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 'a', "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0345");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass1 = methodUtils0.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10L, 100, 10.0f, 100.0f, (-1) };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) wildcardClass1, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Class");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0346");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0.0f, 10.0f, (-1.0d), 10L, (byte) 1 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 100L, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0347");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100, (short) -1, 'a', (-1L), (short) 10 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) 0, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0348");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1.0f, (short) 1 };
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
    public void MethodUtils0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0349");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Class[] classArray4 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray5 = (java.lang.Class<?>[]) classArray4;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 'a', "", objArray2, (java.lang.Class<?>[]) classArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Character");
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
    public void MethodUtils0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0350");
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 0, wildcardClass4, (byte) 10 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (-1.0d), "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0351");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100, (short) 0, 1.0d, 10, '4' };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 1L, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0352");
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1L), 10.0f, 100.0d, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) '4', "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0353");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Class[] classArray4 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray5 = (java.lang.Class<?>[]) classArray4;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (byte) 10, "hi!", objArray2, (java.lang.Class<?>[]) classArray4);
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
    public void MethodUtils0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0354");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass3 = methodUtils2.getClass();
        java.lang.Object[] objArray4 = new java.lang.Object[] { wildcardClass3 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 0L, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0355");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 10, "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0356");
        java.lang.Object[] objArray3 = new java.lang.Object[] { "hi!" };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) true, "hi!", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Boolean");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0357");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10L, '4', 10.0d };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) 1, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0358");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) -1, (short) -1 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) 100, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0359");
        java.lang.Object obj0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { '4', 10.0f };
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
    public void MethodUtils0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0360");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (short) 0, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0361");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.reflect.MethodUtils methodUtils6 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0.0f, 0.0f, (byte) 0, (-1L), methodUtils6, (short) -1 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod(obj0, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0362");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0L, true };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 0L, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0363");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 1.0d, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0364");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10.0d, 0.0f, ' ' };
        java.lang.Class<?>[] wildcardClassArray6 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (byte) 0, "", objArray5, wildcardClassArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0365");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Class[] classArray4 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray5 = (java.lang.Class<?>[]) classArray4;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(obj0, "", objArray2, (java.lang.Class<?>[]) classArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Object");
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
    public void MethodUtils0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0366");
        java.lang.Object obj0 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d) };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(obj0, "hi!", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0367");
        java.lang.Object[] objArray8 = new java.lang.Object[] { ' ', false, 10.0f, 100L, (byte) -1, 1.0f };
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
    public void MethodUtils0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0368");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) 0, (-1.0d) };
        java.lang.Class<?>[] wildcardClassArray5 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 0.0f, "", objArray4, wildcardClassArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0369");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (byte) 10, "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0370");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) -1, (short) 1 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) '#', "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0371");
        java.lang.Object[] objArray8 = new java.lang.Object[] { 'a', (-1L), (-1L), (byte) 1, (short) 1, (short) 100 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 10.0d, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0372");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) 0, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0373");
        java.lang.Object[] objArray5 = new java.lang.Object[] { '4', (short) 0, 1 };
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
    public void MethodUtils0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0374");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1L, (short) 0, (-1.0f), 1, (byte) 0 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (-1.0f), "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0375");
        java.lang.Object[] objArray7 = new java.lang.Object[] { ' ', (short) 10, 0.0f, false, 1L };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) 1, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0376");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 0L, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0377");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (short) 10, "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0378");
        java.lang.Object[] objArray5 = new java.lang.Object[] { false, 1.0d, 0 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 10L, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0379");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (-1), (-1.0d), (-1.0f) };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) "hi!", "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.String");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0380");
        java.lang.Object obj0 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 10, 1, 1, 0, (byte) 100, 0.0f };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod(obj0, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0381");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10.0d, 100.0f, (short) 1, 1.0d, 10.0d };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (byte) 10, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0382");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object[] objArray6 = new java.lang.Object[] { obj3, (short) 1, 10.0d };
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
    public void MethodUtils0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0383");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Class[] classArray4 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray5 = (java.lang.Class<?>[]) classArray4;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) -1, "hi!", objArray2, (java.lang.Class<?>[]) classArray4);
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
    public void MethodUtils0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0384");
        java.lang.Object[] objArray3 = new java.lang.Object[] { "" };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 100.0f, "hi!", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0385");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 100.0d, 1, 10, 0.0f };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 10, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0386");
        java.lang.Object obj0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 10.0f, 100.0f };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(obj0, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0387");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils3 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1.0d), methodUtils3, 0.0d, (-1.0d), 0L, (-1) };
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
    public void MethodUtils0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0388");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 10.0d, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0389");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 1.0d };
        java.lang.Class[] classArray5 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray6 = (java.lang.Class<?>[]) classArray5;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 1L, "", objArray3, wildcardClassArray6);
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
    public void MethodUtils0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0390");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) "", "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.String");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0391");
        java.lang.Object[] objArray7 = new java.lang.Object[] { '#', 100.0d, (byte) 1, 10.0d, true };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 1.0d, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0392");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 1.0d };
        java.lang.Class<?>[] wildcardClassArray4 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 10L, "hi!", objArray3, wildcardClassArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0393");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100.0f, "", 10L };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 10, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0394");
        java.lang.Object[] objArray2 = null;
        java.lang.Class[] classArray4 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray5 = (java.lang.Class<?>[]) classArray4;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 100.0d, "hi!", objArray2, wildcardClassArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray5);
    }

    @Test
    public void MethodUtils0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0395");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray6 = new java.lang.Object[] { methodUtils2, (-1L), "", 0L };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 10.0d, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0396");
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1, 0.0f, (-1), 10L, 10.0f, '#' };
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
    public void MethodUtils0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0397");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils3 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass4 = methodUtils3.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 1, wildcardClass4, (byte) 10, (short) 100 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (short) 0, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0398");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass1 = methodUtils0.getClass();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1.0f };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) wildcardClass1, "", objArray4);
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
    public void MethodUtils0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0399");
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { '4', wildcardClass4, "", 100L };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (short) 100, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0400");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1, 0.0f };
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
    public void MethodUtils0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0401");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) '#', "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0402");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 100.0d, "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0403");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 1, 100, "hi!" };
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
    public void MethodUtils0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0404");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100.0f, 100.0d, 0.0f };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (short) 1, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0405");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 10.0f };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 10, "hi!", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0406");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) -1 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 10.0d, "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0407");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 1, 100.0f };
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
    public void MethodUtils0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0408");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (-1L), 100L, 100L };
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
    public void MethodUtils0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0409");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 0, 0, (short) -1 };
        java.lang.Class[] classArray7 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 1.0d, "", objArray5, (java.lang.Class<?>[]) classArray7);
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
    public void MethodUtils0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0410");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 0, "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0411");
        java.lang.Object obj0 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1.0d, 10.0f, 100.0d, "", obj6 };
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
    public void MethodUtils0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0412");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 1.0d, "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0413");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass3 = methodUtils2.getClass();
        java.lang.Object[] objArray4 = new java.lang.Object[] { methodUtils2 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) 100, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0414");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0, (byte) 100, (byte) 1, 10.0f };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 10L, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0415");
        java.lang.Object obj0 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { '#', wildcardClass4 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(obj0, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0416");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1) };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (-1L), "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0417");
        java.lang.Object[] objArray3 = new java.lang.Object[] { '4' };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) ' ', "hi!", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0418");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) -1, 0L, (-1L) };
        java.lang.Class[] classArray7 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 0.0d, "", objArray5, (java.lang.Class<?>[]) classArray7);
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
    public void MethodUtils0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0419");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) '4', "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0420");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 'a', (short) 10, (byte) 10 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 0.0d, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0421");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Class[] classArray4 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray5 = (java.lang.Class<?>[]) classArray4;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 1L, "", objArray2, (java.lang.Class<?>[]) classArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Long");
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
    public void MethodUtils0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0422");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass1 = methodUtils0.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { '#', (byte) 10 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) wildcardClass1, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Class");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0423");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils3 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass4 = methodUtils3.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1.0f), methodUtils3, 1.0d, (short) -1 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (byte) 10, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0424");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) false, "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Boolean");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0425");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray4 = new java.lang.Object[] { methodUtils2, (byte) 0 };
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
    public void MethodUtils0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0426");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0f) };
        java.lang.Class[] classArray5 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray6 = (java.lang.Class<?>[]) classArray5;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (-1), "", objArray3, (java.lang.Class<?>[]) classArray5);
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
    public void MethodUtils0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0427");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils5 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass6 = methodUtils5.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 0, 0.0f, 1L, methodUtils5 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) 10, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0428");
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100L, 0L, (short) 100, 0L, 10.0d, (-1) };
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
    public void MethodUtils0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0429");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 10L, ' ' };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) '#', "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0430");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) -1, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0431");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1L, (short) 0, 100.0d, 100L };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) methodUtils0, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: org.apache.commons.lang3.reflect.MethodUtils");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0432");
        java.lang.Object obj0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0, 10 };
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
    public void MethodUtils0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0433");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 1.0d };
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
    public void MethodUtils0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0434");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils7 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, ' ', 0, 0.0f, 10L, methodUtils7 };
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
    public void MethodUtils0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0435");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) false, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Boolean");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0436");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) true, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Boolean");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0437");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) 100, "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0438");
        java.lang.Object[] objArray8 = new java.lang.Object[] { true, (byte) 1, (byte) 1, (byte) 0, 10L, "" };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 10.0f, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0439");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray7 = new java.lang.Object[] { methodUtils2, 0L, true, (byte) -1, 1 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 100L, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0440");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10.0f, (byte) -1, 100.0d };
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
    public void MethodUtils0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0441");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 1.0f };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 1, "hi!", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0442");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 10, 100.0d, "" };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 1.0f, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0443");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils3 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10L, methodUtils3, 100L };
        java.lang.Class<?>[] wildcardClassArray6 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) "hi!", "hi!", objArray5, wildcardClassArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.String");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0444");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 100 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) true, "hi!", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Boolean");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0445");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray3 = new java.lang.Object[] { methodUtils2 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 10L, "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0446");
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 1, 'a', 0L, (short) 100, 10 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (short) 100, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0447");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Class[] classArray4 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray5 = (java.lang.Class<?>[]) classArray4;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 100.0f, "", objArray2, wildcardClassArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
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
    public void MethodUtils0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0448");
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { "", obj3, (short) 0, (short) -1, 10.0f, (short) 1 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) 100, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0449");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass1 = methodUtils0.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { "", ' ', 0.0d, '#' };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) methodUtils0, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: org.apache.commons.lang3.reflect.MethodUtils");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0450");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10.0f, 100, 'a', 0L };
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
    public void MethodUtils0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0451");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass3 = methodUtils2.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { methodUtils2, true };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) 0, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0452");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        java.lang.Class[] classArray5 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray6 = (java.lang.Class<?>[]) classArray5;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 1L, "hi!", objArray3, (java.lang.Class<?>[]) classArray5);
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
    public void MethodUtils0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0453");
        java.lang.Object[] objArray6 = new java.lang.Object[] { "hi!", 0.0f, 1L, (byte) 0 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) "hi!", "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.String");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0454");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 1, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0455");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1L) };
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
    public void MethodUtils0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0456");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) ' ', "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0457");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) -1, 1 };
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
    public void MethodUtils0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0458");
        java.lang.Object[] objArray6 = new java.lang.Object[] { "hi!", 1, (short) 1, 100 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) '#', "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0459");
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 10, (-1.0f), (-1L), (short) 100, 1.0f };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) "hi!", "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.String");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0460");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1.0f, 10.0f, 10.0f };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 10.0f, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0461");
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 100, "", (byte) 10, 10L, 0.0f };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 100.0d, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0462");
        java.lang.Object[] objArray8 = new java.lang.Object[] { '4', (byte) 10, (short) 0, (-1L), 1L, (byte) -1 };
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
    public void MethodUtils0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0463");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0.0d, (-1), 10.0d, 10, 10 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 1, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0464");
        java.lang.Object obj0 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10.0d, 10, (short) 0 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod(obj0, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0465");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 1, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0466");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 100.0d };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 0.0d, "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0467");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1L, (-1L), (short) 100 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 1L, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0468");
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 100, (byte) 1, (short) 1, (byte) -1, "" };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 100.0f, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0469");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils3 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0L, methodUtils3 };
        java.lang.Class[] classArray6 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray7 = (java.lang.Class<?>[]) classArray6;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 1L, "", objArray4, wildcardClassArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Long");
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
    public void MethodUtils0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0470");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) 100, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0471");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { obj3, (byte) 10, (short) -1, false };
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
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0472");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 0, 10, 100.0d };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (byte) 1, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0473");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1, 0.0d, 0.0d, 10.0d };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (-1.0d), "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0474");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10.0f, 100L, (-1.0d), 0 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 100.0d, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0475");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { obj2, 10.0d, 10L, '4', 0.0d, 1L };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) '#', "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0476");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils4 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass5 = methodUtils4.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0d, 1.0f, methodUtils4, '4', (-1.0d) };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 100.0d, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0477");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100.0d, 100, 10L };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 0.0f, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0478");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) "hi!", "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.String");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0479");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 0.0f };
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
    public void MethodUtils0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0480");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1L), (-1) };
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
    public void MethodUtils0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0481");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils4 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass5 = methodUtils4.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 100, 'a', methodUtils4 };
        java.lang.Class<?>[] wildcardClassArray7 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (byte) 1, "", objArray6, wildcardClassArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0482");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) 0, "hi!" };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 'a', "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0483");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1.0f), 1, (short) -1, 1.0f };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) 1, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0484");
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 1, 1.0d, obj4 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 10.0d, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0485");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1L) };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) 0, "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0486");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 0.0f };
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
    public void MethodUtils0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0487");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1, 0L, '4', 100.0f, 100 };
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
    public void MethodUtils0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0488");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) ' ', "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0489");
        java.lang.Object obj0 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { "", 0, '#', false, '4', (short) 0 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod(obj0, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0490");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass3 = methodUtils2.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { wildcardClass3, 'a', 'a' };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (-1.0d), "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0491");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100, 0.0f };
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
    public void MethodUtils0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0492");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) 1, "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0493");
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 0, 100.0f, (byte) 0, '#', false };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 0.0f, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0494");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils6 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray8 = new java.lang.Object[] { "", (byte) 1, 100.0f, 0L, methodUtils6, 10 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (byte) -1, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0495");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.reflect.MethodUtils methodUtils4 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass5 = methodUtils4.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10.0d, (-1.0d), wildcardClass5 };
        java.lang.Class<?>[] wildcardClassArray7 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(obj0, "", objArray6, wildcardClassArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0496");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { obj2, '4' };
        java.lang.Class<?>[] wildcardClassArray6 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 100, "hi!", objArray5, wildcardClassArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0497");
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0.0d, 'a', 100L, obj5 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) '#', "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0498");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 100, (short) 0, (short) 10 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) '#', "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0499");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 1.0f };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 10.0f, "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils0.MethodUtils0500");
        java.lang.Object obj0 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(obj0, "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }
}

