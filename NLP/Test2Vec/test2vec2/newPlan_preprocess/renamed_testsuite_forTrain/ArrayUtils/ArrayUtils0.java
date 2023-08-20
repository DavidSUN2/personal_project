
package ArrayUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ArrayUtils0 {

    public static boolean debug = false;

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test001");
        java.lang.Object[] objArray2 = new java.lang.Object[] { 100.0d, 'a' };
        java.lang.Object[] objArray5 = new java.lang.Object[] { "hi!", 1L };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isSameLength(objArray2, objArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test002");
        float[] floatArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray0, (float) (-1L), (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test003");
        java.lang.Byte[] byteArray0 = null;
        byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray0, (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(byteArray2);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test004");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.remove(byteArray3, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test005");
        long[] longArray6 = new long[] { 10L, 1, 1L, (short) 100, (short) -1, 10 };
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(longArray6, 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test006");
        org.apache.commons.lang3.ArrayUtils arrayUtils0 = new org.apache.commons.lang3.ArrayUtils();
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test007");
        char[] charArray6 = new char[] { '4', ' ', '#', '#', ' ', ' ' };
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray6, '#', (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test008");
        int[] intArray5 = new int[] { '4', (short) 10, (byte) 100, (short) 100, (short) 10 };
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray5, 0, (int) (short) 10);
        java.lang.Integer[] intArray9 = org.apache.commons.lang3.ArrayUtils.toObject(intArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray9);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test009");
        short[] shortArray5 = new short[] { (byte) -1, (byte) 10, (short) 0, (short) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.remove(shortArray5, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray5);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test010");
        double[] doubleArray5 = new double[] { 10.0f, (-1L), 1L, 100, (byte) 100 };
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray5);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray6, (double) 0L, (double) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test011");
        char[] charArray5 = new char[] { 'a', '#', '4', ' ', '4' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray5);
        char[] charArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray6);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray6, '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test012");
        double[] doubleArray5 = new double[] { 10.0f, (-1L), 1L, 100, (byte) 100 };
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray5);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray6, (double) (byte) 1, (double) 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test013");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 100, (byte) 1, (byte) 1 };
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 0, (byte) -1 };
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.removeElements(byteArray4, byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray9);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test014");
        int int0 = org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-1) + "'", int0 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test015");
        long[] longArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray0);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test016");
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { true, true };
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2);
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray3);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test017");
        char[] charArray5 = new char[] { 'a', '#', '4', ' ', '4' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray5);
        char[] charArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray6);
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.clone(charArray7);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray8);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test018");
        java.lang.Boolean[] booleanArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BOOLEAN_OBJECT_ARRAY;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray0);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test019");
        double[] doubleArray5 = new double[] { 10.0f, (-1L), 1L, 100, (byte) 100 };
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray5);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray6, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray6);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test020");
        double[] doubleArray4 = new double[] { 1, ' ', '#', 100L };
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray4, (int) (byte) -1, (int) '#');
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray7, (double) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test021");
        java.lang.Byte[] byteArray1 = new java.lang.Byte[] { (byte) 0 };
        java.lang.Byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test022");
        float[] floatArray6 = new float[] { (short) 0, (short) 100, 1.0f, (short) 10, (byte) 10, 0L };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray6, (float) 100, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test023");
        java.lang.Long[] longArray4 = new java.lang.Long[] { (-1L), 10L, 100L, (-1L) };
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray4, 1L);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray9 = org.apache.commons.lang3.ArrayUtils.add(longArray6, (int) (short) -1, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray6);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test024");
        int[] intArray3 = new int[] { (short) 100, 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray5 = org.apache.commons.lang3.ArrayUtils.remove(intArray3, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test025");
        java.lang.Byte[] byteArray2 = new java.lang.Byte[] { (byte) 0, (byte) 10 };
        byte[] byteArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray2, (byte) -1);
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray2, (byte) 0);
        int[] intArray7 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.removeAll(byteArray6, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test026");
        char[] charArray5 = new char[] { 'a', '#', '4', ' ', '4' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray5);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray6, ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test027");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "hi!", "hi!" };
        java.lang.String[] strArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray4);
        java.lang.Double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY;
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) strArray5, (java.lang.Object) doubleArray6);
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray6, (double) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray9);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test028");
        double[] doubleArray4 = new double[] { 1, ' ', '#', 100L };
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray4, (int) (byte) -1, (int) '#');
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray4, (double) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray9);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test029");
        java.lang.Byte[] byteArray2 = new java.lang.Byte[] { (byte) 0, (byte) 10 };
        byte[] byteArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray2, (byte) -1);
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray2, (byte) 0);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray6, (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test030");
        java.lang.Byte[] byteArray2 = new java.lang.Byte[] { (byte) 0, (byte) 10 };
        byte[] byteArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray2, (byte) -1);
        java.lang.Byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray2);
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test031");
        java.lang.Short[] shortArray5 = new java.lang.Short[] { (short) 0, (short) 10, (short) 1, (short) 1, (short) 0 };
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray5, (short) 1);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray7, (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test032");
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { true, true };
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2);
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray3);
        boolean[] booleanArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray3);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray3, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray5);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test033");
        java.lang.Byte[] byteArray2 = new java.lang.Byte[] { (byte) 0, (byte) 10 };
        byte[] byteArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray2, (byte) -1);
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray2, (byte) 0);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test034");
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { true, true };
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2);
        int int5 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray3, false);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray3, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test035");
        boolean[] booleanArray0 = null;
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test036");
        double[] doubleArray5 = new double[] { 10.0f, (-1L), 1L, 100, (byte) 100 };
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray5);
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.add(doubleArray5, 0, (double) 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray9);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test037");
        char[] charArray5 = new char[] { 'a', '#', '4', ' ', '4' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray5);
        char[] charArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray6);
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.clone(charArray7);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray8);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test038");
        int[] intArray3 = new int[] { 0, 10, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray6 = org.apache.commons.lang3.ArrayUtils.add(intArray3, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test039");
        long[] longArray1 = new long[] { (short) -1 };
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray1, 0L);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray5 = org.apache.commons.lang3.ArrayUtils.remove(longArray1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray3);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test040");
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { true, true };
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2);
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray3);
        boolean[] booleanArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray3);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray5, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test041");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "" };
        java.lang.Comparable<java.lang.String>[] strComparableArray4 = org.apache.commons.lang3.ArrayUtils.toArray((java.lang.Comparable<java.lang.String>[]) strArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String>[] strComparableArray7 = org.apache.commons.lang3.ArrayUtils.add(strComparableArray4, (int) ' ', (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray4);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test042");
        float[] floatArray1 = new float[] { ' ' };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray1);
        int int4 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray1, 1.0f);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test043");
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { true, true };
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2);
        boolean[] booleanArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2);
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.add(booleanArray4, true);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray4, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test044");
        int[] intArray6 = new int[] { 1, (byte) 1, 1, '4', (-1), 0 };
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray6, (int) (byte) 10);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray9);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test045");
        long[] longArray0 = null;
        java.lang.Long[] longArray1 = org.apache.commons.lang3.ArrayUtils.toObject(longArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(longArray1);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test046");
        short[] shortArray1 = new short[] { (byte) 10 };
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray1);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test047");
        java.lang.String[] strArray0 = null;
        java.lang.String[] strArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test048");
        java.lang.Short[] shortArray6 = new java.lang.Short[] { (short) 100, (short) 10, (short) 0, (short) 1, (short) 0, (short) 1 };
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray6);
        short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.add(shortArray7, (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray9);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test049");
        java.lang.Short[] shortArray5 = new java.lang.Short[] { (short) 0, (short) 10, (short) 1, (short) 1, (short) 0 };
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray5, (short) 1);
        short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray5);
        short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.clone(shortArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray9);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test050");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 1, 10, 10 };
        java.lang.Integer[] intArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray4);
        java.lang.Integer[] intArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray4);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) intArray4, (java.lang.Object) 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test051");
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { true, true };
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2);
        boolean[] booleanArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray3, false);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray5, false);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray5, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test052");
        short[] shortArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray0, (short) 10, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test053");
        double[] doubleArray5 = new double[] { 10.0f, (-1L), 1L, 100, (byte) 100 };
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray5);
        java.lang.Double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray6);
        double[] doubleArray8 = null;
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray6, doubleArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray9);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test054");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray2 = new byte[] {};
        byte[][] byteArray3 = new byte[][] { byteArray0, byteArray1, byteArray2 };
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = new byte[] {};
        byte[][] byteArray8 = new byte[][] { byteArray4, byteArray5, byteArray6, byteArray7 };
        byte[][] byteArray9 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray3, byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray0);
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
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test055");
        double[] doubleArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test056");
        float[] floatArray1 = new float[] { ' ' };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray1);
        int int4 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray1, 1.0f);
        java.lang.Float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray1);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.remove(floatArray1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray5);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test057");
        float[] floatArray0 = null;
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray0, 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(floatArray2);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test058");
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { true, true };
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2);
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray3, false, (int) (short) 1);
        boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray3, 0, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray9);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test059");
        double[] doubleArray5 = new double[] { 10.0f, (-1L), 1L, 100, (byte) 100 };
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray5);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray5, (double) 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test060");
        short[] shortArray5 = new short[] { (byte) 1, (short) -1, (short) 0, (short) 100, (byte) 10 };
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.add(shortArray5, (short) -1);
        short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.add(shortArray7, (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray9);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test061");
        long[] longArray1 = new long[] { (short) -1 };
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray1, 0L);
        long[] longArray5 = org.apache.commons.lang3.ArrayUtils.add(longArray1, (long) (short) 0);
        long[] longArray8 = new long[] { (short) 10, (short) 100 };
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray5, longArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test062");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray0, (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray2);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test063");
        int[] intArray3 = new int[] { ' ', (byte) 10, (short) -1 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray3, (int) (byte) 100);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray3, (int) (short) 10);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray3, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test064");
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { true, true };
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2);
        boolean[] booleanArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2);
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.add(booleanArray4, true);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray6, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test065");
        double[] doubleArray4 = new double[] { 1, ' ', '#', 100L };
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray4, (int) (byte) -1, (int) '#');
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray4, (double) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test066");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray0);
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray0, (short) (byte) 10, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test067");
        float[] floatArray1 = new float[] { ' ' };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray1);
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray1);
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.clone(floatArray1);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.remove(floatArray4, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray4);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test068");
        java.lang.Short[] shortArray5 = new java.lang.Short[] { (short) 0, (short) 10, (short) 1, (short) 1, (short) 0 };
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray5, (short) 1);
        short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray5);
        java.lang.Short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray9);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test069");
        float[] floatArray0 = null;
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray0);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test070");
        float[] floatArray1 = new float[] { ' ' };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray1);
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray1);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.remove(floatArray1, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test071");
        float[] floatArray0 = null;
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray0, (float) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(floatArray2);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test072");
        double[] doubleArray5 = new double[] { 10.0f, (-1L), 1L, 100, (byte) 100 };
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray5);
        java.lang.Double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray6);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray6, (double) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test073");
        int[] intArray3 = new int[] { ' ', (byte) 10, (short) -1 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray3, (int) (byte) 100);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray3, (int) (short) 10);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray3);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray9);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test074");
        byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        java.lang.Byte[] byteArray1 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray0);
        byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray1);
        byte[] byteArray4 = new byte[] { (byte) 1 };
        byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.clone(byteArray4);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray2, byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.remove(byteArray2, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test075");
        float[] floatArray1 = new float[] { ' ' };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray1);
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray1);
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.clone(floatArray1);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.remove(floatArray4, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray4);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test076");
        long[] longArray1 = new long[] { (short) -1 };
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray1, 0L);
        long[] longArray5 = org.apache.commons.lang3.ArrayUtils.add(longArray1, (long) (short) 0);
        long[] longArray6 = null;
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.removeElements(longArray5, longArray6);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test077");
        char[] charArray5 = new char[] { 'a', '#', '4', ' ', '4' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray5);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test078");
        char[] charArray5 = new char[] { 'a', '#', '4', ' ', '4' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray5);
        char[] charArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray6);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray7, '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test079");
        double[] doubleArray5 = new double[] { 10.0f, (-1L), 1L, 100, (byte) 100 };
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray5);
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray5, 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray8);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test080");
        long[] longArray1 = new long[] { (short) -1 };
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray1, 0L);
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray1, (long) ' ');
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test081");
        double[] doubleArray0 = null;
        double[] doubleArray6 = new double[] { 10.0f, (-1L), 1L, 100, (byte) 100 };
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray6);
        java.lang.Double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray7);
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.removeElements(doubleArray0, doubleArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test082");
        byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        java.lang.Byte[] byteArray1 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray0);
        byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray1);
        byte[] byteArray4 = new byte[] { (byte) 1 };
        byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.clone(byteArray4);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray2, byteArray4);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray4, (byte) -1, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test083");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.ArrayUtils.clone(byteArray2);
        byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.add(byteArray3, (byte) 10);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray5, (byte) -1, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test084");
        boolean[] booleanArray0 = null;
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test085");
        java.lang.Long[] longArray4 = new java.lang.Long[] { (-1L), 10L, 100L, (-1L) };
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray4, 1L);
        java.lang.Long[] longArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray4);
        java.io.Serializable[] serializableArray8 = org.apache.commons.lang3.ArrayUtils.toArray((java.io.Serializable[]) longArray7);
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray9);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test086");
        java.lang.String str2 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) (-1L), "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-1" + "'", str2.equals("-1"));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test087");
        char[] charArray5 = new char[] { 'a', '#', '4', ' ', '4' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray5);
        char[] charArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray6);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray7, ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test088");
        float[] floatArray1 = new float[] { ' ' };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray1);
        long[] longArray4 = new long[] { (short) -1 };
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray4, 0L);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) floatArray1, (java.lang.Object) longArray4);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray1, (float) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test089");
        byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        java.lang.Byte[] byteArray1 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray0);
        byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray1);
        int[] intArray3 = new int[] {};
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.subarray(intArray3, 1, 3);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray3);
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.clone(intArray3);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.removeAll(byteArray2, intArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray9);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test090");
        java.lang.Double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY;
        double[] doubleArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray0);
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray1, (double) 0L);
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray1, 100.0d, (double) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test091");
        float[] floatArray5 = new float[] { 10L, 10L, 100L, (byte) 0, 2 };
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.add(floatArray5, 10, (float) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray5);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test092");
        int[] intArray6 = new int[] { 1, (byte) 1, 1, '4', (-1), 0 };
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray6, (int) (byte) 10);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test093");
        char[] charArray0 = new char[] {};
        java.lang.Character[] charArray1 = org.apache.commons.lang3.ArrayUtils.toObject(charArray0);
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.contains(charArray0, '#');
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray5 = org.apache.commons.lang3.ArrayUtils.remove(charArray0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test094");
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { true, true };
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2);
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray3);
        boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray3, (int) '#', 100);
        java.lang.String str9 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) 100, "-1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "100" + "'", str9.equals("100"));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test095");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 1, 10, 10 };
        java.lang.Integer[] intArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray4);
        java.lang.Integer[] intArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray4);
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray4);
        java.lang.Integer[] intArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test096");
        int[] intArray5 = new int[] { '4', (short) 10, (byte) 100, (short) 100, (short) 10 };
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray5, 0, (int) (short) 10);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray9);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test097");
        float[] floatArray1 = new float[] { ' ' };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray1);
        int int4 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray1, 1.0f);
        java.lang.Float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray1);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray5, (float) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.remove(floatArray7, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray7);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test098");
        char[] charArray5 = new char[] { 'a', '#', '4', ' ', '4' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray5);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray5, 'a');
        java.lang.Character[] charArray9 = org.apache.commons.lang3.ArrayUtils.toObject(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray9);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test099");
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { true, true };
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2);
        boolean[] booleanArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2);
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2, true);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray6, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test100");
        char[] charArray0 = new char[] {};
        java.lang.Character[] charArray1 = org.apache.commons.lang3.ArrayUtils.toObject(charArray0);
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { true, true };
        boolean[] booleanArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray4);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray5);
        boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray5);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) charArray1, (java.lang.Object) booleanArray5, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test101");
        int[] intArray0 = null;
        int int2 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray0, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test102");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.ArrayUtils.clone(byteArray2);
        byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.add(byteArray3, (byte) 10);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test103");
        java.lang.Short[] shortArray0 = null;
        short[] shortArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(shortArray1);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test104");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray0, (int) 'a', (int) (byte) 0);
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.removeElements(shortArray3, shortArray4);
        java.lang.Short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray5);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray5, (short) 0, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test105");
        long[] longArray5 = new long[] { 'a', 10L, 2, 1L, ' ' };
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray5);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test106");
        java.lang.Short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_OBJECT_ARRAY;
        short[] shortArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray0, (short) (byte) 10);
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.contains(shortArray2, (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test107");
        short[] shortArray5 = new short[] { (byte) 1, (short) -1, (short) 0, (short) 100, (byte) 10 };
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.add(shortArray5, (short) -1);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test108");
        long[] longArray1 = new long[] { (short) -1 };
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray1, 0L);
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray1, (long) ' ');
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray1);
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray1, (long) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray8);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test109");
        java.lang.Character[] charArray0 = null;
        char[] charArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray0, '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test110");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.ArrayUtils.clone(byteArray2);
        byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.add(byteArray3, (byte) 10);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray5, (byte) 0);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.add(byteArray5, (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray9);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test111");
        double[] doubleArray0 = null;
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) (short) 0, (int) (byte) -1, (double) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test112");
        short[] shortArray5 = new short[] { (byte) 0, (short) 1, (short) 1, (short) -1, (short) 1 };
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.contains(shortArray5, (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test113");
        double[] doubleArray0 = null;
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test114");
        double[] doubleArray5 = new double[] { 10.0f, (-1L), 1L, 100, (byte) 100 };
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray5);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray5, 1.0d, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test115");
        short[] shortArray5 = new short[] { (short) 100, (short) 10, (byte) -1, (short) 10, (short) -1 };
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray5, (short) (byte) -1, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test116");
        long[] longArray1 = new long[] { (short) -1 };
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray1, 0L);
        long[] longArray5 = org.apache.commons.lang3.ArrayUtils.add(longArray1, (long) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray8 = org.apache.commons.lang3.ArrayUtils.add(longArray5, (int) (short) 100, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray5);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test117");
        float[] floatArray1 = new float[] { ' ' };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray1);
        long[] longArray4 = new long[] { (short) -1 };
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray4, 0L);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) floatArray1, (java.lang.Object) longArray4);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.clone(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray8);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test118");
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { true, true };
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2);
        boolean[] booleanArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2, true);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test119");
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { true, true };
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2);
        boolean[] booleanArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2);
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.add(booleanArray4, true);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.add(booleanArray6, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test120");
        float[] floatArray1 = new float[] { ' ' };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray1);
        float[] floatArray3 = null;
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.removeElements(floatArray1, floatArray3);
        java.lang.Float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray1);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (int) (byte) 0, (float) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray8);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test121");
        int[] intArray0 = new int[] {};
        int[] intArray3 = org.apache.commons.lang3.ArrayUtils.subarray(intArray0, 1, 3);
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray0);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.clone(intArray0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray7 = org.apache.commons.lang3.ArrayUtils.remove(intArray5, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test122");
        int[] intArray6 = new int[] { 1, (byte) 1, 1, '4', (-1), 0 };
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray6, (int) (byte) 10);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test123");
        double[] doubleArray5 = new double[] { 10.0f, (-1L), 1L, 100, (byte) 100 };
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray5);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray5, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray6);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test124");
        long[] longArray5 = new long[] { 'a', 10L, 2, 1L, ' ' };
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray5);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray6, (long) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test125");
        float[] floatArray0 = null;
        int int2 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray0, (float) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test126");
        java.lang.Character[] charArray0 = new java.lang.Character[] {};
        java.lang.Character[] charArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray0);
        java.lang.Character[] charArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray0);
        java.lang.Character[] charArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray3);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test127");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray0);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray0);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test128");
        byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        java.lang.Byte[] byteArray1 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray0);
        byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray1);
        byte[] byteArray4 = new byte[] { (byte) 1 };
        byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.clone(byteArray4);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray2, byteArray4);
        java.lang.String str8 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) boolean6, "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "false" + "'", str8.equals("false"));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test129");
        java.lang.Byte[] byteArray2 = new java.lang.Byte[] { (byte) 0, (byte) 10 };
        byte[] byteArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray2, (byte) -1);
        byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test130");
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { true, true };
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2);
        boolean[] booleanArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2);
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2, true);
        boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray7);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test131");
        float[] floatArray1 = new float[] { ' ' };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray1);
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (byte) -1);
        int int5 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test132");
        byte[] byteArray0 = null;
        int int2 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray0, (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test133");
        java.lang.Short[] shortArray5 = new java.lang.Short[] { (short) 0, (short) 10, (short) 1, (short) 1, (short) 0 };
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray5, (short) 1);
        java.lang.Short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray5);
        short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray9);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test134");
        char[] charArray5 = new char[] { 'a', '#', '4', ' ', '4' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray5);
        char[] charArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray6);
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray7, 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray9);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test135");
        java.lang.Character[] charArray0 = new java.lang.Character[] {};
        java.lang.Character[] charArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray0);
        java.lang.Character[] charArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray0);
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) charArray2);
        java.util.Map<java.lang.Object, java.lang.Object> objMap4 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objMap4);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test136");
        long[] longArray5 = new long[] { (-1L), (-1L), 'a', 3, 1L };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray5);
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.add(longArray5, (long) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray8);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test137");
        java.lang.Short[] shortArray5 = new java.lang.Short[] { (short) 0, (short) 10, (short) 1, (short) 1, (short) 0 };
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray5, (short) 1);
        short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray5, (short) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray9);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test138");
        char[] charArray0 = new char[] {};
        java.lang.Character[] charArray1 = org.apache.commons.lang3.ArrayUtils.toObject(charArray0);
        char[] charArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray1, 'a');
        java.lang.Character[] charArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray1);
        java.util.Map<java.lang.Object, java.lang.Object> objMap5 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) charArray4);
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objMap5);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test139");
        java.lang.Byte[] byteArray0 = new java.lang.Byte[] {};
        java.lang.Byte[] byteArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray0);
        java.lang.Byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test140");
        java.lang.Character[] charArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHARACTER_OBJECT_ARRAY;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray0);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test141");
        long[] longArray1 = new long[] { (short) -1 };
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray1, 0L);
        long[] longArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray3);
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray4, 10L);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray4, (long) (byte) 1, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test142");
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { true, true };
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2);
        java.lang.Boolean[] booleanArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray2);
        java.lang.Boolean[] booleanArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray2);
        java.lang.Boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray5);
        boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray6);
        boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray6, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray9);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test143");
        boolean[] booleanArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray0, false, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test144");
        java.lang.String[] strArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test145");
        java.lang.String str2 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) 1.0d, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1.0" + "'", str2.equals("1.0"));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test146");
        java.lang.Character[] charArray0 = null;
        java.lang.Character[] charArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray0);
        java.lang.Character[] charArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray0);
        char[] charArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charArray3);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test147");
        java.lang.Short[] shortArray5 = new java.lang.Short[] { (short) 0, (short) 10, (short) 1, (short) 1, (short) 0 };
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray5, (short) 1);
        short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray5);
        java.lang.Short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray9);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test148");
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { true, true };
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2);
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray3);
        boolean[] booleanArray5 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray3);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray5, true);
        boolean[] booleanArray8 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray5);
        boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray9);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test149");
        char[] charArray0 = new char[] {};
        java.lang.Character[] charArray1 = org.apache.commons.lang3.ArrayUtils.toObject(charArray0);
        char[] charArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray1, 'a');
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray3, '4', (int) '#');
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray3);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(charArray3, ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test150");
        java.lang.Character[] charArray0 = null;
        char[] charArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray0, ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test151");
        long[] longArray0 = null;
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test152");
        java.lang.Boolean[] booleanArray0 = null;
        boolean[] booleanArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booleanArray1);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test153");
        float[] floatArray1 = new float[] { ' ' };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray1);
        float[] floatArray3 = null;
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.removeElements(floatArray1, floatArray3);
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray3, (float) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test154");
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { true, true };
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2);
        boolean[] booleanArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2);
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2, true);
        java.lang.Boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray7);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test155");
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { true, true };
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2);
        boolean[] booleanArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2, true);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray5, true, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test156");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 1, 10, 10 };
        java.lang.Integer[] intArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray4);
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray4, 3);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.remove(intArray7, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray9);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test157");
        float[] floatArray1 = new float[] { ' ' };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray1);
        float[] floatArray3 = null;
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.removeElements(floatArray1, floatArray3);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray3, (int) (byte) 0, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(floatArray7);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test158");
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { true, true };
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2);
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray3);
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray3, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test159");
        float[] floatArray1 = new float[] { ' ' };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray1);
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (byte) -1);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray4, (float) 10, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.remove(floatArray4, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test160");
        double[] doubleArray3 = new double[] { 0, 1.0d, (byte) 1 };
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray3);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray3, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test161");
        int[] intArray3 = new int[] { ' ', (byte) 10, (short) -1 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray3, (int) (byte) 100);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray3, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = org.apache.commons.lang3.ArrayUtils.remove(intArray3, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test162");
        long[] longArray1 = new long[] { (short) -1 };
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray1, 0L);
        long[] longArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray3);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray4, (long) 'a', (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test163");
        java.lang.Long[] longArray4 = new java.lang.Long[] { (-1L), 10L, 100L, (-1L) };
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray4, 1L);
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.clone(longArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray7);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test164");
        java.lang.Double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY;
        double[] doubleArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray0);
        double[] doubleArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray0, (double) 'a');
        int int5 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test165");
        byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        java.lang.Byte[] byteArray1 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray0);
        java.lang.Byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test166");
        java.lang.Double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY;
        double[] doubleArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray0);
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray1, (double) 0L);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test167");
        char[] charArray5 = new char[] { 'a', '#', '4', ' ', '4' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray5);
        char[] charArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray6);
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.clone(charArray6);
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray9);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test168");
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { true, true };
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2);
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray3, true, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test169");
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { true, true };
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2);
        boolean[] booleanArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2);
        boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.add(booleanArray4, 0, false);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray7, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test170");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.ArrayUtils.clone(byteArray2);
        byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.remove(byteArray2, (int) (byte) 0);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray2, (byte) 1, 3);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test171");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.clone(byteArray1);
        byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray2, (int) (short) 1, (int) ' ');
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray5, (byte) 0, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test172");
        char[] charArray0 = new char[] {};
        java.lang.Character[] charArray1 = org.apache.commons.lang3.ArrayUtils.toObject(charArray0);
        char[] charArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray1, 'a');
        java.lang.Character[] charArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray1);
        java.util.Map<java.lang.Object, java.lang.Object> objMap5 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) charArray4);
        java.lang.String str6 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) objMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test173");
        java.lang.Byte[] byteArray0 = new java.lang.Byte[] {};
        java.lang.Byte[] byteArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray0);
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { true, true };
        boolean[] booleanArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray4);
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray4);
        boolean[] booleanArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray4, true);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) byteArray0, (java.lang.Object) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test174");
        float[] floatArray1 = new float[] { ' ' };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray1);
        int int4 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray1, 1.0f);
        java.lang.Float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray1);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray5, (float) (byte) 1);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray7);
        java.lang.Float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray9);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test175");
        java.lang.Short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_OBJECT_ARRAY;
        short[] shortArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray0, (short) (byte) 10);
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray2, (short) -1, 2);
        java.lang.String str7 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) int5, "{}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "-1" + "'", str7.equals("-1"));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test176");
        java.lang.Integer[] intArray0 = null;
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(intArray2);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test177");
        int[] intArray0 = new int[] {};
        int[] intArray3 = org.apache.commons.lang3.ArrayUtils.subarray(intArray0, 1, 3);
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray0);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.clone(intArray0);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray0, (int) (byte) 10);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.add(intArray0, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray9);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test178");
        long[] longArray0 = new long[] {};
        int int2 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray0, (long) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test179");
        double[] doubleArray0 = null;
        double[] doubleArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray0);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray1);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test180");
        byte[] byteArray0 = new byte[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray0, (byte) -1, 1);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray0);
        byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.clone(byteArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test181");
        long[] longArray4 = new long[] { (short) 100, 10L, 10, (byte) -1 };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.add(longArray4, 2, (long) 'a');
        org.apache.commons.lang3.ArrayUtils.reverse(longArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray7);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test182");
        char[] charArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray0, '#', (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test183");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.ArrayUtils.clone(byteArray2);
        byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.remove(byteArray2, (int) (byte) 0);
        java.lang.Byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray2);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test184");
        byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        java.lang.Byte[] byteArray1 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray4 = org.apache.commons.lang3.ArrayUtils.add(byteArray0, (int) '4', (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test185");
        short[] shortArray5 = new short[] { (byte) 1, (short) -1, (short) 0, (short) 100, (byte) 10 };
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.add(shortArray5, (short) -1);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray5, (short) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test186");
        char[] charArray0 = null;
        char[] charArray3 = org.apache.commons.lang3.ArrayUtils.subarray(charArray0, (int) '#', (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charArray3);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test187");
        float[] floatArray1 = new float[] { ' ' };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray1);
        int int4 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray1, 1.0f);
        java.lang.Float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray1);
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray5);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) floatArray5, (java.lang.Object) byteArray7, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test188");
        java.lang.Float[][] floatArray0 = new java.lang.Float[][] {};
        java.lang.Float[] floatArray1 = new java.lang.Float[] {};
        java.lang.Float[] floatArray2 = new java.lang.Float[] {};
        java.lang.Float[] floatArray3 = new java.lang.Float[] {};
        java.lang.Float[] floatArray4 = new java.lang.Float[] {};
        java.lang.Float[][] floatArray5 = new java.lang.Float[][] { floatArray1, floatArray2, floatArray3, floatArray4 };
        java.lang.Float[][] floatArray6 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray0, floatArray5);
        java.io.Serializable[][] serializableArray9 = org.apache.commons.lang3.ArrayUtils.subarray((java.io.Serializable[][]) floatArray5, (int) (short) 1, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray9);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test189");
        java.lang.Character[] charArray0 = new java.lang.Character[] {};
        java.lang.Character[] charArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray0);
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) charArray0, (java.lang.Object) 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test190");
        float[] floatArray1 = new float[] { ' ' };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray1);
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray1);
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.clone(floatArray1);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (int) (short) 0, (float) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray7);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test191");
        double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) 3, 100, (double) '#');
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 1L, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test192");
        long[] longArray5 = new long[] { 'a', 10L, 2, 1L, ' ' };
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray5);
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.remove(longArray5, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray8);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test193");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.ArrayUtils.clone(byteArray2);
        byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.remove(byteArray2, (int) (byte) 0);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray5, (byte) 0, (int) (short) 10);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.clone(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray9);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test194");
        java.lang.Float[][] floatArray0 = new java.lang.Float[][] {};
        java.lang.Float[] floatArray1 = new java.lang.Float[] {};
        java.lang.Float[] floatArray2 = new java.lang.Float[] {};
        java.lang.Float[] floatArray3 = new java.lang.Float[] {};
        java.lang.Float[] floatArray4 = new java.lang.Float[] {};
        java.lang.Float[][] floatArray5 = new java.lang.Float[][] { floatArray1, floatArray2, floatArray3, floatArray4 };
        java.lang.Float[][] floatArray6 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray0, floatArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable[][] serializableArray8 = org.apache.commons.lang3.ArrayUtils.remove((java.io.Serializable[][]) floatArray5, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray6);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test195");
        double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) 3, 100, (double) '#');
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray0);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test196");
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { true, true };
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2);
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray3);
        boolean[] booleanArray5 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray3);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray5);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test197");
        java.lang.Double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY;
        double[] doubleArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray0);
        double[] doubleArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray0, (double) 'a');
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray3, (int) (byte) 10, (int) 'a');
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test198");
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { true, true };
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2);
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray3);
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray3, (int) (byte) 1);
        boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray3);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray7, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test199");
        int[] intArray3 = new int[] { ' ', (byte) 10, (short) -1 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray3, (int) (byte) 100);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray3, (int) (short) 10);
        java.lang.Integer[] intArray8 = org.apache.commons.lang3.ArrayUtils.toObject(intArray3);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test200");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "hi!", "hi!" };
        java.lang.String[] strArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray5);
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test201");
        java.lang.Character[] charArray0 = new java.lang.Character[] {};
        java.lang.Character[] charArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray0);
        java.lang.Character[] charArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray0);
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) charArray2);
        java.lang.Character[] charArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test202");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray0);
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.add(shortArray0, 0, (short) (byte) 1);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test203");
        float[] floatArray1 = new float[] { ' ' };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray1);
        int int4 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray1, 1.0f);
        java.lang.Float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray1);
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray5);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray5, 0.0f);
        java.lang.Float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray9);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test204");
        float[] floatArray1 = new float[] { ' ' };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray1);
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (byte) -1);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray4, (float) 10, (int) (byte) -1);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray4, (float) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test205");
        byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.add(byteArray0, (byte) 1);
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test206");
        boolean[] booleanArray0 = null;
        boolean[] booleanArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray0);
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { true, true };
        boolean[] booleanArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray4);
        boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray4, true);
        boolean[] booleanArray8 = org.apache.commons.lang3.ArrayUtils.removeElements(booleanArray1, booleanArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray8);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test207");
        boolean[] booleanArray0 = null;
        boolean[] booleanArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray0, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booleanArray2);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test208");
        double[] doubleArray5 = new double[] { 10.0f, (-1L), 1L, 100, (byte) 100 };
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray5);
        java.lang.Double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray6);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray6, 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test209");
        java.lang.Float[] floatArray3 = new java.lang.Float[] { (-1.0f), 100.0f, 10.0f };
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray3);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray4);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray4, (float) (byte) -1, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test210");
        double[] doubleArray0 = null;
        double[] doubleArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray0);
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, 1.0d, (double) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test211");
        byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        java.lang.Byte[] byteArray1 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray0);
        byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray1);
        byte[] byteArray4 = new byte[] { (byte) 1 };
        byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.clone(byteArray4);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray2, byteArray4);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) 10, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test212");
        char[] charArray0 = new char[] {};
        java.lang.Character[] charArray1 = org.apache.commons.lang3.ArrayUtils.toObject(charArray0);
        char[] charArray2 = new char[] {};
        java.lang.Character[] charArray3 = org.apache.commons.lang3.ArrayUtils.toObject(charArray2);
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray3, 'a');
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray5, 'a', (-1));
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.removeElements(charArray0, charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray9);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test213");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "" };
        java.lang.Comparable<java.lang.String>[] strComparableArray4 = org.apache.commons.lang3.ArrayUtils.toArray((java.lang.Comparable<java.lang.String>[]) strArray3);
        java.lang.String[] strArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test214");
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { true, true };
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2);
        boolean[] booleanArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2);
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2, true);
        boolean[] booleanArray8 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray6, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray8);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test215");
        short[] shortArray1 = new short[] { (short) 0 };
        short[] shortArray3 = new short[] { (short) 0 };
        short[] shortArray5 = new short[] { (short) 0 };
        short[] shortArray7 = new short[] { (short) 0 };
        short[][] shortArray8 = new short[][] { shortArray1, shortArray3, shortArray5, shortArray7 };
        short[][] shortArray9 = org.apache.commons.lang3.ArrayUtils.toArray(shortArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray9);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test216");
        java.lang.Double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY;
        double[] doubleArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray0);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray1);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test217");
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { true, true };
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2);
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray3);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.add(booleanArray3, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test218");
        java.lang.Double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY;
        double[] doubleArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray0);
        double[] doubleArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray0, (double) 'a');
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray3, (int) (byte) 10, (int) 'a');
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test219");
        byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        java.lang.Byte[] byteArray1 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray0);
        byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray1);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.add(byteArray2, 2, (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test220");
        char[] charArray0 = new char[] {};
        java.lang.Character[] charArray1 = org.apache.commons.lang3.ArrayUtils.toObject(charArray0);
        java.lang.Character[] charArray2 = org.apache.commons.lang3.ArrayUtils.toObject(charArray0);
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.subarray(charArray0, 100, (int) '4');
        java.lang.Character[] charArray6 = org.apache.commons.lang3.ArrayUtils.toObject(charArray0);
        char[] charArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray7);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test221");
        char[] charArray0 = new char[] {};
        java.lang.Character[] charArray1 = org.apache.commons.lang3.ArrayUtils.toObject(charArray0);
        java.lang.Character[] charArray2 = org.apache.commons.lang3.ArrayUtils.toObject(charArray0);
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.subarray(charArray0, 100, (int) '4');
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray0, ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test222");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.clone(byteArray1);
        byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray2, (int) (short) 1, (int) ' ');
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray2);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray6, (byte) 100);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test223");
        double[] doubleArray5 = new double[] { 10.0f, (-1L), 1L, 100, (byte) 100 };
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray5);
        java.lang.Double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray6);
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) doubleArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray7);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test224");
        long[] longArray1 = new long[] { (short) -1 };
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray1, 0L);
        int int5 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray1, (long) 100);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray1, (long) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test225");
        char[] charArray0 = new char[] {};
        java.lang.Character[] charArray1 = org.apache.commons.lang3.ArrayUtils.toObject(charArray0);
        java.lang.Character[] charArray2 = org.apache.commons.lang3.ArrayUtils.toObject(charArray0);
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.subarray(charArray0, 100, (int) '4');
        java.lang.Character[] charArray6 = org.apache.commons.lang3.ArrayUtils.toObject(charArray0);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray8 = org.apache.commons.lang3.ArrayUtils.remove(charArray0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test226");
        java.lang.Character[] charArray0 = null;
        java.lang.Character[] charArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray0);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "" };
        java.lang.Comparable<java.lang.String>[] strComparableArray6 = org.apache.commons.lang3.ArrayUtils.toArray((java.lang.Comparable<java.lang.String>[]) strArray5);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) charArray1, (java.lang.Object[]) strComparableArray6);
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) strComparableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test227");
        float[] floatArray1 = new float[] { ' ' };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray1);
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (byte) -1);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray4);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test228");
        long[] longArray4 = new long[] { (short) 100, 10L, 10, (byte) -1 };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.add(longArray4, 2, (long) 'a');
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray8);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test229");
        long[] longArray4 = new long[] { (short) 100, 10L, 10, (byte) -1 };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.add(longArray4, 2, (long) 'a');
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test230");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 1, 10, 10 };
        java.lang.Integer[] intArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray4);
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray4, 3);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test231");
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { true, true };
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2);
        boolean[] booleanArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2, true);
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray5);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray8 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray5, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test232");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray0);
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray0, (int) (short) 0, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test233");
        java.lang.Short[] shortArray6 = new java.lang.Short[] { (short) 100, (short) 10, (short) 0, (short) 1, (short) 0, (short) 1 };
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray6);
        java.lang.Short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray6);
        java.lang.Short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray9);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test234");
        long[] longArray1 = new long[] { (short) -1 };
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray1, 0L);
        long[] longArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray3);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray6 = org.apache.commons.lang3.ArrayUtils.remove(longArray3, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray4);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test235");
        double[] doubleArray5 = new double[] { 10.0f, (-1L), 1L, 100, (byte) 100 };
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray5);
        java.lang.Double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray6);
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray8);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test236");
        java.lang.Short[] shortArray2 = new java.lang.Short[] { (short) 100, (short) 1 };
        java.lang.Short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray2);
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray2, (short) (byte) 0);
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray2, (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray7);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test237");
        byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray0);
        byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray0);
        byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray0, 0, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test238");
        java.lang.Long[] longArray4 = new java.lang.Long[] { (-1L), 10L, 100L, (-1L) };
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray4, 1L);
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray4, (long) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray8);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test239");
        java.lang.Byte[] byteArray0 = null;
        byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray0, (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(byteArray2);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test240");
        java.lang.Object[] objArray0 = null;
        float[] floatArray2 = new float[] { ' ' };
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray2);
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.add(floatArray2, (float) (byte) -1);
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(objArray0, (java.lang.Object) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test241");
        java.lang.Character[] charArray0 = new java.lang.Character[] {};
        java.lang.Character[] charArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray0);
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { true, true };
        boolean[] booleanArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray4);
        java.lang.Boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray4);
        java.lang.Boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray4);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) charArray0, (java.lang.Object) booleanArray4);
        boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray9);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test242");
        char[] charArray1 = new char[] { '#' };
        java.lang.Character[] charArray2 = new java.lang.Character[] {};
        java.lang.Character[] charArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray2);
        java.lang.Character[] charArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray2);
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray4);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray1, charArray5);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(charArray5);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray5, '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test243");
        java.lang.Integer[] intArray0 = null;
        java.lang.Integer[] intArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray1);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test244");
        java.lang.Long[] longArray0 = new java.lang.Long[] {};
        java.lang.Long[] longArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray0);
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { true, true };
        boolean[] booleanArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray4);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray5, false, (int) (short) 1);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) longArray1, (java.lang.Object) booleanArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test245");
        char[] charArray0 = new char[] {};
        java.lang.Character[] charArray1 = org.apache.commons.lang3.ArrayUtils.toObject(charArray0);
        char[] charArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray1, 'a');
        java.lang.Character[] charArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray1);
        java.util.Map<java.lang.Object, java.lang.Object> objMap5 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) charArray4);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty((java.lang.Object[]) charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test246");
        char[] charArray1 = new char[] { '#' };
        java.lang.Character[] charArray2 = new java.lang.Character[] {};
        java.lang.Character[] charArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray2);
        java.lang.Character[] charArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray2);
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray4);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray1, charArray5);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray1, '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test247");
        float[] floatArray1 = new float[] { ' ' };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray1);
        int int4 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray1, 1.0f);
        java.lang.Float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray1);
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray5);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray5, 0.0f);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test248");
        char[] charArray0 = new char[] {};
        java.lang.Character[] charArray1 = org.apache.commons.lang3.ArrayUtils.toObject(charArray0);
        java.lang.Character[] charArray2 = org.apache.commons.lang3.ArrayUtils.toObject(charArray0);
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.subarray(charArray0, 100, (int) '4');
        java.lang.Character[] charArray6 = org.apache.commons.lang3.ArrayUtils.toObject(charArray0);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(charArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test249");
        int[] intArray3 = new int[] { ' ', (byte) 10, (short) -1 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray3, (int) (byte) 100);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray3, (int) (byte) -1);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray3, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test250");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.ArrayUtils.clone(byteArray2);
        byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.add(byteArray3, (byte) 10);
        java.lang.String str7 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) byteArray5, "1.0");
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray5, (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{1,10}" + "'", str7.equals("{1,10}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test251");
        long[] longArray0 = null;
        long[] longArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray1);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test252");
        boolean[] booleanArray5 = new boolean[] { false, true, false, true, false };
        boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray5, true);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray5, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test253");
        short[] shortArray1 = new short[] { (byte) -1 };
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.contains(shortArray1, (short) 10);
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.clone(shortArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test254");
        java.lang.Short[][] shortArray0 = new java.lang.Short[][] {};
        java.lang.Short[][] shortArray1 = new java.lang.Short[][] {};
        java.lang.Short[][] shortArray2 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray0, shortArray1);
        java.io.Serializable[][] serializableArray5 = org.apache.commons.lang3.ArrayUtils.subarray((java.io.Serializable[][]) shortArray1, (int) '#', (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray5);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test255");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.clone(byteArray1);
        byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray2, (int) (short) 1, (int) ' ');
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray2);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.clone(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test256");
        float[] floatArray1 = new float[] { ' ' };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray1);
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray1);
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.clone(floatArray1);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray1, (int) (short) -1, (int) (short) 0);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(floatArray1, (float) 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test257");
        byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        java.lang.Byte[] byteArray1 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray0);
        byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray1);
        byte[] byteArray4 = new byte[] { (byte) 1 };
        byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.clone(byteArray4);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray2, byteArray4);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test258");
        float[] floatArray1 = new float[] { ' ' };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray1);
        int int4 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray1, 1.0f);
        java.lang.Float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray1);
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray5);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray5);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray7, (float) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test259");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.clone(byteArray1);
        byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray2, (int) (short) 1, (int) ' ');
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray2);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray6, (byte) 100);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test260");
        char[] charArray5 = new char[] { 'a', '#', '4', ' ', '4' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray5);
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.add(charArray5, 2, 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray9);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test261");
        java.lang.Float[] floatArray1 = new java.lang.Float[] { 0.0f };
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray1);
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray1, (float) 2);
        java.lang.Float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray5);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test262");
        float[] floatArray1 = new float[] { ' ' };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray1);
        int int4 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray1, 1.0f);
        java.lang.Float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray1);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray1, (float) 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test263");
        char[] charArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray0, '4', (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test264");
        char[] charArray5 = new char[] { 'a', '#', '4', ' ', '4' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray5);
        char[] charArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray6);
        java.lang.Class<?> wildcardClass8 = charArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test265");
        long[] longArray1 = new long[] { (short) -1 };
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray1, 0L);
        long[] longArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray3);
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.add(longArray4, (long) 100);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(longArray6, (long) (short) 1);
        java.lang.Class<?> wildcardClass9 = longArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test266");
        double[] doubleArray0 = null;
        int int2 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test267");
        long[] longArray1 = new long[] { (short) -1 };
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray1, 0L);
        long[] longArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray3);
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.add(longArray4, (long) 100);
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray6, (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray8);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test268");
        java.lang.Float[] floatArray3 = new java.lang.Float[] { (-1.0f), 100.0f, 10.0f };
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray3);
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray3, (float) (byte) 100);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray3);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray7, (float) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test269");
        java.lang.Byte[] byteArray2 = new java.lang.Byte[] { (byte) 0, (byte) 10 };
        byte[] byteArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray2, (byte) -1);
        byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.clone(byteArray4);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray5, 1, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test270");
        java.lang.Double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY;
        double[] doubleArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray0);
        double[] doubleArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray0, (double) 'a');
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray3, (int) (byte) 10, (int) 'a');
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test271");
        float[] floatArray1 = new float[] { ' ' };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray1);
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray1);
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.clone(floatArray1);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray4, (float) 1, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test272");
        byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        java.lang.Byte[] byteArray1 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray0);
        byte[] byteArray4 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray0, (int) (byte) 10, 3);
        java.lang.Byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray0);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray0, (byte) 0, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test273");
        long[] longArray1 = new long[] { (short) -1 };
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray1, 0L);
        long[] longArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray3);
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.add(longArray4, (long) 100);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(longArray6, (long) (short) 1);
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray9);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test274");
        char[] charArray1 = new char[] { '#' };
        java.lang.Character[] charArray2 = new java.lang.Character[] {};
        java.lang.Character[] charArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray2);
        java.lang.Character[] charArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray2);
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray4);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray1, charArray5);
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray1, '#');
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray9);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test275");
        java.lang.Float[] floatArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_OBJECT_ARRAY;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray0);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test276");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 1, 10, 10 };
        java.lang.Integer[] intArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray4);
        java.lang.Integer[] intArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray4);
        java.lang.Integer[] intArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray6);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray6, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray9);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test277");
        float[] floatArray1 = new float[] { ' ' };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray1);
        int int4 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray1, 1.0f);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test278");
        java.lang.Short[] shortArray2 = new java.lang.Short[] { (short) 100, (short) 1 };
        java.lang.Short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray2);
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test279");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray2 = org.apache.commons.lang3.ArrayUtils.add(shortArray0, (short) 10);
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray3, (int) 'a', (int) (byte) 0);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray2, shortArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test280");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray0, (int) 'a', (int) (byte) 0);
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.removeElements(shortArray3, shortArray4);
        java.lang.Short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray5);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(shortArray5, (short) 100);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test281");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "hi!", "hi!" };
        java.lang.String[] strArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray4);
        java.lang.Double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY;
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) strArray5, (java.lang.Object) doubleArray6);
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray8);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test282");
        long[] longArray1 = new long[] { (short) -1 };
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray1, 0L);
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray1, (long) ' ');
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray1);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray1, (long) 'a', (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test283");
        double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) 3, 100, (double) '#');
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 0, (double) 100.0f);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test284");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray0);
        int int4 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray0, (short) (byte) 10, (int) (short) 0);
        short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.add(shortArray0, (short) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray6);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test285");
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { true, true };
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2);
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray3);
        boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray3, (int) '#', 100);
        boolean[] booleanArray8 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray3);
        boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray9);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test286");
        int[] intArray3 = new int[] { ' ', (byte) 10, (short) -1 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray3, (int) (byte) 100);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray3, (int) (short) 10);
        java.lang.Integer[] intArray8 = org.apache.commons.lang3.ArrayUtils.toObject(intArray3);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.clone(intArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray9);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test287");
        boolean[] booleanArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray0, true, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test288");
        float[] floatArray0 = null;
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray0, 1, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(floatArray3);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test289");
        char[] charArray0 = null;
        char[] charArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray0, ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test290");
        int[] intArray0 = new int[] {};
        int[] intArray3 = org.apache.commons.lang3.ArrayUtils.subarray(intArray0, 1, 3);
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray0);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray0);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray0, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test291");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 1, 10, 10 };
        java.lang.Integer[] intArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray4);
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray4);
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray4, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test292");
        byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray0);
        byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray0);
        byte[] byteArray4 = org.apache.commons.lang3.ArrayUtils.add(byteArray2, (byte) -1);
        byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.clone(byteArray2);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) 1, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test293");
        java.lang.Character[] charArray0 = null;
        java.lang.Character[] charArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray0);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "" };
        java.lang.Comparable<java.lang.String>[] strComparableArray6 = org.apache.commons.lang3.ArrayUtils.toArray((java.lang.Comparable<java.lang.String>[]) strArray5);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) charArray1, (java.lang.Object[]) strComparableArray6);
        java.lang.Character[] charArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray1);
        java.lang.Character[] charArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray9);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test294");
        long[] longArray5 = new long[] { 10L, (byte) -1, 3, 0, '#' };
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.contains(longArray5, (long) 10);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray5, 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test295");
        java.lang.Character[] charArray0 = null;
        java.lang.Character[] charArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray0);
        java.lang.Character[] charArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray0);
        java.lang.Character[] charArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray2);
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray3, 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test296");
        float[] floatArray1 = new float[] { ' ' };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray1);
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (byte) -1);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray4, (float) 10, (int) (byte) -1);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) boolean8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test297");
        java.lang.Class<?>[] wildcardClassArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_CLASS_ARRAY;
        java.lang.Double[] doubleArray1 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY;
        double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray1);
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) wildcardClassArray0, (java.lang.Object) doubleArray1);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray4 = org.apache.commons.lang3.ArrayUtils.toArray((java.lang.reflect.AnnotatedElement[]) wildcardClassArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray4);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test298");
        short[] shortArray0 = null;
        short[] shortArray1 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray1, (int) 'a', (int) (byte) 0);
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray0, shortArray4);
        java.lang.Short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray4);
        short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray4, (short) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray8);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test299");
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { true, true };
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2);
        boolean[] booleanArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2);
        java.lang.Boolean[] booleanArray5 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray5);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test300");
        float[] floatArray1 = new float[] { ' ' };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray1);
        float[] floatArray3 = null;
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.removeElements(floatArray1, floatArray3);
        java.lang.Float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray1);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray5, (float) ' ');
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray7, (float) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test301");
        double[] doubleArray4 = new double[] { 1, ' ', '#', 100L };
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray4, (int) (byte) -1, (int) '#');
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray7, (double) (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test302");
        long[] longArray1 = new long[] { (short) -1 };
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray1, 0L);
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray1, (long) ' ');
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray1);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test303");
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { true, true };
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2);
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray3);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray3);
        boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.add(booleanArray3, true);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test304");
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { true, true };
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2);
        int int5 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray3, false);
        boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray3, (int) (short) 1);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray3, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test305");
        java.lang.Byte[] byteArray2 = new java.lang.Byte[] { (byte) 0, (byte) 10 };
        byte[] byteArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray2, (byte) -1);
        java.lang.Byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray2);
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test306");
        java.lang.Byte[] byteArray6 = new java.lang.Byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) -1, (byte) -1, (byte) -1 };
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray6, (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test307");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.clone(byteArray1);
        byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray2, (int) (short) 1, (int) ' ');
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.add(byteArray5, (byte) 0);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray7, (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test308");
        java.lang.Short[] shortArray5 = new java.lang.Short[] { (short) 0, (short) 10, (short) 1, (short) 1, (short) 0 };
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray5, (short) 1);
        short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.clone(shortArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray8);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test309");
        int[] intArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_INT_ARRAY;
        int[] intArray1 = org.apache.commons.lang3.ArrayUtils.EMPTY_INT_ARRAY;
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray0, intArray1);
        int int3 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) intArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test310");
        float[] floatArray1 = new float[] { ' ' };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray1);
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray1);
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray1);
        java.lang.String str5 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) floatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{32.0}" + "'", str5.equals("{32.0}"));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test311");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 1, 10, 10 };
        java.lang.Integer[] intArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray4);
        java.lang.Integer[] intArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray4);
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray6);
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.clone(intArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test312");
        long[] longArray1 = new long[] { (short) -1 };
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray1, 0L);
        int int5 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray1, (long) 100);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray7 = org.apache.commons.lang3.ArrayUtils.remove(longArray1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test313");
        char[] charArray5 = new char[] { 'a', '#', '4', ' ', '4' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray5);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray5, '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test314");
        float[][] floatArray0 = new float[][] {};
        float[][] floatArray1 = new float[][] {};
        float[][][] floatArray2 = new float[][][] { floatArray0, floatArray1 };
        float[][][] floatArray3 = new float[][][] {};
        float[][][] floatArray4 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray2, floatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray4);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test315");
        double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray0);
        double[] doubleArray3 = org.apache.commons.lang3.ArrayUtils.add(doubleArray0, (double) 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray3);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test316");
        float[] floatArray1 = new float[] { ' ' };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray1);
        int int4 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray1, 1.0f);
        java.lang.Float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray1);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (int) '#', (float) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray5);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test317");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray2 = org.apache.commons.lang3.ArrayUtils.add(shortArray0, (short) 10);
        java.lang.Short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_OBJECT_ARRAY;
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3, (short) (byte) 10);
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray5, (short) 0);
        short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray7);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray0, shortArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test318");
        float[] floatArray4 = new float[] { 0.0f, 0L, 0, (short) 1 };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.contains(floatArray4, (float) 3);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray4);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test319");
        java.lang.Short[] shortArray6 = new java.lang.Short[] { (short) -1, (short) 100, (short) 100, (short) 10, (short) 1, (short) 100 };
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray7);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test320");
        char[] charArray0 = new char[] {};
        java.lang.Character[] charArray1 = org.apache.commons.lang3.ArrayUtils.toObject(charArray0);
        java.lang.Character[] charArray2 = org.apache.commons.lang3.ArrayUtils.toObject(charArray0);
        java.lang.Character[] charArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray3);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test321");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray0, (int) 'a', (int) (byte) 0);
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.removeElements(shortArray3, shortArray4);
        short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray4);
        short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray6, 2, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray9);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test322");
        byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray0);
        byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray0);
        byte[] byteArray3 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray3);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.add(byteArray5, (byte) -1);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.clone(byteArray5);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray2, byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test323");
        java.lang.Byte[] byteArray0 = new java.lang.Byte[] {};
        java.lang.Byte[] byteArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray0);
        java.lang.Byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray0);
        byte[] byteArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test324");
        float[] floatArray1 = new float[] { ' ' };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray1);
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray1);
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.clone(floatArray1);
        java.lang.Float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray4);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray4, (float) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test325");
        float[] floatArray1 = new float[] { ' ' };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray1);
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray1);
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.clone(floatArray1);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray1, (int) (short) -1, (int) (short) 0);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(floatArray1, (float) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test326");
        long[] longArray1 = new long[] { (short) -1 };
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray1, 0L);
        long[] longArray5 = org.apache.commons.lang3.ArrayUtils.add(longArray1, (long) (short) 0);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray5);
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.subarray(longArray5, (int) (short) 1, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray9);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test327");
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { true, true };
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2);
        boolean[] booleanArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2, true);
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray5);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray6, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test328");
        double[] doubleArray0 = null;
        double[] doubleArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray0);
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test329");
        long[] longArray1 = new long[] { (short) -1 };
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray1, 0L);
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray3, (long) (byte) -1, 10);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray3, (-1L), (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test330");
        char[] charArray0 = new char[] {};
        java.lang.Character[] charArray1 = org.apache.commons.lang3.ArrayUtils.toObject(charArray0);
        char[] charArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray1, 'a');
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray3, '4', (int) '#');
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray3);
        java.lang.Character[] charArray8 = org.apache.commons.lang3.ArrayUtils.toObject(charArray3);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray8);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test331");
        short[] shortArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.add(shortArray0, 3, (short) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test332");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray0, (int) 'a', (int) (byte) 0);
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.removeElements(shortArray3, shortArray4);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray5);
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.clone(shortArray5);
        short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray5, (short) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray9);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test333");
        float[] floatArray4 = new float[] { 0L, 100, 1.0f, 10 };
        float[][] floatArray5 = new float[][] { floatArray4 };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray5);
        float[][] floatArray9 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray5, 100, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray9);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test334");
        java.lang.Long[] longArray4 = new java.lang.Long[] { (-1L), 10L, 100L, (-1L) };
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray4, 1L);
        long[] longArray7 = null;
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.addAll(longArray6, longArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray8);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test335");
        java.lang.Integer[] intArray0 = null;
        int[] intArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(intArray1);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test336");
        double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) 0L, (int) (short) -1);
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray0, (double) (short) 1);
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.add(doubleArray0, (double) '#');
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray7, (double) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray9);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test337");
        byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        java.lang.Byte[] byteArray1 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray0);
        byte[] byteArray4 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray0, (int) (byte) 10, 3);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray0, (byte) 0, (int) (short) 1);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray0);
        java.lang.String str9 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) boolean8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "false" + "'", str9.equals("false"));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test338");
        long[] longArray1 = new long[] { (short) -1 };
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray1, 0L);
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray1, (long) ' ');
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray7 = org.apache.commons.lang3.ArrayUtils.remove(longArray1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test339");
        short[] shortArray0 = null;
        short[] shortArray1 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray1, (int) 'a', (int) (byte) 0);
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray0, shortArray4);
        java.lang.Short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray4);
        java.lang.Short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray7);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test340");
        char[] charArray5 = new char[] { 'a', '#', '4', ' ', '4' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray5);
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray5, ' ');
        org.apache.commons.lang3.ArrayUtils.reverse(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray8);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test341");
        float[] floatArray1 = new float[] { ' ' };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray1);
        int int4 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray1, 1.0f);
        java.lang.Float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray1);
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray5);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray5);
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) floatArray5);
        java.lang.Float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray9);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test342");
        long[] longArray1 = new long[] { (short) -1 };
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray1, 0L);
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray1, (long) ' ');
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray1);
        org.apache.commons.lang3.ArrayUtils.reverse(longArray1);
        java.lang.Long[] longArray8 = org.apache.commons.lang3.ArrayUtils.toObject(longArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray8);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test343");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.ArrayUtils.clone(byteArray2);
        byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.remove(byteArray2, (int) (byte) 0);
        java.lang.Byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray2);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test344");
        double[] doubleArray0 = null;
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) (short) -1, (int) (byte) -1, (double) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test345");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.ArrayUtils.clone(byteArray2);
        byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.add(byteArray3, (byte) 10);
        java.lang.String str7 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) byteArray5, "1.0");
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray5, (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{1,10}" + "'", str7.equals("{1,10}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray9);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test346");
        double[] doubleArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = org.apache.commons.lang3.ArrayUtils.add(doubleArray0, (int) (short) 1, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test347");
        double[] doubleArray5 = new double[] { 10.0f, (-1L), 1L, 100, (byte) 100 };
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray5);
        java.lang.Double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray6);
        java.lang.Double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray8);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test348");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        java.lang.Short[] shortArray1 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray0);
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.contains(shortArray0, (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test349");
        long[] longArray1 = new long[] { (short) -1 };
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray1, 0L);
        long[] longArray5 = org.apache.commons.lang3.ArrayUtils.add(longArray1, (long) (short) 0);
        long[] longArray6 = null;
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.removeElements(longArray5, longArray6);
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.clone(longArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray8);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test350");
        java.lang.Short[] shortArray5 = new java.lang.Short[] { (short) 0, (short) 10, (short) 1, (short) 1, (short) 0 };
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray5, (short) 1);
        java.lang.Class<?> wildcardClass8 = shortArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test351");
        int[] intArray0 = null;
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.add(intArray0, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test352");
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { true, true };
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2);
        boolean[] booleanArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray3, false);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray3, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray5);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test353");
        java.lang.Short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_OBJECT_ARRAY;
        short[] shortArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray0, (short) (byte) 10);
        java.lang.Short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray0);
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) shortArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test354");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.ArrayUtils.clone(byteArray2);
        byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.remove(byteArray2, (int) (byte) 0);
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test355");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray0);
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.add(shortArray0, 0, (short) (byte) 1);
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray4, (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test356");
        java.lang.Object[] objArray0 = null;
        float[] floatArray2 = new float[] { ' ' };
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray2);
        float[] floatArray4 = null;
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.removeElements(floatArray2, floatArray4);
        java.lang.Float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray2);
        java.lang.Float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray6);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isSameLength(objArray0, (java.lang.Object[]) floatArray6);
        float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray9);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test357");
        double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) 0L, (int) (short) -1);
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray0, (double) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.add(doubleArray5, (int) (byte) 10, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray5);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test358");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.ArrayUtils.clone(byteArray2);
        byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.remove(byteArray2, (int) (byte) 0);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray5, (byte) 0, (int) (short) 10);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray9);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test359");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 1, 10, 10 };
        java.lang.Integer[] intArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray4);
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray4, 3);
        java.lang.Integer[] intArray8 = org.apache.commons.lang3.ArrayUtils.toObject(intArray7);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test360");
        float[] floatArray1 = new float[] { ' ' };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray1);
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (byte) -1);
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) '#');
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.clone(floatArray1);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.remove(floatArray7, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray7);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test361");
        long[] longArray1 = new long[] { (short) -1 };
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray1, 0L);
        long[] longArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray3);
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.add(longArray4, (long) 100);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray6, (long) 2, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test362");
        java.lang.Byte[] byteArray2 = new java.lang.Byte[] { (byte) 0, (byte) 10 };
        byte[] byteArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray2, (byte) -1);
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray2, (byte) 0);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.add(byteArray6, (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test363");
        java.lang.Long[] longArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY;
        long[] longArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray0, (long) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray2);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test364");
        short[] shortArray5 = new short[] { (byte) 1, (short) -1, (short) 0, (short) 100, (byte) 10 };
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.add(shortArray5, (short) -1);
        short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.clone(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray8);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test365");
        int[] intArray0 = new int[] {};
        int[] intArray3 = org.apache.commons.lang3.ArrayUtils.subarray(intArray0, 1, 3);
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray0, (int) '#');
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray0, (int) (short) -1, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test366");
        long[] longArray5 = new long[] { 'a', 10L, 2, 1L, ' ' };
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray5);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray8 = org.apache.commons.lang3.ArrayUtils.remove(longArray6, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray6);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test367");
        java.lang.Character[] charArray0 = null;
        java.lang.Character[] charArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray0);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "" };
        java.lang.Comparable<java.lang.String>[] strComparableArray6 = org.apache.commons.lang3.ArrayUtils.toArray((java.lang.Comparable<java.lang.String>[]) strArray5);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) charArray1, (java.lang.Object[]) strComparableArray6);
        java.lang.Character[] charArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray1);
        java.lang.Character[] charArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray9);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test368");
        short[] shortArray0 = null;
        short[] shortArray1 = org.apache.commons.lang3.ArrayUtils.clone(shortArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(shortArray1);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test369");
        boolean[] booleanArray5 = new boolean[] { false, true, false, true, false };
        boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray5, true);
        java.lang.Boolean[] booleanArray8 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray8);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test370");
        char[] charArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHAR_ARRAY;
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray0, 'a', (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test371");
        java.lang.Class<?>[] wildcardClassArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_CLASS_ARRAY;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.AnnotatedElement[] annotatedElementArray2 = org.apache.commons.lang3.ArrayUtils.remove((java.lang.reflect.AnnotatedElement[]) wildcardClassArray0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray0);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test372");
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { true, true };
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2);
        java.lang.Boolean[] booleanArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray2);
        java.lang.Boolean[] booleanArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray2);
        java.lang.Boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray2);
        boolean[] booleanArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2, false);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test373");
        short[] shortArray5 = new short[] { (byte) 1, (short) -1, (short) 0, (short) 100, (byte) 10 };
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.add(shortArray5, (short) -1);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(shortArray5, (short) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test374");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.ArrayUtils.clone(byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        java.lang.Byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray5);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray3, byteArray6);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray3);
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test375");
        long[] longArray1 = new long[] { (short) -1 };
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray1, 0L);
        int int5 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray1, (long) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test376");
        long[] longArray1 = new long[] { (short) -1 };
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray1, 0L);
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray1, (long) ' ');
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray1, 1L);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray1, (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test377");
        java.lang.Object obj0 = null;
        java.lang.String str1 = org.apache.commons.lang3.ArrayUtils.toString(obj0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{}" + "'", str1.equals("{}"));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test378");
        boolean[] booleanArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray0, false, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test379");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.add(booleanArray0, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test380");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray2 = org.apache.commons.lang3.ArrayUtils.remove(charArray0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test381");
        int[] intArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray0, (int) (byte) 0, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test382");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray0, (int) 'a', (int) (byte) 0);
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.removeElements(shortArray3, shortArray4);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray5);
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.clone(shortArray5);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test383");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.ArrayUtils.clone(byteArray2);
        byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.remove(byteArray2, (int) (byte) 0);
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.clone(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test384");
        byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        java.lang.Byte[] byteArray1 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray0);
        byte[] byteArray4 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray0, (int) (byte) 10, 3);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray0, (byte) 0, (int) (short) 1);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.add(byteArray0, (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray9);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test385");
        char[] charArray5 = new char[] { 'a', '#', '4', ' ', '4' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray5);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(charArray6, 'a');
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray9);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test386");
        float[] floatArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_ARRAY;
        float[] floatArray1 = org.apache.commons.lang3.ArrayUtils.clone(floatArray0);
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray1, (float) (-1), (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test387");
        double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.add(doubleArray0, (double) (short) -1);
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray0, 1, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray5);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test388");
        java.lang.Object[] objArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY;
        long[] longArray2 = new long[] { (short) -1 };
        long[] longArray4 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray2, 0L);
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.add(longArray2, (long) (short) 0);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray6);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(objArray0, (java.lang.Object) longArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test389");
        float[] floatArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_ARRAY;
        float[] floatArray1 = org.apache.commons.lang3.ArrayUtils.clone(floatArray0);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.remove(floatArray1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray1);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test390");
        java.lang.Float[] floatArray3 = new java.lang.Float[] { (-1.0f), 100.0f, 10.0f };
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray3);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray4);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray4);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test391");
        java.lang.Object[] objArray0 = null;
        java.lang.Short[] shortArray6 = new java.lang.Short[] { (short) 0, (short) 10, (short) 1, (short) 1, (short) 0 };
        short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray6, (short) 1);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isSameLength(objArray0, (java.lang.Object[]) shortArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test392");
        byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray0);
        byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray0);
        byte[] byteArray4 = org.apache.commons.lang3.ArrayUtils.add(byteArray2, (byte) -1);
        byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray4);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.remove(byteArray4, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test393");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.ArrayUtils.clone(byteArray2);
        byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.add(byteArray3, (byte) 10);
        java.lang.String str7 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) byteArray5, "1.0");
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.add(byteArray5, (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{1,10}" + "'", str7.equals("{1,10}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray9);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test394");
        java.lang.Character[] charArray0 = null;
        java.lang.Character[] charArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray0);
        java.lang.Character[] charArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray0);
        java.lang.Character[] charArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray2);
        char[] charArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test395");
        char[] charArray5 = new char[] { 'a', '#', '4', ' ', '4' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray5);
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray5, ' ');
        java.lang.Character[] charArray9 = org.apache.commons.lang3.ArrayUtils.toObject(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray9);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test396");
        float[] floatArray1 = new float[] { ' ' };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray1);
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (byte) -1);
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.add(floatArray4, (float) ' ');
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray6, (float) 10, 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test397");
        long[] longArray1 = new long[] { (short) -1 };
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray1, 0L);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.contains(longArray3, (long) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test398");
        float[] floatArray1 = new float[] { ' ' };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray1);
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray1);
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray1);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray1, (float) 0L, (int) (byte) 1);
        float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray9);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test399");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray0, (int) 'a', (int) (byte) 0);
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.removeElements(shortArray3, shortArray4);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test400");
        float[] floatArray1 = new float[] { ' ' };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray1);
        long[] longArray4 = new long[] { (short) -1 };
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray4, 0L);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) floatArray1, (java.lang.Object) longArray4);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(floatArray1, (float) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test401");
        int[] intArray0 = new int[] {};
        int[] intArray3 = org.apache.commons.lang3.ArrayUtils.subarray(intArray0, 1, 3);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test402");
        java.lang.Class<?>[] wildcardClassArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_CLASS_ARRAY;
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray1 = null;
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray2 = org.apache.commons.lang3.ArrayUtils.addAll((java.lang.reflect.GenericDeclaration[]) wildcardClassArray0, genericDeclarationArray1);
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ArrayUtils.clone(wildcardClassArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test403");
        long[] longArray1 = new long[] { (short) -1 };
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray1, 0L);
        long[] longArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray3);
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.add(longArray4, (long) 100);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(longArray4, 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test404");
        short[] shortArray3 = new short[] { (byte) 1, (byte) 10, (byte) 0 };
        int int5 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray3, (short) 1);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test405");
        byte[] byteArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray0, (byte) -1, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test406");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 1, 10, 10 };
        java.lang.Integer[] intArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray4);
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray4, 3);
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test407");
        java.lang.Byte[] byteArray2 = new java.lang.Byte[] { (byte) 0, (byte) 10 };
        byte[] byteArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray2, (byte) -1);
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray2, (byte) 0);
        java.lang.Byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray2);
        java.lang.Byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test408");
        java.lang.Long[] longArray4 = new java.lang.Long[] { (-1L), 10L, 100L, (-1L) };
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray4, 1L);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray6, 1L, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test409");
        java.lang.Long[] longArray0 = new java.lang.Long[] {};
        java.lang.Long[] longArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray0);
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray0, (long) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray3);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test410");
        double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) 0L, (int) (short) -1);
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray0, (double) (short) 1);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray5, (double) '#', (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test411");
        java.lang.Float[] floatArray3 = new java.lang.Float[] { (-1.0f), 100.0f, 10.0f };
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray3);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray4);
        java.lang.Float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray6);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test412");
        byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray0);
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray0, (byte) 10, 1);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test413");
        java.lang.Double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY;
        java.lang.Double[] doubleArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray0);
        java.util.Map<java.lang.Object, java.lang.Object> objMap2 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) doubleArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objMap2);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test414");
        java.lang.Float[] floatArray3 = new java.lang.Float[] { (-1.0f), 100.0f, 10.0f };
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray3);
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray3, (float) (byte) 100);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray6, (float) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test415");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.clone(byteArray1);
        byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray2, (int) (short) 1, (int) ' ');
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test416");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 100 };
        int int4 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test417");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.add(booleanArray0, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test418");
        short[] shortArray0 = null;
        short[] shortArray2 = org.apache.commons.lang3.ArrayUtils.add(shortArray0, (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray2);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test419");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 1, 10, 10 };
        java.lang.Integer[] intArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray4);
        java.lang.Integer[] intArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray4);
        java.lang.Integer[] intArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray6);
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray6);
        java.lang.Integer[] intArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray9);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test420");
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { true, true };
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2);
        java.lang.Boolean[] booleanArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray2);
        java.lang.Boolean[] booleanArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray2);
        java.lang.Boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray2);
        java.lang.Boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray7);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test421");
        boolean[] booleanArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray0, true, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test422");
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { true, true };
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2);
        java.lang.Boolean[] booleanArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray2);
        java.lang.Boolean[] booleanArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray2);
        boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray5, true);
        java.lang.Class<?> wildcardClass8 = booleanArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test423");
        java.lang.Double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY;
        double[] doubleArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray0);
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray1, (double) 0L);
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray1, (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray5);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test424");
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { true, true };
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2);
        boolean[] booleanArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray3, false);
        boolean[] booleanArray8 = org.apache.commons.lang3.ArrayUtils.add(booleanArray5, 0, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray8);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test425");
        boolean[] booleanArray0 = null;
        boolean[] booleanArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray0);
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray0, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test426");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "" };
        java.lang.Comparable<java.lang.String>[] strComparableArray4 = org.apache.commons.lang3.ArrayUtils.toArray((java.lang.Comparable<java.lang.String>[]) strArray3);
        java.lang.String[] strArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test427");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "" };
        java.lang.Comparable<java.lang.String>[] strComparableArray4 = org.apache.commons.lang3.ArrayUtils.toArray((java.lang.Comparable<java.lang.String>[]) strArray3);
        java.lang.String[] strArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray3);
        java.lang.CharSequence[] charSequenceArray8 = org.apache.commons.lang3.ArrayUtils.add((java.lang.CharSequence[]) strArray6, (java.lang.CharSequence) "-1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray8);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test428");
        java.lang.Byte[] byteArray2 = new java.lang.Byte[] { (byte) 0, (byte) 10 };
        byte[] byteArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray2, (byte) -1);
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray2, (byte) 0);
        java.lang.Byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray6);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray6, (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray9);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test429");
        char[] charArray0 = new char[] {};
        java.lang.Character[] charArray1 = org.apache.commons.lang3.ArrayUtils.toObject(charArray0);
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) charArray0, (java.lang.Object) false);
        char[] charArray4 = org.apache.commons.lang3.ArrayUtils.clone(charArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test430");
        int[] intArray0 = new int[] {};
        int[] intArray3 = org.apache.commons.lang3.ArrayUtils.subarray(intArray0, 1, 3);
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray0, (int) (short) 10, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test431");
        java.lang.String[] strArray6 = new java.lang.String[] { "-1", "{1,10}", "{1,10}", "-1", "{}", "{32.0}" };
        java.lang.String[] strArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test432");
        java.lang.Byte[] byteArray0 = new java.lang.Byte[] {};
        java.lang.Byte[] byteArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray0);
        java.lang.Byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray0);
        java.lang.Object[] objArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty((java.lang.Object[]) byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test433");
        float[] floatArray1 = new float[] { ' ' };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray1);
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray1);
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.clone(floatArray1);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray1, (int) (short) -1, (int) (short) 0);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(floatArray1, (float) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test434");
        char[] charArray0 = new char[] {};
        java.lang.Character[] charArray1 = org.apache.commons.lang3.ArrayUtils.toObject(charArray0);
        java.lang.Character[] charArray2 = org.apache.commons.lang3.ArrayUtils.toObject(charArray0);
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.subarray(charArray0, 100, (int) '4');
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test435");
        java.lang.Short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_OBJECT_ARRAY;
        short[] shortArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray0, (short) (byte) 10);
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray2, (short) 0);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test436");
        java.lang.Long[] longArray4 = new java.lang.Long[] { (-1L), 10L, 100L, (-1L) };
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray4, 1L);
        java.lang.Long[] longArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray4);
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray4, (long) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray9);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test437");
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { true, true };
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2);
        java.lang.Boolean[] booleanArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray2);
        java.lang.Boolean[] booleanArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray2);
        boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray5, true);
        boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray5, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray9);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test438");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.clone(byteArray1);
        byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray2, (int) (short) 1, (int) ' ');
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray2);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray6, (byte) 100);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test439");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 1, 10, 10 };
        java.lang.Integer[] intArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray4);
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray4, 3);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray4, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray9);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test440");
        float[] floatArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_ARRAY;
        float[] floatArray1 = org.apache.commons.lang3.ArrayUtils.clone(floatArray0);
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray1, 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test441");
        float[][][][][] floatArray0 = new float[][][][][] {};
        // The following exception was thrown during execution in test generation
        try {
            float[][][][][] floatArray2 = org.apache.commons.lang3.ArrayUtils.remove(floatArray0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray0);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test442");
        int[] intArray0 = new int[] {};
        int[] intArray3 = org.apache.commons.lang3.ArrayUtils.subarray(intArray0, 1, 3);
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray0);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray0);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.contains(intArray0, (int) (short) 10);
        java.lang.Integer[] intArray8 = org.apache.commons.lang3.ArrayUtils.toObject(intArray0);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray9);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test443");
        java.lang.Float[] floatArray3 = new java.lang.Float[] { (-1.0f), 100.0f, 10.0f };
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray3);
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray3, (float) (byte) 100);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isEmpty((java.lang.Object[]) floatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test444");
        double[] doubleArray3 = new double[] { 0, 1.0d, (byte) 1 };
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray3);
        int[] intArray7 = new int[] { (byte) 0, 100 };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.removeAll(doubleArray3, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray7);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test445");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray0, (int) 'a', (int) (byte) 0);
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.removeElements(shortArray3, shortArray4);
        java.lang.Short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray5);
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.clone(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray7);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test446");
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { true, true };
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2);
        int int5 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray3, false);
        boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray3, false);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray7, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test447");
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { true, true };
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2);
        int int5 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray3, false);
        boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray3, (int) (short) 1);
        boolean[] booleanArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray8);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test448");
        int[] intArray0 = new int[] {};
        int[] intArray3 = org.apache.commons.lang3.ArrayUtils.subarray(intArray0, 1, 3);
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray0);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.clone(intArray0);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray5, (int) (short) 100, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test449");
        float[] floatArray1 = new float[] { ' ' };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray1);
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray1);
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray1, (float) 100L, 0);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.remove(floatArray1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test450");
        java.lang.Double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY;
        double[] doubleArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray0);
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray1, (double) 0L);
        java.lang.Double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray1);
        java.lang.Object[] objArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty((java.lang.Object[]) doubleArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test451");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.ArrayUtils.clone(byteArray2);
        byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.add(byteArray3, (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.add(byteArray3, (int) (byte) 10, (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test452");
        double[] doubleArray5 = new double[] { 10.0f, (-1L), 1L, 100, (byte) 100 };
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray5);
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray7);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test453");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 1, 10, 10 };
        java.lang.Integer[] intArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray4);
        java.lang.Integer[] intArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray4);
        java.lang.Integer[] intArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray6);
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) intArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray7);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test454");
        char[] charArray0 = null;
        char[] charArray2 = org.apache.commons.lang3.ArrayUtils.add(charArray0, '#');
        char[] charArray3 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHAR_ARRAY;
        char[] charArray4 = org.apache.commons.lang3.ArrayUtils.removeElements(charArray0, charArray3);
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.clone(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charArray5);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test455");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray2 = org.apache.commons.lang3.ArrayUtils.add(shortArray0, (short) 10);
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray0, (short) 0);
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray0, (int) 'a', (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray7);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test456");
        float[] floatArray5 = new float[] { 0, (byte) 10, 0L, 100, (byte) -1 };
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray5, (float) (short) 10);
        java.lang.Float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray5);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test457");
        java.lang.Long[] longArray4 = new java.lang.Long[] { (-1L), 10L, 100L, (-1L) };
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray4, 1L);
        java.lang.Long[] longArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray4);
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray7);
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray9);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test458");
        float[] floatArray1 = new float[] { ' ' };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray1);
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray1);
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray1, (float) 100L, 0);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray1, (float) 100, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test459");
        int[] intArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_INT_ARRAY;
        int[] intArray1 = org.apache.commons.lang3.ArrayUtils.clone(intArray0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = org.apache.commons.lang3.ArrayUtils.remove(intArray1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray1);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test460");
        char[] charArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHAR_ARRAY;
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray0);
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(charArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test461");
        float[][][][] floatArray0 = new float[][][][] {};
        float[][][][] floatArray1 = org.apache.commons.lang3.ArrayUtils.toArray(floatArray0);
        float[][][][] floatArray2 = new float[][][][] {};
        float[][][][] floatArray3 = org.apache.commons.lang3.ArrayUtils.toArray(floatArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable[][][] serializableArray4 = org.apache.commons.lang3.ArrayUtils.add((java.io.Serializable[][][]) floatArray0, (java.io.Serializable[][]) floatArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: [[[[F");
        } catch (java.lang.ArrayStoreException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray3);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test462");
        java.lang.Byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_OBJECT_ARRAY;
        java.lang.Float[] floatArray4 = new java.lang.Float[] { (-1.0f), 100.0f, 10.0f };
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray4);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray5, (float) 0);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) byteArray0, (java.lang.Object) floatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test463");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "" };
        java.lang.Comparable<java.lang.String>[] strComparableArray4 = org.apache.commons.lang3.ArrayUtils.toArray((java.lang.Comparable<java.lang.String>[]) strArray3);
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) strComparableArray4, (java.lang.Object) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.Object, java.lang.Object> objMap7 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) strComparableArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array element 0, 'hi!', is neither of type Map.Entry nor an Array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test464");
        float[] floatArray1 = new float[] { ' ' };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray1);
        float[] floatArray3 = null;
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.removeElements(floatArray1, floatArray3);
        java.lang.Float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray1);
        java.lang.Float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray5);
        java.lang.Float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray7);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test465");
        java.lang.Character[] charArray0 = new java.lang.Character[] {};
        java.lang.Character[] charArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray0);
        java.lang.Character[] charArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray0);
        char[] charArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray2);
        char[] charArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray2);
        java.lang.Character[] charArray5 = org.apache.commons.lang3.ArrayUtils.toObject(charArray4);
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.subarray(charArray4, (int) (byte) 0, (int) (byte) 0);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test466");
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { true, true };
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2);
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray3);
        boolean[] booleanArray5 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray3);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray3, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test467");
        double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.add(doubleArray0, (double) (short) -1);
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.add(doubleArray0, (double) 'a');
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.add(doubleArray0, 0.0d);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, 100.0d, (double) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test468");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray0, (int) 'a', (int) (byte) 0);
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray3, (short) 0);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test469");
        char[] charArray5 = new char[] { 'a', '#', '4', ' ', '4' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray5);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test470");
        byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        java.lang.Byte[] byteArray1 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray0);
        byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray1);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray2);
        byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray2, (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test471");
        char[] charArray0 = new char[] {};
        java.lang.Character[] charArray1 = org.apache.commons.lang3.ArrayUtils.toObject(charArray0);
        java.lang.Character[] charArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test472");
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { true, true };
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2);
        boolean[] booleanArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2);
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.add(booleanArray4, true);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test473");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.clone(byteArray1);
        byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray2, (int) (short) 1, (int) ' ');
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray2);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(byteArray6, (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test474");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 1, 10, 10 };
        java.lang.Integer[] intArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray4);
        java.lang.Object[] objArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty((java.lang.Object[]) intArray5);
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray5);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test475");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray0, (int) 'a', (int) (byte) 0);
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.removeElements(shortArray3, shortArray4);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray4, (short) 1, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test476");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 1, 10, 10 };
        java.lang.Integer[] intArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray4);
        java.lang.Integer[] intArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray4);
        java.lang.Integer[] intArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray6);
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray7);
        java.lang.Integer[] intArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray9);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test477");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "" };
        java.lang.Comparable<java.lang.String>[] strComparableArray4 = org.apache.commons.lang3.ArrayUtils.toArray((java.lang.Comparable<java.lang.String>[]) strArray3);
        java.lang.String[] strArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray3);
        java.lang.Object[] objArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty((java.lang.Object[]) strArray5);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isEmpty((java.lang.Object[]) strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test478");
        java.lang.Byte[] byteArray0 = new java.lang.Byte[] {};
        java.lang.Byte[] byteArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray0);
        java.lang.Byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray0);
        byte[] byteArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray2, (byte) -1);
        int int5 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test479");
        byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        byte[] byteArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test480");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 1, 10, 10 };
        java.lang.Integer[] intArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray4);
        java.lang.Integer[] intArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray4);
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray6);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray6, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray9);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test481");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 1, 10, 10 };
        java.lang.Integer[] intArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray4);
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray4, 3);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray7);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test482");
        java.lang.Byte[] byteArray2 = new java.lang.Byte[] { (byte) 0, (byte) 10 };
        byte[] byteArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray2, (byte) -1);
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray2, (byte) 0);
        java.lang.Byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray6);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray6, (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test483");
        java.lang.Byte[] byteArray2 = new java.lang.Byte[] { (byte) 0, (byte) 10 };
        byte[] byteArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray2, (byte) -1);
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray2, (byte) 0);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray2);
        java.lang.Byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray2);
        java.lang.Byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
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
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test484");
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { true, true };
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2);
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray3);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray3, true, 0);
        boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray3, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray9);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test485");
        int[] intArray0 = null;
        int[] intArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray0);
        java.lang.Integer[] intArray2 = org.apache.commons.lang3.ArrayUtils.toObject(intArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test486");
        java.lang.String[][] strArray0 = null;
        java.lang.String[][] strArray3 = org.apache.commons.lang3.ArrayUtils.subarray(strArray0, (int) ' ', (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test487");
        char[] charArray0 = new char[] {};
        java.lang.Character[] charArray1 = org.apache.commons.lang3.ArrayUtils.toObject(charArray0);
        char[] charArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray1, 'a');
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray3, '4', (int) '#');
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray3);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test488");
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { true, true };
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2);
        boolean[] booleanArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray3, false);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray3, false, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test489");
        java.lang.Double[] doubleArray0 = null;
        double[] doubleArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test490");
        int[] intArray0 = null;
        int[] intArray1 = new int[] {};
        int[] intArray4 = org.apache.commons.lang3.ArrayUtils.subarray(intArray1, 1, 3);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray1);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray1);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(intArray1, (int) (short) 10);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.addAll(intArray0, intArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray9);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test491");
        java.lang.Short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_OBJECT_ARRAY;
        short[] shortArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray0, (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray2);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test492");
        double[] doubleArray0 = null;
        double[] doubleArray1 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray1);
        double[] doubleArray3 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray0, doubleArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray3);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test493");
        long[] longArray4 = new long[] { ' ', '#', (short) 0, 10L };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray4, (long) (-1), (int) (short) 1);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray4, (long) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test494");
        byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        java.lang.Byte[] byteArray1 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray0);
        byte[] byteArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray1, (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.remove(byteArray3, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test495");
        char[] charArray1 = new char[] { '#' };
        java.lang.Character[] charArray2 = new java.lang.Character[] {};
        java.lang.Character[] charArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray2);
        java.lang.Character[] charArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray2);
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray4);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray1, charArray5);
        char[] charArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray5);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray5, 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test496");
        char[] charArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray0, '4', (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test497");
        long[] longArray2 = new long[] { (byte) -1, 10L };
        long[] longArray5 = org.apache.commons.lang3.ArrayUtils.subarray(longArray2, (int) '#', (int) (byte) 10);
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray2, (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray7);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test498");
        java.lang.Float[] floatArray3 = new java.lang.Float[] { (-1.0f), 100.0f, 10.0f };
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray3);
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray3, (float) (byte) 100);
        java.lang.Float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray7);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test499");
        java.lang.Short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_OBJECT_ARRAY;
        short[] shortArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray0, (short) (byte) 10);
        java.lang.Short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray0);
        java.lang.Short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
    }

    @Test
    public void ArrayUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test500");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 1, 10, 10 };
        java.lang.Integer[] intArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray4);
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray4, 3);
        java.lang.Integer[] intArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray4);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isNotEmpty((java.lang.Object[]) intArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }
}

