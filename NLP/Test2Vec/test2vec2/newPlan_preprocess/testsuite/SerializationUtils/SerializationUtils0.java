package SerializationUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SerializationUtils0 {

    public static boolean debug = false;

    @Test
    public void SerializationUtils0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0001");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in SerializationUtils generation
        try {
            java.lang.Object obj1 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The InputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0002");
        java.io.Serializable serializable1 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable1 + "' != '" + 1L + "'", serializable1.equals(1L));
    }

    @Test
    public void SerializationUtils0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0003");
        java.io.Serializable serializable0 = null;
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in SerializationUtils generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize(serializable0, outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0004");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in SerializationUtils generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 1, outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0005");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in SerializationUtils generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The byte[] must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0006");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in SerializationUtils generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 10, outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0007");
        java.io.Serializable serializable1 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable1 + "' != '" + 1.0f + "'", serializable1.equals(1.0f));
    }

    @Test
    public void SerializationUtils0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0008");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in SerializationUtils generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L), outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0009");
        java.lang.String str1 = org.apache.commons.lang3.SerializationUtils.clone("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void SerializationUtils0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0010");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in SerializationUtils generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The InputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0011");
        java.lang.String str1 = org.apache.commons.lang3.SerializationUtils.clone("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void SerializationUtils0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0012");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in SerializationUtils generation
        try {
            java.lang.CharSequence charSequence1 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The InputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0013");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in SerializationUtils generation
        try {
            java.lang.Comparable<java.lang.String> strComparable1 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The InputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0014");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in SerializationUtils generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) "hi!", outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0015");
        byte[] byteArray0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.clone(byteArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(byteArray1);
    }

    @Test
    public void SerializationUtils0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0016");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0017");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in SerializationUtils generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) false, outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0018");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in SerializationUtils generation
        try {
            java.lang.reflect.AnnotatedElement annotatedElement1 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The InputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0019");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in SerializationUtils generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 10.0d, outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0020");
        java.io.Serializable serializable1 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable1 + "' != '" + 100.0d + "'", serializable1.equals(100.0d));
    }

    @Test
    public void SerializationUtils0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0021");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0022");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in SerializationUtils generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 1.0d, outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0023");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.io.OutputStream outputStream2 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0024");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0d);
        java.io.OutputStream outputStream2 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0025");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in SerializationUtils generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) '#', outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0026");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        java.lang.Comparable<java.lang.String> strComparable2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0027");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in SerializationUtils generation
        try {
            byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The InputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0028");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0d);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0029");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in SerializationUtils generation
        try {
            java.lang.reflect.GenericDeclaration genericDeclaration1 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The InputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0030");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in SerializationUtils generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The InputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0031");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 1);
        java.io.OutputStream outputStream2 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0032");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.io.OutputStream outputStream4 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0033");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0d);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0034");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.io.OutputStream outputStream4 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0035");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in SerializationUtils generation
        try {
            java.io.Serializable serializable1 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The byte[] must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0036");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in SerializationUtils generation
        try {
            org.apache.commons.lang3.SerializationUtils serializationUtils1 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The InputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0037");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0038");
        java.io.Serializable serializable0 = null;
        java.io.Serializable serializable1 = org.apache.commons.lang3.SerializationUtils.clone(serializable0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable1);
    }

    @Test
    public void SerializationUtils0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0039");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0040");
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
    public void SerializationUtils0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0041");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0042");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0043");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in SerializationUtils generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 100.0f, outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0044");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in SerializationUtils generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 100.0d, outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0045");
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
    public void SerializationUtils0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0046");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.reflect.GenericDeclaration genericDeclaration5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0047");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in SerializationUtils generation
        try {
            java.io.Serializable serializable1 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The InputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0048");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0049");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.io.OutputStream outputStream3 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0050");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in SerializationUtils generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 10.0f, outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0051");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) -1);
        java.io.OutputStream outputStream2 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0052");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in SerializationUtils generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 10, outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0053");
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
    public void SerializationUtils0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0054");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 100);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void SerializationUtils0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0055");
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
    public void SerializationUtils0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0056");
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
    public void SerializationUtils0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0057");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Comparable<java.lang.String> strComparable2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0058");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.io.OutputStream outputStream4 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0059");
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
    public void SerializationUtils0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0060");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.io.OutputStream outputStream2 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0061");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 1);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 1);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0062");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.reflect.Type type4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        org.apache.commons.lang3.SerializationUtils serializationUtils5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0063");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Class<?> wildcardClass4 = byteArray1.getClass();
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0064");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in SerializationUtils generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) -1, outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0065");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0066");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 100);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0067");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.io.OutputStream outputStream4 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0068");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0069");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0070");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0071");
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
    public void SerializationUtils0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0072");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        org.apache.commons.lang3.SerializationUtils serializationUtils4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Class<?> wildcardClass5 = byteArray1.getClass();
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0073");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray2.getClass();
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0074");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0075");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0076");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass4 = byteArray2.getClass();
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0077");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.OutputStream outputStream3 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0078");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.io.OutputStream outputStream4 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0079");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 100);
        java.io.OutputStream outputStream2 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0080");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.lang.Class<?> wildcardClass6 = byteArray4.getClass();
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0081");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in SerializationUtils generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) -1, outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0082");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 100);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0083");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0084");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass3);
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0085");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        org.apache.commons.lang3.SerializationUtils serializationUtils4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.reflect.AnnotatedElement annotatedElement5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0086");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 1);
        java.io.OutputStream outputStream2 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0087");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 10L);
        java.lang.Object obj2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0088");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0089");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0090");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.io.OutputStream outputStream3 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0091");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.reflect.GenericDeclaration genericDeclaration4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray2);
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0092");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.Object obj4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        java.lang.Class<?> wildcardClass5 = byteArray3.getClass();
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0093");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.io.OutputStream outputStream4 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0094");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) -1);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void SerializationUtils0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0095");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize(serializable3);
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0096");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0d);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.io.OutputStream outputStream4 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0097");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in SerializationUtils generation
        try {
            java.lang.reflect.Type type1 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The InputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0098");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) -1);
        java.io.OutputStream outputStream2 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0099");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0100");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.reflect.GenericDeclaration genericDeclaration5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0101");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in SerializationUtils generation
        try {
            java.lang.reflect.GenericDeclaration genericDeclaration1 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The byte[] must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0102");
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
    public void SerializationUtils0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0103");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) ' ');
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0104");
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
    public void SerializationUtils0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0105");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray3);
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0106");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0107");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize(serializable3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.clone(byteArray4);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0108");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) -1);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0109");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray3);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0110");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 1);
        java.io.Serializable serializable2 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (short) 1 + "'", serializable2.equals((short) 1));
    }

    @Test
    public void SerializationUtils0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0111");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0112");
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
    public void SerializationUtils0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0113");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in SerializationUtils generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 0, outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0114");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 1);
        java.lang.Object obj2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.io.OutputStream outputStream3 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0115");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray2.getClass();
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0116");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) '4');
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0117");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0d);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.io.Serializable serializable5 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray4);
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0118");
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
    public void SerializationUtils0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0119");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 10L);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0120");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.io.OutputStream outputStream4 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0121");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in SerializationUtils generation
        try {
            java.lang.reflect.Type type1 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The byte[] must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0122");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.clone(byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.lang.Class<?> wildcardClass5 = byteArray4.getClass();
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0123");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Comparable<java.lang.String> strComparable2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Comparable<java.lang.String> strComparable3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.io.OutputStream outputStream4 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0124");
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
    public void SerializationUtils0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0125");
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
    public void SerializationUtils0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0126");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize(serializable6);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0127");
        java.io.Serializable serializable1 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable1 + "' != '" + (short) 0 + "'", serializable1.equals((short) 0));
    }

    @Test
    public void SerializationUtils0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0128");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        org.apache.commons.lang3.SerializationUtils serializationUtils4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Class<?> wildcardClass5 = byteArray1.getClass();
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0129");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass1);
    }

    @Test
    public void SerializationUtils0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0130");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass3);
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0131");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0d);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0132");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 100);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0133");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0d);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.lang.Class<?> wildcardClass5 = byteArray3.getClass();
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0134");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.lang.Class<?> wildcardClass5 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0135");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0f);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) wildcardClass2);
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0136");
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
    public void SerializationUtils0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0137");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) wildcardClass2);
        java.io.OutputStream outputStream4 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0138");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0139");
        java.io.Serializable serializable1 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable1 + "' != '" + (-1.0f) + "'", serializable1.equals((-1.0f)));
    }

    @Test
    public void SerializationUtils0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0140");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.reflect.Type type4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0141");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in SerializationUtils generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The byte[] must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0142");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0143");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0144");
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
    public void SerializationUtils0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0145");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) '4');
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0146");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) wildcardClass2);
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0147");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.clone(byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0148");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in SerializationUtils generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1), outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0149");
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
    public void SerializationUtils0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0150");
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
    public void SerializationUtils0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0151");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray2.getClass();
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass3);
        java.lang.Class<?> wildcardClass5 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass3);
        java.lang.Class<?> wildcardClass6 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass5);
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0152");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0153");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0d);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.io.Serializable serializable5 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray4);
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0154");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray2.getClass();
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0155");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) ' ');
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0156");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray2.getClass();
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0157");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray4);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0158");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.OutputStream outputStream3 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0159");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize(serializable3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.clone(byteArray4);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray7);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0160");
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
    public void SerializationUtils0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0161");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable5 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray4);
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0162");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.clone(byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0163");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0164");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.clone(byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        java.lang.Class<?> wildcardClass6 = byteArray5.getClass();
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0165");
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
    public void SerializationUtils0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0166");
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
    public void SerializationUtils0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0167");
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
    public void SerializationUtils0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0168");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0169");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0d);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0170");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 'a');
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void SerializationUtils0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0171");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.io.OutputStream outputStream4 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0172");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize(serializable3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.lang.Class<?> wildcardClass6 = byteArray4.getClass();
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0173");
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
    public void SerializationUtils0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0174");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        java.lang.Class<?> wildcardClass6 = byteArray4.getClass();
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0175");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize(serializable3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0176");
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
    public void SerializationUtils0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0177");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) '#');
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void SerializationUtils0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0178");
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
    public void SerializationUtils0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0179");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass4 = byteArray2.getClass();
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        java.lang.Class<?> wildcardClass6 = byteArray5.getClass();
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0180");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass4 = byteArray2.getClass();
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0181");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 10.0f);
        java.io.Serializable serializable2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.io.OutputStream outputStream3 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0182");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) ' ');
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) ' ');
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0183");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 100);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0184");
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
    public void SerializationUtils0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0185");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void SerializationUtils0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0186");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize(serializable6);
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0187");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0188");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0d);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.lang.Class<?> wildcardClass6 = byteArray5.getClass();
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0189");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0190");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0191");
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
    public void SerializationUtils0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0192");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.reflect.GenericDeclaration genericDeclaration5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0193");
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
    public void SerializationUtils0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0194");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void SerializationUtils0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0195");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 10.0f);
        java.io.Serializable serializable2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.io.OutputStream outputStream3 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0196");
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
    public void SerializationUtils0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0197");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.OutputStream outputStream4 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0198");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.clone(byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        java.lang.Class<?> wildcardClass6 = byteArray5.getClass();
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0199");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 100);
        java.io.OutputStream outputStream2 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0200");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0201");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0202");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 1);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 1);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0203");
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
    public void SerializationUtils0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0204");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray5);
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0205");
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
    public void SerializationUtils0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0206");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0207");
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
    public void SerializationUtils0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0208");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.lang.Class<?> wildcardClass5 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0209");
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
    public void SerializationUtils0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0210");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray4);
        java.lang.reflect.GenericDeclaration genericDeclaration6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0211");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.io.OutputStream outputStream4 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0212");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass3);
        java.lang.Class<?> wildcardClass5 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass3);
        java.lang.Class<?> wildcardClass6 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass3);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass3);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0213");
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
    public void SerializationUtils0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0214");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in SerializationUtils generation
        try {
            java.lang.Comparable<java.lang.String> strComparable1 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The byte[] must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0215");
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
    public void SerializationUtils0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0216");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 'a');
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void SerializationUtils0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0217");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0218");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0219");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.reflect.Type type4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        org.apache.commons.lang3.SerializationUtils serializationUtils5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0220");
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
    public void SerializationUtils0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0221");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in SerializationUtils generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) '4', outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0222");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.io.OutputStream outputStream4 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0223");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray3);
        java.lang.reflect.GenericDeclaration genericDeclaration7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0224");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) wildcardClass2);
        java.lang.Class<?> wildcardClass5 = serializable4.getClass();
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0225");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0226");
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
    public void SerializationUtils0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0227");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in SerializationUtils generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 1, outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0228");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.reflect.Type type4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        org.apache.commons.lang3.SerializationUtils serializationUtils5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0229");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0230");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.reflect.GenericDeclaration genericDeclaration5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        org.apache.commons.lang3.SerializationUtils serializationUtils6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0231");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in SerializationUtils generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 100L, outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0232");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0233");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass4 = byteArray2.getClass();
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray6);
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0234");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0235");
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
    public void SerializationUtils0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0236");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 'a');
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0237");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) -1);
        java.lang.Object obj2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0238");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void SerializationUtils0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0239");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0240");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize(serializable3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0241");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray2.getClass();
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0242");
        java.io.Serializable serializable1 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable1 + "' != '" + 10 + "'", serializable1.equals(10));
    }

    @Test
    public void SerializationUtils0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0243");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.reflect.Type type4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        org.apache.commons.lang3.SerializationUtils serializationUtils5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.reflect.Type type7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray6);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray6);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0244");
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
    public void SerializationUtils0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0245");
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
    public void SerializationUtils0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0246");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize(serializable6);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0247");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize(serializable3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0248");
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
    public void SerializationUtils0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0249");
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
    public void SerializationUtils0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0250");
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
    public void SerializationUtils0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0251");
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
    public void SerializationUtils0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0252");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0d);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray6);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0253");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.lang.Class<?> wildcardClass5 = byteArray3.getClass();
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0254");
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
    public void SerializationUtils0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0255");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) '4');
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0256");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 1);
        java.lang.Object obj2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0257");
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
    public void SerializationUtils0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0258");
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
    public void SerializationUtils0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0259");
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
    public void SerializationUtils0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0260");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0f);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.io.OutputStream outputStream4 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0261");
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
    public void SerializationUtils0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0262");
        java.io.Serializable serializable1 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable1 + "' != '" + (short) 1 + "'", serializable1.equals((short) 1));
    }

    @Test
    public void SerializationUtils0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0263");
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
    public void SerializationUtils0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0264");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.io.OutputStream outputStream4 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0265");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.String str4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray2);
        java.lang.Class<?> wildcardClass5 = byteArray2.getClass();
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0266");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0267");
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
    public void SerializationUtils0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0268");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.lang.Class<?> wildcardClass5 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0269");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray2.getClass();
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass5 = byteArray2.getClass();
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) wildcardClass5);
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0270");
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
    public void SerializationUtils0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0271");
        java.io.Serializable serializable1 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable1 + "' != '" + (byte) 1 + "'", serializable1.equals((byte) 1));
    }

    @Test
    public void SerializationUtils0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0272");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.Class<?> wildcardClass4 = byteArray3.getClass();
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0273");
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
    public void SerializationUtils0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0274");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0275");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray4);
        java.lang.reflect.Type type6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0276");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass5 = byteArray4.getClass();
        java.lang.Class<?> wildcardClass6 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass5);
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0277");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.reflect.Type type4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        org.apache.commons.lang3.SerializationUtils serializationUtils5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.reflect.Type type7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray6);
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0278");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize(serializable3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0279");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.lang.Object obj6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0280");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.Class<?> wildcardClass4 = byteArray3.getClass();
        java.lang.Class<?> wildcardClass5 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass4);
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0281");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.reflect.GenericDeclaration genericDeclaration4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray2);
        java.lang.Class<?> wildcardClass5 = byteArray2.getClass();
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0282");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray4);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0283");
        java.io.Serializable serializable1 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable1 + "' != '" + (-1.0d) + "'", serializable1.equals((-1.0d)));
    }

    @Test
    public void SerializationUtils0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0284");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0285");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.lang.reflect.Type type6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0286");
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
    public void SerializationUtils0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0287");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in SerializationUtils generation
        try {
            java.lang.Object obj1 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The byte[] must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0288");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0289");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0d);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.lang.Class<?> wildcardClass5 = byteArray3.getClass();
        java.lang.Class<?> wildcardClass6 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass6);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.clone(byteArray7);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0290");
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
    public void SerializationUtils0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0291");
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
    public void SerializationUtils0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0292");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass4 = byteArray2.getClass();
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        java.lang.Class<?> wildcardClass7 = byteArray5.getClass();
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0293");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0294");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0295");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0296");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) ' ');
        java.io.OutputStream outputStream2 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0297");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0f);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) wildcardClass3);
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0298");
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
    public void SerializationUtils0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0299");
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
    public void SerializationUtils0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0300");
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
    public void SerializationUtils0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0301");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.reflect.GenericDeclaration genericDeclaration4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0302");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.reflect.Type type4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        org.apache.commons.lang3.SerializationUtils serializationUtils5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray6);
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0303");
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
    public void SerializationUtils0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0304");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass4 = byteArray2.getClass();
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0305");
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
    public void SerializationUtils0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0306");
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
    public void SerializationUtils0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0307");
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
    public void SerializationUtils0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0308");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        java.lang.Class<?> wildcardClass7 = byteArray6.getClass();
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0309");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray3);
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0310");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.lang.Class<?> wildcardClass5 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0311");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0f);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.io.OutputStream outputStream3 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0312");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0d);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.io.Serializable serializable5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0313");
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
    public void SerializationUtils0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0314");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.io.Serializable serializable5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray2);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0315");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in SerializationUtils generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0, outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0316");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray2.getClass();
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass3);
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0317");
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
    public void SerializationUtils0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0318");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass4 = byteArray2.getClass();
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0319");
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
    public void SerializationUtils0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0320");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) "hi!");
        java.io.OutputStream outputStream2 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0321");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0322");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0323");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray1);
        java.lang.Class<?> wildcardClass5 = byteArray1.getClass();
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0324");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0d);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0325");
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
    public void SerializationUtils0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0326");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in SerializationUtils generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 10, outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0327");
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
    public void SerializationUtils0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0328");
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
    public void SerializationUtils0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0329");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0330");
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
    public void SerializationUtils0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0331");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass4 = byteArray2.getClass();
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass6 = byteArray5.getClass();
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0332");
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
    public void SerializationUtils0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0333");
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
    public void SerializationUtils0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0334");
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
    public void SerializationUtils0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0335");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 10L);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0336");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0337");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Class<?> wildcardClass4 = byteArray1.getClass();
        java.io.Serializable serializable5 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) wildcardClass4);
        java.lang.Class<?> wildcardClass6 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass4);
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0338");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.Object obj4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0339");
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
    public void SerializationUtils0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0340");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) ' ');
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0341");
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
    public void SerializationUtils0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0342");
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
    public void SerializationUtils0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0343");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) -1);
        java.lang.Object obj2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray1.getClass();
        java.io.OutputStream outputStream4 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0344");
        org.apache.commons.lang3.SerializationUtils serializationUtils0 = new org.apache.commons.lang3.SerializationUtils();
        java.lang.Class<?> wildcardClass1 = serializationUtils0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void SerializationUtils0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0345");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.Class<?> wildcardClass4 = byteArray1.getClass();
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0346");
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
    public void SerializationUtils0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0347");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass4 = serializable3.getClass();
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0348");
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
    public void SerializationUtils0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0349");
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
    public void SerializationUtils0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0350");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.io.OutputStream outputStream4 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0351");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        org.apache.commons.lang3.SerializationUtils serializationUtils4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.reflect.AnnotatedElement annotatedElement5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.reflect.GenericDeclaration genericDeclaration6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0352");
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
    public void SerializationUtils0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0353");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.Comparable<java.lang.String> strComparable4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0354");
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
    public void SerializationUtils0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0355");
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
    public void SerializationUtils0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0356");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize(serializable3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0357");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray2.getClass();
        java.io.OutputStream outputStream4 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0358");
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
    public void SerializationUtils0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0359");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass4 = byteArray2.getClass();
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray6);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.clone(byteArray7);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0360");
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
    public void SerializationUtils0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0361");
        java.io.Serializable serializable1 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable1 + "' != '" + '#' + "'", serializable1.equals('#'));
    }

    @Test
    public void SerializationUtils0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0362");
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
    public void SerializationUtils0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0363");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0364");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.reflect.GenericDeclaration genericDeclaration5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        org.apache.commons.lang3.SerializationUtils serializationUtils6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0365");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in SerializationUtils generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 10L, outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0366");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in SerializationUtils generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0f), outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0367");
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
    public void SerializationUtils0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0368");
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
    public void SerializationUtils0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0369");
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
    public void SerializationUtils0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0370");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        org.apache.commons.lang3.SerializationUtils serializationUtils4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.reflect.AnnotatedElement annotatedElement5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0371");
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
    public void SerializationUtils0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0372");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray3);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0373");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0374");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        java.lang.reflect.AnnotatedElement annotatedElement7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0375");
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
    public void SerializationUtils0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0376");
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
    public void SerializationUtils0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0377");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0378");
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
    public void SerializationUtils0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0379");
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
    public void SerializationUtils0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0380");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0381");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray5);
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0382");
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
    public void SerializationUtils0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0383");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0384");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0385");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.io.OutputStream outputStream4 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0386");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.io.Serializable serializable5 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray4);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0387");
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
    public void SerializationUtils0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0388");
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
    public void SerializationUtils0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0389");
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
    public void SerializationUtils0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0390");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass3);
        java.lang.Class<?> wildcardClass5 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass3);
        java.lang.Class<?> wildcardClass6 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass5);
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0391");
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
    public void SerializationUtils0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0392");
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
    public void SerializationUtils0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0393");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0d);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.lang.Class<?> wildcardClass5 = byteArray3.getClass();
        java.lang.Class<?> wildcardClass6 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass6);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0394");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.lang.Class<?> wildcardClass5 = byteArray3.getClass();
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass5);
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0395");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 10.0d);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0396");
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
    public void SerializationUtils0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0397");
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
    public void SerializationUtils0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0398");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in SerializationUtils generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0f, outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0399");
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
    public void SerializationUtils0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0400");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0f);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0401");
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
    public void SerializationUtils0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0402");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        java.lang.reflect.AnnotatedElement annotatedElement7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0403");
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
    public void SerializationUtils0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0404");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0405");
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
    public void SerializationUtils0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0406");
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
    public void SerializationUtils0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0407");
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
    public void SerializationUtils0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0408");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 10.0f);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 10.0f);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.lang.Class<?> wildcardClass5 = byteArray4.getClass();
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0409");
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
    public void SerializationUtils0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0410");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0411");
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
    public void SerializationUtils0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0412");
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
    public void SerializationUtils0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0413");
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
    public void SerializationUtils0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0414");
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
    public void SerializationUtils0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0415");
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
    public void SerializationUtils0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0416");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass4 = byteArray2.getClass();
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass6 = byteArray2.getClass();
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0417");
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
    public void SerializationUtils0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0418");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0d);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.io.Serializable serializable5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        java.lang.Class<?> wildcardClass6 = byteArray4.getClass();
        java.io.Serializable serializable7 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) wildcardClass6);
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0419");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 1.0d);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0420");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        java.lang.Class<?> wildcardClass6 = byteArray5.getClass();
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0421");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in SerializationUtils generation
        try {
            java.lang.CharSequence charSequence1 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The byte[] must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void SerializationUtils0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0422");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray2.getClass();
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass3);
        java.lang.Class<?> wildcardClass5 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass3);
        java.lang.Class<?> wildcardClass6 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass5);
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0423");
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
    public void SerializationUtils0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0424");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray4);
        java.lang.reflect.Type type6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0425");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.io.OutputStream outputStream4 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0426");
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
    public void SerializationUtils0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0427");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0428");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0429");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0430");
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
    public void SerializationUtils0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0431");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 1);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.io.OutputStream outputStream4 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0432");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0433");
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
    public void SerializationUtils0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0434");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 10.0f);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 10.0f);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.lang.Class<?> wildcardClass5 = byteArray4.getClass();
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray6);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0435");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray5);
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0436");
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
    public void SerializationUtils0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0437");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass4 = byteArray2.getClass();
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0438");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0439");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0440");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        org.apache.commons.lang3.SerializationUtils serializationUtils5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray2);
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0441");
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
    public void SerializationUtils0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0442");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 'a');
        java.io.Serializable serializable2 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.Object obj4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0443");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) '#');
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0444");
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
    public void SerializationUtils0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0445");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable5 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray4);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0446");
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
    public void SerializationUtils0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0447");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0448");
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
    public void SerializationUtils0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0449");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray2.getClass();
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass5 = byteArray2.getClass();
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0450");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0d);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0451");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0d);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray5);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0452");
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
    public void SerializationUtils0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0453");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0454");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 'a');
        java.io.Serializable serializable2 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray1);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0455");
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
    public void SerializationUtils0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0456");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 1);
        java.lang.Object obj2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Object obj3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0457");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.io.OutputStream outputStream4 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0458");
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
    public void SerializationUtils0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0459");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0f);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0f);
        java.io.OutputStream outputStream3 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0460");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass4 = byteArray2.getClass();
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray6);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0461");
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
    public void SerializationUtils0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0462");
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
    public void SerializationUtils0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0463");
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
    public void SerializationUtils0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0464");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 10L);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void SerializationUtils0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0465");
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
    public void SerializationUtils0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0466");
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
    public void SerializationUtils0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0467");
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
    public void SerializationUtils0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0468");
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
    public void SerializationUtils0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0469");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.clone(byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0470");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0471");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.clone(byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0472");
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
    public void SerializationUtils0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0473");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.reflect.Type type4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        org.apache.commons.lang3.SerializationUtils serializationUtils5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0474");
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
    public void SerializationUtils0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0475");
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
    public void SerializationUtils0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0476");
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
    public void SerializationUtils0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0477");
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
    public void SerializationUtils0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0478");
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
    public void SerializationUtils0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0479");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray2.getClass();
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass3);
        java.lang.Class<?> wildcardClass5 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass4);
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0480");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0481");
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
    public void SerializationUtils0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0482");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0d);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray6);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.clone(byteArray6);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0483");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray4);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0484");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        org.apache.commons.lang3.SerializationUtils serializationUtils4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Class<?> wildcardClass5 = byteArray1.getClass();
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray6);
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0485");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray2.getClass();
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        java.lang.Class<?> wildcardClass5 = byteArray2.getClass();
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) wildcardClass5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass5);
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0486");
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
    public void SerializationUtils0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0487");
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
    public void SerializationUtils0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0488");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.lang.Class<?> wildcardClass5 = byteArray3.getClass();
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0489");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) '4');
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0490");
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
    public void SerializationUtils0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0491");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize(serializable3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        java.io.Serializable serializable6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0492");
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
    public void SerializationUtils0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0493");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.clone(byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        java.lang.Class<?> wildcardClass6 = byteArray3.getClass();
        java.lang.Class<?> wildcardClass7 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass6);
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0494");
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
    public void SerializationUtils0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0495");
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
    public void SerializationUtils0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0496");
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
    public void SerializationUtils0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0497");
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
    public void SerializationUtils0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0498");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 10.0f);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 10.0f);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.lang.Class<?> wildcardClass5 = byteArray4.getClass();
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray6);
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0499");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        java.lang.Class<?> wildcardClass6 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass2);
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in SerializationUtils generation
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
    public void SerializationUtils0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.SerializationUtils0500");
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

