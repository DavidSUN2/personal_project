package SerializationUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SerializationUtils0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test01");
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
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test02");
        org.apache.commons.lang3.SerializationUtils serializationUtils0 = new org.apache.commons.lang3.SerializationUtils();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test03");
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
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test04");
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
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test05");
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
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test06");
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
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test07");
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
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test08");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 1.0d);
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
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test09");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 10.0f);
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
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test10");
        java.io.Serializable serializable1 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable1 + "' != '" + '#' + "'", serializable1.equals('#'));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test11");
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
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test12");
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
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test13");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass1);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test14");
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
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test15");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test16");
        java.lang.String str1 = org.apache.commons.lang3.SerializationUtils.clone("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test17");
        java.io.Serializable serializable1 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable1 + "' != '" + '4' + "'", serializable1.equals('4'));
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test18");
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
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test19");
        java.io.Serializable serializable1 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable1 + "' != '" + (byte) 1 + "'", serializable1.equals((byte) 1));
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test20");
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
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test21");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 100, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        java.io.Serializable serializable7 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type type8 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray6);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.StreamCorruptedException: invalid stream header: 64010064");
        } catch (org.apache.commons.lang3.SerializationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable7);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test22");
        java.lang.String str1 = org.apache.commons.lang3.SerializationUtils.clone("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test23");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 100, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        java.io.Serializable serializable7 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray6);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.StreamCorruptedException: invalid stream header: 64010064");
        } catch (org.apache.commons.lang3.SerializationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable7);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test24");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.GenericDeclaration genericDeclaration4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test25");
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
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test26");
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
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test27");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 100);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test28");
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
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test29");
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
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test30");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 10);
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
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test31");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 100, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.clone(byteArray6);
        java.lang.Class<?> wildcardClass8 = byteArray7.getClass();
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
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test32");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        org.apache.commons.lang3.SerializationUtils serializationUtils2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = serializationUtils2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializationUtils2);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test33");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) "");
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test34");
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
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test35");
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
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test36");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 100);
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
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test37");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 100);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test38");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test39");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 100, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.clone(byteArray6);
        java.lang.Class<?> wildcardClass8 = byteArray6.getClass();
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
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test40");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 100, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        java.lang.Class<?> wildcardClass7 = byteArray6.getClass();
        java.lang.Class<?> wildcardClass8 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass7);
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
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test41");
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
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test42");
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
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test43");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 100, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        java.io.Serializable serializable7 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray6);
        java.lang.Class<?> wildcardClass8 = serializable7.getClass();
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
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test44");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 100, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        java.lang.Class<?> wildcardClass7 = byteArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test45");
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
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test46");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) ' ', outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test47");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
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
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test48");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 1.0d);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test49");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
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
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test50");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1 };
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        java.lang.Class<?> wildcardClass7 = byteArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test51");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1 };
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
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test52");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 100L);
        java.lang.Object obj2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray1);
        java.lang.Class<?> wildcardClass4 = serializable3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj2 + "' != '" + 100L + "'", obj2.equals(100L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test53");
        java.io.Serializable serializable1 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable1 + "' != '" + 100.0f + "'", serializable1.equals(100.0f));
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test54");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        org.apache.commons.lang3.SerializationUtils serializationUtils2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray1);
        java.lang.Class<?> wildcardClass4 = serializable3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializationUtils2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test55");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.Class<?> wildcardClass4 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass5 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass4);
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
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test56");
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
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test57");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
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
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test58");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 10.0f);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test59");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1));
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
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test60");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 100);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
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
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test61");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 100);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test62");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 100);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.io.Serializable serializable3 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable3);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test63");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1));
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
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test64");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 100);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils serializationUtils4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
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
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test65");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 100);
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
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SerializationUtils0.test66");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 100L);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }
}

