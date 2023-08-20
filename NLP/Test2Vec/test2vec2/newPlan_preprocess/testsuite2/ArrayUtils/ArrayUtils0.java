package ArrayUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ArrayUtils0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test01");
        int[] intArray5 = new int[] { (short) 1, (-1), (-1) };
        java.lang.Integer[] intArray6 = org.apache.commons.lang3.ArrayUtils.toObject(intArray5);
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1L, 100, intArray5, true };
        org.apache.commons.lang3.ArrayUtils.reverse(objArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test02");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.remove(byteArray3, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test03");
        java.lang.Double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray0);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test04");
        int[] intArray3 = new int[] { (short) 1, (-1), (-1) };
        java.lang.Integer[] intArray4 = org.apache.commons.lang3.ArrayUtils.toObject(intArray3);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.clone(intArray3);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray3, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test05");
        long[] longArray4 = new long[] { 100L, 'a', (short) -1, (byte) 0 };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.contains(longArray4, (long) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test06");
        java.lang.Object[] objArray1 = new java.lang.Object[] { "" };
        int int4 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(objArray1, (java.lang.Object) (short) 100, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test07");
        java.lang.Boolean[] booleanArray5 = new java.lang.Boolean[] { true, false, true, false, true };
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray5);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test08");
        double[] doubleArray4 = new double[] { 0.0f, (-1.0f), (byte) 100, 10.0f };
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray4, (double) (byte) 100);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray4, (double) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test09");
        java.lang.Byte[] byteArray0 = null;
        java.lang.Byte[] byteArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test10");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.remove(byteArray3, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test11");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test12");
        boolean[] booleanArray2 = new boolean[] { false, true };
        int int5 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray2, true, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test13");
        java.lang.Integer[] intArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test14");
        java.lang.Boolean[] booleanArray5 = new java.lang.Boolean[] { true, false, true, false, true };
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray5);
        boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.add(booleanArray6, (int) (short) 0, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray9);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test15");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray3);
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray3, (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test16");
        java.lang.Boolean[] booleanArray5 = new java.lang.Boolean[] { true, false, true, false, true };
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray5);
        boolean[] booleanArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray5, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray8);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test17");
        java.lang.String[] strArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test18");
        int[] intArray3 = new int[] { (short) 1, (-1), (-1) };
        java.lang.Integer[] intArray4 = org.apache.commons.lang3.ArrayUtils.toObject(intArray3);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.clone(intArray3);
        java.lang.Integer[] intArray6 = org.apache.commons.lang3.ArrayUtils.toObject(intArray5);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray5);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.add(intArray5, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray9);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test19");
        int[] intArray3 = new int[] { (short) 1, (-1), (-1) };
        java.lang.Integer[] intArray4 = org.apache.commons.lang3.ArrayUtils.toObject(intArray3);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.clone(intArray3);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray3, 2, 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test20");
        char[] charArray4 = new char[] { '4', 'a', ' ', '#' };
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray7 = org.apache.commons.lang3.ArrayUtils.add(charArray4, (int) (short) -1, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test21");
        java.lang.Long[] longArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY;
        java.lang.Long[] longArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray0);
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isEmpty((java.lang.Object[]) longArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test22");
        float[] floatArray1 = new float[] { (short) -1 };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray1, (float) (byte) 10, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (int) (short) -1, (float) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test23");
        int[] intArray3 = new int[] { (short) 1, (-1), (-1) };
        java.lang.Integer[] intArray4 = org.apache.commons.lang3.ArrayUtils.toObject(intArray3);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.clone(intArray3);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.contains(intArray3, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test24");
        double[] doubleArray4 = new double[] { 0.0f, (-1.0f), (byte) 100, 10.0f };
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray4, (double) (byte) 100);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray4);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test25");
        java.lang.Object[][] objArray0 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray1 = org.apache.commons.lang3.ArrayUtils.toArray(objArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray1);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test26");
        boolean[] booleanArray6 = new boolean[] { true, false, true, true, true, false };
        java.lang.Boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray6);
        java.lang.Boolean[] booleanArray8 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray8);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test27");
        char[] charArray6 = new char[] { '#', '#', 'a', '#', ' ', '#' };
        org.apache.commons.lang3.ArrayUtils.reverse(charArray6);
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHAR_ARRAY;
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.addAll(charArray6, charArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray9);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test28");
        float[] floatArray1 = new float[] { (short) -1 };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray1, (float) (byte) 10, (int) (short) 1);
        java.lang.Float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray5);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test29");
        int int0 = org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-1) + "'", int0 == (-1));
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test30");
        float[] floatArray1 = new float[] { (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.remove(floatArray1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray1);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test31");
        double[] doubleArray4 = new double[] { 0.0f, (-1.0f), (byte) 100, 10.0f };
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray4, (double) (byte) 100);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray4, (double) (short) 0);
        java.lang.Double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray9);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test32");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1 };
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray4, (byte) 0);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray4);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(byteArray4, (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test33");
        short[] shortArray6 = new short[] { (short) -1, (byte) -1, (short) 1, (byte) 100, (short) 0, (short) 1 };
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray6, (short) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test34");
        char[] charArray5 = new char[] { 'a', '4', '#', ' ', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray8 = org.apache.commons.lang3.ArrayUtils.add(charArray5, (int) '4', '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test35");
        java.lang.Character[] charArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHARACTER_OBJECT_ARRAY;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray0);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test36");
        java.lang.Long[] longArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY;
        java.lang.Long[] longArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray0);
        long[] longArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray1);
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test37");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray0);
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray0, (short) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test38");
        double[] doubleArray4 = new double[] { 0.0f, (-1.0f), (byte) 100, 10.0f };
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray4, (double) (byte) 100);
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray4, (int) (short) 1, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray9);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test39");
        java.lang.Object obj0 = null;
        int int1 = org.apache.commons.lang3.ArrayUtils.getLength(obj0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test40");
        char[] charArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHAR_ARRAY;
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.contains(charArray0, 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test41");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        int[] intArray4 = new int[] { (short) 1, (-1), (-1) };
        java.lang.Integer[] intArray5 = org.apache.commons.lang3.ArrayUtils.toObject(intArray4);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.removeAll(shortArray0, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test42");
        float[] floatArray0 = new float[] {};
        int int2 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray0, 0.0f);
        int int5 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray0, (float) (short) -1, 0);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test43");
        char[] charArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHAR_ARRAY;
        char[] charArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray0, '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test44");
        long[] longArray1 = new long[] { (-1L) };
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.add(longArray1, (long) 2);
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.subarray(longArray1, (int) (byte) -1, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray6);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test45");
        float[] floatArray0 = null;
        float[] floatArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray1);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test46");
        float[] floatArray0 = new float[] {};
        int int2 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray0, 0.0f);
        int int5 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray0, (float) (short) -1, 0);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.contains(floatArray0, (float) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test47");
        double[] doubleArray0 = null;
        int int2 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test48");
        java.lang.Byte[] byteArray6 = new java.lang.Byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) 0, (byte) 0, (byte) 100 };
        java.lang.Byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray6);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray6, (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray9);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test49");
        java.lang.Float[] floatArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_OBJECT_ARRAY;
        java.lang.Long[] longArray1 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY;
        java.lang.Long[] longArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray1);
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray2);
        java.lang.Object[] objArray4 = org.apache.commons.lang3.ArrayUtils.addAll((java.lang.Object[]) floatArray0, (java.lang.Object[]) longArray2);
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray2, (long) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray6);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test50");
        java.lang.Boolean[] booleanArray5 = new java.lang.Boolean[] { true, false, true, false, true };
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray5);
        boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray7);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test51");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10, 2 };
        int[] intArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray2, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test52");
        float[] floatArray0 = new float[] {};
        int int2 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray0, 0.0f);
        int int5 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray0, (float) (short) -1, 0);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.contains(floatArray0, (float) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test53");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.clone(byteArray3);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test54");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "", "" };
        java.lang.String[] strArray6 = new java.lang.String[] {};
        java.lang.Comparable<java.lang.String>[] strComparableArray7 = org.apache.commons.lang3.ArrayUtils.removeElements((java.lang.Comparable<java.lang.String>[]) strArray5, (java.lang.Comparable<java.lang.String>[]) strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray7);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test55");
        double[] doubleArray4 = new double[] { '#', 2, (short) 1, 10.0f };
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.add(doubleArray4, (double) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray6);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test56");
        long[] longArray1 = new long[] { (-1L) };
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.add(longArray1, (long) 2);
        int int5 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray1, (long) (-1));
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.subarray(longArray1, (-1), (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray8);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test57");
        int[] intArray3 = new int[] { (short) 1, (-1), (-1) };
        java.lang.Integer[] intArray4 = org.apache.commons.lang3.ArrayUtils.toObject(intArray3);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.clone(intArray3);
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test58");
        char[] charArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHAR_ARRAY;
        char[] charArray1 = org.apache.commons.lang3.ArrayUtils.clone(charArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray1);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test59");
        boolean[] booleanArray0 = null;
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test60");
        short[] shortArray2 = new short[] { (short) 10, (short) 0 };
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray2);
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray2, (short) 100);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray5, (short) (byte) 10, 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test61");
        short[] shortArray3 = new short[] { (short) 100, (short) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.remove(shortArray3, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test62");
        float[] floatArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_ARRAY;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray0);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test63");
        int[] intArray3 = new int[] { (-1), 2, 100 };
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray3, (int) (short) 1);
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.add(intArray5, 0, (int) (byte) 1);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.clone(intArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray9);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test64");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.clone(byteArray3);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray3, (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayUtils0.test65");
        boolean[] booleanArray6 = new boolean[] { true, false, true, true, true, false };
        java.lang.Boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray6);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }
}

