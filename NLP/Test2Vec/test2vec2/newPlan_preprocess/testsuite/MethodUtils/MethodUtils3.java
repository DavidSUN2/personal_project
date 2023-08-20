package MethodUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MethodUtils3 {

    public static boolean debug = false;

    @Test
    public void MethodUtils1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1501");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0.0d, '#', (byte) 0, (-1.0f) };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 10, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1502");
        java.lang.Object[] objArray8 = new java.lang.Object[] { ' ', 10, (short) 100, '4', (short) 0, 100L };
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
    public void MethodUtils1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1503");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0.0d, 0, 'a' };
        java.lang.Class[] classArray7 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) "", "", objArray5, wildcardClassArray8);
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
    public void MethodUtils1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1504");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (-1.0f), 100.0d, ' ' };
        java.lang.Class<?>[] wildcardClassArray6 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) true, "", objArray5, wildcardClassArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Boolean");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1505");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 10L, 10.0f };
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
    public void MethodUtils1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1506");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 100, "hi!", 0.0f, 1.0d };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) 1, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1507");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (-1.0d), (short) 1, 10L };
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
    public void MethodUtils1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1508");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) -1 };
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
    public void MethodUtils1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1509");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1.0d, (byte) 100, 0.0d, "hi!" };
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
    public void MethodUtils1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1510");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0.0d, (-1L), (byte) 100 };
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
    public void MethodUtils1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1511");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 100, (byte) -1, '#' };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) 100, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1512");
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0.0f, 1, 100.0d, '4', (short) 100, (byte) -1 };
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
    public void MethodUtils1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1513");
        java.lang.Object obj0 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { false };
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
    public void MethodUtils1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1514");
        java.lang.Object[] objArray2 = null;
        java.lang.Class[] classArray4 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray5 = (java.lang.Class<?>[]) classArray4;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 1L, "hi!", objArray2, wildcardClassArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray5);
    }

    @Test
    public void MethodUtils1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1515");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 0, 0, (-1.0f) };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 'a', "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1516");
        java.lang.Object[] objArray4 = new java.lang.Object[] { "hi!", '4' };
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
    public void MethodUtils1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1517");
        java.lang.Object[] objArray7 = new java.lang.Object[] { false, (short) 1, (-1.0d), (byte) 10, (byte) 100 };
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
    public void MethodUtils1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1518");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 10.0d };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 0, "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1519");
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100L, (short) 100, "", (-1.0d), (short) 1, 'a' };
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
    public void MethodUtils1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1520");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d) };
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
    public void MethodUtils1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1521");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100L, (short) 100 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (byte) 0, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1522");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10, (byte) -1, 'a', (-1L), 100.0f };
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
    public void MethodUtils1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1523");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils3 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) 1, methodUtils3 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (short) 1, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1524");
        java.lang.Object[] objArray5 = new java.lang.Object[] { "", 0L, '#' };
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
    public void MethodUtils1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1525");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 10 };
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
    public void MethodUtils1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1526");
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100.0f, 10L, 'a', (short) -1, 1, (-1.0f) };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) 1, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1527");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Class[] classArray4 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray5 = (java.lang.Class<?>[]) classArray4;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 1.0d, "", objArray2, (java.lang.Class<?>[]) classArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
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
    public void MethodUtils1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1528");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1.0d, '#' };
        java.lang.Class[] classArray6 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray7 = (java.lang.Class<?>[]) classArray6;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) -1, "", objArray4, wildcardClassArray7);
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
    public void MethodUtils1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1529");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils4 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100L, 0, methodUtils4, false, 'a' };
        java.lang.Class<?>[] wildcardClassArray8 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) false, "hi!", objArray7, wildcardClassArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Boolean");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1530");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (-1L), "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1531");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1L, (short) -1 };
        java.lang.Class[] classArray6 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray7 = (java.lang.Class<?>[]) classArray6;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (byte) 100, "", objArray4, wildcardClassArray7);
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
    public void MethodUtils1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1532");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10.0f, 100L, 0.0f, 10.0f, 0.0d };
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
    public void MethodUtils1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1533");
        java.lang.Object[] objArray3 = new java.lang.Object[] { ' ' };
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
    public void MethodUtils1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1534");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 0 };
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
    public void MethodUtils1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1535");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0.0d, (-1.0f), (-1), 1, 100.0f, (-1L) };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) methodUtils0, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: org.apache.commons.lang3.reflect.MethodUtils");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1536");
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (-1.0d), wildcardClass4 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (byte) 0, "", objArray5);
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
    public void MethodUtils1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1537");
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1.0d, 0L, (short) 1, 0.0f, 10.0f, 10L };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 1.0f, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1538");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils4 = new org.apache.commons.lang3.reflect.MethodUtils();
        org.apache.commons.lang3.reflect.MethodUtils methodUtils5 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass6 = methodUtils5.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { ' ', '#', methodUtils4, methodUtils5, 1.0d };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) 10, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1539");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
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
    public void MethodUtils1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1540");
        java.lang.Object[] objArray3 = new java.lang.Object[] { '#' };
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
    public void MethodUtils1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1541");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1, "hi!" };
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
    public void MethodUtils1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1542");
        java.lang.Object[] objArray3 = new java.lang.Object[] { ' ' };
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
    public void MethodUtils1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1543");
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 10, (short) 0, (-1), wildcardClass6, (short) -1 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 0L, "hi!", objArray8);
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
    public void MethodUtils1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1544");
        java.lang.Object[] objArray5 = new java.lang.Object[] { true, 100, 10.0f };
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
    public void MethodUtils1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1545");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray6 = new java.lang.Object[] { obj2, (byte) 0, '4', 1.0f };
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
    public void MethodUtils1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1546");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 10, 10 };
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
    public void MethodUtils1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1547");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100, 100.0d, 0.0f, (short) 1, 1.0d };
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
    public void MethodUtils1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1548");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray3 = new java.lang.Object[] { obj2 };
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
    public void MethodUtils1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1549");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray4 = new java.lang.Object[] { methodUtils2, (byte) -1 };
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
    public void MethodUtils1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1550");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (-1.0f), "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1551");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 0.0f };
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
    public void MethodUtils1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1552");
        java.lang.Object[] objArray5 = new java.lang.Object[] { ' ', (-1.0f), 10.0d };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 100, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1553");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, (-1), (byte) 10, (-1.0f) };
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
    public void MethodUtils1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1554");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Class[] classArray4 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray5 = (java.lang.Class<?>[]) classArray4;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) true, "hi!", objArray2, (java.lang.Class<?>[]) classArray4);
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
    public void MethodUtils1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1555");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10L, (-1L), "" };
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
    public void MethodUtils1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1556");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 100 };
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
    public void MethodUtils1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1557");
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 100, true, 0L, true, true };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 0.0f, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1558");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 10, "hi!" };
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
    public void MethodUtils1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1559");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100.0f, "", '4', (byte) 10, (-1) };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 10L, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1560");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 10, 0.0d, 10.0f, 0.0f, (-1) };
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
    public void MethodUtils1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1561");
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100L, (short) 0, (-1.0d), obj5, 1L, 10.0f };
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
    public void MethodUtils1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1562");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 1.0d };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 1.0d, "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1563");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100.0f, 100, 100L };
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
    public void MethodUtils1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1564");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) -1, "hi!", 0.0d, (short) 100 };
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
    public void MethodUtils1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1565");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (-1.0d), (byte) 100, 1.0f };
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
    public void MethodUtils1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1566");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 0L };
        java.lang.Class<?>[] wildcardClassArray4 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (byte) 10, "", objArray3, wildcardClassArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1567");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 0.0f, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1568");
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) -1, 1.0f, 1, 100L, (short) -1 };
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
    public void MethodUtils1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1569");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1.0f, (-1L), (short) 0 };
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
    public void MethodUtils1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1570");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 1.0d };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 0, "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1571");
        java.lang.Object obj3 = new java.lang.Object();
        org.apache.commons.lang3.reflect.MethodUtils methodUtils4 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1.0d, obj3, methodUtils4, 100L };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) "hi!", "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.String");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1572");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1.0f, 0, '4', (-1.0d), 100 };
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
    public void MethodUtils1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1573");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 0.0f, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1574");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 10.0d, 10 };
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
    public void MethodUtils1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1575");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d) };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) '#', "hi!", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1576");
        java.lang.Object[] objArray7 = new java.lang.Object[] { '4', 100.0d, 100.0d, (byte) 0, 100L };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 1.0f, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1577");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) -1 };
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
    public void MethodUtils1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1578");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0, 0L };
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
    public void MethodUtils1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1579");
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1), true, (-1L), 100.0f, (-1.0f) };
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
    public void MethodUtils1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1580");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { obj2, ' ', (short) 0, 1.0d, 0.0f };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 100, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1581");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100.0f, 1.0f, 1.0f };
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
    public void MethodUtils1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1582");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0, ' ', (byte) -1, 0.0f, 10L };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (short) -1, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1583");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) -1, 1, (short) 10 };
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
    public void MethodUtils1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1584");
        java.lang.Object[] objArray6 = new java.lang.Object[] { true, 0, (-1L), (byte) -1 };
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
    public void MethodUtils1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1585");
        java.lang.Object[] objArray5 = new java.lang.Object[] { '#', (short) 1, (short) 10 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 1, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1586");
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 10, obj3 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (byte) 100, "", objArray5);
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
    public void MethodUtils1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1587");
        java.lang.Object[] objArray8 = new java.lang.Object[] { ' ', 100, (byte) 10, false, (byte) 10, (-1.0f) };
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
    public void MethodUtils1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1588");
        java.lang.Object obj0 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 10, 100.0d, 1.0d };
        java.lang.Class[] classArray7 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod(obj0, "", objArray5, wildcardClassArray8);
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
    public void MethodUtils1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1589");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1L, 10.0f };
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
    public void MethodUtils1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1590");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0.0f, '4', '4', 100L, true };
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
    public void MethodUtils1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1591");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1, "hi!", true, "hi!" };
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
    public void MethodUtils1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1592");
        java.lang.Object[] objArray5 = new java.lang.Object[] { "hi!", 100L, 100L };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (byte) 0, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1593");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0L, (short) 10, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (-1.0f), "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1594");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0L, (byte) 0 };
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
    public void MethodUtils1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1595");
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100, '4', (short) 1, 100.0f, 100, false };
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
    public void MethodUtils1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1596");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, '4', 0 };
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
    public void MethodUtils1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1597");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0.0d, (-1) };
        java.lang.Class[] classArray7 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod(obj0, "hi!", objArray5, (java.lang.Class<?>[]) classArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Object");
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
    public void MethodUtils1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1598");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 100 };
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
    public void MethodUtils1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1599");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray4 = new java.lang.Object[] { methodUtils2, (short) 1 };
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
    public void MethodUtils1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1600");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass1 = methodUtils0.getClass();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Object[] objArray6 = new java.lang.Object[] { '4', obj4, false };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) wildcardClass1, "", objArray6);
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
    public void MethodUtils1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1601");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10.0d, 0, 10.0f, (byte) -1 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(obj0, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Object");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1602");
        java.lang.Object obj0 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10L, 1.0d, wildcardClass5, (byte) 10 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod(obj0, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1603");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0.0d, (byte) 0, 100, (byte) 0 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod(obj0, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Object");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1604");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.apache.commons.lang3.reflect.MethodUtils methodUtils3 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass4 = methodUtils3.getClass();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { methodUtils3, wildcardClass6, ' ' };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod(obj0, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Object");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1605");
        java.lang.Object[] objArray8 = new java.lang.Object[] { "hi!", 0, 0.0d, (-1.0f), 'a', "" };
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
    public void MethodUtils1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1606");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils5 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass6 = methodUtils5.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100.0f, ' ', 100.0d, wildcardClass6 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (-1.0d), "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1607");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils0 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass1 = methodUtils0.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0, 1.0d };
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
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray8);
    }

    @Test
    public void MethodUtils1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1608");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1.0d, 0L, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) 1, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1609");
        java.lang.Object obj2 = new java.lang.Object();
        org.apache.commons.lang3.reflect.MethodUtils methodUtils4 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass5 = methodUtils4.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { obj2, (-1.0f), wildcardClass5 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 0.0f, "hi!", objArray6);
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
    public void MethodUtils1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1610");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 100.0f, (byte) 0, '4', (byte) -1 };
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
    public void MethodUtils1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1611");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1.0d, 1.0d, 100.0f };
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
    public void MethodUtils1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1612");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10.0f, 10, (byte) 100, (byte) 0 };
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
    public void MethodUtils1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1613");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0.0f, (-1L), 1 };
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
    public void MethodUtils1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1614");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0, 1 };
        java.lang.Class<?>[] wildcardClassArray5 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 100, "hi!", objArray4, wildcardClassArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Integer");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1615");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 100.0d };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 1.0d, "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1616");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Class[] classArray4 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray5 = (java.lang.Class<?>[]) classArray4;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) '4', "", objArray2, (java.lang.Class<?>[]) classArray4);
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
    public void MethodUtils1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1617");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 10.0d, 0.0f };
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
    public void MethodUtils1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1618");
        java.lang.Object[] objArray3 = new java.lang.Object[] { "hi!" };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 'a', "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1619");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 0, 1, (byte) -1, 1 };
        java.lang.Class<?>[] wildcardClassArray7 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (-1.0d), "", objArray6, wildcardClassArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1620");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) '#', "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
    }

    @Test
    public void MethodUtils1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1621");
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100.0f, 10.0d, (-1.0f), 10, 0.0f, (short) 0 };
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
    public void MethodUtils1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1622");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1.0d), (byte) -1, (-1), 100.0f };
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
    public void MethodUtils1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1623");
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100L, obj3, 100.0d, 1, (short) 10, (byte) -1 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (short) 0, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Short");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1624");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils4 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1L), (byte) -1, methodUtils4, (byte) -1, (short) 100, 10 };
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
    public void MethodUtils1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1625");
        java.lang.Object obj0 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 0, "", 100, 1L };
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
    public void MethodUtils1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1626");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 1, 100L, '4', 10 };
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
    public void MethodUtils1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1627");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass3 = methodUtils2.getClass();
        java.lang.Object[] objArray4 = new java.lang.Object[] { wildcardClass3 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) "", "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.String");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1628");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1 };
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
    public void MethodUtils1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1629");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 100.0d };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 100.0f, "hi!", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1630");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray4 = new java.lang.Object[] { wildcardClass3 };
        java.lang.Class[] classArray6 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray7 = (java.lang.Class<?>[]) classArray6;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 10.0d, "", objArray4, (java.lang.Class<?>[]) classArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
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
    public void MethodUtils1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1631");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, false, 0L, (byte) 1, 10.0d };
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
    public void MethodUtils1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1632");
        java.lang.Object obj0 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1) };
        java.lang.Class[] classArray5 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray6 = (java.lang.Class<?>[]) classArray5;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(obj0, "", objArray3, wildcardClassArray6);
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
    public void MethodUtils1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1633");
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (-1), true, obj4 };
        java.lang.Class<?>[] wildcardClassArray6 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 1.0d, "", objArray5, wildcardClassArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1634");
        java.lang.Object[] objArray4 = new java.lang.Object[] { "", "hi!" };
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
    public void MethodUtils1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1635");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) -1 };
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
    public void MethodUtils1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1636");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0, ' ' };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) '4', "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Character");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1637");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 10, ' ', '4' };
        java.lang.Class[] classArray7 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (-1), "", objArray5, (java.lang.Class<?>[]) classArray7);
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
    public void MethodUtils1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1638");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils3 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass4 = methodUtils3.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1.0d, methodUtils3, 10 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 10, "hi!", objArray6);
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
    public void MethodUtils1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1639");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Class<?>[] wildcardClassArray3 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) false, "hi!", objArray2, wildcardClassArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Boolean");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void MethodUtils1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1640");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1, (byte) 100 };
        java.lang.Class[] classArray6 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray7 = (java.lang.Class<?>[]) classArray6;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) 1, "hi!", objArray4, (java.lang.Class<?>[]) classArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Byte");
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
    public void MethodUtils1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1641");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass3 = methodUtils2.getClass();
        java.lang.Object[] objArray4 = new java.lang.Object[] { methodUtils2 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 10.0d, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1642");
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) -1, (-1L), obj4, true };
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
    public void MethodUtils1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1643");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 100, (short) 1, 100L, 10 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 100.0f, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1644");
        java.lang.Object[] objArray4 = new java.lang.Object[] { true, 1 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 10L, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: hi!() on object: java.lang.Long");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1645");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1L) };
        java.lang.Class<?>[] wildcardClassArray4 = null;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (-1.0d), "", objArray3, wildcardClassArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void MethodUtils1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1646");
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 100, wildcardClass4, 100.0f };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) (short) 1, "", objArray6);
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
    public void MethodUtils1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1647");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 0.0d };
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
    public void MethodUtils1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1648");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 100.0f };
        java.lang.Class[] classArray5 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray6 = (java.lang.Class<?>[]) classArray5;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 10.0d, "", objArray3, wildcardClassArray6);
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
    public void MethodUtils1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1649");
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1, (-1.0d), 0L, obj5, 100L };
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
    public void MethodUtils1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1650");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { methodUtils2, obj3, '4', false, 0.0d, (byte) 1 };
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
    public void MethodUtils1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1651");
        java.lang.Object[] objArray3 = new java.lang.Object[] { false };
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
    public void MethodUtils1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1652");
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 0, (-1.0f), 100.0d, 10L, 10L };
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
    public void MethodUtils1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1653");
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0.0d, 10, obj4, 10L };
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
    public void MethodUtils1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1654");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { obj2, 100.0d, 0.0d, "", true };
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
    public void MethodUtils1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1655");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.reflect.MethodUtils methodUtils3 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass4 = methodUtils3.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0.0d, wildcardClass4 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod(obj0, "hi!", objArray5);
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
    public void MethodUtils1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1656");
        java.lang.Object obj0 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 100.0d };
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
    public void MethodUtils1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1657");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', 0.0f };
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
    public void MethodUtils1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1658");
        java.lang.Object obj0 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100.0d, 10, "hi!" };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(obj0, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1659");
        java.lang.Object obj0 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 100.0f, 100.0f, (-1.0f), 1 };
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
    public void MethodUtils1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1660");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0L, 100L, 100.0d, true };
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
    public void MethodUtils1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1661");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ' ', '#' };
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
    public void MethodUtils1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1662");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { "hi!", (short) -1, (short) 0, "", 1.0d };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) wildcardClass1, "", objArray8);
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
    public void MethodUtils1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1663");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils3 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass4 = methodUtils3.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 100, wildcardClass4 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 10.0f, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void MethodUtils1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1664");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100, 1.0d, obj5, 0.0d };
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
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void MethodUtils1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1665");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 10L, (-1L) };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 0.0d, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Double");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1666");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1.0d };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(obj0, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Object");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void MethodUtils1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1667");
        org.apache.commons.lang3.reflect.MethodUtils methodUtils2 = new org.apache.commons.lang3.reflect.MethodUtils();
        java.lang.Class<?> wildcardClass3 = methodUtils2.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { wildcardClass3, (short) 10, 0.0f, 100 };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) -1, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Byte");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void MethodUtils1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1668");
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100L, 100, (short) -1, '#', 0L, "" };
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
    public void MethodUtils1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1669");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Class[] classArray4 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray5 = (java.lang.Class<?>[]) classArray4;
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 100, "", objArray2, wildcardClassArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Integer");
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
    public void MethodUtils1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1670");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray4 = new java.lang.Object[] { obj2 };
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
    public void MethodUtils1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1671");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10.0d, "", "", true };
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
    public void MethodUtils1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1672");
        java.lang.Object[] objArray4 = new java.lang.Object[] { "", 10.0f };
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
    public void MethodUtils1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1673");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 100.0d, 100, '4', 100.0d };
        // The following exception was thrown during execution in MethodUtils generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) 100.0f, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No such accessible method: () on object: java.lang.Float");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void MethodUtils1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1674");
        java.lang.Object obj0 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1.0d, 1.0d, (short) 0, 10L };
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
    public void MethodUtils1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1675");
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0.0d, 0, '#', 10.0f, (byte) 10, (byte) 0 };
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
    public void MethodUtils1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MethodUtils3.MethodUtils1676");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1L, true, (short) 100, 100L };
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
}

