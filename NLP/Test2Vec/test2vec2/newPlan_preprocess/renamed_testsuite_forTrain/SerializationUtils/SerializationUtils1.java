
package SerializationUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SerializationUtils1 {

    public static boolean debug = false;

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0501");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.lang.Class<?> wildcardClass6 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0502");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize(serializable3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        java.io.Serializable serializable7 = org.apache.commons.lang3.SerializationUtils.clone(serializable6);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize(serializable7);
        java.lang.Class<?> wildcardClass9 = serializable7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0503");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.reflect.Type type4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        org.apache.commons.lang3.SerializationUtils serializationUtils5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray6);
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray6, outputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(type4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializationUtils5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0504");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.lang.Integer to [B");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0505");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.lang.Long to java.lang.Class");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0506");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.clone(byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils serializationUtils6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast [B to org.apache.commons.lang3.SerializationUtils");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0507");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.reflect.GenericDeclaration genericDeclaration4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.lang.reflect.Type type6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray2);
        java.lang.String str7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(genericDeclaration4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(type6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0508");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        java.lang.Class<?> wildcardClass5 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0509");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize(serializable3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        java.lang.Class<?> wildcardClass8 = byteArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0510");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable5 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray4);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = byteArray7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(byteArray7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0511");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2, outputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0512");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        java.lang.Class<?> wildcardClass7 = byteArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0513");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass3);
        java.lang.Class<?> wildcardClass5 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass3);
        java.lang.Class<?> wildcardClass6 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass3);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass3);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray7);
        java.lang.Class<?> wildcardClass9 = byteArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0514");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass4 = byteArray2.getClass();
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray6);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.clone(byteArray7);
        java.lang.Class<?> wildcardClass9 = byteArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0515");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 1);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.lang.Short to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0516");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0f);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4, outputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0517");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        java.lang.reflect.AnnotatedElement annotatedElement2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(annotatedElement2);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0518");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0f);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) wildcardClass2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize(serializable4);
        java.lang.Class<?> wildcardClass6 = serializable4.getClass();
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize(serializable4, outputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0519");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.reflect.GenericDeclaration genericDeclaration5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.lang.Class<?> wildcardClass7 = byteArray6.getClass();
        java.lang.Class<?> wildcardClass8 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass7);
        java.io.Serializable serializable9 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(genericDeclaration5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0520");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass5 = byteArray4.getClass();
        java.lang.Class<?> wildcardClass6 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass6);
        java.lang.Class<?> wildcardClass8 = byteArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0521");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils serializationUtils2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.lang.Double to org.apache.commons.lang3.SerializationUtils");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0522");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.lang.Class<?> wildcardClass6 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2, outputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0523");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        java.lang.reflect.Type type6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.clone(byteArray4);
        java.lang.Object obj8 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        java.io.Serializable serializable9 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(type6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0524");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 1);
        java.lang.Object obj2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.Class<?> wildcardClass4 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj2 + "' != '" + (short) 1 + "'", obj2.equals((short) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0525");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.clone(byteArray2);
        java.lang.reflect.GenericDeclaration genericDeclaration4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass6 = byteArray5.getClass();
        java.lang.Class<?> wildcardClass7 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(genericDeclaration4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0526");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.lang.Class<?> wildcardClass5 = byteArray4.getClass();
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0527");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize(serializable3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        java.io.Serializable serializable7 = org.apache.commons.lang3.SerializationUtils.clone(serializable6);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize(serializable7);
        byte[] byteArray9 = org.apache.commons.lang3.SerializationUtils.clone(byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0528");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Comparable<java.lang.String> strComparable2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Comparable<java.lang.String> strComparable3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type type4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.lang.Integer to java.lang.reflect.Type");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable2 + "' != '" + 0 + "'", strComparable2.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable3 + "' != '" + 0 + "'", strComparable3.equals(0));
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0529");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize(serializable3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        java.io.Serializable serializable7 = org.apache.commons.lang3.SerializationUtils.clone(serializable6);
        java.lang.Class<?> wildcardClass8 = serializable7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0530");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils serializationUtils6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast [B to org.apache.commons.lang3.SerializationUtils");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0531");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3, outputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0532");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.lang.Object obj5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3, outputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0533");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5, outputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0534");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.reflect.GenericDeclaration genericDeclaration3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.io.OutputStream outputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1, outputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(genericDeclaration3);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0535");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.io.Serializable serializable5 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast [B to java.lang.CharSequence");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0536");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize(serializable3);
        java.lang.Class<?> wildcardClass5 = serializable3.getClass();
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize(serializable3, outputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0537");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        java.lang.Class<?> wildcardClass6 = byteArray4.getClass();
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass6);
        java.lang.Class<?> wildcardClass8 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass6);
        byte[] byteArray9 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0538");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.CharSequence charSequence5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.CharSequence charSequence6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1, outputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0539");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        java.lang.Comparable<java.lang.String> strComparable2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Comparable<java.lang.String> strComparable3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4, outputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strComparable2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strComparable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0540");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray6);
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray7, outputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0541");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils serializationUtils5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast [B to org.apache.commons.lang3.SerializationUtils");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0542");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) wildcardClass2);
        java.io.OutputStream outputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize(serializable3, outputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable3);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0543");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Comparable<java.lang.String> strComparable2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Comparable<java.lang.String> strComparable3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass6 = byteArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable2 + "' != '" + 0 + "'", strComparable2.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable3 + "' != '" + 0 + "'", strComparable3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0544");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Comparable<java.lang.String> strComparable4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast [B to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strComparable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0545");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 1);
        java.lang.Object obj2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Object obj3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Class<?> wildcardClass4 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass5 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj2 + "' != '" + (short) 1 + "'", obj2.equals((short) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 1 + "'", obj3.equals((short) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0546");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass4 = byteArray2.getClass();
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0547");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        java.lang.Class<?> wildcardClass5 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0548");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        org.apache.commons.lang3.SerializationUtils serializationUtils4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Class<?> wildcardClass5 = byteArray1.getClass();
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type type8 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast [B to java.lang.reflect.Type");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializationUtils4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0549");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 1.0f);
        java.io.OutputStream outputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1, outputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0550");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize(serializable6);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize(serializable6);
        java.lang.Class<?> wildcardClass9 = byteArray8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0551");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        java.lang.reflect.AnnotatedElement annotatedElement7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        java.lang.Class<?> wildcardClass9 = byteArray8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElement7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0552");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        java.lang.Class<?> wildcardClass5 = byteArray3.getClass();
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass5, outputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0553");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        java.lang.Class<?> wildcardClass6 = byteArray4.getClass();
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass6);
        java.lang.Class<?> wildcardClass8 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass6);
        java.lang.Class<?> wildcardClass9 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0554");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.Class<?> wildcardClass4 = byteArray1.getClass();
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4, outputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0555");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast [B to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0556");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) true, outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0557");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray6);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray7);
        java.lang.Class<?> wildcardClass9 = byteArray8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0558");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.lang.Class<?> wildcardClass6 = byteArray5.getClass();
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        java.lang.Class<?> wildcardClass8 = byteArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0559");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0560");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize(serializable3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.clone(byteArray4);
        java.lang.Object obj8 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray7);
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0561");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 10.0f);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 10.0f);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.lang.Class<?> wildcardClass5 = byteArray4.getClass();
        java.lang.Class<?> wildcardClass6 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass5);
        java.lang.Class<?> wildcardClass7 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass5);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0562");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 1);
        java.lang.Object obj2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray3);
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3, outputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj2 + "' != '" + (short) 1 + "'", obj2.equals((short) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0563");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0f);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type type3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.lang.Float to java.lang.reflect.Type");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0564");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass4 = byteArray2.getClass();
        java.io.Serializable serializable5 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize(serializable5, outputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0565");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0d);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.io.Serializable serializable5 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray4);
        java.lang.reflect.Type type6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4, outputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(type6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0566");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.clone(byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3, outputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0567");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray3);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.io.Serializable serializable9 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0568");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize(serializable3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.lang.Class<?> wildcardClass6 = byteArray5.getClass();
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0569");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 1);
        java.lang.Object obj2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj2 + "' != '" + (short) 1 + "'", obj2.equals((short) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0570");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0L, outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0571");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray4);
        java.lang.reflect.Type type6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        java.lang.Class<?> wildcardClass7 = byteArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(type6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0572");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize(serializable6);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.clone(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0573");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 1);
        java.lang.Object obj2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.Class<?> wildcardClass4 = byteArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj2 + "' != '" + (short) 1 + "'", obj2.equals((short) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0574");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        java.lang.Class<?> wildcardClass6 = byteArray4.getClass();
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass6);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray7);
        java.lang.reflect.AnnotatedElement annotatedElement9 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElement9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0575");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        java.lang.Class<?> wildcardClass6 = byteArray5.getClass();
        java.lang.Class<?> wildcardClass7 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0576");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray4);
        java.lang.reflect.AnnotatedElement annotatedElement6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElement6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0577");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.lang.reflect.Type type6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        java.lang.Class<?> wildcardClass7 = byteArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(type6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0578");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.lang.Class<?> wildcardClass5 = byteArray4.getClass();
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4, outputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0579");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.lang.Class<?> wildcardClass5 = byteArray3.getClass();
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass5);
        java.lang.Class<?> wildcardClass7 = byteArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0580");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.String str4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray2);
        java.lang.CharSequence charSequence5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0581");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 1);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.io.OutputStream outputStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1, outputStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0582");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        java.lang.Class<?> wildcardClass6 = byteArray4.getClass();
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass6);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast [B to java.lang.Class");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0583");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize(serializable3);
        java.lang.Class<?> wildcardClass5 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0584");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 10.0f);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 10.0f);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass4 = byteArray2.getClass();
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0585");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0d);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.lang.Class<?> wildcardClass5 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0586");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray2.getClass();
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        java.lang.Class<?> wildcardClass6 = byteArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0587");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        java.lang.reflect.Type type7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = type7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(type7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0588");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.Comparable<java.lang.String> strComparable4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Class<?> wildcardClass5 = byteArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strComparable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0589");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0d);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.lang.Class<?> wildcardClass5 = byteArray3.getClass();
        java.lang.Class<?> wildcardClass6 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass6);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.clone(byteArray7);
        java.lang.Class<?> wildcardClass9 = byteArray8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0590");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 'a');
        java.io.Serializable serializable2 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.Object obj4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0591");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray2.getClass();
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass3);
        java.lang.Class<?> wildcardClass5 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass3);
        java.lang.Class<?> wildcardClass6 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass5);
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray7, outputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0592");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray5);
        java.lang.Class<?> wildcardClass7 = byteArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0593");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence8 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast [B to java.lang.CharSequence");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0594");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.clone(byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        java.lang.Class<?> wildcardClass6 = byteArray3.getClass();
        java.lang.Class<?> wildcardClass7 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass6);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0595");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) -1);
        java.lang.Object obj2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.io.OutputStream outputStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1, outputStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj2 + "' != '" + (short) -1 + "'", obj2.equals((short) -1));
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0596");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Class<?> wildcardClass4 = byteArray1.getClass();
        java.io.Serializable serializable5 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) wildcardClass4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray7, outputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0597");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.lang.Class<?> wildcardClass5 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) wildcardClass5);
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize(serializable6, outputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0598");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Comparable<java.lang.String> strComparable2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.Class<?> wildcardClass4 = byteArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable2 + "' != '" + 0 + "'", strComparable2.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0599");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Comparable<java.lang.String> strComparable2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.lang.Class<?> wildcardClass5 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable2 + "' != '" + 0 + "'", strComparable2.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0600");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        java.lang.Comparable<java.lang.String> strComparable2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Comparable<java.lang.String> strComparable3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray7);
        byte[] byteArray9 = org.apache.commons.lang3.SerializationUtils.clone(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strComparable2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strComparable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0601");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast [B to java.lang.CharSequence");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0602");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.Object obj4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5, outputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0603");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray5);
        java.lang.reflect.GenericDeclaration genericDeclaration7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        java.lang.Class<?> wildcardClass8 = genericDeclaration7.getClass();
        byte[] byteArray9 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0604");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.reflect.Type type4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        org.apache.commons.lang3.SerializationUtils serializationUtils5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.reflect.Type type7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray6);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray6);
        java.lang.Class<?> wildcardClass9 = byteArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(type4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializationUtils5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(type7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0605");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5, outputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0606");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass4 = byteArray2.getClass();
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5, outputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0607");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0d);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.io.Serializable serializable5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        java.lang.Class<?> wildcardClass6 = byteArray4.getClass();
        java.io.Serializable serializable7 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) wildcardClass6);
        java.io.Serializable serializable8 = org.apache.commons.lang3.SerializationUtils.clone(serializable7);
        java.io.Serializable serializable9 = org.apache.commons.lang3.SerializationUtils.clone(serializable7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0608");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.clone(byteArray2);
        java.lang.reflect.GenericDeclaration genericDeclaration4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast [B to java.lang.Class");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(genericDeclaration4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0609");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.clone(byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.lang.Double to java.lang.Class");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0610");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.String str4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0611");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Comparable<java.lang.String> strComparable2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Comparable<java.lang.String> strComparable3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass6 = byteArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable2 + "' != '" + 0 + "'", strComparable2.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable3 + "' != '" + 0 + "'", strComparable3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0612");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0613");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 1);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 1);
        java.io.OutputStream outputStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 1, outputStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0614");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.lang.Class to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0615");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        java.io.Serializable serializable8 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0616");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0617");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.lang.Class<?> wildcardClass7 = byteArray6.getClass();
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass7, outputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0618");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.reflect.GenericDeclaration genericDeclaration5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.GenericDeclaration genericDeclaration7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast [B to java.lang.reflect.GenericDeclaration");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(genericDeclaration5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0619");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0d);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.io.OutputStream outputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass3, outputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0620");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass4 = byteArray2.getClass();
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type type7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast [B to java.lang.reflect.Type");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0621");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.io.Serializable serializable5 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize(serializable5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0622");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass5 = byteArray4.getClass();
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0623");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0f);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2, outputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0624");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize(serializable3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5, outputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0625");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.reflect.Type type4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        org.apache.commons.lang3.SerializationUtils serializationUtils5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.reflect.Type type7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray6);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray6);
        byte[] byteArray9 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(type4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializationUtils5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(type7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0626");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 10.0f);
        java.io.Serializable serializable2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Object obj3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + 10.0f + "'", serializable2.equals(10.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 10.0f + "'", obj3.equals(10.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0627");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) ' ');
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) ' ');
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) ' ');
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0628");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.lang.Class<?> wildcardClass6 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.lang.Class<?> wildcardClass8 = byteArray7.getClass();
        java.lang.Class<?> wildcardClass9 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0629");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        java.io.Serializable serializable9 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0630");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass4 = byteArray2.getClass();
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray6);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.clone(byteArray7);
        java.lang.Object obj9 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0631");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Class<?> wildcardClass4 = byteArray1.getClass();
        java.io.Serializable serializable5 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) wildcardClass4);
        java.lang.Class<?> wildcardClass6 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass4);
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4, outputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0632");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass6 = byteArray1.getClass();
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1, outputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0633");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.lang.Object obj5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj5.toString(), "class [B");
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0634");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray6, outputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0635");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray3);
        java.lang.Class<?> wildcardClass7 = serializable6.getClass();
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass7);
        byte[] byteArray9 = org.apache.commons.lang3.SerializationUtils.clone(byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0636");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        org.apache.commons.lang3.SerializationUtils serializationUtils4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type type6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast [B to java.lang.reflect.Type");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializationUtils4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0637");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray2.getClass();
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass5 = byteArray2.getClass();
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) wildcardClass5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass5);
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass5, outputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0638");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize(serializable3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.clone(byteArray4);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        byte[] byteArray9 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0639");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 1);
        java.lang.Object obj2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.lang.Short to [B");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj2 + "' != '" + (short) 1 + "'", obj2.equals((short) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0640");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Class<?> wildcardClass4 = byteArray1.getClass();
        java.io.Serializable serializable5 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) wildcardClass4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        java.lang.Class<?> wildcardClass7 = byteArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0641");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Comparable<java.lang.String> strComparable4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.reflect.AnnotatedElement annotatedElement5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = annotatedElement5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strComparable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(annotatedElement5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0642");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass4 = byteArray2.getClass();
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        java.io.Serializable serializable7 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray6);
        java.lang.Class<?> wildcardClass8 = serializable7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0643");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.clone(byteArray2);
        java.lang.Class<?> wildcardClass4 = byteArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0644");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 'a');
        java.io.Serializable serializable2 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray1);
        java.lang.Class<?> wildcardClass3 = serializable2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0645");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray5);
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5, outputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0646");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0647");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        java.lang.Comparable<java.lang.String> strComparable2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Comparable<java.lang.String> strComparable3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast [B to java.lang.CharSequence");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strComparable2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strComparable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0648");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.Object obj4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type type7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast [B to java.lang.reflect.Type");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0649");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        java.lang.Class<?> wildcardClass5 = byteArray3.getClass();
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass5);
        java.lang.Class<?> wildcardClass7 = byteArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0650");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray2.getClass();
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass3);
        java.lang.Class<?> wildcardClass5 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass3);
        java.lang.Class<?> wildcardClass6 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass5);
        java.lang.Class<?> wildcardClass8 = byteArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0651");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.lang.Object obj6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass7, outputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0652");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.reflect.Type type4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        org.apache.commons.lang3.SerializationUtils serializationUtils5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast [B to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(type4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializationUtils5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0653");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.lang.Object obj6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0654");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        java.lang.Class<?> wildcardClass6 = byteArray5.getClass();
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass6, outputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0655");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.lang.Class<?> wildcardClass5 = byteArray3.getClass();
        java.lang.Class<?> wildcardClass6 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0656");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.clone(byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        java.lang.Object obj6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type type7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.lang.Double to java.lang.reflect.Type");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (-1.0d) + "'", obj6.equals((-1.0d)));
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0657");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        java.lang.Class<?> wildcardClass6 = byteArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0658");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0659");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2, outputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0660");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray2);
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2, outputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0661");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) "hi!");
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.GenericDeclaration genericDeclaration3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.lang.String to java.lang.reflect.GenericDeclaration");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0662");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        org.apache.commons.lang3.SerializationUtils serializationUtils4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Class<?> wildcardClass5 = byteArray1.getClass();
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        org.apache.commons.lang3.SerializationUtils serializationUtils8 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializationUtils4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializationUtils8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0663");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4, outputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0664");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        java.lang.Class<?> wildcardClass7 = byteArray6.getClass();
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray6);
        java.lang.Object obj9 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0665");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.lang.Class<?> wildcardClass6 = byteArray3.getClass();
        java.lang.Class<?> wildcardClass7 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass6);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass6);
        java.io.Serializable serializable9 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0666");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Comparable<java.lang.String> strComparable2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Comparable<java.lang.String> strComparable3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass7 = byteArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable2 + "' != '" + 0 + "'", strComparable2.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable3 + "' != '" + 0 + "'", strComparable3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0667");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass4 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0668");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.clone(byteArray2);
        java.lang.reflect.GenericDeclaration genericDeclaration4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray2);
        java.lang.CharSequence charSequence5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray2);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(genericDeclaration4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0669");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        java.lang.reflect.Type type6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.clone(byteArray4);
        java.lang.Object obj8 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        java.lang.CharSequence charSequence9 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(type6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0670");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.reflect.GenericDeclaration genericDeclaration5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.io.Serializable serializable7 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray4);
        java.lang.Class<?> wildcardClass8 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(genericDeclaration5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0671");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.reflect.GenericDeclaration genericDeclaration5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.lang.Class<?> wildcardClass7 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(genericDeclaration5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0672");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray4);
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5, outputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0673");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast [B to java.lang.Class");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0674");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 1);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0675");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        java.lang.Comparable<java.lang.String> strComparable2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Comparable<java.lang.String> strComparable3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.lang.CharSequence charSequence6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strComparable2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strComparable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0676");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        java.lang.Class<?> wildcardClass5 = byteArray3.getClass();
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass5);
        java.lang.Class<?> wildcardClass7 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0677");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.lang.Class<?> wildcardClass6 = byteArray5.getClass();
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        java.io.Serializable serializable8 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.GenericDeclaration genericDeclaration9 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast [B to java.lang.reflect.GenericDeclaration");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0678");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray6);
        java.io.Serializable serializable8 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0679");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass4 = byteArray2.getClass();
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        byte[] byteArray9 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0680");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 10.0f);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 10.0f);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.lang.Class<?> wildcardClass5 = byteArray4.getClass();
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray6);
        java.lang.Class<?> wildcardClass8 = byteArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0681");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable5 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray4);
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4, outputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0682");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        java.lang.reflect.AnnotatedElement annotatedElement7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElement7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0683");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable5 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray4);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray6);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.clone(byteArray6);
        byte[] byteArray9 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0684");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.String str4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray2);
        java.lang.Class<?> wildcardClass5 = byteArray2.getClass();
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass7 = byteArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0685");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable5 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray4);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.lang.Class<?> wildcardClass9 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0686");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0d);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.io.Serializable serializable5 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.clone(byteArray4);
        java.lang.Class<?> wildcardClass8 = byteArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0687");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.clone(byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type type6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast [B to java.lang.reflect.Type");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0688");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0689");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast [B to java.lang.Class");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0690");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 10.0f);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 10.0f);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.lang.Object obj6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0691");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0692");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.reflect.Type type4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        org.apache.commons.lang3.SerializationUtils serializationUtils5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1, outputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(type4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializationUtils5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0693");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) -1);
        java.lang.Object obj2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils serializationUtils3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.lang.Short to org.apache.commons.lang3.SerializationUtils");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj2 + "' != '" + (short) -1 + "'", obj2.equals((short) -1));
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0694");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        org.apache.commons.lang3.SerializationUtils serializationUtils4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Class<?> wildcardClass5 = byteArray1.getClass();
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray6);
        java.io.Serializable serializable8 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializationUtils4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0695");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Comparable<java.lang.String> strComparable3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray2);
        java.io.OutputStream outputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2, outputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strComparable3);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0696");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) "hi!");
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0697");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        java.lang.Comparable<java.lang.String> strComparable2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Comparable<java.lang.String> strComparable3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1, outputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strComparable2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strComparable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0698");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        org.apache.commons.lang3.SerializationUtils serializationUtils5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray2);
        java.lang.CharSequence charSequence6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray2);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializationUtils5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(byteArray7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0699");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize(serializable3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.GenericDeclaration genericDeclaration8 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast [B to java.lang.reflect.GenericDeclaration");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0700");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        java.lang.Comparable<java.lang.String> strComparable2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Comparable<java.lang.String> strComparable3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The byte[] must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strComparable2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strComparable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(byteArray8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0701");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0702");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.reflect.GenericDeclaration genericDeclaration4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray2);
        java.lang.String str5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(genericDeclaration4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0703");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        java.lang.Comparable<java.lang.String> strComparable9 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strComparable9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0704");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        byte[] byteArray9 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0705");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray3);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.GenericDeclaration genericDeclaration8 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast [B to java.lang.reflect.GenericDeclaration");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0706");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass3);
        java.lang.Class<?> wildcardClass5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0707");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0d);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3, outputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0708");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Comparable<java.lang.String> strComparable2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type type5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast [B to java.lang.reflect.Type");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable2 + "' != '" + 0 + "'", strComparable2.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0709");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        org.apache.commons.lang3.SerializationUtils serializationUtils4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.reflect.AnnotatedElement annotatedElement5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.reflect.GenericDeclaration genericDeclaration6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1, outputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializationUtils4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(annotatedElement5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(genericDeclaration6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0710");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast [B to java.lang.Class");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0711");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        java.lang.Class<?> wildcardClass5 = serializable4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0712");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        java.lang.reflect.Type type6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.clone(byteArray4);
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray7, outputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(type6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0713");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0714");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence8 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast [B to java.lang.CharSequence");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0715");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.lang.Object obj6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        java.lang.Class<?> wildcardClass9 = byteArray8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0716");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray4);
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5, outputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0717");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) wildcardClass3);
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass3, outputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0718");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.io.OutputStream outputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3, outputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0719");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 1);
        java.lang.Object obj2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Object obj3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Class<?> wildcardClass4 = byteArray1.getClass();
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1, outputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj2 + "' != '" + (short) 1 + "'", obj2.equals((short) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 1 + "'", obj3.equals((short) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0720");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 1);
        java.lang.Object obj2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray3);
        java.lang.Class<?> wildcardClass5 = serializable4.getClass();
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize(serializable4, outputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj2 + "' != '" + (short) 1 + "'", obj2.equals((short) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0721");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        java.lang.Class<?> wildcardClass6 = byteArray4.getClass();
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass6);
        java.lang.Class<?> wildcardClass8 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass6);
        java.lang.Class<?> wildcardClass9 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0722");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.CharSequence charSequence5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1, outputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0723");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize(serializable6);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize(serializable6);
        java.lang.Class<?> wildcardClass9 = serializable6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0724");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) "hi!");
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.OutputStream outputStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1, outputStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0725");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) wildcardClass2);
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) wildcardClass2);
        java.lang.Class<?> wildcardClass5 = serializable4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0726");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.io.Serializable serializable5 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.AnnotatedElement annotatedElement6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast [B to java.lang.reflect.AnnotatedElement");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0727");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) -1);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0728");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) "hi!");
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass4 = byteArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0729");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0d);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.io.Serializable serializable5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize(serializable5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray6);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray7);
        byte[] byteArray9 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0730");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Comparable<java.lang.String> strComparable2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.Class<?> wildcardClass4 = byteArray3.getClass();
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable2 + "' != '" + 0 + "'", strComparable2.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0731");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast [B to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0732");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass4 = byteArray2.getClass();
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.lang.Class to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0733");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass5 = byteArray4.getClass();
        java.lang.Class<?> wildcardClass6 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils serializationUtils8 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.lang.Class to org.apache.commons.lang3.SerializationUtils");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0734");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.clone(byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.GenericDeclaration genericDeclaration6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.lang.Double to java.lang.reflect.GenericDeclaration");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0735");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0736");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.reflect.Type type4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        org.apache.commons.lang3.SerializationUtils serializationUtils5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Comparable<java.lang.String> strComparable6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.reflect.Type type8 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(type4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializationUtils5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strComparable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(type8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0737");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        java.lang.Comparable<java.lang.String> strComparable2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Comparable<java.lang.String> strComparable3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray7);
        java.lang.Class<?> wildcardClass9 = byteArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strComparable2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strComparable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0738");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 1);
        java.lang.Object obj2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray3);
        java.lang.Class<?> wildcardClass5 = byteArray3.getClass();
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj2 + "' != '" + (short) 1 + "'", obj2.equals((short) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0739");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.clone(byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0740");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        java.lang.Comparable<java.lang.String> strComparable2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Comparable<java.lang.String> strComparable3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.io.Serializable serializable8 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strComparable2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strComparable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0741");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence8 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast [B to java.lang.CharSequence");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0742");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0f);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) wildcardClass2);
        java.lang.Class<?> wildcardClass5 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0743");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0d);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.lang.Class<?> wildcardClass6 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.io.Serializable serializable7 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) wildcardClass6);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize(serializable7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.lang.Class to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0744");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray4);
        java.lang.reflect.Type type6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        java.lang.Class<?> wildcardClass8 = byteArray7.getClass();
        java.lang.Class<?> wildcardClass9 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(type6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0745");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray6);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray7);
        java.lang.Class<?> wildcardClass9 = byteArray8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0746");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils serializationUtils7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.lang.Class to org.apache.commons.lang3.SerializationUtils");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0747");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass5 = byteArray4.getClass();
        java.lang.Class<?> wildcardClass6 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass6);
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass6, outputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0748");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) '#');
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) '#');
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0749");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0d);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.io.Serializable serializable5 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize(serializable5);
        java.lang.Class<?> wildcardClass7 = byteArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0750");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray2.getClass();
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass5 = byteArray2.getClass();
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) wildcardClass5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass5);
        java.lang.Class<?> wildcardClass8 = byteArray7.getClass();
        byte[] byteArray9 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0751");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0d);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray5);
        java.io.Serializable serializable7 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0752");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Comparable<java.lang.String> strComparable4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        java.lang.Class<?> wildcardClass8 = byteArray7.getClass();
        java.lang.Class<?> wildcardClass9 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strComparable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0753");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) '#');
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) '#');
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass5 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0754");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize(serializable6);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.clone(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type type9 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast [B to java.lang.reflect.Type");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0755");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.io.Serializable serializable5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray2);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray6, outputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1L) + "'", serializable5.equals((-1L)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0756");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.clone(byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.lang.Class<?> wildcardClass6 = byteArray5.getClass();
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass6);
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass6, outputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0757");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.CharSequence charSequence5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.CharSequence charSequence6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.CharSequence charSequence7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0758");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0d);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.lang.Class<?> wildcardClass6 = byteArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0759");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0d);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray6);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.clone(byteArray7);
        java.io.Serializable serializable9 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0760");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.Class<?> wildcardClass4 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass5 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0761");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.clone(byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3, outputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (-1.0d) + "'", serializable6.equals((-1.0d)));
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0762");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0f);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) wildcardClass2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize(serializable4);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.lang.Class to [B");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0763");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        java.lang.Comparable<java.lang.String> strComparable2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Comparable<java.lang.String> strComparable3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.String str4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) str4);
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5, outputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strComparable2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strComparable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0764");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.reflect.GenericDeclaration genericDeclaration4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        java.lang.Class<?> wildcardClass7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(genericDeclaration4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0765");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        java.lang.reflect.Type type5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        java.lang.Class<?> wildcardClass6 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(type5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0766");
        java.io.Serializable serializable1 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable1 + "' != '" + true + "'", serializable1.equals(true));
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0767");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        java.lang.Object obj7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray6);
        java.io.Serializable serializable8 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray6);
        java.lang.Class<?> wildcardClass9 = byteArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj7.toString(), "class [B");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0768");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.lang.Class<?> wildcardClass6 = byteArray3.getClass();
        java.lang.Class<?> wildcardClass7 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass6);
        java.io.Serializable serializable8 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0769");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray4);
        java.lang.Class<?> wildcardClass6 = byteArray5.getClass();
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5, outputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0770");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        java.lang.reflect.Type type6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.clone(byteArray4);
        java.lang.Object obj8 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        java.lang.Object obj9 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(type6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0771");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.lang.Class<?> wildcardClass5 = byteArray4.getClass();
        java.lang.Class<?> wildcardClass6 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass6);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.clone(byteArray7);
        byte[] byteArray9 = org.apache.commons.lang3.SerializationUtils.clone(byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0772");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0d);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.io.Serializable serializable5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize(serializable5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type type7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast [B to java.lang.reflect.Type");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0773");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 'a', outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0774");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.clone(byteArray2);
        java.lang.reflect.GenericDeclaration genericDeclaration4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass6 = byteArray5.getClass();
        java.io.Serializable serializable7 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(genericDeclaration4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0775");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Class<?> wildcardClass4 = byteArray1.getClass();
        java.io.Serializable serializable5 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) wildcardClass4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        java.lang.Class<?> wildcardClass7 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0776");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.reflect.Type type4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        org.apache.commons.lang3.SerializationUtils serializationUtils5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass7 = byteArray6.getClass();
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass7, outputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(type4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializationUtils5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0777");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.lang.Class<?> wildcardClass5 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray6);
        java.io.Serializable serializable8 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray6);
        java.io.Serializable serializable9 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0778");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass4 = byteArray2.getClass();
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type type8 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast [B to java.lang.reflect.Type");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0779");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.lang.reflect.Type type6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        java.lang.Class<?> wildcardClass7 = type6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(type6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0780");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        org.apache.commons.lang3.SerializationUtils serializationUtils5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray2);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializationUtils5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0781");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 10.0f);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0782");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.clone(byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        java.lang.Class<?> wildcardClass7 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (-1.0d) + "'", serializable6.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0783");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.clone(byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.lang.Class<?> wildcardClass6 = byteArray5.getClass();
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5, outputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0784");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        org.apache.commons.lang3.SerializationUtils serializationUtils4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.reflect.AnnotatedElement annotatedElement5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.String str6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializationUtils4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(annotatedElement5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0785");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray2.getClass();
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass3);
        java.lang.Class<?> wildcardClass5 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0786");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.reflect.Type type5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1, outputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(type5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0787");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass4 = byteArray2.getClass();
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0788");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize(serializable3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        java.io.Serializable serializable8 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray7);
        java.io.Serializable serializable9 = org.apache.commons.lang3.SerializationUtils.clone(serializable8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0789");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize(serializable6);
        java.lang.Object obj8 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray7);
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0790");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.reflect.GenericDeclaration genericDeclaration3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.reflect.GenericDeclaration genericDeclaration5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(genericDeclaration3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(genericDeclaration5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0791");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 1);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0792");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray2.getClass();
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass5 = byteArray2.getClass();
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) wildcardClass5);
        java.lang.Class<?> wildcardClass7 = serializable6.getClass();
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize(serializable6, outputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0793");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass4 = byteArray2.getClass();
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.lang.Class to [B");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0794");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.lang.Class<?> wildcardClass6 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.io.Serializable serializable8 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0795");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.lang.Class<?> wildcardClass6 = byteArray5.getClass();
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        java.io.Serializable serializable8 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray7);
        java.lang.Class<?> wildcardClass9 = byteArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0796");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray5);
        java.lang.Class<?> wildcardClass7 = serializable6.getClass();
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize(serializable6, outputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0797");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.Object obj4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Class<?> wildcardClass6 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0798");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        java.lang.reflect.Type type6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.clone(byteArray4);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.clone(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(type6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0799");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0d);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.lang.Class<?> wildcardClass6 = byteArray5.getClass();
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0800");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 1);
        java.lang.Object obj2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1, outputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj2 + "' != '" + (short) 1 + "'", obj2.equals((short) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0801");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize(serializable6);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.clone(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast [B to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0802");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        java.lang.Class<?> wildcardClass8 = byteArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0803");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.io.OutputStream outputStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1, outputStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0804");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass4 = byteArray2.getClass();
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass6 = byteArray2.getClass();
        java.io.Serializable serializable7 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) wildcardClass6);
        java.lang.Class<?> wildcardClass8 = serializable7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0805");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0806");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        java.io.Serializable serializable5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0807");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) wildcardClass2);
        java.lang.Class<?> wildcardClass5 = serializable4.getClass();
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize(serializable4);
        java.io.Serializable serializable7 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0808");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        org.apache.commons.lang3.SerializationUtils serializationUtils4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1, outputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializationUtils4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0809");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast [B to java.lang.Class");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0810");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable5 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray4);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray6);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.clone(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0811");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        java.io.Serializable serializable7 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0812");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) '4');
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0813");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.clone(byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray4);
        java.lang.Class<?> wildcardClass6 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0814");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass3 = byteArray2.getClass();
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0815");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable5 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray4);
        java.lang.Class<?> wildcardClass6 = serializable5.getClass();
        java.lang.Class<?> wildcardClass7 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass6);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass6);
        byte[] byteArray9 = org.apache.commons.lang3.SerializationUtils.clone(byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0816");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass4 = byteArray2.getClass();
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        java.lang.Class<?> wildcardClass6 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0817");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0d);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.lang.Class<?> wildcardClass5 = byteArray3.getClass();
        java.lang.Class<?> wildcardClass6 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass5);
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass5, outputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0818");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.Class<?> wildcardClass4 = byteArray3.getClass();
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3, outputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0819");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        java.lang.Comparable<java.lang.String> strComparable2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Comparable<java.lang.String> strComparable3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.String str4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) str4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        java.lang.CharSequence charSequence7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strComparable2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strComparable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0820");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        java.io.Serializable serializable9 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0821");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        java.lang.Class<?> wildcardClass9 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0822");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        java.lang.reflect.Type type5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        java.lang.Class<?> wildcardClass6 = type5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(type5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0823");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        java.lang.Class<?> wildcardClass7 = byteArray5.getClass();
        java.lang.Class<?> wildcardClass8 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0824");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.clone(byteArray2);
        java.lang.reflect.GenericDeclaration genericDeclaration4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(genericDeclaration4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0825");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.AnnotatedElement annotatedElement7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast [B to java.lang.reflect.AnnotatedElement");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0826");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass5 = byteArray4.getClass();
        java.lang.Class<?> wildcardClass6 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass6);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.clone(byteArray7);
        java.lang.Class<?> wildcardClass9 = byteArray8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0827");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray2.getClass();
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        java.lang.reflect.GenericDeclaration genericDeclaration6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        java.lang.Class<?> wildcardClass7 = byteArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0828");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast [B to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0829");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 1);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.GenericDeclaration genericDeclaration4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.lang.Short to java.lang.reflect.GenericDeclaration");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0830");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.reflect.Type type4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Comparable<java.lang.String> strComparable5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.reflect.Type type6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(type4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strComparable5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(type6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0831");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.clone(byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.io.Serializable serializable5 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray3);
        java.lang.reflect.AnnotatedElement annotatedElement6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(annotatedElement6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0832");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass4 = byteArray2.getClass();
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        java.lang.Class<?> wildcardClass7 = byteArray5.getClass();
        java.lang.Class<?> wildcardClass8 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0833");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray2.getClass();
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass3);
        java.lang.Class<?> wildcardClass5 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass3);
        java.lang.Class<?> wildcardClass6 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass5);
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass5, outputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0834");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.io.OutputStream outputStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2, outputStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0835");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.clone(byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        java.lang.Class<?> wildcardClass6 = byteArray3.getClass();
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass6, outputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0836");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.lang.Object obj6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4, outputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0837");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 10.0d);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.GenericDeclaration genericDeclaration3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.lang.Double to java.lang.reflect.GenericDeclaration");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0838");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray7);
        byte[] byteArray9 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0839");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass3);
        java.lang.Class<?> wildcardClass5 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass3);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass5);
        java.io.Serializable serializable7 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0840");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray3);
        java.lang.reflect.GenericDeclaration genericDeclaration7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        java.lang.Class<?> wildcardClass8 = genericDeclaration7.getClass();
        byte[] byteArray9 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0841");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize(serializable3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        java.io.Serializable serializable7 = org.apache.commons.lang3.SerializationUtils.clone(serializable6);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize(serializable7);
        java.lang.Class<?> wildcardClass9 = byteArray8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0842");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        org.apache.commons.lang3.SerializationUtils serializationUtils4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Class<?> wildcardClass5 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass6 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass6);
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray7, outputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializationUtils4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0843");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0d);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0844");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0845");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.reflect.Type type4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        org.apache.commons.lang3.SerializationUtils serializationUtils5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.Class<?> wildcardClass8 = byteArray7.getClass();
        byte[] byteArray9 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(type4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializationUtils5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0846");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass4 = byteArray2.getClass();
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        java.lang.Class<?> wildcardClass7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0847");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0d);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.lang.Class<?> wildcardClass5 = byteArray3.getClass();
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0848");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0d);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.lang.Class<?> wildcardClass6 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass6);
        java.lang.Class<?> wildcardClass8 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass6);
        java.lang.Class<?> wildcardClass9 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0849");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast [B to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0850");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass4 = byteArray2.getClass();
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.clone(byteArray6);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0851");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 1);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.lang.Class<?> wildcardClass5 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0852");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.lang.Class to java.lang.CharSequence");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0853");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray3);
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize(serializable6, outputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0854");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.Object obj4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        java.lang.Class<?> wildcardClass7 = byteArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0855");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 10L);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0856");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.lang.Class<?> wildcardClass5 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.io.Serializable serializable7 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0857");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        org.apache.commons.lang3.SerializationUtils serializationUtils5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializationUtils5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0858");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) '4');
        java.io.Serializable serializable2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + '4' + "'", serializable2.equals('4'));
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0859");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils serializationUtils8 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast [B to org.apache.commons.lang3.SerializationUtils");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0860");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 10.0f);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 10.0f);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.lang.Class<?> wildcardClass5 = byteArray4.getClass();
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0861");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0862");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        org.apache.commons.lang3.SerializationUtils serializationUtils4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Class<?> wildcardClass5 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass6 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass6);
        java.lang.Class<?> wildcardClass8 = byteArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializationUtils4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0863");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable5 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray4);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.clone(byteArray6);
        java.lang.Class<?> wildcardClass8 = byteArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0864");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.reflect.Type type4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        org.apache.commons.lang3.SerializationUtils serializationUtils5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils serializationUtils8 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast [B to org.apache.commons.lang3.SerializationUtils");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(type4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializationUtils5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0865");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray4);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.clone(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0866");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast [B to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0867");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        java.lang.Class<?> wildcardClass9 = byteArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0868");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass3);
        java.lang.Class<?> wildcardClass5 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass3);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type type8 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast [B to java.lang.reflect.Type");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0869");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        java.lang.Object obj7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray6);
        java.lang.reflect.AnnotatedElement annotatedElement8 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray6);
        java.lang.Class<?> wildcardClass9 = byteArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj7.toString(), "class [B");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElement8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0870");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray6);
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray6, outputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0871");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        java.lang.Class<?> wildcardClass8 = byteArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0872");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0d);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.lang.Class<?> wildcardClass6 = byteArray5.getClass();
        java.io.Serializable serializable7 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) wildcardClass6);
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass6, outputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0873");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.lang.Class<?> wildcardClass6 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass6, outputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0874");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray3);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence9 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast [B to java.lang.CharSequence");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0875");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        org.apache.commons.lang3.SerializationUtils serializationUtils4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Class<?> wildcardClass5 = byteArray1.getClass();
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray6);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.clone(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializationUtils4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0876");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable5 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray4);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.clone(byteArray6);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(byteArray8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0877");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) "hi!");
        java.lang.Object obj2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj2 + "' != '" + "hi!" + "'", obj2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0878");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.GenericDeclaration genericDeclaration7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast [B to java.lang.reflect.GenericDeclaration");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0879");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0880");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) '#');
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) '#');
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass5 = byteArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0881");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass4 = byteArray2.getClass();
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence8 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast [B to java.lang.CharSequence");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0882");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.lang.Class to [B");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0883");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) -1);
        java.lang.Object obj2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray1.getClass();
        java.io.OutputStream outputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1, outputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj2 + "' != '" + (short) -1 + "'", obj2.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0884");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 1);
        java.lang.Object obj2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj2 + "' != '" + (short) 1 + "'", obj2.equals((short) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0885");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        java.lang.Comparable<java.lang.String> strComparable2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.reflect.AnnotatedElement annotatedElement3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strComparable2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(annotatedElement3);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0886");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray6);
        java.lang.Class<?> wildcardClass8 = byteArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0887");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.reflect.GenericDeclaration genericDeclaration3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(genericDeclaration3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0888");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass3 = byteArray2.getClass();
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass5 = byteArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0889");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize(serializable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0890");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        org.apache.commons.lang3.SerializationUtils serializationUtils4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.reflect.Type type5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.reflect.Type type6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializationUtils4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(type5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(type6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0891");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.clone(byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray4);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.GenericDeclaration genericDeclaration7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast [B to java.lang.reflect.GenericDeclaration");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0892");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        java.lang.Class<?> wildcardClass9 = byteArray8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0893");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.GenericDeclaration genericDeclaration6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast [B to java.lang.reflect.GenericDeclaration");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0894");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.io.Serializable serializable5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray2);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize(serializable6, outputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1L) + "'", serializable5.equals((-1L)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0895");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.String str4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray2);
        java.lang.Class<?> wildcardClass5 = byteArray2.getClass();
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.io.Serializable serializable7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0896");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0d);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.io.Serializable serializable5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        java.lang.Object obj6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0897");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.CharSequence charSequence5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.CharSequence charSequence6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.reflect.Type type7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(type7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0898");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Class<?> wildcardClass4 = byteArray1.getClass();
        java.io.Serializable serializable5 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) wildcardClass4);
        java.lang.Class<?> wildcardClass6 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass4);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass6);
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass6, outputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0899");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.reflect.GenericDeclaration genericDeclaration5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.io.Serializable serializable7 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray4);
        java.lang.reflect.AnnotatedElement annotatedElement8 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(genericDeclaration5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(annotatedElement8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0900");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 1);
        java.lang.Object obj2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.io.Serializable serializable5 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray4);
        java.lang.Class<?> wildcardClass6 = serializable5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj2 + "' != '" + (short) 1 + "'", obj2.equals((short) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0901");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) wildcardClass3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize(serializable4);
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize(serializable4, outputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0902");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        java.lang.Object obj7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray6);
        java.lang.Class<?> wildcardClass8 = byteArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj7.toString(), "class [B");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0903");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.GenericDeclaration genericDeclaration7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast [B to java.lang.reflect.GenericDeclaration");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0904");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0d);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4, outputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0905");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass3 = byteArray2.getClass();
        java.io.OutputStream outputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2, outputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0906");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Class<?> wildcardClass4 = byteArray1.getClass();
        java.io.Serializable serializable5 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) wildcardClass4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        java.lang.Class<?> wildcardClass8 = byteArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0907");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        java.lang.Comparable<java.lang.String> strComparable2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Comparable<java.lang.String> strComparable3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5, outputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strComparable2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strComparable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0908");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0909");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize(serializable3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0910");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass4 = serializable3.getClass();
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize(serializable3);
        java.lang.Class<?> wildcardClass6 = byteArray5.getClass();
        java.lang.Class<?> wildcardClass7 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass6);
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass6, outputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0911");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) "hi!");
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type type3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.lang.String to java.lang.reflect.Type");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0912");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 1);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type type5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast [B to java.lang.reflect.Type");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0913");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        java.lang.Class<?> wildcardClass9 = byteArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0914");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray2.getClass();
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0915");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.reflect.Type type4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        org.apache.commons.lang3.SerializationUtils serializationUtils5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Object obj6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(type4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializationUtils5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0916");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.lang.Object obj6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        java.lang.Class<?> wildcardClass8 = byteArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0917");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 1);
        java.lang.Object obj2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray3);
        java.lang.Class<?> wildcardClass5 = byteArray3.getClass();
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3, outputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj2 + "' != '" + (short) 1 + "'", obj2.equals((short) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0918");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 10.0f);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 10.0f);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.lang.Class<?> wildcardClass5 = byteArray4.getClass();
        java.lang.Class<?> wildcardClass6 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0919");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        java.lang.Class<?> wildcardClass7 = byteArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0920");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize(serializable3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.clone(byteArray4);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray7);
        java.lang.Class<?> wildcardClass9 = byteArray8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0921");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 10.0f);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 10.0f);
        java.lang.Class<?> wildcardClass3 = byteArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0922");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.lang.Class<?> wildcardClass6 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0923");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.lang.Class<?> wildcardClass6 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0924");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0925");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize(serializable3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.clone(byteArray4);
        java.lang.Object obj8 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray7);
        byte[] byteArray9 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0926");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray2);
        java.lang.Class<?> wildcardClass6 = byteArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0927");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize(serializable3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0928");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.lang.Class<?> wildcardClass5 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.lang.Class<?> wildcardClass7 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.lang.Class<?> wildcardClass8 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass7);
        java.lang.Class<?> wildcardClass9 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0929");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        java.lang.Comparable<java.lang.String> strComparable2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Comparable<java.lang.String> strComparable3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray7);
        byte[] byteArray9 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strComparable2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strComparable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0930");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.clone(byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils serializationUtils7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.lang.Double to org.apache.commons.lang3.SerializationUtils");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (-1.0d) + "'", serializable6.equals((-1.0d)));
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0931");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.reflect.GenericDeclaration genericDeclaration5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.lang.Class<?> wildcardClass7 = byteArray6.getClass();
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(genericDeclaration5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0932");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Comparable<java.lang.String> strComparable4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray7, outputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strComparable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0933");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass4 = byteArray2.getClass();
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass6 = byteArray2.getClass();
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0934");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize(serializable3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.lang.Class<?> wildcardClass6 = byteArray4.getClass();
        java.lang.Class<?> wildcardClass7 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass6);
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass6, outputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0935");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0d);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.lang.reflect.Type type6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(type6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0936");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.Object obj4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        java.lang.Class<?> wildcardClass6 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0937");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.io.OutputStream outputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1, outputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0938");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        java.lang.Comparable<java.lang.String> strComparable2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Comparable<java.lang.String> strComparable3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.lang.Class<?> wildcardClass6 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strComparable2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strComparable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0939");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0d);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.lang.Class<?> wildcardClass5 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0940");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 10.0d);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.io.OutputStream outputStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1, outputStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0941");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray5);
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize(serializable6, outputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0942");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.lang.Object obj6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence9 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast [B to java.lang.CharSequence");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0943");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 10.0f);
        java.io.Serializable serializable2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + 10.0f + "'", serializable2.equals(10.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + 10.0f + "'", serializable3.equals(10.0f));
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0944");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray2.getClass();
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass3);
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4, outputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0945");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray3);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.clone(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.GenericDeclaration genericDeclaration9 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast [B to java.lang.reflect.GenericDeclaration");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0946");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.Class<?> wildcardClass6 = byteArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0947");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray6);
        java.lang.reflect.AnnotatedElement annotatedElement8 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElement8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0948");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Comparable<java.lang.String> strComparable2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Comparable<java.lang.String> strComparable3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable2 + "' != '" + 0 + "'", strComparable2.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable3 + "' != '" + 0 + "'", strComparable3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0949");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5, outputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0950");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0d);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast [B to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0951");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass4 = byteArray2.getClass();
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass6 = byteArray2.getClass();
        java.io.Serializable serializable7 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) wildcardClass6);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize(serializable7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0952");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) -1);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0953");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.reflect.GenericDeclaration genericDeclaration4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray6);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(genericDeclaration4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0954");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        java.lang.Class<?> wildcardClass7 = byteArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0955");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 10.0f);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 10.0f);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0956");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0957");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast [B to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0958");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 'a');
        java.io.Serializable serializable2 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0959");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.GenericDeclaration genericDeclaration5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast [B to java.lang.reflect.GenericDeclaration");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0960");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass4 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0961");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0d);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.io.Serializable serializable5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize(serializable5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils serializationUtils7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast [B to org.apache.commons.lang3.SerializationUtils");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0962");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray6);
        java.io.Serializable serializable8 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0963");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        java.lang.Class<?> wildcardClass6 = byteArray4.getClass();
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass6);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray7);
        java.io.Serializable serializable9 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0964");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.clone(byteArray2);
        java.lang.reflect.GenericDeclaration genericDeclaration4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray2);
        java.lang.Object obj5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(genericDeclaration4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0965");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        java.lang.Class<?> wildcardClass5 = byteArray3.getClass();
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0966");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1, outputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0967");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        java.lang.Comparable<java.lang.String> strComparable2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.io.OutputStream outputStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1, outputStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strComparable2);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0968");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray7, outputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0969");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0970");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray6);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0971");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass4 = byteArray2.getClass();
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4, outputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0972");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray3);
        java.lang.Class<?> wildcardClass7 = serializable6.getClass();
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass7, outputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0973");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) "hi!");
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.io.OutputStream outputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1, outputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0974");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Class<?> wildcardClass4 = byteArray1.getClass();
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        java.lang.Class<?> wildcardClass6 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass4);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0975");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0d);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.lang.Class<?> wildcardClass6 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass6);
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass6, outputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0976");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        java.lang.Comparable<java.lang.String> strComparable2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Comparable<java.lang.String> strComparable3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.String str4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) str4);
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) str4, outputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strComparable2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strComparable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0977");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) -1);
        java.lang.Object obj2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.GenericDeclaration genericDeclaration4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast [B to java.lang.reflect.GenericDeclaration");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj2 + "' != '" + (short) -1 + "'", obj2.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0978");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0f);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.io.OutputStream outputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2, outputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0979");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass5 = byteArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0980");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) '#');
        java.io.Serializable serializable2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize(serializable2);
        java.lang.Comparable<java.lang.String> strComparable4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + '#' + "'", serializable2.equals('#'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable4 + "' != '" + '#' + "'", strComparable4.equals('#'));
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0981");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.lang.Class<?> wildcardClass7 = byteArray6.getClass();
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0982");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.lang.Double to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0983");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) "hi!");
        java.io.Serializable serializable2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + "hi!" + "'", serializable2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0984");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        java.lang.Object obj5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.lang.Class to [B");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj5.toString(), "class [B");
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0985");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray3);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        java.lang.Class<?> wildcardClass8 = byteArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0986");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray2.getClass();
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        java.lang.reflect.GenericDeclaration genericDeclaration6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0987");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        org.apache.commons.lang3.SerializationUtils serializationUtils4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.reflect.AnnotatedElement annotatedElement5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.reflect.GenericDeclaration genericDeclaration6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Comparable<java.lang.String> strComparable7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializationUtils4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(annotatedElement5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strComparable7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0988");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) "hi!");
        java.lang.Object obj2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.Class<?> wildcardClass4 = byteArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj2 + "' != '" + "hi!" + "'", obj2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0989");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.lang.Class<?> wildcardClass5 = byteArray4.getClass();
        java.lang.Class<?> wildcardClass6 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass5);
        java.lang.Class<?> wildcardClass7 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0990");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.lang.Class<?> wildcardClass6 = byteArray5.getClass();
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        java.io.Serializable serializable8 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray7);
        byte[] byteArray9 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0991");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray2);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray2);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0992");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.clone(byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0993");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.lang.Class<?> wildcardClass5 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0994");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.clone(byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        java.lang.Object obj7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0995");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.Class<?> wildcardClass4 = byteArray3.getClass();
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4, outputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0996");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0f);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) wildcardClass2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize(serializable4);
        java.lang.Class<?> wildcardClass6 = byteArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0997");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.reflect.Type type4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        org.apache.commons.lang3.SerializationUtils serializationUtils5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.Class<?> wildcardClass9 = byteArray8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(type4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializationUtils5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0998");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray1.getClass();
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test0999");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Class<?> wildcardClass4 = byteArray1.getClass();
        java.io.Serializable serializable5 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) wildcardClass4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray6, outputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils1.test1000");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        org.apache.commons.lang3.SerializationUtils serializationUtils4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.Class<?> wildcardClass6 = byteArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializationUtils4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }
}

