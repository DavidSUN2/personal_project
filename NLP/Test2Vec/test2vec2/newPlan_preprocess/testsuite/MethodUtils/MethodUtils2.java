package MethodUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MethodUtils2 {

    public static boolean debug = false;

    @Test
    public void MethodUtils1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1001");
        java.lang.Object obj0 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { false, ' ', 1.0f, 10.0f };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1002");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1 };
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
    public void MethodUtils1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1003");
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100, 1.0d, "hi!", (byte) 100, (short) 100, 1.0d };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1004");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10.0f, 0L, (-1L) };
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
    public void MethodUtils1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1005");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 0.0f, "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1006");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils3 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100.0d, methodUtils3, 100.0d };
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
    public void MethodUtils1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1007");
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', 10.0f, 100L, 0.0d, (-1L), 10 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1008");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100.0f, (-1.0f), 0, 10.0f, ' ' };
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
    public void MethodUtils1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1009");
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1.0d, (short) -1, "hi!", obj5, (byte) 100 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1010");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1011");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 0.0d };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1012");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1013");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 0, (byte) 100 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1014");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) -1, '4' };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1015");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils4 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass5 = methodUtils4.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 1, (short) 1, methodUtils4, (byte) -1, 100L };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1016");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 10.0f, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1017");
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1, 0, 0.0f, 1, (short) 100, false };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1018");
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1L), (-1L), 100.0d, (byte) 1, 100.0d };
        java.lang.Class<?>[] wildcardClassArray8 = null;
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1019");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils3 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0, methodUtils3, 1L };
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
    public void MethodUtils1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1020");
        java.lang.Object obj0 = null;
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod(obj0, "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1021");
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100.0f, 1.0f, obj4, 0L, (short) 1 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1022");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { obj2, 100, (-1), 1.0d, 10, 0.0f };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1023");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object[] objArray4 = new java.lang.Object[] { true, (-1) };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1024");
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0d, 0.0d, 100.0d, (-1L), 1.0d, (short) 10 };
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
    public void MethodUtils1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1025");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 100 };
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
    public void MethodUtils1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1026");
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 1, (-1.0d), 'a', (-1), 0L };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1027");
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1.0f, (short) 1, (-1.0d), (-1L), 1.0f, "" };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1028");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) -1, false };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1029");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 10 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1030");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 100, (byte) 1, (byte) 1, (short) 10 };
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
    public void MethodUtils1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1031");
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 1, obj3, "hi!", 0.0f, 1 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1032");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1033");
        java.lang.Object obj0 = null;
        java.lang.Object[] objArray2 = null;
        java.lang.Class<?>[] wildcardClassArray3 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod(obj0, "hi!", objArray2, wildcardClassArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1034");
        java.lang.Object[] objArray4 = new java.lang.Object[] { false, false };
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
    public void MethodUtils1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1035");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray6 = new java.lang.Object[] { obj2, ' ', 100.0f, '4' };
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
    public void MethodUtils1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1036");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, '4', (-1L), true };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1037");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 100, (byte) 0, 100.0f, (short) 100 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1038");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { "hi!", 10.0f };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1039");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1040");
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100.0d, 100, "", (byte) 10, 10, ' ' };
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
    public void MethodUtils1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1041");
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, (short) 0, (byte) 1, (short) 10, '#', (short) 1 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1042");
        java.lang.Object[] objArray6 = new java.lang.Object[] { '4', 0L, (short) 100, (byte) 1 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1043");
        java.lang.Object[] objArray8 = new java.lang.Object[] { true, 0, (short) 1, true, '4', 0.0d };
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
    public void MethodUtils1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1044");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0.0f, (-1) };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1045");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.apache.commons.lang3.reflect.MethodUtils methodUtils6 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray7 = new java.lang.Object[] { methodUtils2, obj3, 1L, methodUtils6 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1046");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 100.0f };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1047");
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1L), (-1.0f), 10, (-1.0f), (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1048");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
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
    public void MethodUtils1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1049");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 0L, "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1050");
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 100L, true, obj4 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1051");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1L), (-1.0d), ' ', (byte) 100 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1052");
        java.lang.Object[] objArray8 = new java.lang.Object[] { "hi!", 10.0d, (short) 100, (short) -1, '4', (short) 0 };
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
    public void MethodUtils1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1053");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass3 = methodUtils2.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { wildcardClass3, (-1.0f), (byte) 100 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1054");
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        org.apache.commons.lang3.reflect.MethodUtils methodUtils6 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) -1, 0.0d, wildcardClass5, methodUtils6 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1055");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils7 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100.0f, 1.0d, (byte) 10, (byte) 100, 10.0f, methodUtils7 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1056");
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0L, (byte) 10, 1.0f, obj5, 1.0d };
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
    public void MethodUtils1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1057");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100.0d, 100.0f, 1, 1.0f, 0.0f };
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
    public void MethodUtils1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1058");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 0, (-1.0f), 'a' };
        java.lang.Class[] classArray7 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1059");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0L, (short) -1 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1060");
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 1, (-1), 100.0d, (-1L), ' ' };
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
    public void MethodUtils1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1061");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils4 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 10, 100.0d, methodUtils4, (short) 1, 10L, 100.0f };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1062");
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1, '4', 1, ' ', (-1L), obj7 };
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
    public void MethodUtils1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1063");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils4 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass5 = methodUtils4.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100, false, wildcardClass5, "" };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1064");
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0.0d, 1, "hi!", '4', (short) 100, ' ' };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1065");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils3 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1.0d), methodUtils3 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1066");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray3 = new java.lang.Object[] { obj2 };
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
    public void MethodUtils1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1067");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray4 = new java.lang.Object[] { obj2 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1068");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1069");
        java.lang.Object[] objArray8 = new java.lang.Object[] { "", (short) -1, (short) 0, (byte) 1, '#', (-1.0f) };
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
    public void MethodUtils1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1070");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { obj2, 100 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1071");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray5 = new java.lang.Object[] { true, ' ', 10.0f };
        java.lang.Class[] classArray7 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1072");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1.0d), "", (-1.0f), "" };
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
    public void MethodUtils1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1073");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1074");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 1L, "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1075");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 10, (-1L) };
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
    public void MethodUtils1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1076");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1L, (byte) 100, 100, 1L, 10L };
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
    public void MethodUtils1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1077");
        java.lang.Object[] objArray5 = new java.lang.Object[] { '4', (byte) 100, 10.0f };
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
    public void MethodUtils1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1078");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100, (-1L) };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1079");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1.0f), 100.0d };
        java.lang.Class[] classArray6 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray7 = (java.lang.Class<?>[]) classArray6;
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1080");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils3 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass4 = methodUtils3.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1L, wildcardClass4 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1081");
        java.lang.Object[] objArray4 = new java.lang.Object[] { true, (-1L) };
        java.lang.Class[] classArray6 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray7 = (java.lang.Class<?>[]) classArray6;
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1082");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Class[] classArray4 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray5 = (java.lang.Class<?>[]) classArray4;
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1083");
        java.lang.Object[] objArray3 = new java.lang.Object[] { false };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1084");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0L, 1.0d };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1085");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils4 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1L, 100.0d, methodUtils4 };
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
    public void MethodUtils1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1086");
        java.lang.Object obj0 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { ' ' };
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

    @Test
    public void MethodUtils1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1087");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 0, (byte) 100, "", "hi!" };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1088");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.apache.commons.lang3.reflect.MethodUtils methodUtils4 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 10, methodUtils4 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1089");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object[] objArray3 = null;
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1090");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { obj2, wildcardClass5 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1091");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 10.0d, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1092");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Class[] classArray4 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray5 = (java.lang.Class<?>[]) classArray4;
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1093");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0.0d, 100.0d };
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
    public void MethodUtils1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1094");
        java.lang.Object[] objArray6 = new java.lang.Object[] { true, 10.0d, (-1.0d), (short) 100 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1095");
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { false, '#', 1, obj5, 10.0d, '4' };
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
    public void MethodUtils1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1096");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass1 = methodUtils0.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10.0f, 1.0d, 1 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1097");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray3 = new java.lang.Object[] { 0.0d };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1098");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100.0f, '#', 100.0f };
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
    public void MethodUtils1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1099");
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0L, (byte) 0, 10.0d, "", 100.0d, (-1.0f) };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1100");
        java.lang.Object obj2 = new java.lang.Object();
        org.apache.commons.lang3.reflect.MethodUtils methodUtils4 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray7 = new java.lang.Object[] { obj2, (short) 1, methodUtils4, '#', 100.0f };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1101");
        java.lang.Object[] objArray4 = new java.lang.Object[] { true, (-1) };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1102");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0f) };
        java.lang.Class[] classArray5 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray6 = (java.lang.Class<?>[]) classArray5;
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1103");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10, "hi!", (short) 1, (byte) 10 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1104");
        java.lang.Object obj0 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 1, 100L, (short) 0, ' ' };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1105");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1.0f), 100.0d };
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
    public void MethodUtils1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1106");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0.0f, 0.0f };
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
    public void MethodUtils1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1107");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass3 = methodUtils2.getClass();
        java.lang.Object[] objArray4 = new java.lang.Object[] { wildcardClass3 };
        java.lang.Class[] classArray6 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray7 = (java.lang.Class<?>[]) classArray6;
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1108");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (-1.0f), "", (short) 100 };
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
    public void MethodUtils1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1109");
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 100, 0L, false, 1, 100L, "hi!" };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1110");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ' ', 1L };
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
    public void MethodUtils1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1111");
        java.lang.Object[] objArray7 = new java.lang.Object[] { false, '#', 10.0d, ' ', 0.0d };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1112");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils3 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (-1.0d), methodUtils3, (byte) 1 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1113");
        java.lang.Object obj0 = new java.lang.Object();
        org.apache.commons.lang3.reflect.MethodUtils methodUtils4 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1, ' ', methodUtils4, 'a' };
        java.lang.Class<?>[] wildcardClassArray7 = null;
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1114");
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 10, 1.0d, (-1L), 1.0d, 100.0f, (-1) };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1115");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 1, false, 0L, (-1.0d), 10 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1116");
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { '#', (byte) 0, 100L, 100L, obj6 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1117");
        java.lang.Object[] objArray8 = new java.lang.Object[] { 'a', "", 10, (byte) 10, (-1L), 1.0f };
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
    public void MethodUtils1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1118");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils6 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100.0f, false, '4', 10.0f, methodUtils6, obj7 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1119");
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0L, ' ', (byte) 0, obj5 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1120");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 10L, (short) -1 };
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
    public void MethodUtils1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1121");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100L, false };
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
    public void MethodUtils1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1122");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 100, '#', 100L };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1123");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 1L };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1124");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (-1L), "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1125");
        java.lang.Object obj3 = new java.lang.Object();
        org.apache.commons.lang3.reflect.MethodUtils methodUtils5 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray7 = new java.lang.Object[] { true, obj3, 0.0f, methodUtils5, 100 };
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
    public void MethodUtils1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1126");
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 1, 0, 1.0f, ' ', 1L };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1127");
        java.lang.Object[] objArray5 = new java.lang.Object[] { ' ', '4', 1L };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1128");
        java.lang.Object[] objArray7 = new java.lang.Object[] { "hi!", "hi!", 100, 'a', (short) 10 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1129");
        java.lang.Object[] objArray6 = new java.lang.Object[] { false, 100.0f, (-1), 1 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1130");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1131");
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1.0f), (byte) 100, (byte) 0, 100.0d, (short) 1, 1L };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1132");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils3 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, methodUtils3, (-1), 10.0f };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1133");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1134");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 100.0f };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1135");
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10, "hi!", 1L, wildcardClass6, (byte) 1 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1136");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils3 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', methodUtils3, 10.0d, (short) 100, "" };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1137");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1138");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray4 = new java.lang.Object[] { obj2, (short) 0 };
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
    public void MethodUtils1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1139");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0.0f, (short) 1, 10, ' ', 10.0f };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1140");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1) };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1141");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray6 = new java.lang.Object[] { methodUtils2, true, false, 10.0f };
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
    public void MethodUtils1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1142");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) -1 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1143");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 10 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1144");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1.0f), 0.0d };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1145");
        java.lang.Object obj0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { true, (short) -1 };
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
    public void MethodUtils1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1146");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray8 = new java.lang.Object[] { methodUtils2, (short) 0, (-1L), (byte) 0, 0.0f, 10.0d };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1147");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray4 = new java.lang.Object[] { methodUtils2, (short) 100 };
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
    public void MethodUtils1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1148");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray4 = new java.lang.Object[] { methodUtils2, "" };
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
    public void MethodUtils1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1149");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { wildcardClass3, 100L, (short) 10 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1150");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 10, (short) -1 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1151");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass1 = methodUtils0.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10, 100.0d, (-1.0f), '#' };
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
    public void MethodUtils1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1152");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 100.0d };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1153");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 1.0f };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1154");
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0.0d, wildcardClass4 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1155");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 0, 10L, 10.0d };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1156");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray4 = new java.lang.Object[] { methodUtils2, (byte) 1 };
        java.lang.Class[] classArray6 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray7 = (java.lang.Class<?>[]) classArray6;
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1157");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass3 = methodUtils2.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { methodUtils2, (-1L), '4', 10.0d, 100 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1158");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) -1, "", (-1), 1L };
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
    public void MethodUtils1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1159");
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, obj3, 100L, (byte) 10 };
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
    public void MethodUtils1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1160");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        org.apache.commons.lang3.reflect.MethodUtils methodUtils3 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass4 = methodUtils3.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { methodUtils2, wildcardClass4 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1161");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1162");
        java.lang.Object[] objArray8 = new java.lang.Object[] { '4', 1, 100, '4', 10, 0.0d };
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
    public void MethodUtils1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1163");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1.0d), (short) 1 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1164");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1165");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1, 10.0f, (byte) -1 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1166");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0.0d, 0.0d, (short) 100 };
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
    public void MethodUtils1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1167");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Class<?>[] wildcardClassArray3 = null;
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1168");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 10 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1169");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 0, "hi!", 100L };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1170");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 100, 100L, (byte) 0 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1171");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1) };
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
    public void MethodUtils1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1172");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object[] objArray3 = new java.lang.Object[] { 10 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1173");
        java.lang.Object[] objArray5 = new java.lang.Object[] { "", true, "hi!" };
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
    public void MethodUtils1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1174");
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1), 10.0f, ' ', (byte) 10, 100.0f };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1175");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1176");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils4 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1), 1.0f, methodUtils4, 1, (byte) 100 };
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
    public void MethodUtils1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1177");
        java.lang.Object[] objArray5 = new java.lang.Object[] { '#', true, (short) -1 };
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
    public void MethodUtils1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1178");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 10L, (short) 0 };
        java.lang.Class<?>[] wildcardClassArray5 = null;
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1179");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass1 = methodUtils0.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100.0d, (byte) -1 };
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
    public void MethodUtils1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1180");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) -1, 10, (byte) 100, 0L };
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
    public void MethodUtils1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1181");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { methodUtils2, 1, false, 0L, wildcardClass7 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1182");
        java.lang.Object[] objArray5 = new java.lang.Object[] { "", "hi!", (byte) 10 };
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
    public void MethodUtils1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1183");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0.0d, (-1.0f), 100L, (-1), 1.0f };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1184");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass3 = methodUtils2.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { wildcardClass3, ' ' };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1185");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1186");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 100 };
        java.lang.Class<?>[] wildcardClassArray4 = null;
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1187");
        java.lang.Object obj0 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1, (short) 0, 1.0f };
        java.lang.Class[] classArray7 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1188");
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) -1, (byte) 1, 10, '#', "" };
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
    public void MethodUtils1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1189");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0f) };
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
    public void MethodUtils1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1190");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0.0d, 10.0f, (-1) };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1191");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100.0f, (byte) 10 };
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
    public void MethodUtils1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1192");
        java.lang.Object obj0 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 100.0f, 0.0f, 0.0d, (-1.0d) };
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
    public void MethodUtils1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1193");
        java.lang.Object[] objArray3 = new java.lang.Object[] { ' ' };
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
    public void MethodUtils1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1194");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 1L };
        java.lang.Class[] classArray5 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray6 = (java.lang.Class<?>[]) classArray5;
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1195");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 100, '#' };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1196");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { obj2, (-1.0d), (short) 0, '4', 100L };
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
    public void MethodUtils1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1197");
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) -1, 100, "", "", (-1.0f) };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1198");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1.0d, (byte) 10, true, 100, 0.0f };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1199");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray3 = new java.lang.Object[] { '4' };
        java.lang.Class[] classArray5 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray6 = (java.lang.Class<?>[]) classArray5;
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1200");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0.0f, 0 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1201");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1202");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 'a', (byte) 10, false };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1203");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 100, (byte) 10 };
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
    public void MethodUtils1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1204");
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1L, true, 0, (-1.0f), (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1205");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1206");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 10L };
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
    public void MethodUtils1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1207");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1208");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1.0f), 10, "", 1.0d };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1209");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray4 = new java.lang.Object[] { obj2 };
        java.lang.Class[] classArray6 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray7 = (java.lang.Class<?>[]) classArray6;
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1210");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 100.0f };
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
    public void MethodUtils1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1211");
        java.lang.Object[] objArray6 = new java.lang.Object[] { ' ', ' ', false, 1.0d };
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
    public void MethodUtils1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1212");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 10L, 0L };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1213");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Class[] classArray4 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray5 = (java.lang.Class<?>[]) classArray4;
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1214");
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "hi!", obj3, 100, true };
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
    public void MethodUtils1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1215");
        java.lang.Object obj0 = null;
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1L), '#', (byte) 100, (short) -1, 100.0d, obj7 };
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
    public void MethodUtils1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1216");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Class<?>[] wildcardClassArray3 = null;
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1217");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass1 = methodUtils0.getClass();
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1218");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Class[] classArray4 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray5 = (java.lang.Class<?>[]) classArray4;
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1219");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1L), (-1L) };
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
    public void MethodUtils1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1220");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray6 = new java.lang.Object[] { methodUtils2, 0L, 10.0f, (byte) -1 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1221");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 1, (short) 10, (byte) 10, (-1L) };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1222");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1223");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray6 = new java.lang.Object[] { obj2, 100.0d, 10L, 10.0d };
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
    public void MethodUtils1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1224");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 10.0d, "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1225");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Class<?>[] wildcardClassArray3 = null;
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1226");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Class[] classArray4 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray5 = (java.lang.Class<?>[]) classArray4;
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1227");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1228");
        java.lang.Object obj0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100L, 0.0f };
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
    public void MethodUtils1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1229");
        java.lang.Object[] objArray5 = new java.lang.Object[] { "", 10.0d, 10.0f };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1230");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0, 0, 0, (-1) };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1231");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass3 = methodUtils2.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { wildcardClass3, 10.0f };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1232");
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 1, 100L, 10L, 10.0f, "" };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1233");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, 100.0f, 1.0f };
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
    public void MethodUtils1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1234");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { wildcardClass3, true, true };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1235");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.reflect.MethodUtils methodUtils5 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass6 = methodUtils5.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0.0f, (-1), (byte) 1, methodUtils5, 10.0d };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1236");
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 100, 0.0d, (byte) 0, (byte) 1, 100.0f };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1237");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass3 = methodUtils2.getClass();
        java.lang.Object[] objArray4 = new java.lang.Object[] { methodUtils2 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1238");
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1.0d), 100.0d, (short) 100, (-1L), '4', 0.0d };
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
    public void MethodUtils1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1239");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) -1 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1240");
        java.lang.Object[] objArray8 = new java.lang.Object[] { true, (-1.0d), (short) -1, 100.0f, 1L, (short) 100 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1241");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1242");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1243");
        java.lang.Object[] objArray4 = new java.lang.Object[] { "", 100L };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1244");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 1L };
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
    public void MethodUtils1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1245");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0L, (short) 10, 1L, 0 };
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
    public void MethodUtils1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1246");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100L, (short) 1, 1.0f };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1247");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10L, 0, 1, 1L, (byte) 0 };
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
    public void MethodUtils1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1248");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { obj3 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1249");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { "hi!", (short) 100 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1250");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils3 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 1, methodUtils3, (byte) 0, 10.0f, wildcardClass7 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1251");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 10, 10L, 100L };
        java.lang.Class[] classArray7 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1252");
        java.lang.Object obj0 = null;
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(obj0, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1253");
        java.lang.Object[] objArray4 = new java.lang.Object[] { "hi!", (byte) 10 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1254");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100.0d, 10.0d, '#' };
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
    public void MethodUtils1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1255");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) -1 };
        java.lang.Class[] classArray5 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray6 = (java.lang.Class<?>[]) classArray5;
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1256");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1257");
        java.lang.Object[] objArray6 = new java.lang.Object[] { false, (short) 1, 10L, 10L };
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
    public void MethodUtils1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1258");
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object[] objArray6 = new java.lang.Object[] { true, 10.0d, 10.0f, obj5 };
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
    public void MethodUtils1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1259");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100L, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1260");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 10, 0L, 1.0d, 100 };
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
    public void MethodUtils1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1261");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10L, false, (byte) 1, false, "hi!" };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1262");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 100.0f, "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1263");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0.0d, 100.0f, (-1L) };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1264");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1265");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1266");
        java.lang.Object[] objArray5 = new java.lang.Object[] { false, '4', 1 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1267");
        java.lang.Object[] objArray4 = new java.lang.Object[] { "hi!", 100.0d };
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
    public void MethodUtils1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1268");
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 10, 10.0f, 1.0d, (-1), (-1.0f) };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1269");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray5 = new java.lang.Object[] { obj2, (-1), (-1.0d) };
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
    public void MethodUtils1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1270");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1, (short) 10, (byte) 1 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1271");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1272");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 0.0d };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1273");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 10.0f };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1274");
        java.lang.Object[] objArray7 = new java.lang.Object[] { "hi!", 10, 1, 100.0f, (short) 0 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1275");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10, 100, "", 100L, "hi!" };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1276");
        java.lang.Object[] objArray6 = new java.lang.Object[] { false, '#', (byte) 100, 1 };
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
    public void MethodUtils1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1277");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { obj2, (short) 0, 10, false, '#' };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1278");
        java.lang.Object[] objArray6 = new java.lang.Object[] { true, (-1.0d), (-1), (byte) 0 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1279");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 0, (short) 1 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1280");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0L, (-1.0d), (short) 10, 0.0f, 'a' };
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
    public void MethodUtils1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1281");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) -1, "hi!" };
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
    public void MethodUtils1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1282");
        java.lang.Object[] objArray3 = new java.lang.Object[] { ' ' };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1283");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 1.0d };
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
    public void MethodUtils1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1284");
        java.lang.Object[] objArray4 = new java.lang.Object[] { true, 'a' };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1285");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1286");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils4 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass5 = methodUtils4.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 'a', (short) 0, wildcardClass5 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1287");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1.0f, (short) 10, 1.0d };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1288");
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1.0f), (short) 0, 10.0d, (short) 0, (short) 1, (byte) -1 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1289");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (byte) 0, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1290");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass3 = methodUtils2.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { methodUtils2, '4', 'a' };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1291");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0, false, (byte) 1, (short) 0, true, 10.0d };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1292");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Class[] classArray4 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray5 = (java.lang.Class<?>[]) classArray4;
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1293");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 100, 100 };
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
    public void MethodUtils1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1294");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { obj2, 0.0f };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1295");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 100, (short) 10, '4', (byte) 10 };
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
    public void MethodUtils1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1296");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0.0f, 100L };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1297");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1298");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 0, 0.0f };
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
    public void MethodUtils1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1299");
        java.lang.Object[] objArray7 = new java.lang.Object[] { ' ', false, ' ', (byte) 0, 1.0f };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1300");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray3 = new java.lang.Object[] { obj2 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1301");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 1, (-1.0f) };
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
    public void MethodUtils1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1302");
        java.lang.Object obj0 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 'a', 10L, 10L, 1.0f, (-1), false };
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
    public void MethodUtils1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1303");
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0L, '#', 100L, 0L, "hi!", (byte) 100 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1304");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1), true };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1305");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) "", "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.String");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1306");
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 'a', (short) 100, 0.0f, 'a', (byte) 1 };
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
    public void MethodUtils1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1307");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10L, (byte) -1, "", 1.0d };
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
    public void MethodUtils1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1308");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 10 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1309");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils4 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1.0f, "", methodUtils4, (byte) -1, 1.0d };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1310");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils3 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 10, methodUtils3, 10L };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1311");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 1 };
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
    public void MethodUtils1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1312");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1.0d, 'a', (byte) 10 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1313");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 1, "", 100.0f };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1314");
        java.lang.Object[] objArray7 = new java.lang.Object[] { '4', 1.0f, 10L, (short) 1, 1.0d };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1315");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 1, (short) -1, (-1L), 100L };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1316");
        java.lang.Object[] objArray5 = new java.lang.Object[] { false, 1.0f, 1.0d };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1317");
        java.lang.Object[] objArray6 = new java.lang.Object[] { true, (short) 100, (short) 1, 'a' };
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
    public void MethodUtils1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1318");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils4 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass5 = methodUtils4.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { '4', (byte) -1, wildcardClass5, 10.0d };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1319");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { true, 100.0f, 100.0f, (byte) 0 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1320");
        java.lang.Object[] objArray3 = new java.lang.Object[] { '4' };
        java.lang.Class[] classArray5 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray6 = (java.lang.Class<?>[]) classArray5;
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1321");
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 100, (-1.0f), 0.0f, (byte) 10, 10L };
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
    public void MethodUtils1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1322");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1), (short) 100, ' ', ' ' };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1323");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 10 };
        java.lang.Class[] classArray5 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray6 = (java.lang.Class<?>[]) classArray5;
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1324");
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1.0d, 0L, (short) 1, 10.0f, 'a', true };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1325");
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 100.0d, (byte) 1, 0.0d };
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
    public void MethodUtils1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1326");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils4 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass5 = methodUtils4.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1L), (short) 100, methodUtils4 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1327");
        java.lang.Object[] objArray7 = new java.lang.Object[] { "", (byte) -1, 100L, 1.0f, 0 };
        java.lang.Class<?>[] wildcardClassArray8 = null;
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1328");
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 1, (byte) 10, (-1.0f), 10.0d, 0.0f };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1329");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass3 = methodUtils2.getClass();
        java.lang.Object[] objArray4 = new java.lang.Object[] { wildcardClass3 };
        java.lang.Class<?>[] wildcardClassArray5 = null;
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1330");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0, (byte) 0, ' ' };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1331");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 0, (short) 0 };
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
    public void MethodUtils1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1332");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 0.0f };
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
    public void MethodUtils1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1333");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', 100.0f };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1334");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1335");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1.0d), (byte) 10 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1336");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1.0d, false };
        java.lang.Class<?>[] wildcardClassArray5 = null;
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1337");
        java.lang.Object[] objArray8 = new java.lang.Object[] { 'a', (byte) -1, (byte) 100, true, 10, '#' };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1338");
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1L), (short) 1, false, (-1.0f), 10, 0L };
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
    public void MethodUtils1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1339");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils4 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1, (-1.0f), methodUtils4 };
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
    public void MethodUtils1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1340");
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1.0d, 1.0d, '#', 0L, obj6, (short) 1 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1341");
        java.lang.Object[] objArray4 = new java.lang.Object[] { "hi!", (short) 10 };
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
    public void MethodUtils1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1342");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1), 0.0f };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1343");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) -1, 'a', (short) 100, 0.0f };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1344");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { obj2, (short) 1 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1345");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils5 = new org.apache.commons.lang3.reflect.MethodUtils();
        org.apache.commons.lang3.reflect.MethodUtils methodUtils6 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) -1, (short) 10, (byte) 1, methodUtils5, methodUtils6 };
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
    public void MethodUtils1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1346");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1.0d, 100.0d };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1347");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Class[] classArray4 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray5 = (java.lang.Class<?>[]) classArray4;
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1348");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1L), (byte) 0 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1349");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray5 = new java.lang.Object[] { obj2, '#', 10L };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1350");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1L, (byte) 10, true, (short) -1 };
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
    public void MethodUtils1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1351");
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 1, obj3, 10.0d };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1352");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1, 10, true, true, 100 };
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
    public void MethodUtils1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1353");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1L, 10.0d, 'a', "hi!" };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1354");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { obj2, (-1), 100 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1355");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray8 = new java.lang.Object[] { methodUtils2, '#', (short) -1, 10L, 0.0f, (-1.0f) };
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
    public void MethodUtils1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1356");
        java.lang.Object[] objArray4 = new java.lang.Object[] { "", 10.0d };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1357");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Class<?>[] wildcardClassArray3 = null;
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1358");
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { "", 1.0d, obj4, (short) 100, (short) 1 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1359");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (-1.0d), 1.0f, 10L };
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
    public void MethodUtils1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1360");
        java.lang.Object obj0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) -1, 0 };
        java.lang.Class[] classArray6 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray7 = (java.lang.Class<?>[]) classArray6;
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1361");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) 0, (short) -1 };
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
    public void MethodUtils1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1362");
        java.lang.Object[] objArray6 = new java.lang.Object[] { true, 0.0d, 10, false };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1363");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { "", (-1L) };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1364");
        java.lang.Object[] objArray4 = new java.lang.Object[] { '#', (byte) 0 };
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
    public void MethodUtils1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1365");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1L, obj3, false, (byte) 0, '#' };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1366");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) -1 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1367");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1.0f), 100.0f, 0L, (byte) -1 };
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
    public void MethodUtils1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1368");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, 0L, "hi!" };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1369");
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 10, 1L, "", 1.0d, 1.0f };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1370");
        java.lang.Object[] objArray5 = new java.lang.Object[] { ' ', "", "hi!" };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1371");
        java.lang.Object[] objArray4 = new java.lang.Object[] { "hi!", true };
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
    public void MethodUtils1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1372");
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1.0f), 1, 1.0d, wildcardClass6 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1373");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass1 = methodUtils0.getClass();
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1374");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) -1 };
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
    public void MethodUtils1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1375");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) '4', "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1376");
        java.lang.Object[] objArray5 = new java.lang.Object[] { "hi!", (-1L), (short) 0 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1377");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) 10, (short) 1 };
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
    public void MethodUtils1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1378");
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 1, 10L, (short) 0, 100, true };
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
    public void MethodUtils1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1379");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 10, 100.0f, (short) 100 };
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
    public void MethodUtils1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1380");
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 0, 'a', (byte) 100, (short) 1, (byte) -1 };
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
    public void MethodUtils1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1381");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0.0f, false, 100L, ' ' };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1382");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1383");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0L, false };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1384");
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 0.0d, 100, 0.0d };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1385");
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 0, 100.0d, 100.0d, (short) 1, false };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1386");
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 0L, (-1.0f), 0 };
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
    public void MethodUtils1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1387");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1388");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10.0f, (byte) 1, 'a' };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1389");
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { false, wildcardClass4, 'a' };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1390");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object obj4 = new java.lang.Object();
        org.apache.commons.lang3.reflect.MethodUtils methodUtils5 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray8 = new java.lang.Object[] { methodUtils2, 10.0f, obj4, methodUtils5, (short) 10, (-1) };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1391");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1, 100L, true };
        java.lang.Class[] classArray7 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1392");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass3 = methodUtils2.getClass();
        org.apache.commons.lang3.reflect.MethodUtils methodUtils4 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass5 = methodUtils4.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { wildcardClass3, methodUtils4, 10L, '#' };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1393");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass1 = methodUtils0.getClass();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { obj3, 'a', (-1L), (-1.0d) };
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
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1394");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100.0f, 10L, ' ' };
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
    public void MethodUtils1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1395");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 100L, 0.0d, ' ', 0L };
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
    public void MethodUtils1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1396");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 0, false, 10 };
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
    public void MethodUtils1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1397");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d) };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1398");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1.0d, 10.0f };
        java.lang.Class<?>[] wildcardClassArray5 = null;
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1399");
        java.lang.Object[] objArray3 = new java.lang.Object[] { "" };
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
    public void MethodUtils1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1400");
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1), true, '4', (short) 10, 1.0d, (-1) };
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
    public void MethodUtils1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1401");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1.0d, 1.0d, '4' };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1402");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
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
    public void MethodUtils1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1403");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 100.0d };
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
    public void MethodUtils1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1404");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 1, 100L, (byte) 0, 0.0f };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1405");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 'a', 10L, (byte) 100 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1406");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ' ', (byte) 100 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1407");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 10.0d };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1408");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) -1, 0.0d, (-1L) };
        java.lang.Class[] classArray7 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1409");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1410");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils4 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass5 = methodUtils4.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { "", 1.0f, wildcardClass5, "" };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1411");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0.0f, 0 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1412");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1.0f, "" };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1413");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 10.0d, (short) 10 };
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
    public void MethodUtils1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1414");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1) };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1415");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 100 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1416");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100, (short) 0, 100.0d };
        java.lang.Class[] classArray7 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1417");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 1, true };
        java.lang.Class[] classArray6 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray7 = (java.lang.Class<?>[]) classArray6;
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1418");
        java.lang.Object obj0 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { true, false, 1.0f };
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
    public void MethodUtils1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1419");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils4 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray8 = new java.lang.Object[] { "hi!", "", methodUtils4, 0.0d, (-1), '#' };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1420");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) -1, 1.0d, 'a' };
        java.lang.Class[] classArray7 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1421");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 100, '4', 0.0d };
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
    public void MethodUtils1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1422");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0, (short) 100, 1, (short) 1, 10 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1423");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass1 = methodUtils0.getClass();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1424");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { obj2, 10L, 10L, (short) 0, 1.0d, ' ' };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1425");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 0 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1426");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', '#', (short) 0, (-1), 1.0f };
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
    public void MethodUtils1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1427");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 100, (short) 100, "", (short) 1 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1428");
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100, ' ', '4', (short) 0, 1, 1L };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1429");
        java.lang.Object[] objArray7 = new java.lang.Object[] { true, (byte) 100, 0.0f, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1430");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) 0, (-1L) };
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
    public void MethodUtils1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1431");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0f) };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1432");
        java.lang.Object[] objArray7 = new java.lang.Object[] { "", 'a', (short) 10, (-1L), 100L };
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
    public void MethodUtils1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1433");
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 1, 1, obj4, (byte) 100, (short) -1, true };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1434");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray5 = new java.lang.Object[] { "hi!", 100L, 100.0f };
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
    public void MethodUtils1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1435");
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { '4', obj3, 0, 10.0f, (-1) };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1436");
        java.lang.Object[] objArray3 = new java.lang.Object[] { '4' };
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
    public void MethodUtils1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1437");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100, ' ' };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1438");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils3 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass4 = methodUtils3.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1, wildcardClass4 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1439");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass3 = methodUtils2.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { methodUtils2, (-1L) };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1440");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 1.0d };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1441");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass1 = methodUtils0.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1.0f, ' ', (-1.0f), (short) 100, 10.0d };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1442");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils4 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass5 = methodUtils4.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 100, 10.0f, methodUtils4, (byte) -1 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1443");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 10 };
        java.lang.Class[] classArray5 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray6 = (java.lang.Class<?>[]) classArray5;
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1444");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Class<?>[] wildcardClassArray3 = null;
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1445");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100.0f, 1 };
        java.lang.Class<?>[] wildcardClassArray5 = null;
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1446");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1), 'a' };
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
    public void MethodUtils1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1447");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 100L, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1448");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100.0d, 10.0f };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1449");
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1.0f, 10L, obj4, (byte) 10 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1450");
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 100, "", 100.0d, ' ', (short) 10 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1451");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1L), (byte) 10 };
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
    public void MethodUtils1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1452");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 10.0f, 100 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1453");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils4 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100.0f, 0, methodUtils4 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1454");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10.0f, true, 1L, 'a' };
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
    public void MethodUtils1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1455");
        java.lang.Object[] objArray7 = new java.lang.Object[] { false, true, (byte) -1, 0.0f, (byte) 10 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1456");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d) };
        java.lang.Class[] classArray5 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray6 = (java.lang.Class<?>[]) classArray5;
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1457");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) -1, (-1), (short) 100 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1458");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1459");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0.0d, (byte) 10 };
        java.lang.Class[] classArray7 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1460");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', (short) -1, 0.0f, false, (short) -1 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1461");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Class<?>[] wildcardClassArray3 = null;
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1462");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 0.0d };
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
    public void MethodUtils1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1463");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100.0f, (byte) 0 };
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
    public void MethodUtils1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1464");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 0, 100.0d };
        java.lang.Class[] classArray6 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray7 = (java.lang.Class<?>[]) classArray6;
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1465");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1.0d, (short) -1, 1.0d };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1466");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100.0d, 1.0d, (-1.0d) };
        java.lang.Class[] classArray7 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1467");
        java.lang.Object[] objArray7 = new java.lang.Object[] { true, (short) 0, (-1.0d), 10.0f, (byte) 1 };
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
    public void MethodUtils1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1468");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils5 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass6 = methodUtils5.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { true, '#', 0, methodUtils5, 1.0d };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1469");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1L, 100 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1470");
        java.lang.Object[] objArray3 = new java.lang.Object[] { "hi!" };
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
    public void MethodUtils1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1471");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0, 10.0d, (-1L), (byte) 1 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1472");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 0L };
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
    public void MethodUtils1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1473");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1L) };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1474");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1L), ' ', 100.0f, '#' };
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
    public void MethodUtils1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1475");
        java.lang.Object[] objArray2 = null;
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
        org.junit.Assert.assertNotNull(classArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray5);
    }

    @Test
    public void MethodUtils1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1476");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object[] objArray2 = null;
        java.lang.Class[] classArray4 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray5 = (java.lang.Class<?>[]) classArray4;
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1477");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils4 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 100, 0.0f, methodUtils4, 1.0d, (short) 100 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1478");
        java.lang.Object[] objArray3 = new java.lang.Object[] { "" };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1479");
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100L, 1, (short) 1, 1.0f, (byte) -1, 0.0d };
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
    public void MethodUtils1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1480");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray4 = new java.lang.Object[] { methodUtils2, (-1.0f) };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1481");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 1L };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1482");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Class<?>[] wildcardClassArray3 = null;
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1483");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 10, (byte) 100, (byte) -1, (short) 0 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1484");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10.0d, (-1.0d), 100.0d, (byte) 0 };
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
    public void MethodUtils1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1485");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 10, (-1.0f) };
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
    public void MethodUtils1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1486");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 100 };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1487");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0L, 100L, (-1), (short) 100 };
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
    public void MethodUtils1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1488");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0, 100L };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1489");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10, (byte) 10, (byte) 100, '#', 100 };
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
    public void MethodUtils1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1490");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1L, 0, (short) 100, 10, false };
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
    public void MethodUtils1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1491");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 100 };
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
    public void MethodUtils1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1492");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1L, (byte) 10, true, "hi!", "" };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1493");
        java.lang.Object[] objArray6 = new java.lang.Object[] { ' ', (byte) 0, (byte) 100, (short) 0 };
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
    public void MethodUtils1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1494");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, '#', 10.0d };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1495");
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 1, obj3, '4', (-1.0d), (-1.0d) };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1496");
        java.lang.Object obj0 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 0L };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1497");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0.0f, (byte) 100, (-1.0f), (byte) -1, 10L };
        // The following exception was thrown during execution in MethodUtils generation
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
    public void MethodUtils1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1498");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 100, (byte) 10, (-1) };
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
    public void MethodUtils1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1499");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils3 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0, methodUtils3, (byte) 0, 0.0d, ' ', ' ' };
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
    public void MethodUtils1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils2.MethodUtils1500");
        java.lang.Object obj0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) -1, (-1.0f) };
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
}

