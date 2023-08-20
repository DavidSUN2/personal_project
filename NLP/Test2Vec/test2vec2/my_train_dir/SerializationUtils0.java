
package SerializationUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SerializationUtils0 {

    public static boolean debug = false;

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0001");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj1 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The InputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0002");
        java.io.Serializable serializable1 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable1 + "' != '" + 1L + "'", serializable1.equals(1L));
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0003");
        java.io.Serializable serializable0 = null;
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize(serializable0, outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0004");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 1, outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0005");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The byte[] must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0006");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 10, outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0007");
        java.io.Serializable serializable1 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable1 + "' != '" + 1.0f + "'", serializable1.equals(1.0f));
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0008");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L), outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0009");
        java.lang.String str1 = org.apache.commons.lang3.SerializationUtils.clone("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0010");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The InputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0011");
        java.lang.String str1 = org.apache.commons.lang3.SerializationUtils.clone("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0012");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence1 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The InputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0013");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable1 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The InputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0014");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) "hi!", outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0015");
        byte[] byteArray0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.clone(byteArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(byteArray1);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0016");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.lang.Double to java.lang.CharSequence");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0017");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) false, outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0018");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.AnnotatedElement annotatedElement1 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The InputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0019");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 10.0d, outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0020");
        java.io.Serializable serializable1 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable1 + "' != '" + 100.0d + "'", serializable1.equals(100.0d));
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0021");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.lang.Long to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0022");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 1.0d, outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0023");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.io.OutputStream outputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0, outputStream2);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0024");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0d);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0025");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) '#', outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0026");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        java.lang.Comparable<java.lang.String> strComparable2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = strComparable2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
            System.out.format("%n%s%n", "SerializationUtils0.test0027");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The InputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0028");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type type2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.lang.Double to java.lang.reflect.Type");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0029");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.GenericDeclaration genericDeclaration1 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The InputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0030");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The InputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0031");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 1);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0032");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
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
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0033");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.lang.Double to [B");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0034");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0035");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable1 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The byte[] must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0036");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils serializationUtils1 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The InputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0037");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.lang.Double to java.lang.Class");
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
            System.out.format("%n%s%n", "SerializationUtils0.test0038");
        java.io.Serializable serializable0 = null;
        java.io.Serializable serializable1 = org.apache.commons.lang3.SerializationUtils.clone(serializable0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable1);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0039");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
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
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0040");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable5 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray4);
        java.lang.Class<?> wildcardClass6 = byteArray4.getClass();
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
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0041");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
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
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0042");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.lang.Integer to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0043");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 100.0f, outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0044");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 100.0d, outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0045");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.reflect.GenericDeclaration genericDeclaration4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray2);
        java.lang.Comparable<java.lang.String> strComparable5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(genericDeclaration4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strComparable5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0046");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.reflect.GenericDeclaration genericDeclaration5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
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
        org.junit.Assert.assertNull(genericDeclaration5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0047");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable1 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The InputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0048");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type type4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
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
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0049");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
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
            System.out.format("%n%s%n", "SerializationUtils0.test0050");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 10.0f, outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0051");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) -1);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0052");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 10, outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0053");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass4 = byteArray2.getClass();
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        org.apache.commons.lang3.SerializationUtils serializationUtils6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray2);
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
        org.junit.Assert.assertNull(serializationUtils6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0054");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 100);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0055");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
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
            System.out.format("%n%s%n", "SerializationUtils0.test0056");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass4 = byteArray2.getClass();
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.lang.Comparable<java.lang.String> strComparable6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray2);
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
        org.junit.Assert.assertNull(strComparable6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0057");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Comparable<java.lang.String> strComparable2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type type3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.lang.Integer to java.lang.reflect.Type");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable2 + "' != '" + 0 + "'", strComparable2.equals(0));
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0058");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
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
            System.out.format("%n%s%n", "SerializationUtils0.test0059");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.reflect.Type type4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        org.apache.commons.lang3.SerializationUtils serializationUtils5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.Class<?> wildcardClass7 = byteArray1.getClass();
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
            System.out.format("%n%s%n", "SerializationUtils0.test0060");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.io.OutputStream outputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L), outputStream2);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0061");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 1);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.lang.Short to java.lang.Class");
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
            System.out.format("%n%s%n", "SerializationUtils0.test0062");
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
        org.junit.Assert.assertNull(type4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializationUtils5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0063");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
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
        org.junit.Assert.assertNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0064");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) -1, outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0065");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.StreamCorruptedException: invalid stream header: 00010101");
        } catch (org.apache.commons.lang3.SerializationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0066");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils serializationUtils2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.lang.Integer to org.apache.commons.lang3.SerializationUtils");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0067");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
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
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable3);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0068");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
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
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0069");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils serializationUtils3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.lang.Long to org.apache.commons.lang3.SerializationUtils");
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
            System.out.format("%n%s%n", "SerializationUtils0.test0070");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0071");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0072");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        org.apache.commons.lang3.SerializationUtils serializationUtils4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Class<?> wildcardClass5 = byteArray1.getClass();
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
        org.junit.Assert.assertNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializationUtils4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0073");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray2.getClass();
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
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
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0074");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0075");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.GenericDeclaration genericDeclaration3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray2);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0076");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass4 = byteArray2.getClass();
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
            System.out.format("%n%s%n", "SerializationUtils0.test0077");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0078");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
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
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0079");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 100);
        java.io.OutputStream outputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 100, outputStream2);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0080");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.lang.Class<?> wildcardClass6 = byteArray4.getClass();
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
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0081");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) -1, outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0082");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.lang.Short to [B");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0083");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0084");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass3);
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
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0085");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        org.apache.commons.lang3.SerializationUtils serializationUtils4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.reflect.AnnotatedElement annotatedElement5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
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
        org.junit.Assert.assertNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializationUtils4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(annotatedElement5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0086");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 1);
        java.io.OutputStream outputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 1, outputStream2);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0087");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 10L);
        java.lang.Object obj2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.GenericDeclaration genericDeclaration3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.lang.Long to java.lang.reflect.GenericDeclaration");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj2 + "' != '" + 10L + "'", obj2.equals(10L));
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0088");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
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
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0089");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0090");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0091");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.reflect.GenericDeclaration genericDeclaration4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray2);
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2, outputStream5);
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
        org.junit.Assert.assertNull(genericDeclaration4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0092");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.Object obj4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
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
        org.junit.Assert.assertNotNull(byteArray2);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0093");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
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
            System.out.format("%n%s%n", "SerializationUtils0.test0094");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) -1);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0095");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize(serializable3);
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize(serializable3, outputStream5);
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
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0096");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0d);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
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
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0097");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type type1 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The InputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0098");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) -1);
        java.io.OutputStream outputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) -1, outputStream2);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0099");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
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
            System.out.format("%n%s%n", "SerializationUtils0.test0100");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.reflect.GenericDeclaration genericDeclaration5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
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
        org.junit.Assert.assertNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(genericDeclaration5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0101");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.GenericDeclaration genericDeclaration1 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The byte[] must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0102");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.String str4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray2);
        java.lang.reflect.Type type5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(type5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0103");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils serializationUtils2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.lang.Character to org.apache.commons.lang3.SerializationUtils");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0104");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.reflect.GenericDeclaration genericDeclaration4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray2);
        java.lang.Class<?> wildcardClass5 = byteArray2.getClass();
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(genericDeclaration4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0105");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0106");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
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
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0107");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize(serializable3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.clone(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.AnnotatedElement annotatedElement8 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
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
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0108");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.lang.Short to [B");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0109");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
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
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0110");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 1);
        java.io.Serializable serializable2 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (short) 1 + "'", serializable2.equals((short) 1));
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0111");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0112");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        java.lang.Class<?> wildcardClass6 = byteArray4.getClass();
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass6);
        java.lang.reflect.AnnotatedElement annotatedElement8 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray7);
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
        org.junit.Assert.assertNotNull(annotatedElement8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0113");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 0, outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0114");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 1);
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
        org.junit.Assert.assertTrue("'" + obj2 + "' != '" + (short) 1 + "'", obj2.equals((short) 1));
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0115");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray2.getClass();
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0116");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.lang.Character to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0117");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0d);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.io.Serializable serializable5 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray4);
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
        org.junit.Assert.assertNotNull(wildcardClass2);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0118");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0119");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 10L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type type2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.lang.Long to java.lang.reflect.Type");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0120");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0121");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type type1 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The byte[] must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0122");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.clone(byteArray2);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0123");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Comparable<java.lang.String> strComparable2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Comparable<java.lang.String> strComparable3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
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
        org.junit.Assert.assertTrue("'" + strComparable2 + "' != '" + 0 + "'", strComparable2.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable3 + "' != '" + 0 + "'", strComparable3.equals(0));
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0124");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.reflect.Type type4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        org.apache.commons.lang3.SerializationUtils serializationUtils5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass7 = byteArray1.getClass();
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
            System.out.format("%n%s%n", "SerializationUtils0.test0125");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray3);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0126");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize(serializable6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray7);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0127");
        java.io.Serializable serializable1 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable1 + "' != '" + (short) 0 + "'", serializable1.equals((short) 0));
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0128");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        org.apache.commons.lang3.SerializationUtils serializationUtils4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Class<?> wildcardClass5 = byteArray1.getClass();
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
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
        org.junit.Assert.assertNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializationUtils4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0129");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass1);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0130");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass3);
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
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0131");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0d);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0132");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.AnnotatedElement annotatedElement2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.lang.Integer to java.lang.reflect.AnnotatedElement");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0133");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0d);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0134");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.lang.Class<?> wildcardClass5 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0135");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0f);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) wildcardClass2);
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
        org.junit.Assert.assertNotNull(serializable4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0136");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray2);
        java.lang.Class<?> wildcardClass6 = byteArray2.getClass();
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
            System.out.format("%n%s%n", "SerializationUtils0.test0137");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) wildcardClass2);
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
        org.junit.Assert.assertNotNull(serializable3);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0138");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
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
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0139");
        java.io.Serializable serializable1 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable1 + "' != '" + (-1.0f) + "'", serializable1.equals((-1.0f)));
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0140");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.reflect.Type type4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
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
        org.junit.Assert.assertNull(type4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0141");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The byte[] must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0142");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
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
        org.junit.Assert.assertNotNull(serializable4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0143");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0144");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Comparable<java.lang.String> strComparable2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Comparable<java.lang.String> strComparable3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Class<?> wildcardClass4 = strComparable3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable2 + "' != '" + 0 + "'", strComparable2.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable3 + "' != '" + 0 + "'", strComparable3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0145");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils serializationUtils2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.lang.Character to org.apache.commons.lang3.SerializationUtils");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0146");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) wildcardClass2);
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
        org.junit.Assert.assertNotNull(serializable4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0147");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.clone(byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0148");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1), outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0149");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.String str5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0150");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.lang.Class<?> wildcardClass6 = byteArray5.getClass();
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
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0151");
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
            System.out.format("%n%s%n", "SerializationUtils0.test0152");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
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
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0153");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0d);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.io.Serializable serializable5 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray4);
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
        org.junit.Assert.assertNotNull(wildcardClass2);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0154");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray2.getClass();
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils serializationUtils6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.lang.Class to org.apache.commons.lang3.SerializationUtils");
        } catch (java.lang.ClassCastException e) {
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
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0155");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type type2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.lang.Character to java.lang.reflect.Type");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0156");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray2.getClass();
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass3);
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
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0157");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils serializationUtils6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.lang.Class to org.apache.commons.lang3.SerializationUtils");
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
            System.out.format("%n%s%n", "SerializationUtils0.test0158");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
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
            System.out.format("%n%s%n", "SerializationUtils0.test0159");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize(serializable3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.clone(byteArray4);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence9 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray7);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0160");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0d);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.lang.Class<?> wildcardClass5 = byteArray3.getClass();
        java.lang.Class<?> wildcardClass6 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass6);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0161");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable5 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray4);
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
        org.junit.Assert.assertNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0162");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.clone(byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type type6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
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
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0163");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
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
        org.junit.Assert.assertNotNull(serializable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0164");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.clone(byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0165");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        java.lang.reflect.AnnotatedElement annotatedElement7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        java.lang.Class<?> wildcardClass8 = byteArray5.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0166");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0167");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = byteArray3.getClass();
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
            System.out.format("%n%s%n", "SerializationUtils0.test0168");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
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
        org.junit.Assert.assertNotNull(serializable4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0169");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0d);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0170");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 'a');
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0171");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0172");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize(serializable3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.lang.Class<?> wildcardClass6 = byteArray4.getClass();
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
        org.junit.Assert.assertNotNull(serializable3);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0173");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.reflect.Type type4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        org.apache.commons.lang3.SerializationUtils serializationUtils5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.reflect.Type type7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray6);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray6);
        java.lang.Object obj9 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray6);
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
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0174");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        java.lang.Class<?> wildcardClass6 = byteArray4.getClass();
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
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0175");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize(serializable3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
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
        org.junit.Assert.assertNotNull(serializable3);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0176");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        java.lang.Class<?> wildcardClass7 = byteArray5.getClass();
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
            System.out.format("%n%s%n", "SerializationUtils0.test0177");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) '#');
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0178");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        java.lang.reflect.AnnotatedElement annotatedElement7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        java.lang.Class<?> wildcardClass8 = annotatedElement7.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0179");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass4 = byteArray2.getClass();
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
        org.junit.Assert.assertNotNull(byteArray2);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0180");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass4 = byteArray2.getClass();
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0181");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 10.0f);
        java.io.Serializable serializable2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.io.OutputStream outputStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize(serializable2, outputStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + 10.0f + "'", serializable2.equals(10.0f));
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0182");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) ' ');
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.AnnotatedElement annotatedElement3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.lang.Character to java.lang.reflect.AnnotatedElement");
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
            System.out.format("%n%s%n", "SerializationUtils0.test0183");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.lang.Short to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0184");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0185");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0186");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize(serializable6);
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
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0187");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type type4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
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
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0188");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0d);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0189");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
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
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0190");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0191");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0d);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0192");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.reflect.GenericDeclaration genericDeclaration5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
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
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(genericDeclaration5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0193");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.reflect.Type type4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        org.apache.commons.lang3.SerializationUtils serializationUtils5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.reflect.Type type7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray6);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray6);
        org.apache.commons.lang3.SerializationUtils serializationUtils9 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray6);
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
        org.junit.Assert.assertNull(serializationUtils9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0194");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0195");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 10.0f);
        java.io.Serializable serializable2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
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
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + 10.0f + "'", serializable2.equals(10.0f));
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0196");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0d);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.lang.Class<?> wildcardClass6 = byteArray5.getClass();
        java.io.Serializable serializable7 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) wildcardClass6);
        java.lang.Class<?> wildcardClass8 = serializable7.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0197");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0198");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.clone(byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0199");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 100);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0200");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0201");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
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
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0202");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 1);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils serializationUtils3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.lang.Short to org.apache.commons.lang3.SerializationUtils");
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
            System.out.format("%n%s%n", "SerializationUtils0.test0203");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        java.lang.Class<?> wildcardClass6 = byteArray4.getClass();
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass6);
        java.lang.Class<?> wildcardClass8 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass6);
        java.io.Serializable serializable9 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) wildcardClass6);
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
        org.junit.Assert.assertNotNull(serializable9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0204");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
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
        org.junit.Assert.assertNotNull(wildcardClass3);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0205");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize(serializable6);
        java.lang.Class<?> wildcardClass8 = serializable6.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0206");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.AnnotatedElement annotatedElement8 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast [B to java.lang.reflect.AnnotatedElement");
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
            System.out.format("%n%s%n", "SerializationUtils0.test0207");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.reflect.Type type4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        org.apache.commons.lang3.SerializationUtils serializationUtils5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray6);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.clone(byteArray6);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0208");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.lang.Class<?> wildcardClass5 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.lang.Class to java.lang.Comparable");
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
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0209");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.lang.Class<?> wildcardClass7 = byteArray3.getClass();
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
            System.out.format("%n%s%n", "SerializationUtils0.test0210");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray4);
        java.lang.reflect.GenericDeclaration genericDeclaration6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
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
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0211");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
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
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0212");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass3);
        java.lang.Class<?> wildcardClass5 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass3);
        java.lang.Class<?> wildcardClass6 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass3);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence8 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.lang.Class to java.lang.CharSequence");
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
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0213");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        java.lang.Class<?> wildcardClass6 = byteArray4.getClass();
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass6);
        java.lang.reflect.Type type8 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray7);
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
        org.junit.Assert.assertNotNull(type8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0214");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable1 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The byte[] must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0215");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        java.lang.Class<?> wildcardClass7 = byteArray6.getClass();
        java.lang.Class<?> wildcardClass8 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass7);
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
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0216");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 'a');
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0217");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
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
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0218");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
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
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0219");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.reflect.Type type4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        org.apache.commons.lang3.SerializationUtils serializationUtils5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0220");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0d);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.io.Serializable serializable5 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.lang.reflect.Type type7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
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
        org.junit.Assert.assertNotNull(type7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0221");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) '4', outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0222");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
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
        org.junit.Assert.assertNotNull(serializable3);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0223");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray3);
        java.lang.reflect.GenericDeclaration genericDeclaration7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3, outputStream8);
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
        org.junit.Assert.assertNotNull(genericDeclaration7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0224");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) wildcardClass2);
        java.lang.Class<?> wildcardClass5 = serializable4.getClass();
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
            System.out.format("%n%s%n", "SerializationUtils0.test0225");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
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
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0226");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Comparable<java.lang.String> strComparable2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable2 + "' != '" + 0 + "'", strComparable2.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0227");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 1, outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0228");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.reflect.Type type4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        org.apache.commons.lang3.SerializationUtils serializationUtils5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
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
        org.junit.Assert.assertNull(type4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializationUtils5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0229");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0230");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.reflect.GenericDeclaration genericDeclaration5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        org.apache.commons.lang3.SerializationUtils serializationUtils6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = serializationUtils6.getClass();
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
        org.junit.Assert.assertNull(genericDeclaration5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializationUtils6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0231");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 100L, outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0232");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils serializationUtils5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.lang.Class to org.apache.commons.lang3.SerializationUtils");
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
            System.out.format("%n%s%n", "SerializationUtils0.test0233");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass4 = byteArray2.getClass();
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0234");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.GenericDeclaration genericDeclaration3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.lang.Integer to java.lang.reflect.GenericDeclaration");
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
            System.out.format("%n%s%n", "SerializationUtils0.test0235");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0d);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.lang.Class<?> wildcardClass6 = byteArray5.getClass();
        java.io.Serializable serializable7 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) wildcardClass6);
        java.io.Serializable serializable8 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) wildcardClass6);
        byte[] byteArray9 = org.apache.commons.lang3.SerializationUtils.serialize(serializable8);
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
        org.junit.Assert.assertNotNull(serializable8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0236");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.lang.Character to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0237");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) -1);
        java.lang.Object obj2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.GenericDeclaration genericDeclaration3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.lang.Short to java.lang.reflect.GenericDeclaration");
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
            System.out.format("%n%s%n", "SerializationUtils0.test0238");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0239");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
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
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0240");
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
            System.out.format("%n%s%n", "SerializationUtils0.test0241");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray2.getClass();
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass3);
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
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0242");
        java.io.Serializable serializable1 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable1 + "' != '" + 10 + "'", serializable1.equals(10));
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0243");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.reflect.Type type4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        org.apache.commons.lang3.SerializationUtils serializationUtils5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.reflect.Type type7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray6);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray6);
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
        org.junit.Assert.assertNull(type7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0244");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray4);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0245");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.reflect.GenericDeclaration genericDeclaration5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.lang.Class<?> wildcardClass7 = byteArray6.getClass();
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
            System.out.format("%n%s%n", "SerializationUtils0.test0246");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize(serializable6);
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
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0247");
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
            java.lang.String str8 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast [B to java.lang.String");
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
            System.out.format("%n%s%n", "SerializationUtils0.test0248");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0d);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.io.Serializable serializable5 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.lang.Class<?> wildcardClass7 = byteArray4.getClass();
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
            System.out.format("%n%s%n", "SerializationUtils0.test0249");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0d);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.io.Serializable serializable5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize(serializable5);
        java.lang.Class<?> wildcardClass7 = serializable5.getClass();
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
            System.out.format("%n%s%n", "SerializationUtils0.test0250");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0251");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.lang.Class<?> wildcardClass6 = byteArray5.getClass();
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
            System.out.format("%n%s%n", "SerializationUtils0.test0252");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0d);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray6);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0253");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0254");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray2.getClass();
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        java.lang.Class<?> wildcardClass7 = byteArray6.getClass();
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
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0255");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.AnnotatedElement annotatedElement2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.lang.Character to java.lang.reflect.AnnotatedElement");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0256");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 1);
        java.lang.Object obj2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.lang.Short to [B");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj2 + "' != '" + (short) 1 + "'", obj2.equals((short) 1));
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0257");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass4 = byteArray2.getClass();
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray6);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.clone(byteArray7);
        java.lang.Class<?> wildcardClass9 = byteArray8.getClass();
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
            System.out.format("%n%s%n", "SerializationUtils0.test0258");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.lang.Class<?> wildcardClass5 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass4);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0259");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0d);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
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
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0260");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0f);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0261");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Comparable<java.lang.String> strComparable2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Object obj3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable2 + "' != '" + 0 + "'", strComparable2.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0262");
        java.io.Serializable serializable1 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable1 + "' != '" + (short) 1 + "'", serializable1.equals((short) 1));
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0263");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        java.lang.reflect.GenericDeclaration genericDeclaration6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
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
        org.junit.Assert.assertNotNull(genericDeclaration6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0264");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
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
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0265");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.String str4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray2);
        java.lang.Class<?> wildcardClass5 = byteArray2.getClass();
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
        org.junit.Assert.assertNotNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0266");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
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
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0267");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.reflect.Type type4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        org.apache.commons.lang3.SerializationUtils serializationUtils5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.Comparable<java.lang.String> strComparable8 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray9 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
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
        org.junit.Assert.assertNull(strComparable8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0268");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.lang.Class<?> wildcardClass5 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.lang.Class to java.lang.CharSequence");
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
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0269");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray2.getClass();
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass5 = byteArray2.getClass();
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) wildcardClass5);
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
        org.junit.Assert.assertNotNull(serializable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0270");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize(serializable3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.clone(byteArray4);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray7);
        java.io.Serializable serializable9 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray8);
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
        org.junit.Assert.assertNotNull(serializable9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0271");
        java.io.Serializable serializable1 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable1 + "' != '" + (byte) 1 + "'", serializable1.equals((byte) 1));
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0272");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
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
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0273");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        java.lang.Class<?> wildcardClass6 = byteArray4.getClass();
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass6);
        java.lang.reflect.Type type8 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray7);
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
        org.junit.Assert.assertNotNull(type8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0274");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
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
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0275");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray4);
        java.lang.reflect.Type type6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
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
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(type6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0276");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass5 = byteArray4.getClass();
        java.lang.Class<?> wildcardClass6 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass5);
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
        org.junit.Assert.assertNull(wildcardClass3);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0277");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.reflect.Type type4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        org.apache.commons.lang3.SerializationUtils serializationUtils5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.reflect.Type type7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray6);
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
        org.junit.Assert.assertNull(type7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0278");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize(serializable3);
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
        org.junit.Assert.assertNotNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0279");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.lang.Object obj6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
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
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0280");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.Class<?> wildcardClass4 = byteArray3.getClass();
        java.lang.Class<?> wildcardClass5 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass4);
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
        org.junit.Assert.assertNotNull(wildcardClass2);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0281");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.reflect.GenericDeclaration genericDeclaration4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray2);
        java.lang.Class<?> wildcardClass5 = byteArray2.getClass();
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
        org.junit.Assert.assertNotNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(genericDeclaration4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0282");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.lang.Class to java.lang.String");
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
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0283");
        java.io.Serializable serializable1 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable1 + "' != '" + (-1.0d) + "'", serializable1.equals((-1.0d)));
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0284");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0285");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.lang.reflect.Type type6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
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
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(type6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0286");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0d);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.lang.Class<?> wildcardClass5 = byteArray3.getClass();
        java.lang.Class<?> wildcardClass6 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass6);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.clone(byteArray7);
        java.lang.reflect.Type type9 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray7);
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
        org.junit.Assert.assertNotNull(type9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0287");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj1 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The byte[] must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0288");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2, outputStream6);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0289");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0d);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.lang.Class<?> wildcardClass5 = byteArray3.getClass();
        java.lang.Class<?> wildcardClass6 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass6);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.clone(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence9 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray8);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0290");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass4 = byteArray2.getClass();
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        java.lang.Class<?> wildcardClass8 = byteArray7.getClass();
        byte[] byteArray9 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass8);
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
        org.junit.Assert.assertNotNull(wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0291");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable5 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray4);
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
        org.junit.Assert.assertNotNull(serializable5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0292");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass4 = byteArray2.getClass();
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        java.lang.Class<?> wildcardClass7 = byteArray5.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0293");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0294");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
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
        org.junit.Assert.assertNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0295");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0296");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) ' ');
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
            System.out.format("%n%s%n", "SerializationUtils0.test0297");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0f);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) wildcardClass3);
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize(serializable4, outputStream5);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0298");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass4 = byteArray2.getClass();
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray6);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.clone(byteArray7);
        byte[] byteArray9 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray8);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0299");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0300");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.lang.Class<?> wildcardClass5 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
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
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0301");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.reflect.GenericDeclaration genericDeclaration4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
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
        org.junit.Assert.assertNotNull(serializable3);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0302");
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
            System.out.format("%n%s%n", "SerializationUtils0.test0303");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        byte[] byteArray9 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray8);
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
        org.junit.Assert.assertNotNull(byteArray9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0304");
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
            System.out.format("%n%s%n", "SerializationUtils0.test0305");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 10.0f);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 10.0f);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0306");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.clone(byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0307");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.Class<?> wildcardClass4 = byteArray1.getClass();
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
            System.out.format("%n%s%n", "SerializationUtils0.test0308");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        java.lang.Class<?> wildcardClass7 = byteArray6.getClass();
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
            System.out.format("%n%s%n", "SerializationUtils0.test0309");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray3);
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize(serializable4, outputStream5);
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
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0310");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.lang.Class<?> wildcardClass5 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray6);
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
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0311");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0f);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.io.OutputStream outputStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2, outputStream3);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0312");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0d);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.io.Serializable serializable5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
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
        org.junit.Assert.assertNotNull(wildcardClass2);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0313");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass4 = byteArray2.getClass();
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray6);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.clone(byteArray7);
        byte[] byteArray9 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray7);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0314");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.io.Serializable serializable5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.lang.Long to java.lang.CharSequence");
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
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1L) + "'", serializable5.equals((-1L)));
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0315");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0, outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0316");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0317");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
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
            System.out.format("%n%s%n", "SerializationUtils0.test0318");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
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
        org.junit.Assert.assertNotNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0319");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray3);
        java.lang.reflect.GenericDeclaration genericDeclaration7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        java.lang.Class<?> wildcardClass8 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        java.lang.Class<?> wildcardClass9 = byteArray3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0320");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) "hi!");
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
            System.out.format("%n%s%n", "SerializationUtils0.test0321");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.GenericDeclaration genericDeclaration3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast [B to java.lang.reflect.GenericDeclaration");
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
            System.out.format("%n%s%n", "SerializationUtils0.test0322");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
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
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0323");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray1);
        java.lang.Class<?> wildcardClass5 = byteArray1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass2);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0324");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0d);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0325");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        java.lang.reflect.AnnotatedElement annotatedElement7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        java.lang.Class<?> wildcardClass9 = byteArray5.getClass();
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
            System.out.format("%n%s%n", "SerializationUtils0.test0326");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 10, outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0327");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        org.apache.commons.lang3.SerializationUtils serializationUtils4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Class<?> wildcardClass5 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass6 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass5);
        java.lang.Class<?> wildcardClass7 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass6);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass7);
        java.lang.Class<?> wildcardClass9 = byteArray8.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0328");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Comparable<java.lang.String> strComparable2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable2 + "' != '" + 0 + "'", strComparable2.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0329");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type type3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.lang.Double to java.lang.reflect.Type");
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
            System.out.format("%n%s%n", "SerializationUtils0.test0330");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0331");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass4 = byteArray2.getClass();
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0332");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass4 = byteArray2.getClass();
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        java.lang.Class<?> wildcardClass7 = byteArray5.getClass();
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass7);
        byte[] byteArray9 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass7);
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
        org.junit.Assert.assertNotNull(byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0333");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.clone(byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        java.lang.Class<?> wildcardClass7 = serializable6.getClass();
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
            System.out.format("%n%s%n", "SerializationUtils0.test0334");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray5);
        java.lang.Class<?> wildcardClass7 = byteArray5.getClass();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0335");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 10L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.lang.Long to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0336");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
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
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0337");
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
            System.out.format("%n%s%n", "SerializationUtils0.test0338");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.Object obj4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.AnnotatedElement annotatedElement6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
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
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0339");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        java.lang.reflect.Type type6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
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
        org.junit.Assert.assertNull(serializable5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(type6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0340");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.lang.Character to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0341");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        java.lang.Comparable<java.lang.String> strComparable2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Comparable<java.lang.String> strComparable3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.String str4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) str4);
        java.lang.String str6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
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
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0342");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable5 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray4);
        java.lang.CharSequence charSequence6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
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
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0343");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) -1);
        java.lang.Object obj2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray1.getClass();
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
        org.junit.Assert.assertTrue("'" + obj2 + "' != '" + (short) -1 + "'", obj2.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0344");
        org.apache.commons.lang3.SerializationUtils serializationUtils0 = new org.apache.commons.lang3.SerializationUtils();
        java.lang.Class<?> wildcardClass1 = serializationUtils0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0345");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
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
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0346");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize(serializable6);
        java.lang.Class<?> wildcardClass8 = serializable6.getClass();
        byte[] byteArray9 = org.apache.commons.lang3.SerializationUtils.serialize(serializable6);
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
        org.junit.Assert.assertNotNull(wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0347");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass4 = serializable3.getClass();
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
        org.junit.Assert.assertNotNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0348");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize(serializable3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        java.io.Serializable serializable7 = org.apache.commons.lang3.SerializationUtils.clone(serializable6);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize(serializable6);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0349");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray4);
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
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0350");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0351");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        org.apache.commons.lang3.SerializationUtils serializationUtils4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.reflect.AnnotatedElement annotatedElement5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.reflect.GenericDeclaration genericDeclaration6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = genericDeclaration6.getClass();
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
        org.junit.Assert.assertNull(serializationUtils4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(annotatedElement5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(genericDeclaration6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0352");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0353");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.Comparable<java.lang.String> strComparable4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
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
        org.junit.Assert.assertNull(strComparable4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0354");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.lang.Class<?> wildcardClass6 = byteArray5.getClass();
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        java.io.Serializable serializable8 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray7);
        java.lang.Class<?> wildcardClass9 = serializable8.getClass();
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
            System.out.format("%n%s%n", "SerializationUtils0.test0355");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.lang.Class<?> wildcardClass5 = byteArray4.getClass();
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
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0356");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize(serializable3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0357");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray2.getClass();
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
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0358");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray2.getClass();
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass3);
        java.lang.Class<?> wildcardClass5 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass4);
        java.lang.Class<?> wildcardClass6 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass4);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0359");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass4 = byteArray2.getClass();
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray6);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.clone(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence9 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray7);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0360");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray3);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize(serializable6);
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
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0361");
        java.io.Serializable serializable1 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable1 + "' != '" + '#' + "'", serializable1.equals('#'));
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0362");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0363");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
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
        org.junit.Assert.assertNotNull(serializable4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0364");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.reflect.GenericDeclaration genericDeclaration5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        org.apache.commons.lang3.SerializationUtils serializationUtils6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
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
        org.junit.Assert.assertNull(genericDeclaration5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializationUtils6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0365");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 10L, outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0366");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0f), outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0367");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        java.lang.Class<?> wildcardClass7 = byteArray6.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0368");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.lang.Class<?> wildcardClass6 = byteArray3.getClass();
        java.lang.Class<?> wildcardClass7 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass6);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass6);
        byte[] byteArray9 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray8);
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
        org.junit.Assert.assertNotNull(byteArray9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0369");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.reflect.Type type4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        org.apache.commons.lang3.SerializationUtils serializationUtils5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.reflect.Type type7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray6);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray6);
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
        org.junit.Assert.assertNull(type7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0370");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        org.apache.commons.lang3.SerializationUtils serializationUtils4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
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
        org.junit.Assert.assertNull(serializationUtils4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(annotatedElement5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0371");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) ' ');
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) ' ');
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
            System.out.format("%n%s%n", "SerializationUtils0.test0372");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils serializationUtils7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
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
        org.junit.Assert.assertNotNull(serializable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0373");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
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
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0374");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        java.lang.reflect.AnnotatedElement annotatedElement7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
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
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElement7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0375");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        java.lang.reflect.AnnotatedElement annotatedElement7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        byte[] byteArray9 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray8);
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
        org.junit.Assert.assertNotNull(byteArray9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0376");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray3);
        java.lang.Class<?> wildcardClass7 = serializable6.getClass();
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass7);
        byte[] byteArray9 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass7);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0377");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
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
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0378");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass3);
        java.lang.Class<?> wildcardClass5 = byteArray4.getClass();
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
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0379");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray7);
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
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0380");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
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
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0381");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
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
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0382");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.lang.reflect.GenericDeclaration genericDeclaration4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        java.lang.Class<?> wildcardClass5 = genericDeclaration4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0383");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize(serializable4, outputStream5);
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
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0384");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0385");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
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
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0386");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.io.Serializable serializable5 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.GenericDeclaration genericDeclaration6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
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
        org.junit.Assert.assertNotNull(serializable5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0387");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        org.apache.commons.lang3.SerializationUtils serializationUtils4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Comparable<java.lang.String> strComparable5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializationUtils4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strComparable5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0388");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize(serializable3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        java.io.Serializable serializable8 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray7);
        byte[] byteArray9 = org.apache.commons.lang3.SerializationUtils.serialize(serializable8);
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
        org.junit.Assert.assertNotNull(byteArray9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0389");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0390");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass3);
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
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0391");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0392");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        java.lang.reflect.Type type8 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
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
        org.junit.Assert.assertNotNull(type8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0393");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0d);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.lang.Class<?> wildcardClass5 = byteArray3.getClass();
        java.lang.Class<?> wildcardClass6 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence8 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray7);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0394");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.lang.Class<?> wildcardClass5 = byteArray3.getClass();
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass5);
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
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0395");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.AnnotatedElement annotatedElement2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.lang.Double to java.lang.reflect.AnnotatedElement");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0396");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass3);
        java.lang.Class<?> wildcardClass5 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass3);
        java.lang.Class<?> wildcardClass6 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass3);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass3);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray7);
        java.lang.Object obj9 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray8);
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
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0397");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Comparable<java.lang.String> strComparable2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Comparable<java.lang.String> strComparable3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Class<?> wildcardClass4 = byteArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable2 + "' != '" + 0 + "'", strComparable2.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable3 + "' != '" + 0 + "'", strComparable3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0398");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0f, outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0399");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        java.lang.Comparable<java.lang.String> strComparable2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Comparable<java.lang.String> strComparable3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        java.lang.String str7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        java.lang.Class<?> wildcardClass8 = byteArray4.getClass();
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
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0400");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0f);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2, outputStream6);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0401");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray3);
        java.lang.reflect.GenericDeclaration genericDeclaration7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        java.lang.Class<?> wildcardClass8 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        java.lang.reflect.GenericDeclaration genericDeclaration9 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
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
        org.junit.Assert.assertNotNull(genericDeclaration9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0402");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        java.lang.reflect.AnnotatedElement annotatedElement7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils serializationUtils9 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray8);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0403");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray6);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray7);
        byte[] byteArray9 = org.apache.commons.lang3.SerializationUtils.clone(byteArray7);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0404");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.lang.Class to java.lang.String");
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
            System.out.format("%n%s%n", "SerializationUtils0.test0405");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.lang.Class<?> wildcardClass7 = byteArray6.getClass();
        java.lang.Class<?> wildcardClass8 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass7);
        java.io.Serializable serializable9 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) wildcardClass7);
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
        org.junit.Assert.assertNotNull(wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0406");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        java.lang.Class<?> wildcardClass5 = byteArray3.getClass();
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
            System.out.format("%n%s%n", "SerializationUtils0.test0407");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        java.lang.Class<?> wildcardClass8 = byteArray5.getClass();
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
            System.out.format("%n%s%n", "SerializationUtils0.test0408");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 10.0f);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 10.0f);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.lang.Class<?> wildcardClass5 = byteArray4.getClass();
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
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
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0409");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = byteArray3.getClass();
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
            System.out.format("%n%s%n", "SerializationUtils0.test0410");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
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
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0411");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray4);
        java.lang.Class<?> wildcardClass7 = byteArray4.getClass();
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
            System.out.format("%n%s%n", "SerializationUtils0.test0412");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize(serializable3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        java.io.Serializable serializable8 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray7);
        byte[] byteArray9 = org.apache.commons.lang3.SerializationUtils.serialize(serializable8);
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
        org.junit.Assert.assertNotNull(byteArray9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0413");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize(serializable3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.clone(byteArray4);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray7);
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
        org.junit.Assert.assertNotNull(byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0414");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize(serializable3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.clone(byteArray4);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        byte[] byteArray9 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0415");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
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
            System.out.format("%n%s%n", "SerializationUtils0.test0416");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass4 = byteArray2.getClass();
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass6 = byteArray2.getClass();
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
            System.out.format("%n%s%n", "SerializationUtils0.test0417");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize(serializable3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.clone(byteArray4);
        java.lang.Object obj8 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray7);
        byte[] byteArray9 = org.apache.commons.lang3.SerializationUtils.clone(byteArray7);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0418");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0d);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.io.Serializable serializable5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        java.lang.Class<?> wildcardClass6 = byteArray4.getClass();
        java.io.Serializable serializable7 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) wildcardClass6);
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize(serializable7, outputStream8);
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
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0419");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.AnnotatedElement annotatedElement2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.lang.Double to java.lang.reflect.AnnotatedElement");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0420");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0421");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence1 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The byte[] must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0422");
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
            System.out.format("%n%s%n", "SerializationUtils0.test0423");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize(serializable3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        java.io.Serializable serializable8 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray7);
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
        org.junit.Assert.assertNotNull(serializable8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0424");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray4);
        java.lang.reflect.Type type6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
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
        org.junit.Assert.assertNotNull(type6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0425");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
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
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0426");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.reflect.Type type4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        org.apache.commons.lang3.SerializationUtils serializationUtils5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.reflect.Type type7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray6);
        java.lang.Class<?> wildcardClass8 = byteArray6.getClass();
        java.lang.Class<?> wildcardClass9 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass8);
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
        org.junit.Assert.assertNotNull(wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0427");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray5);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0428");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils serializationUtils8 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.lang.Class to org.apache.commons.lang3.SerializationUtils");
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
            System.out.format("%n%s%n", "SerializationUtils0.test0429");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
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
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0430");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray6);
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
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0431");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 1);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0432");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
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
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0433");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize(serializable3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        java.lang.Class<?> wildcardClass7 = serializable6.getClass();
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize(serializable6);
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
        org.junit.Assert.assertNotNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0434");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 10.0f);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 10.0f);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.lang.Class<?> wildcardClass5 = byteArray4.getClass();
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray6);
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
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0435");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0436");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray4);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0437");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass4 = byteArray2.getClass();
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
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
        org.junit.Assert.assertNotNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0438");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0439");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0440");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        org.apache.commons.lang3.SerializationUtils serializationUtils5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray2);
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
        org.junit.Assert.assertNotNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializationUtils5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0441");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 10.0f);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 10.0f);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0442");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 'a');
        java.io.Serializable serializable2 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.Object obj4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils serializationUtils5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast [B to org.apache.commons.lang3.SerializationUtils");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0443");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.AnnotatedElement annotatedElement2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.lang.Character to java.lang.reflect.AnnotatedElement");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0444");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.lang.reflect.GenericDeclaration genericDeclaration4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        java.lang.Class<?> wildcardClass5 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0445");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable5 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray4);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils serializationUtils9 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast [B to org.apache.commons.lang3.SerializationUtils");
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
        org.junit.Assert.assertNotNull(serializable5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0446");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray3);
        java.lang.reflect.GenericDeclaration genericDeclaration7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        java.lang.Class<?> wildcardClass8 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
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
        org.junit.Assert.assertNotNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0447");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
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
        org.junit.Assert.assertNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0448");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.reflect.Type type4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        org.apache.commons.lang3.SerializationUtils serializationUtils5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Class<?> wildcardClass6 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass7 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass6);
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
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0449");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray2.getClass();
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass5 = byteArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0450");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0d);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.GenericDeclaration genericDeclaration6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
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
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0451");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0d);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray5);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0452");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass3);
        java.lang.Class<?> wildcardClass5 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass3);
        java.lang.Class<?> wildcardClass6 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass3);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass3);
        java.lang.Class<?> wildcardClass8 = byteArray7.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0453");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0454");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 'a');
        java.io.Serializable serializable2 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.lang.Character to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable2);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0455");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        java.lang.Class<?> wildcardClass8 = byteArray5.getClass();
        byte[] byteArray9 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
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
        org.junit.Assert.assertNotNull(wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0456");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 1);
        java.lang.Object obj2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Object obj3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.lang.Short to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj2 + "' != '" + (short) 1 + "'", obj2.equals((short) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 1 + "'", obj3.equals((short) 1));
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0457");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0458");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0f);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) wildcardClass2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0459");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0f);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0f);
        java.io.OutputStream outputStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0f, outputStream3);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0460");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass4 = byteArray2.getClass();
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray6);
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
        org.junit.Assert.assertNotNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(byteArray7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0461");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray3);
        java.lang.Class<?> wildcardClass7 = byteArray3.getClass();
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
            System.out.format("%n%s%n", "SerializationUtils0.test0462");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray2.getClass();
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass5 = byteArray2.getClass();
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) wildcardClass5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass5);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass5);
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
        org.junit.Assert.assertNotNull(byteArray8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0463");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass4 = byteArray2.getClass();
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        java.lang.Class<?> wildcardClass7 = byteArray6.getClass();
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
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0464");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 10L);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0465");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0d);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.io.Serializable serializable5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        java.lang.Class<?> wildcardClass6 = byteArray4.getClass();
        java.io.Serializable serializable7 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) wildcardClass6);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass6);
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
        org.junit.Assert.assertNotNull(byteArray8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0466");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0d);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.io.Serializable serializable5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        java.lang.Class<?> wildcardClass6 = byteArray4.getClass();
        java.io.Serializable serializable7 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) wildcardClass6);
        java.io.Serializable serializable8 = org.apache.commons.lang3.SerializationUtils.clone(serializable7);
        java.lang.Class<?> wildcardClass9 = serializable8.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0467");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        org.apache.commons.lang3.SerializationUtils serializationUtils4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Class<?> wildcardClass5 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass6 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass5);
        java.lang.Class<?> wildcardClass7 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass5);
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
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0468");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass5 = byteArray4.getClass();
        java.lang.Class<?> wildcardClass6 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass5);
        java.lang.Class<?> wildcardClass7 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass5);
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
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0469");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.clone(byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
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
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (-1.0d) + "'", serializable6.equals((-1.0d)));
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0470");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.GenericDeclaration genericDeclaration5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0471");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.clone(byteArray2);
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
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0472");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray4);
        java.lang.reflect.AnnotatedElement annotatedElement7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray6);
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
        org.junit.Assert.assertNotNull(annotatedElement7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0473");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.reflect.Type type4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        org.apache.commons.lang3.SerializationUtils serializationUtils5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0474");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass4 = byteArray2.getClass();
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        java.lang.Class<?> wildcardClass8 = byteArray7.getClass();
        java.lang.Class<?> wildcardClass9 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass8);
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
        org.junit.Assert.assertNotNull(wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0475");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray6);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.clone(byteArray6);
        byte[] byteArray9 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray8);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0476");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray6);
        java.lang.Class<?> wildcardClass8 = byteArray7.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0477");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.CharSequence charSequence5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.CharSequence charSequence6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Class<?> wildcardClass7 = byteArray1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0478");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0d);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.io.Serializable serializable5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        java.lang.Class<?> wildcardClass6 = serializable5.getClass();
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
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0479");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray2.getClass();
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass3);
        java.lang.Class<?> wildcardClass5 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass4);
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
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0480");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0481");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable5 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray4);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
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
        org.junit.Assert.assertNotNull(serializable5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0482");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0d);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray6);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.clone(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable9 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray6);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0483");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils serializationUtils6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
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
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0484");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        org.apache.commons.lang3.SerializationUtils serializationUtils4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Class<?> wildcardClass5 = byteArray1.getClass();
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
            System.out.format("%n%s%n", "SerializationUtils0.test0485");
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
            System.out.format("%n%s%n", "SerializationUtils0.test0486");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize(serializable3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        java.lang.Object obj8 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray7);
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
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0487");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass4 = byteArray2.getClass();
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray6);
        java.lang.Class<?> wildcardClass8 = byteArray7.getClass();
        java.lang.Class<?> wildcardClass9 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass8);
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
        org.junit.Assert.assertNotNull(wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0488");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0489");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) '4');
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.lang.Character to [B");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0490");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray3);
        java.lang.reflect.GenericDeclaration genericDeclaration7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        java.lang.Class<?> wildcardClass8 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        java.lang.Object obj9 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
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
        org.junit.Assert.assertNotNull(obj9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj9.toString(), "class [B");
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0491");
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
            System.out.format("%n%s%n", "SerializationUtils0.test0492");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass4 = byteArray2.getClass();
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        java.lang.Object obj7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
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
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0493");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.clone(byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        java.lang.Class<?> wildcardClass6 = byteArray3.getClass();
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
            System.out.format("%n%s%n", "SerializationUtils0.test0494");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.reflect.GenericDeclaration genericDeclaration4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray6);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray6);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0495");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) "hi!");
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.String str3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Class<?> wildcardClass4 = byteArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0496");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.reflect.GenericDeclaration genericDeclaration5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray4);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.clone(byteArray4);
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
        org.junit.Assert.assertNotNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0497");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass4 = byteArray2.getClass();
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass6 = byteArray2.getClass();
        java.lang.Class<?> wildcardClass7 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass6);
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
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0498");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 10.0f);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 10.0f);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.lang.Class<?> wildcardClass5 = byteArray4.getClass();
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.AnnotatedElement annotatedElement8 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray6);
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
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void SerializationUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test0499");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.lang.Class<?> wildcardClass6 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2, outputStream7);
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
            System.out.format("%n%s%n", "SerializationUtils0.test0500");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0d);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize(serializable6);
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
    }
}

