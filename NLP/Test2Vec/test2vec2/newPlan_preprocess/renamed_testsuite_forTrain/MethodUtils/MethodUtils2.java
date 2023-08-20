
package MethodUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MethodUtils2 {

    public static boolean debug = false;

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1001");
        java.lang.Object obj0 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { false, ' ', 1.0f, 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(obj0, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1002");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1 };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1003");
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100, 1.0d, "hi!", (byte) 100, (short) 100, 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 100.0d, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1004");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10.0f, 0L, (-1L) };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1005");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 0.0f, "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1006");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils3 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100.0d, methodUtils3, 100.0d };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1007");
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', 10.0f, 100L, 0.0d, (-1L), 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) 0, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1008");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100.0f, (-1.0f), 0, 10.0f, ' ' };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1009");
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1.0d, (short) -1, "hi!", obj5, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 100L, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1010");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 100.0f, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1011");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 0.0d, "hi!", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1012");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 1, "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1013");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) '4', "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1014");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) -1, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) 100, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1015");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils4 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass5 = methodUtils4.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 1, (short) 1, methodUtils4, (byte) -1, 100L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) '#', "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1016");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 10.0f, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1017");
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1, 0, 0.0f, 1, (short) 100, false };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) 1, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1018");
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1L), (-1L), 100.0d, (byte) 1, 100.0d };
        java.lang.Class<?>[] wildcardClassArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 'a', "", objArray7, wildcardClassArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1019");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils3 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0, methodUtils3, 1L };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1020");
        java.lang.Object obj0 = null;
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod(obj0, "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1021");
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100.0f, 1.0f, obj4, 0L, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (-1.0d), "", objArray8);
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1022");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { obj2, 100, (-1), 1.0d, 10, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 100.0f, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1023");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object[] objArray4 = new java.lang.Object[] { true, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod(obj0, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Object");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1024");
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0d, 0.0d, 100.0d, (-1L), 1.0d, (short) 10 };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1025");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 100 };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1026");
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 1, (-1.0d), 'a', (-1), 0L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (-1L), "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1027");
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1.0f, (short) 1, (-1.0d), (-1L), 1.0f, "" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 1, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1028");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) -1, false };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 0L, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1029");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) 100, "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1030");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 100, (byte) 1, (byte) 1, (short) 10 };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1031");
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 1, obj3, "hi!", 0.0f, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) "", "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.String");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1032");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) wildcardClass1, "hi!", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Class");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1033");
        java.lang.Object obj0 = null;
        java.lang.Object[] objArray2 = null;
        java.lang.Class<?>[] wildcardClassArray3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod(obj0, "hi!", objArray2, wildcardClassArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1034");
        java.lang.Object[] objArray4 = new java.lang.Object[] { false, false };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1035");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray6 = new java.lang.Object[] { obj2, ' ', 100.0f, '4' };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1036");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, '4', (-1L), true };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (byte) 100, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1037");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 100, (byte) 0, 100.0f, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) true, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Boolean");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1038");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { "hi!", 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) wildcardClass1, "hi!", objArray5);
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1039");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 1, "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1040");
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100.0d, 100, "", (byte) 10, 10, ' ' };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1041");
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, (short) 0, (byte) 1, (short) 10, '#', (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 'a', "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1042");
        java.lang.Object[] objArray6 = new java.lang.Object[] { '4', 0L, (short) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 100L, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1043");
        java.lang.Object[] objArray8 = new java.lang.Object[] { true, 0, (short) 1, true, '4', 0.0d };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1044");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0.0f, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (short) 100, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1045");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.apache.commons.lang3.reflect.MethodUtils methodUtils6 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray7 = new java.lang.Object[] { methodUtils2, obj3, 1L, methodUtils6 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) 100, "hi!", objArray7);
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1046");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 1L, "hi!", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1047");
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1L), (-1.0f), 10, (-1.0f), (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 1.0f, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1048");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1049");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 0L, "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1050");
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 100L, true, obj4 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (byte) 100, "", objArray6);
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1051");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1L), (-1.0d), ' ', (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) methodUtils0, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: org.apache.commons.lang3.reflect.MethodUtils");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1052");
        java.lang.Object[] objArray8 = new java.lang.Object[] { "hi!", 10.0d, (short) 100, (short) -1, '4', (short) 0 };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1053");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass3 = methodUtils2.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { wildcardClass3, (-1.0f), (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) ' ', "", objArray6);
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1054");
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        org.apache.commons.lang3.reflect.MethodUtils methodUtils6 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) -1, 0.0d, wildcardClass5, methodUtils6 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (-1.0f), "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1055");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils7 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100.0f, 1.0d, (byte) 10, (byte) 100, 10.0f, methodUtils7 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 100.0d, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1056");
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0L, (byte) 10, 1.0f, obj5, 1.0d };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1057");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100.0d, 100.0f, 1, 1.0f, 0.0f };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1058");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 0, (-1.0f), 'a' };
        java.lang.Class[] classArray7 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 0.0f, "hi!", objArray5, (java.lang.Class<?>[]) classArray7);
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1059");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0L, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (byte) 1, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1060");
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 1, (-1), 100.0d, (-1L), ' ' };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1061");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils4 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 10, 100.0d, methodUtils4, (short) 1, 10L, 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) true, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Boolean");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1062");
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1, '4', 1, ' ', (-1L), obj7 };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1063");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils4 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass5 = methodUtils4.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100, false, wildcardClass5, "" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 0L, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1064");
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0.0d, 1, "hi!", '4', (short) 100, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 100, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1065");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils3 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1.0d), methodUtils3 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (short) -1, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1066");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray3 = new java.lang.Object[] { obj2 };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1067");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray4 = new java.lang.Object[] { obj2 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (short) 10, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1068");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) 10, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1069");
        java.lang.Object[] objArray8 = new java.lang.Object[] { "", (short) -1, (short) 0, (byte) 1, '#', (-1.0f) };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1070");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { obj2, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 1.0f, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1071");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray5 = new java.lang.Object[] { true, ' ', 10.0f };
        java.lang.Class[] classArray7 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) methodUtils0, "", objArray5, (java.lang.Class<?>[]) classArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: org.apache.commons.lang3.reflect.MethodUtils");
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1072");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1.0d), "", (-1.0f), "" };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1073");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (short) 10, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1074");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 1L, "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1075");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 10, (-1L) };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1076");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1L, (byte) 100, 100, 1L, 10L };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1077");
        java.lang.Object[] objArray5 = new java.lang.Object[] { '4', (byte) 100, 10.0f };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1078");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (short) 0, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1079");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1.0f), 100.0d };
        java.lang.Class[] classArray6 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray7 = (java.lang.Class<?>[]) classArray6;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 100L, "hi!", objArray4, (java.lang.Class<?>[]) classArray6);
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1080");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils3 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass4 = methodUtils3.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1L, wildcardClass4 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) 10, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1081");
        java.lang.Object[] objArray4 = new java.lang.Object[] { true, (-1L) };
        java.lang.Class[] classArray6 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray7 = (java.lang.Class<?>[]) classArray6;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 1.0f, "", objArray4, wildcardClassArray7);
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1082");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Class[] classArray4 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray5 = (java.lang.Class<?>[]) classArray4;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) 0, "", objArray2, wildcardClassArray5);
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1083");
        java.lang.Object[] objArray3 = new java.lang.Object[] { false };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 1, "hi!", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1084");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0L, 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (short) -1, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1085");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils4 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1L, 100.0d, methodUtils4 };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1086");
        java.lang.Object obj0 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(obj0, "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1087");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 0, (byte) 100, "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) 0, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1088");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.apache.commons.lang3.reflect.MethodUtils methodUtils4 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 10, methodUtils4 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) wildcardClass1, "hi!", objArray5);
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1089");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object[] objArray3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) wildcardClass1, "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Class");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1090");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { obj2, wildcardClass5 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 100, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1091");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 10.0d, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1092");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Class[] classArray4 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray5 = (java.lang.Class<?>[]) classArray4;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) 0, "", objArray2, wildcardClassArray5);
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1093");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0.0d, 100.0d };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1094");
        java.lang.Object[] objArray6 = new java.lang.Object[] { true, 10.0d, (-1.0d), (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 1.0f, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1095");
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { false, '#', 1, obj5, 10.0d, '4' };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1096");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass1 = methodUtils0.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10.0f, 1.0d, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) methodUtils0, "hi!", objArray6);
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1097");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray3 = new java.lang.Object[] { 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) methodUtils0, "hi!", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: org.apache.commons.lang3.reflect.MethodUtils");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1098");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100.0f, '#', 100.0f };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1099");
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0L, (byte) 0, 10.0d, "", 100.0d, (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (short) 10, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1100");
        java.lang.Object obj2 = new java.lang.Object();
        org.apache.commons.lang3.reflect.MethodUtils methodUtils4 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray7 = new java.lang.Object[] { obj2, (short) 1, methodUtils4, '#', 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (short) 10, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1101");
        java.lang.Object[] objArray4 = new java.lang.Object[] { true, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) -1, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1102");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0f) };
        java.lang.Class[] classArray5 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray6 = (java.lang.Class<?>[]) classArray5;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (byte) 1, "", objArray3, (java.lang.Class<?>[]) classArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1103");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10, "hi!", (short) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 0, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1104");
        java.lang.Object obj0 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 1, 100L, (short) 0, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod(obj0, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1105");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1.0f), 100.0d };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1106");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0.0f, 0.0f };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1107");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass3 = methodUtils2.getClass();
        java.lang.Object[] objArray4 = new java.lang.Object[] { wildcardClass3 };
        java.lang.Class[] classArray6 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray7 = (java.lang.Class<?>[]) classArray6;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 1L, "", objArray4, wildcardClassArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Long");
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1108");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (-1.0f), "", (short) 100 };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1109");
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 100, 0L, false, 1, 100L, "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) '4', "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1110");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ' ', 1L };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1111");
        java.lang.Object[] objArray7 = new java.lang.Object[] { false, '#', 10.0d, ' ', 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (byte) 0, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1112");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils3 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (-1.0d), methodUtils3, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (-1L), "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1113");
        java.lang.Object obj0 = new java.lang.Object();
        org.apache.commons.lang3.reflect.MethodUtils methodUtils4 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1, ' ', methodUtils4, 'a' };
        java.lang.Class<?>[] wildcardClassArray7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(obj0, "hi!", objArray6, wildcardClassArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Object");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1114");
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 10, 1.0d, (-1L), 1.0d, 100.0f, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) true, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Boolean");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1115");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 1, false, 0L, (-1.0d), 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) methodUtils0, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: org.apache.commons.lang3.reflect.MethodUtils");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1116");
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { '#', (byte) 0, 100L, 100L, obj6 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (byte) 1, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1117");
        java.lang.Object[] objArray8 = new java.lang.Object[] { 'a', "", 10, (byte) 10, (-1L), 1.0f };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1118");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils6 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100.0f, false, '4', 10.0f, methodUtils6, obj7 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (byte) 10, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1119");
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0L, ' ', (byte) 0, obj5 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) 10, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1120");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 10L, (short) -1 };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1121");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100L, false };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1122");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 100, '#', 100L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) "hi!", "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.String");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1123");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 1L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 1L, "hi!", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1124");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (-1L), "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1125");
        java.lang.Object obj3 = new java.lang.Object();
        org.apache.commons.lang3.reflect.MethodUtils methodUtils5 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray7 = new java.lang.Object[] { true, obj3, 0.0f, methodUtils5, 100 };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1126");
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 1, 0, 1.0f, ' ', 1L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (-1), "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1127");
        java.lang.Object[] objArray5 = new java.lang.Object[] { ' ', '4', 1L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 100.0f, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1128");
        java.lang.Object[] objArray7 = new java.lang.Object[] { "hi!", "hi!", 100, 'a', (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 0.0d, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1129");
        java.lang.Object[] objArray6 = new java.lang.Object[] { false, 100.0f, (-1), 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (short) 10, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1130");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (-1.0d), "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1131");
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1.0f), (byte) 100, (byte) 0, 100.0d, (short) 1, 1L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) true, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Boolean");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1132");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils3 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, methodUtils3, (-1), 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) 1, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1133");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 100L, "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1134");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) -1, "hi!", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1135");
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10, "hi!", 1L, wildcardClass6, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 1.0d, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1136");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils3 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', methodUtils3, 10.0d, (short) 100, "" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) "", "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.String");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1137");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 'a', "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1138");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray4 = new java.lang.Object[] { obj2, (short) 0 };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1139");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0.0f, (short) 1, 10, ' ', 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 10L, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1140");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (short) 100, "hi!", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1141");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray6 = new java.lang.Object[] { methodUtils2, true, false, 10.0f };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1142");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) 1, "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1143");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 0L, "hi!", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1144");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1.0f), 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (byte) 1, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1145");
        java.lang.Object obj0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { true, (short) -1 };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1146");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray8 = new java.lang.Object[] { methodUtils2, (short) 0, (-1L), (byte) 0, 0.0f, 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 0.0d, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1147");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray4 = new java.lang.Object[] { methodUtils2, (short) 100 };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1148");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray4 = new java.lang.Object[] { methodUtils2, "" };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1149");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { wildcardClass3, 100L, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 100L, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1150");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 10, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (byte) 1, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1151");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass1 = methodUtils0.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10, 100.0d, (-1.0f), '#' };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1152");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) -1, "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1153");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (-1L), "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1154");
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0.0d, wildcardClass4 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 10L, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1155");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 0, 10L, 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 0L, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1156");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray4 = new java.lang.Object[] { methodUtils2, (byte) 1 };
        java.lang.Class[] classArray6 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray7 = (java.lang.Class<?>[]) classArray6;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) "hi!", "", objArray4, (java.lang.Class<?>[]) classArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.String");
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1157");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass3 = methodUtils2.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { methodUtils2, (-1L), '4', 10.0d, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) "", "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.String");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1158");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) -1, "", (-1), 1L };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1159");
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, obj3, 100L, (byte) 10 };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1160");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        org.apache.commons.lang3.reflect.MethodUtils methodUtils3 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass4 = methodUtils3.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { methodUtils2, wildcardClass4 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) -1, "", objArray5);
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1161");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) '4', "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1162");
        java.lang.Object[] objArray8 = new java.lang.Object[] { '4', 1, 100, '4', 10, 0.0d };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1163");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1.0d), (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 0.0d, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1164");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 10L, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1165");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1, 10.0f, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (short) 10, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1166");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0.0d, 0.0d, (short) 100 };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1167");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Class<?>[] wildcardClassArray3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (-1.0f), "", objArray2, wildcardClassArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1168");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 0.0f, "hi!", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1169");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 0, "hi!", 100L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) "", "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.String");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1170");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 100, 100L, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 0L, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1171");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1) };
        java.lang.Class[] classArray5 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray6 = (java.lang.Class<?>[]) classArray5;
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1172");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object[] objArray3 = new java.lang.Object[] { 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod(obj0, "hi!", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Object");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1173");
        java.lang.Object[] objArray5 = new java.lang.Object[] { "", true, "hi!" };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1174");
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1), 10.0f, ' ', (byte) 10, 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 100L, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1175");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 10.0d, "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1176");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils4 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1), 1.0f, methodUtils4, 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1177");
        java.lang.Object[] objArray5 = new java.lang.Object[] { '#', true, (short) -1 };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1178");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 10L, (short) 0 };
        java.lang.Class<?>[] wildcardClassArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) 1, "hi!", objArray4, wildcardClassArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1179");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass1 = methodUtils0.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100.0d, (byte) -1 };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1180");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) -1, 10, (byte) 100, 0L };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1181");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { methodUtils2, 1, false, 0L, wildcardClass7 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 1L, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1182");
        java.lang.Object[] objArray5 = new java.lang.Object[] { "", "hi!", (byte) 10 };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1183");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0.0d, (-1.0f), 100L, (-1), 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (byte) 100, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1184");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass3 = methodUtils2.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { wildcardClass3, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) false, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Boolean");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1185");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) 10, "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1186");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 100 };
        java.lang.Class<?>[] wildcardClassArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) false, "", objArray3, wildcardClassArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Boolean");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1187");
        java.lang.Object obj0 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1, (short) 0, 1.0f };
        java.lang.Class[] classArray7 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(obj0, "", objArray5, (java.lang.Class<?>[]) classArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1188");
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) -1, (byte) 1, 10, '#', "" };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1189");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0f) };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1190");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0.0d, 10.0f, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) true, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Boolean");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1191");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100.0f, (byte) 10 };
        java.lang.Class[] classArray6 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray7 = (java.lang.Class<?>[]) classArray6;
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1192");
        java.lang.Object obj0 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 100.0f, 0.0f, 0.0d, (-1.0d) };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1193");
        java.lang.Object[] objArray3 = new java.lang.Object[] { ' ' };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1194");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 1L };
        java.lang.Class[] classArray5 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray6 = (java.lang.Class<?>[]) classArray5;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (short) 10, "", objArray3, wildcardClassArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Short");
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1195");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 100, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (-1), "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1196");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { obj2, (-1.0d), (short) 0, '4', 100L };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1197");
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) -1, 100, "", "", (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (byte) 100, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1198");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1.0d, (byte) 10, true, 100, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 1.0d, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1199");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray3 = new java.lang.Object[] { '4' };
        java.lang.Class[] classArray5 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray6 = (java.lang.Class<?>[]) classArray5;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) methodUtils0, "hi!", objArray3, (java.lang.Class<?>[]) classArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: org.apache.commons.lang3.reflect.MethodUtils");
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1200");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0.0f, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (short) 100, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1201");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) methodUtils0, "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: org.apache.commons.lang3.reflect.MethodUtils");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1202");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 'a', (byte) 10, false };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) 1, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1203");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1204");
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1L, true, 0, (-1.0f), (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (byte) 0, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1205");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (-1.0d), "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1206");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 10L };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1207");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) '#', "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1208");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1.0f), 10, "", 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 0.0f, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1209");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray4 = new java.lang.Object[] { obj2 };
        java.lang.Class[] classArray6 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray7 = (java.lang.Class<?>[]) classArray6;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) "hi!", "", objArray4, (java.lang.Class<?>[]) classArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.String");
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1210");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 100.0f };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1211");
        java.lang.Object[] objArray6 = new java.lang.Object[] { ' ', ' ', false, 1.0d };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1212");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 10L, 0L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) "hi!", "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.String");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1213");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Class[] classArray4 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray5 = (java.lang.Class<?>[]) classArray4;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) ' ', "", objArray2, wildcardClassArray5);
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1214");
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "hi!", obj3, 100, true };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1215");
        java.lang.Object obj0 = null;
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1L), '#', (byte) 100, (short) -1, 100.0d, obj7 };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1216");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Class<?>[] wildcardClassArray3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 100.0d, "hi!", objArray2, wildcardClassArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1217");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass1 = methodUtils0.getClass();
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) methodUtils0, "hi!", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: org.apache.commons.lang3.reflect.MethodUtils");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1218");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Class[] classArray4 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray5 = (java.lang.Class<?>[]) classArray4;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) methodUtils0, "hi!", objArray2, (java.lang.Class<?>[]) classArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: org.apache.commons.lang3.reflect.MethodUtils");
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1219");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1L), (-1L) };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1220");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray6 = new java.lang.Object[] { methodUtils2, 0L, 10.0f, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (short) 100, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1221");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 1, (short) 10, (byte) 10, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 1, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1222");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) methodUtils0, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: org.apache.commons.lang3.reflect.MethodUtils");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1223");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray6 = new java.lang.Object[] { obj2, 100.0d, 10L, 10.0d };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1224");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 10.0d, "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1225");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Class<?>[] wildcardClassArray3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 10.0d, "hi!", objArray2, wildcardClassArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1226");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Class[] classArray4 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray5 = (java.lang.Class<?>[]) classArray4;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) 10, "hi!", objArray2, wildcardClassArray5);
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1227");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (byte) 0, "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1228");
        java.lang.Object obj0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100L, 0.0f };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1229");
        java.lang.Object[] objArray5 = new java.lang.Object[] { "", 10.0d, 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (-1.0d), "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1230");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0, 0, 0, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (short) 100, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1231");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass3 = methodUtils2.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { wildcardClass3, 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) 10, "", objArray5);
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1232");
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 1, 100L, 10L, 10.0f, "" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) "hi!", "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.String");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1233");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, 100.0f, 1.0f };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1234");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { wildcardClass3, true, true };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(obj0, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Object");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1235");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.reflect.MethodUtils methodUtils5 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass6 = methodUtils5.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0.0f, (-1), (byte) 1, methodUtils5, 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(obj0, "hi!", objArray8);
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1236");
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 100, 0.0d, (byte) 0, (byte) 1, 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 100.0f, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1237");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass3 = methodUtils2.getClass();
        java.lang.Object[] objArray4 = new java.lang.Object[] { methodUtils2 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 100, "hi!", objArray4);
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1238");
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1.0d), 100.0d, (short) 100, (-1L), '4', 0.0d };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1239");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) "", "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.String");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1240");
        java.lang.Object[] objArray8 = new java.lang.Object[] { true, (-1.0d), (short) -1, 100.0f, 1L, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 1, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1241");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 100, "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1242");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (-1.0d), "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1243");
        java.lang.Object[] objArray4 = new java.lang.Object[] { "", 100L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 10.0d, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1244");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 1L };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1245");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0L, (short) 10, 1L, 0 };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1246");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100L, (short) 1, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) 0, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1247");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10L, 0, 1, 1L, (byte) 0 };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1248");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { obj3 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod(obj0, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Object");
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1249");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { "hi!", (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod(obj0, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Object");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1250");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils3 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 1, methodUtils3, (byte) 0, 10.0f, wildcardClass7 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (-1.0f), "", objArray8);
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1251");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 10, 10L, 100L };
        java.lang.Class[] classArray7 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) 1, "", objArray5, wildcardClassArray8);
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1252");
        java.lang.Object obj0 = null;
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(obj0, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1253");
        java.lang.Object[] objArray4 = new java.lang.Object[] { "hi!", (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) 100, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1254");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100.0d, 10.0d, '#' };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1255");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) -1 };
        java.lang.Class[] classArray5 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray6 = (java.lang.Class<?>[]) classArray5;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 1.0f, "hi!", objArray3, (java.lang.Class<?>[]) classArray5);
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1256");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 100.0f, "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1257");
        java.lang.Object[] objArray6 = new java.lang.Object[] { false, (short) 1, 10L, 10L };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1258");
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object[] objArray6 = new java.lang.Object[] { true, 10.0d, 10.0f, obj5 };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1259");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100L, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) "hi!", "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.String");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1260");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 10, 0L, 1.0d, 100 };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1261");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10L, false, (byte) 1, false, "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) 1, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1262");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 100.0f, "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1263");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0.0d, 100.0f, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 1L, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1264");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (byte) -1, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1265");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 0L, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1266");
        java.lang.Object[] objArray5 = new java.lang.Object[] { false, '4', 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) true, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Boolean");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1267");
        java.lang.Object[] objArray4 = new java.lang.Object[] { "hi!", 100.0d };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1268");
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 10, 10.0f, 1.0d, (-1), (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (byte) 1, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1269");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray5 = new java.lang.Object[] { obj2, (-1), (-1.0d) };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1270");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1, (short) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) true, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Boolean");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1271");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 1.0f, "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1272");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 100L, "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1273");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 1.0f, "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1274");
        java.lang.Object[] objArray7 = new java.lang.Object[] { "hi!", 10, 1, 100.0f, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) "hi!", "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.String");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1275");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10, 100, "", 100L, "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) '#', "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1276");
        java.lang.Object[] objArray6 = new java.lang.Object[] { false, '#', (byte) 100, 1 };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1277");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { obj2, (short) 0, 10, false, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 100L, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1278");
        java.lang.Object[] objArray6 = new java.lang.Object[] { true, (-1.0d), (-1), (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) true, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Boolean");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1279");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 0, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) 1, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1280");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0L, (-1.0d), (short) 10, 0.0f, 'a' };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1281");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) -1, "hi!" };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1282");
        java.lang.Object[] objArray3 = new java.lang.Object[] { ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (byte) 100, "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1283");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 1.0d };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1284");
        java.lang.Object[] objArray4 = new java.lang.Object[] { true, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (short) 1, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1285");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 10.0f, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1286");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils4 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass5 = methodUtils4.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 'a', (short) 0, wildcardClass5 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 10.0f, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1287");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1.0f, (short) 10, 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) 10, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1288");
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1.0f), (short) 0, 10.0d, (short) 0, (short) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) '#', "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1289");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (byte) 0, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1290");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass3 = methodUtils2.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { methodUtils2, '4', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 100L, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1291");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0, false, (byte) 1, (short) 0, true, 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) methodUtils0, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: org.apache.commons.lang3.reflect.MethodUtils");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1292");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Class[] classArray4 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray5 = (java.lang.Class<?>[]) classArray4;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (byte) 0, "hi!", objArray2, wildcardClassArray5);
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1293");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 100, 100 };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1294");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { obj2, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 1.0f, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1295");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 100, (short) 10, '4', (byte) 10 };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1296");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0.0f, 100L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (-1.0f), "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1297");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 10.0d, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1298");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 0, 0.0f };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1299");
        java.lang.Object[] objArray7 = new java.lang.Object[] { ' ', false, ' ', (byte) 0, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (-1.0f), "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1300");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray3 = new java.lang.Object[] { obj2 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 10.0d, "hi!", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1301");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 1, (-1.0f) };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1302");
        java.lang.Object obj0 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 'a', 10L, 10L, 1.0f, (-1), false };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1303");
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0L, '#', 100L, 0L, "hi!", (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 0.0f, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1304");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1), true };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) methodUtils0, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: org.apache.commons.lang3.reflect.MethodUtils");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1305");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) "", "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.String");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1306");
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 'a', (short) 100, 0.0f, 'a', (byte) 1 };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1307");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10L, (byte) -1, "", 1.0d };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1308");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 1L, "hi!", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1309");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils4 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1.0f, "", methodUtils4, (byte) -1, 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 10, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1310");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils3 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 10, methodUtils3, 10L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) 0, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1311");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1312");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1.0d, 'a', (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) 100, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1313");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 1, "", 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) '#', "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1314");
        java.lang.Object[] objArray7 = new java.lang.Object[] { '4', 1.0f, 10L, (short) 1, 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) true, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Boolean");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1315");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 1, (short) -1, (-1L), 100L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) -1, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1316");
        java.lang.Object[] objArray5 = new java.lang.Object[] { false, 1.0f, 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) 0, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1317");
        java.lang.Object[] objArray6 = new java.lang.Object[] { true, (short) 100, (short) 1, 'a' };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1318");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils4 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass5 = methodUtils4.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { '4', (byte) -1, wildcardClass5, 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) 10, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1319");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { true, 100.0f, 100.0f, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod(obj0, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Object");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1320");
        java.lang.Object[] objArray3 = new java.lang.Object[] { '4' };
        java.lang.Class[] classArray5 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray6 = (java.lang.Class<?>[]) classArray5;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 100, "hi!", objArray3, (java.lang.Class<?>[]) classArray5);
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1321");
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 100, (-1.0f), 0.0f, (byte) 10, 10L };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1322");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1), (short) 100, ' ', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (short) -1, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1323");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 10 };
        java.lang.Class[] classArray5 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray6 = (java.lang.Class<?>[]) classArray5;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) 100, "", objArray3, wildcardClassArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1324");
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1.0d, 0L, (short) 1, 10.0f, 'a', true };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 0.0f, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1325");
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 100.0d, (byte) 1, 0.0d };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1326");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils4 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass5 = methodUtils4.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1L), (short) 100, methodUtils4 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 100.0f, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1327");
        java.lang.Object[] objArray7 = new java.lang.Object[] { "", (byte) -1, 100L, 1.0f, 0 };
        java.lang.Class<?>[] wildcardClassArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) -1, "hi!", objArray7, wildcardClassArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1328");
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 1, (byte) 10, (-1.0f), 10.0d, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 10.0f, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1329");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass3 = methodUtils2.getClass();
        java.lang.Object[] objArray4 = new java.lang.Object[] { wildcardClass3 };
        java.lang.Class<?>[] wildcardClassArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (-1.0f), "hi!", objArray4, wildcardClassArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1330");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0, (byte) 0, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) "hi!", "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.String");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1331");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 0, (short) 0 };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1332");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 0.0f };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1333");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 1.0d, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1334");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) -1, "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1335");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1.0d), (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 100.0d, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1336");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1.0d, false };
        java.lang.Class<?>[] wildcardClassArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (short) 0, "", objArray4, wildcardClassArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1337");
        java.lang.Object[] objArray8 = new java.lang.Object[] { 'a', (byte) -1, (byte) 100, true, 10, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 10.0f, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1338");
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1L), (short) 1, false, (-1.0f), 10, 0L };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1339");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils4 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1, (-1.0f), methodUtils4 };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1340");
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1.0d, 1.0d, '#', 0L, obj6, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 0.0d, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1341");
        java.lang.Object[] objArray4 = new java.lang.Object[] { "hi!", (short) 10 };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1342");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1), 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 1.0f, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1343");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) -1, 'a', (short) 100, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) 100, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1344");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { obj2, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) methodUtils0, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: org.apache.commons.lang3.reflect.MethodUtils");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1345");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils5 = new org.apache.commons.lang3.reflect.MethodUtils();
        org.apache.commons.lang3.reflect.MethodUtils methodUtils6 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) -1, (short) 10, (byte) 1, methodUtils5, methodUtils6 };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1346");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1.0d, 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) '4', "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1347");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Class[] classArray4 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray5 = (java.lang.Class<?>[]) classArray4;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 10.0d, "hi!", objArray2, (java.lang.Class<?>[]) classArray4);
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1348");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1L), (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) ' ', "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1349");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray5 = new java.lang.Object[] { obj2, '#', 10L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) 10, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1350");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1L, (byte) 10, true, (short) -1 };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1351");
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 1, obj3, 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 0L, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1352");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1, 10, true, true, 100 };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1353");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1L, 10.0d, 'a', "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (-1.0f), "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1354");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { obj2, (-1), 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 0L, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1355");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray8 = new java.lang.Object[] { methodUtils2, '#', (short) -1, 10L, 0.0f, (-1.0f) };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1356");
        java.lang.Object[] objArray4 = new java.lang.Object[] { "", 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) 100, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1357");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Class<?>[] wildcardClassArray3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 10L, "", objArray2, wildcardClassArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1358");
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { "", 1.0d, obj4, (short) 100, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (short) 1, "", objArray8);
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1359");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (-1.0d), 1.0f, 10L };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1360");
        java.lang.Object obj0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) -1, 0 };
        java.lang.Class[] classArray6 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray7 = (java.lang.Class<?>[]) classArray6;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(obj0, "", objArray4, wildcardClassArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1361");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) 0, (short) -1 };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1362");
        java.lang.Object[] objArray6 = new java.lang.Object[] { true, 0.0d, 10, false };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 10L, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1363");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { "", (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod(obj0, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Object");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1364");
        java.lang.Object[] objArray4 = new java.lang.Object[] { '#', (byte) 0 };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1365");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1L, obj3, false, (byte) 0, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(obj0, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Object");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1366");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) "hi!", "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.String");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1367");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1.0f), 100.0f, 0L, (byte) -1 };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1368");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, 0L, "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (byte) -1, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1369");
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 10, 1L, "", 1.0d, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) '#', "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1370");
        java.lang.Object[] objArray5 = new java.lang.Object[] { ' ', "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) "", "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.String");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1371");
        java.lang.Object[] objArray4 = new java.lang.Object[] { "hi!", true };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1372");
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1.0f), 1, 1.0d, wildcardClass6 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 'a', "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1373");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass1 = methodUtils0.getClass();
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) wildcardClass1, "hi!", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Class");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1374");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) -1 };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1375");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) '4', "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1376");
        java.lang.Object[] objArray5 = new java.lang.Object[] { "hi!", (-1L), (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) 10, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1377");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) 10, (short) 1 };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1378");
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 1, 10L, (short) 0, 100, true };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1379");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 10, 100.0f, (short) 100 };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1380");
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 0, 'a', (byte) 100, (short) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1381");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0.0f, false, 100L, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 0.0f, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1382");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 0L, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1383");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0L, false };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (-1.0d), "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1384");
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 0.0d, 100, 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 1.0f, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1385");
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 0, 100.0d, 100.0d, (short) 1, false };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 10.0f, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1386");
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 0L, (-1.0f), 0 };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1387");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) '4', "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1388");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10.0f, (byte) 1, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (-1.0f), "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1389");
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { false, wildcardClass4, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (-1.0f), "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1390");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object obj4 = new java.lang.Object();
        org.apache.commons.lang3.reflect.MethodUtils methodUtils5 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray8 = new java.lang.Object[] { methodUtils2, 10.0f, obj4, methodUtils5, (short) 10, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) 0, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1391");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1, 100L, true };
        java.lang.Class[] classArray7 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (short) 0, "", objArray5, (java.lang.Class<?>[]) classArray7);
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1392");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass3 = methodUtils2.getClass();
        org.apache.commons.lang3.reflect.MethodUtils methodUtils4 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass5 = methodUtils4.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { wildcardClass3, methodUtils4, 10L, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) methodUtils0, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: org.apache.commons.lang3.reflect.MethodUtils");
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1393");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass1 = methodUtils0.getClass();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { obj3, 'a', (-1L), (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) wildcardClass1, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Class");
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1394");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100.0f, 10L, ' ' };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1395");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 100L, 0.0d, ' ', 0L };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1396");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 0, false, 10 };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1397");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) "hi!", "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.String");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1398");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1.0d, 10.0f };
        java.lang.Class<?>[] wildcardClassArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (short) 100, "", objArray4, wildcardClassArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1399");
        java.lang.Object[] objArray3 = new java.lang.Object[] { "" };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1400");
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1), true, '4', (short) 10, 1.0d, (-1) };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1401");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1.0d, 1.0d, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 10L, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1402");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1403");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 100.0d };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1404");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 1, 100L, (byte) 0, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) 1, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1405");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 'a', 10L, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 0L, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1406");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ' ', (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 10, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1407");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 'a', "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1408");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) -1, 0.0d, (-1L) };
        java.lang.Class[] classArray7 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 1.0f, "hi!", objArray5, (java.lang.Class<?>[]) classArray7);
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1409");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 0, "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1410");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils4 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass5 = methodUtils4.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { "", 1.0f, wildcardClass5, "" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 10L, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1411");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0.0f, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 1.0d, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1412");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1.0f, "" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 100.0f, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1413");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 10.0d, (short) 10 };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1414");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) false, "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Boolean");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1415");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 'a', "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1416");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100, (short) 0, 100.0d };
        java.lang.Class[] classArray7 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 1, "hi!", objArray5, (java.lang.Class<?>[]) classArray7);
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1417");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 1, true };
        java.lang.Class[] classArray6 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray7 = (java.lang.Class<?>[]) classArray6;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) "hi!", "", objArray4, (java.lang.Class<?>[]) classArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.String");
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1418");
        java.lang.Object obj0 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { true, false, 1.0f };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1419");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils4 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray8 = new java.lang.Object[] { "hi!", "", methodUtils4, 0.0d, (-1), '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 10L, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1420");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) -1, 1.0d, 'a' };
        java.lang.Class[] classArray7 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 100, "", objArray5, wildcardClassArray8);
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1421");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 100, '4', 0.0d };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1422");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0, (short) 100, 1, (short) 1, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) '4', "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1423");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass1 = methodUtils0.getClass();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) methodUtils0, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: org.apache.commons.lang3.reflect.MethodUtils");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1424");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { obj2, 10L, 10L, (short) 0, 1.0d, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 10L, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1425");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) false, "hi!", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Boolean");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1426");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', '#', (short) 0, (-1), 1.0f };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1427");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 100, (short) 100, "", (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 0.0f, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1428");
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100, ' ', '4', (short) 0, 1, 1L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 1L, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1429");
        java.lang.Object[] objArray7 = new java.lang.Object[] { true, (byte) 100, 0.0f, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (-1.0d), "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1430");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) 0, (-1L) };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1431");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) 100, "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1432");
        java.lang.Object[] objArray7 = new java.lang.Object[] { "", 'a', (short) 10, (-1L), 100L };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1433");
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 1, 1, obj4, (byte) 100, (short) -1, true };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 0.0d, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1434");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray5 = new java.lang.Object[] { "hi!", 100L, 100.0f };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1435");
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { '4', obj3, 0, 10.0f, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) ' ', "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1436");
        java.lang.Object[] objArray3 = new java.lang.Object[] { '4' };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1437");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) 1, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1438");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils3 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass4 = methodUtils3.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1, wildcardClass4 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (short) -1, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1439");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass3 = methodUtils2.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { methodUtils2, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) 10, "", objArray5);
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1440");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 1, "hi!", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1441");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass1 = methodUtils0.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1.0f, ' ', (-1.0f), (short) 100, 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) methodUtils0, "hi!", objArray8);
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1442");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils4 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass5 = methodUtils4.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 100, 10.0f, methodUtils4, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) true, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Boolean");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1443");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 10 };
        java.lang.Class[] classArray5 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray6 = (java.lang.Class<?>[]) classArray5;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (short) -1, "", objArray3, (java.lang.Class<?>[]) classArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Short");
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1444");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Class<?>[] wildcardClassArray3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 100.0f, "hi!", objArray2, wildcardClassArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1445");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100.0f, 1 };
        java.lang.Class<?>[] wildcardClassArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (byte) -1, "", objArray4, wildcardClassArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1446");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1), 'a' };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1447");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 100L, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1448");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100.0d, 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 0, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1449");
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1.0f, 10L, obj4, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) "hi!", "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.String");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1450");
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 100, "", 100.0d, ' ', (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) -1, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1451");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1L), (byte) 10 };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1452");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 10.0f, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 100.0f, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1453");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils4 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100.0f, 0, methodUtils4 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 100L, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1454");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10.0f, true, 1L, 'a' };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1455");
        java.lang.Object[] objArray7 = new java.lang.Object[] { false, true, (byte) -1, 0.0f, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) true, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Boolean");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1456");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d) };
        java.lang.Class[] classArray5 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray6 = (java.lang.Class<?>[]) classArray5;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) 10, "", objArray3, wildcardClassArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1457");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) -1, (-1), (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 'a', "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1458");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 100.0d, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1459");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0.0d, (byte) 10 };
        java.lang.Class[] classArray7 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod(obj0, "", objArray5, (java.lang.Class<?>[]) classArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Object");
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1460");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', (short) -1, 0.0f, false, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (short) 0, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1461");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Class<?>[] wildcardClassArray3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 1.0d, "hi!", objArray2, wildcardClassArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1462");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 0.0d };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1463");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100.0f, (byte) 0 };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1464");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 0, 100.0d };
        java.lang.Class[] classArray6 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray7 = (java.lang.Class<?>[]) classArray6;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 10L, "", objArray4, wildcardClassArray7);
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1465");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1.0d, (short) -1, 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) '#', "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1466");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100.0d, 1.0d, (-1.0d) };
        java.lang.Class[] classArray7 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 10L, "", objArray5, wildcardClassArray8);
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1467");
        java.lang.Object[] objArray7 = new java.lang.Object[] { true, (short) 0, (-1.0d), 10.0f, (byte) 1 };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1468");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils5 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass6 = methodUtils5.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { true, '#', 0, methodUtils5, 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (-1.0d), "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1469");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1L, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 1.0d, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1470");
        java.lang.Object[] objArray3 = new java.lang.Object[] { "hi!" };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1471");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0, 10.0d, (-1L), (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 1.0f, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1472");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 0L };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1473");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (byte) 100, "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1474");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1L), ' ', 100.0f, '#' };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1475");
        java.lang.Object[] objArray2 = null;
        java.lang.Class[] classArray4 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray5 = (java.lang.Class<?>[]) classArray4;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (-1.0f), "hi!", objArray2, (java.lang.Class<?>[]) classArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray5);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1476");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object[] objArray2 = null;
        java.lang.Class[] classArray4 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray5 = (java.lang.Class<?>[]) classArray4;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod(obj0, "", objArray2, wildcardClassArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Object");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray5);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1477");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils4 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 100, 0.0f, methodUtils4, 1.0d, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 10.0f, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1478");
        java.lang.Object[] objArray3 = new java.lang.Object[] { "" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 100L, "hi!", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1479");
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100L, 1, (short) 1, 1.0f, (byte) -1, 0.0d };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1480");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray4 = new java.lang.Object[] { methodUtils2, (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 100.0f, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1481");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 1L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (short) 10, "hi!", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1482");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Class<?>[] wildcardClassArray3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (-1.0f), "hi!", objArray2, wildcardClassArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1483");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 10, (byte) 100, (byte) -1, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) 100, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1484");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10.0d, (-1.0d), 100.0d, (byte) 0 };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1485");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 10, (-1.0f) };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1486");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) -1, "hi!", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1487");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0L, 100L, (-1), (short) 100 };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1488");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0, 100L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) ' ', "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1489");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10, (byte) 10, (byte) 100, '#', 100 };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1490");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1L, 0, (short) 100, 10, false };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1491");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 100 };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1492");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1L, (byte) 10, true, "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (byte) 0, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1493");
        java.lang.Object[] objArray6 = new java.lang.Object[] { ' ', (byte) 0, (byte) 100, (short) 0 };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1494");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, '#', 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 10.0f, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1495");
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 1, obj3, '4', (-1.0d), (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (-1L), "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1496");
        java.lang.Object obj0 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 0L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod(obj0, "hi!", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1497");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0.0f, (byte) 100, (-1.0f), (byte) -1, 10L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (byte) 0, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1498");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 100, (byte) 10, (-1) };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1499");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils3 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0, methodUtils3, (byte) 0, 0.0d, ' ', ' ' };
        // The following exception was thrown during execution in test generation
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
    public void MethodUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.test1500");
        java.lang.Object obj0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) -1, (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod(obj0, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }
}

