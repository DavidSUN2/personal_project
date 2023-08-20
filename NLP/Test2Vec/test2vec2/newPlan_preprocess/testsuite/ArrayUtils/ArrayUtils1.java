package ArrayUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ArrayUtils1 {

    public static boolean debug = false;

    @Test
    public void ArrayUtils501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils1.ArrayUtils501");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray0, (int) 'a', (int) (byte) 0);
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.removeElements(shortArray3, shortArray4);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void ArrayUtils502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils1.ArrayUtils502");
        int[] intArray0 = new int[] {};
        int[] intArray3 = org.apache.commons.lang3.ArrayUtils.subarray(intArray0, 1, 3);
        int[] intArray4 = org.apache.commons.lang3.ArrayUtils.clone(intArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void ArrayUtils503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils1.ArrayUtils503");
        java.lang.Double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY;
        double[] doubleArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray0);
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray1, (double) 100L, (double) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void ArrayUtils504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils1.ArrayUtils504");
        java.lang.Long[] longArray4 = new java.lang.Long[] { (-1L), 10L, 100L, (-1L) };
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray4, 1L);
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray7);
    }

    @Test
    public void ArrayUtils505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils1.ArrayUtils505");
        char[] charArray5 = new char[] { 'a', '#', '4', ' ', '4' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray5);
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray5, ' ');
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray8);
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
    public void ArrayUtils506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils1.ArrayUtils506");
        int[] intArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_INT_ARRAY;
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.contains(intArray0, (int) (byte) 100);
        // The following exception was thrown during execution in ArrayUtils generation
        try {
            int[] intArray5 = org.apache.commons.lang3.ArrayUtils.add(intArray0, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void ArrayUtils507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils1.ArrayUtils507");
        java.lang.Character[] charArray0 = null;
        java.lang.Character[] charArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray0);
        java.lang.Character[] charArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray0);
        java.lang.Character[] charArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray2);
        char[] charArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray2);
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray2);
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
    }

    @Test
    public void ArrayUtils508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils1.ArrayUtils508");
        char[] charArray0 = new char[] {};
        java.lang.Character[] charArray1 = org.apache.commons.lang3.ArrayUtils.toObject(charArray0);
        java.lang.Character[] charArray2 = org.apache.commons.lang3.ArrayUtils.toObject(charArray0);
        char[] charArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray2, '#');
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray2, ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
    }

    @Test
    public void ArrayUtils509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils1.ArrayUtils509");
        java.lang.Byte[] byteArray2 = new java.lang.Byte[] { (byte) 0, (byte) 10 };
        byte[] byteArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray2, (byte) -1);
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray2, (byte) 0);
        java.lang.Byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray6);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.clone(byteArray6);
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
    public void ArrayUtils510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils1.ArrayUtils510");
        double[] doubleArray5 = new double[] { 10.0f, (-1L), 1L, 100, (byte) 100 };
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray5);
        java.lang.Double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray6);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void ArrayUtils511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils1.ArrayUtils511");
        boolean[] booleanArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BOOLEAN_ARRAY;
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray0, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void ArrayUtils512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils1.ArrayUtils512");
        double[] doubleArray5 = new double[] { (short) 0, 'a', 0L, 1.0d, 100L };
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray5);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray5, (double) 100, (double) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void ArrayUtils513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils1.ArrayUtils513");
        java.lang.Float[][][] floatArray0 = new java.lang.Float[][][] {};
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void ArrayUtils514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils1.ArrayUtils514");
        byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray0);
        byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray0);
        byte[] byteArray4 = org.apache.commons.lang3.ArrayUtils.add(byteArray2, (byte) -1);
        // The following exception was thrown during execution in ArrayUtils generation
        try {
            byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.add(byteArray4, (int) '4', (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void ArrayUtils515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils1.ArrayUtils515");
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { true, true };
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2);
        java.lang.Boolean[] booleanArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray2);
        java.lang.Boolean[] booleanArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray2);
        boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray5, true);
        java.lang.String str9 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) booleanArray7, "false");
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{true,true}" + "'", str9.equals("{true,true}"));
    }

    @Test
    public void ArrayUtils516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils1.ArrayUtils516");
        double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.add(doubleArray0, (double) (short) -1);
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.add(doubleArray0, (double) 'a');
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray4, (double) 10L, (int) (short) 100, (double) 10.0f);
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray9);
    }

    @Test
    public void ArrayUtils517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils1.ArrayUtils517");
        boolean[] booleanArray6 = new boolean[] { true, false, true, true, true, false };
        boolean[] booleanArray7 = null;
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray6, booleanArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void ArrayUtils518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils1.ArrayUtils518");
        short[] shortArray1 = new short[] { (byte) -1 };
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.contains(shortArray1, (short) 10);
        short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray1, (int) (short) 0, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray6);
    }

    @Test
    public void ArrayUtils519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils1.ArrayUtils519");
        java.lang.Class<?>[] wildcardClassArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_CLASS_ARRAY;
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray1 = null;
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray2 = org.apache.commons.lang3.ArrayUtils.addAll((java.lang.reflect.GenericDeclaration[]) wildcardClassArray0, genericDeclarationArray1);
        java.lang.Object[] objArray3 = null;
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) wildcardClassArray0, objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void ArrayUtils520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils1.ArrayUtils520");
        java.lang.Long[] longArray3 = new java.lang.Long[] { (-1L), 100L, 10L };
        long[] longArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray4);
    }

    @Test
    public void ArrayUtils521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils1.ArrayUtils521");
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { true, true };
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2);
        java.lang.Boolean[] booleanArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray2);
        java.lang.Boolean[] booleanArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray2);
        java.lang.Boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray5);
        boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray5);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray7);
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void ArrayUtils522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils1.ArrayUtils522");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.clone(byteArray1);
        byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray2, (int) (short) 1, (int) ' ');
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray2);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray6, (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void ArrayUtils523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils1.ArrayUtils523");
        double[] doubleArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) (byte) 0, (double) 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void ArrayUtils524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils1.ArrayUtils524");
        double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) 0L, (int) (short) -1);
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray0, (double) (short) 1);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray0, (double) 'a', (double) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void ArrayUtils525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils1.ArrayUtils525");
        float[] floatArray1 = new float[] { ' ' };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray1);
        int int4 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray1, 1.0f);
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray1, (float) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray6);
    }

    @Test
    public void ArrayUtils526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils1.ArrayUtils526");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray0, (int) 'a', (int) (byte) 0);
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.removeElements(shortArray3, shortArray4);
        short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray4);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray6, (short) 10);
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void ArrayUtils527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils1.ArrayUtils527");
        java.lang.Integer[] intArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY;
        java.lang.Boolean[] booleanArray3 = new java.lang.Boolean[] { true, true };
        boolean[] booleanArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray3);
        boolean[] booleanArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray3);
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) booleanArray3);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) intArray0, (java.lang.Object[]) booleanArray3);
        boolean[] booleanArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray8);
    }

    @Test
    public void ArrayUtils528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils1.ArrayUtils528");
        java.lang.Byte[] byteArray2 = new java.lang.Byte[] { (byte) 0, (byte) 10 };
        byte[] byteArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray2, (byte) -1);
        java.lang.Byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray2);
        java.lang.Byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray2);
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
    public void ArrayUtils529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils1.ArrayUtils529");
        boolean[] booleanArray4 = new boolean[] { true, true, false, false };
        java.lang.Boolean[] booleanArray5 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray4);
        boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray5, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray7);
    }

    @Test
    public void ArrayUtils530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils1.ArrayUtils530");
        double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) 3, 100, (double) '#');
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, 10.0d, 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void ArrayUtils531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils1.ArrayUtils531");
        double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.add(doubleArray0, (double) (short) -1);
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.add(doubleArray0, (double) 'a');
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray4, (double) 0, (double) 100L);
        // The following exception was thrown during execution in ArrayUtils generation
        try {
            double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray4, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void ArrayUtils532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils1.ArrayUtils532");
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { true, true };
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2);
        boolean[] booleanArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray4, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void ArrayUtils533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils1.ArrayUtils533");
        double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) 0L, (int) (short) -1);
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray0);
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.add(doubleArray0, 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray6);
    }

    @Test
    public void ArrayUtils534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils1.ArrayUtils534");
        double[] doubleArray3 = new double[] { 0, 1.0d, (byte) 1 };
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray3);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray3);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray3);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray3, (double) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void ArrayUtils535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils1.ArrayUtils535");
        long[] longArray4 = new long[] { (short) 100, 10L, 10, (byte) -1 };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.add(longArray4, 2, (long) 'a');
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray8);
    }

    @Test
    public void ArrayUtils536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils1.ArrayUtils536");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray0, (int) 'a', (int) (byte) 0);
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray3, (short) -1, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void ArrayUtils537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils1.ArrayUtils537");
        java.lang.Double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY;
        double[] doubleArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray0);
        double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void ArrayUtils538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils1.ArrayUtils538");
        byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        java.lang.Byte[] byteArray1 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray0);
        byte[] byteArray4 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray0, (int) (byte) 10, 3);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray0, (byte) 0, (int) (short) 1);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray0);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.clone(byteArray0);
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
        org.junit.Assert.assertNotNull(byteArray9);
    }

    @Test
    public void ArrayUtils539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils1.ArrayUtils539");
        byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        byte[] byteArray1 = org.apache.commons.lang3.ArrayUtils.clone(byteArray0);
        byte[] byteArray3 = org.apache.commons.lang3.ArrayUtils.add(byteArray0, (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void ArrayUtils540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils1.ArrayUtils540");
        float[] floatArray0 = null;
        // The following exception was thrown during execution in ArrayUtils generation
        try {
            float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.remove(floatArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void ArrayUtils541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils1.ArrayUtils541");
        java.lang.Float[] floatArray3 = new java.lang.Float[] { (-1.0f), 100.0f, 10.0f };
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray3);
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray3, (float) (byte) 100);
        java.lang.Float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray3);
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
    public void ArrayUtils542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils1.ArrayUtils542");
        byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        java.lang.Byte[] byteArray1 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray0);
        byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.ArrayUtils.clone(byteArray2);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.contains(byteArray2, (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void ArrayUtils543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils1.ArrayUtils543");
        double[] doubleArray0 = null;
        double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray0, (double) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(doubleArray2);
    }

    @Test
    public void ArrayUtils544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils1.ArrayUtils544");
        java.lang.Double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY;
        double[] doubleArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray0);
        double[] doubleArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray0, (double) 'a');
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray4);
    }

    @Test
    public void ArrayUtils545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils1.ArrayUtils545");
        java.lang.Byte[] byteArray0 = null;
        java.lang.Byte[] byteArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void ArrayUtils546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils1.ArrayUtils546");
        float[] floatArray1 = new float[] { ' ' };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray1);
        int int4 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray1, 1.0f);
        java.lang.Float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray1);
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray5);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray5);
        java.lang.Float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray5);
        java.lang.Float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray8);
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
        org.junit.Assert.assertNotNull(floatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray9);
    }

    @Test
    public void ArrayUtils547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils1.ArrayUtils547");
        double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.add(doubleArray0, (double) (short) -1);
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.add(doubleArray0, (double) 'a');
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray4, (double) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void ArrayUtils548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils1.ArrayUtils548");
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { true, true };
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2);
        boolean[] booleanArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2);
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.add(booleanArray4, true);
        java.lang.Boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray6);
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
    public void ArrayUtils549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils1.ArrayUtils549");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        java.lang.Short[] shortArray1 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray0);
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray0, (short) (byte) 0);
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray0, (short) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray5);
    }

    @Test
    public void ArrayUtils550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils1.ArrayUtils550");
        float[] floatArray4 = new float[] { 0.0f, 0L, 0, (short) 1 };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.contains(floatArray4, (float) 3);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray4);
        // The following exception was thrown during execution in ArrayUtils generation
        try {
            float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.remove(floatArray4, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void ArrayUtils551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils1.ArrayUtils551");
        long[] longArray1 = new long[] { 1 };
        long[] longArray3 = new long[] { 1 };
        long[][] longArray4 = new long[][] { longArray1, longArray3 };
        long[][] longArray5 = org.apache.commons.lang3.ArrayUtils.clone(longArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray5);
    }

    @Test
    public void ArrayUtils552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils1.ArrayUtils552");
        java.lang.Double[] doubleArray0 = null;
        java.lang.Double[] doubleArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray0);
        double[] doubleArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray1, (double) 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray3);
    }

    @Test
    public void ArrayUtils553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils1.ArrayUtils553");
        java.lang.Long[] longArray0 = null;
        java.lang.Long[] longArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray1);
    }

    @Test
    public void ArrayUtils554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils1.ArrayUtils554");
        char[] charArray0 = new char[] {};
        java.lang.Character[] charArray1 = org.apache.commons.lang3.ArrayUtils.toObject(charArray0);
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.contains(charArray0, '#');
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray0, '#');
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray5, '#', (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void ArrayUtils555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils1.ArrayUtils555");
        short[] shortArray0 = null;
        short[] shortArray2 = org.apache.commons.lang3.ArrayUtils.add(shortArray0, (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray2);
    }

    @Test
    public void ArrayUtils556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils1.ArrayUtils556");
        int[][] intArray0 = new int[][] {};
        int[][] intArray3 = org.apache.commons.lang3.ArrayUtils.subarray(intArray0, (int) (byte) 100, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void ArrayUtils557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils1.ArrayUtils557");
        java.lang.Character[] charArray0 = new java.lang.Character[] {};
        java.lang.Character[] charArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray0);
        java.lang.Character[] charArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray0);
        char[] charArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray2);
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.subarray(charArray3, 100, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
    }

    @Test
    public void ArrayUtils558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils1.ArrayUtils558");
        long[] longArray1 = new long[] { (short) -1 };
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray1, 0L);
        // The following exception was thrown during execution in ArrayUtils generation
        try {
            long[] longArray6 = org.apache.commons.lang3.ArrayUtils.add(longArray3, (int) (byte) 100, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray3);
    }

    @Test
    public void ArrayUtils559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils1.ArrayUtils559");
        float[] floatArray1 = new float[] { ' ' };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray1);
        float[] floatArray3 = null;
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.removeElements(floatArray1, floatArray3);
        java.lang.Float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray1);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) floatArray5, (java.lang.Object) "false");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void ArrayUtils560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils1.ArrayUtils560");
        char[] charArray0 = null;
        char[] charArray2 = org.apache.commons.lang3.ArrayUtils.add(charArray0, '#');
        char[] charArray3 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHAR_ARRAY;
        char[] charArray4 = org.apache.commons.lang3.ArrayUtils.removeElements(charArray0, charArray3);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void ArrayUtils561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils1.ArrayUtils561");
        char[] charArray0 = null;
        char[] charArray2 = org.apache.commons.lang3.ArrayUtils.add(charArray0, '#');
        char[] charArray3 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHAR_ARRAY;
        char[] charArray4 = org.apache.commons.lang3.ArrayUtils.removeElements(charArray0, charArray3);
        // The following exception was thrown during execution in ArrayUtils generation
        try {
            char[] charArray7 = org.apache.commons.lang3.ArrayUtils.add(charArray3, (int) (short) 100, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charArray4);
    }

    @Test
    public void ArrayUtils562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils1.ArrayUtils562");
        long[] longArray1 = new long[] { (short) -1 };
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray1, 0L);
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray1, (long) ' ');
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray1);
        org.apache.commons.lang3.ArrayUtils.reverse(longArray1);
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray1);
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
    public void ArrayUtils563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils1.ArrayUtils563");
        int[] intArray0 = new int[] {};
        int[] intArray3 = org.apache.commons.lang3.ArrayUtils.subarray(intArray0, 1, 3);
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray3, (int) (byte) 0, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void ArrayUtils564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils1.ArrayUtils564");
        double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) 0L, (int) (short) -1);
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray4);
    }

    @Test
    public void ArrayUtils565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils1.ArrayUtils565");
        byte[] byteArray0 = null;
        byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray0, (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(byteArray2);
    }

    @Test
    public void ArrayUtils566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils1.ArrayUtils566");
        java.lang.Double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY;
        double[] doubleArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray0);
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray1, (double) 0L);
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray1, (double) 10, 10);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray1, 0.0d, (double) (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void ArrayUtils567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils1.ArrayUtils567");
        java.lang.Byte[] byteArray0 = new java.lang.Byte[] {};
        java.lang.Byte[] byteArray1 = new java.lang.Byte[] {};
        java.lang.Byte[] byteArray2 = new java.lang.Byte[] {};
        java.lang.Byte[] byteArray3 = new java.lang.Byte[] {};
        java.lang.Byte[][] byteArray4 = new java.lang.Byte[][] { byteArray0, byteArray1, byteArray2, byteArray3 };
        java.lang.Byte[] byteArray6 = new java.lang.Byte[] {};
        java.lang.Byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray6);
        // The following exception was thrown during execution in ArrayUtils generation
        try {
            java.lang.Byte[][] byteArray8 = org.apache.commons.lang3.ArrayUtils.add(byteArray4, (int) (byte) 10, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 4");
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
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void ArrayUtils568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils1.ArrayUtils568");
        java.lang.Byte[] byteArray0 = new java.lang.Byte[] {};
        java.lang.Byte[] byteArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray0);
        byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void ArrayUtils569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils1.ArrayUtils569");
        java.lang.Double[] doubleArray0 = new java.lang.Double[] {};
        double[] doubleArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray1);
    }

    @Test
    public void ArrayUtils570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils1.ArrayUtils570");
        double[] doubleArray4 = new double[] { 1, ' ', '#', 100L };
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray4, (int) (byte) -1, (int) '#');
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray8);
    }

    @Test
    public void ArrayUtils571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils1.ArrayUtils571");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        java.lang.Short[] shortArray1 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_OBJECT_ARRAY;
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray1, (short) (byte) 10);
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray3, (short) 0);
        short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray5);
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray0, shortArray6);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray7, (short) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void ArrayUtils572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils1.ArrayUtils572");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray0, (int) 'a', (int) (byte) 0);
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.add(shortArray0, (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray5);
    }

    @Test
    public void ArrayUtils573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils1.ArrayUtils573");
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { true, true };
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2);
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray3);
        boolean[] booleanArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray3);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray3, true);
        java.lang.Boolean[] booleanArray8 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray8);
    }

    @Test
    public void ArrayUtils574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils1.ArrayUtils574");
        java.lang.Class<?>[] wildcardClassArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_CLASS_ARRAY;
        // The following exception was thrown during execution in ArrayUtils generation
        try {
            java.lang.reflect.Type[] typeArray2 = org.apache.commons.lang3.ArrayUtils.remove((java.lang.reflect.Type[]) wildcardClassArray0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray0);
    }

    @Test
    public void ArrayUtils575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils1.ArrayUtils575");
        boolean[] booleanArray0 = null;
        java.lang.Boolean[] booleanArray3 = new java.lang.Boolean[] { true, true };
        boolean[] booleanArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray3);
        boolean[] booleanArray5 = org.apache.commons.lang3.ArrayUtils.removeElements(booleanArray0, booleanArray4);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booleanArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void ArrayUtils576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils1.ArrayUtils576");
        long[] longArray1 = new long[] { (short) -1 };
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray1, 0L);
        long[] longArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray3);
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray3, (long) (byte) 0);
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.add(longArray3, (long) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray8);
    }
}

