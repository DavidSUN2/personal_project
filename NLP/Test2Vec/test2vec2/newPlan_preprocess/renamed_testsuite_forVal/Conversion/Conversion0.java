
package Conversion;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Conversion0 {

    public static boolean debug = false;

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test01");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) -1, (byte) 0, (byte) 100 };
        int int9 = org.apache.commons.lang3.Conversion.byteArrayToInt(byteArray4, 10, (int) (byte) -1, (-1), (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test02");
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("hi!", 100, (long) '4', (int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test03");
        byte[] byteArray0 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.util.UUID uUID2 = org.apache.commons.lang3.Conversion.byteArrayToUuid(byteArray0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Need at least 16 bytes for UUID");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray0);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test04");
        boolean[] booleanArray0 = new boolean[] {};
        short short5 = org.apache.commons.lang3.Conversion.binaryToShort(booleanArray0, (int) (byte) 0, (short) 0, 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            char char7 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot convert an empty array.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test05");
        boolean[] booleanArray4 = new boolean[] { true, false };
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray7 = org.apache.commons.lang3.Conversion.shortToBinary((short) (byte) 1, (int) (short) -1, booleanArray4, 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test06");
        char char1 = org.apache.commons.lang3.Conversion.intToHexDigitMsb0((int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '8' + "'", char1 == '8');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test07");
        boolean[] booleanArray0 = new boolean[] {};
        short short5 = org.apache.commons.lang3.Conversion.binaryToShort(booleanArray0, (int) (byte) 0, (short) 0, 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            char char7 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot convert an empty array.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test08");
        org.apache.commons.lang3.Conversion conversion0 = new org.apache.commons.lang3.Conversion();
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test09");
        boolean[] booleanArray0 = new boolean[] {};
        short short5 = org.apache.commons.lang3.Conversion.binaryToShort(booleanArray0, (int) (byte) 0, (short) 0, 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            char char6 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot convert an empty array.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test10");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray7 = org.apache.commons.lang3.Conversion.shortToByteArray((short) (byte) 0, (int) (short) 100, byteArray4, (int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nBytes-1)*8+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test11");
        char char1 = org.apache.commons.lang3.Conversion.intToHexDigitMsb0((int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '0' + "'", char1 == '0');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test12");
        long long5 = org.apache.commons.lang3.Conversion.hexToLong("", 0, (long) (short) -1, (int) (short) 10, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test13");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) ' ', (int) '4', "hi!", 0, (int) '0');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test14");
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("", (int) (byte) 10, (long) 100, (int) (short) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test15");
        boolean[] booleanArray0 = new boolean[] {};
        short short5 = org.apache.commons.lang3.Conversion.binaryToShort(booleanArray0, (int) (byte) 0, (short) 0, 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            char char7 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: src.length-srcPos<4: src.length=0, srcPos=-1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test16");
        boolean[] booleanArray6 = new boolean[] { false, false, false, true, false, true };
        char char7 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray6);
        // The following exception was thrown during execution in test generation
        try {
            char char9 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray6, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '1' + "'", char7 == '1');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test17");
        short[] shortArray2 = new short[] { (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            int int7 = org.apache.commons.lang3.Conversion.shortArrayToInt(shortArray2, 0, (int) (short) 1, (int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nShorts-1)*16+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray2);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test18");
        boolean[] booleanArray6 = new boolean[] { false, false, false, true, false, true };
        char char7 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray6);
        char char8 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '1' + "'", char7 == '1');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '5' + "'", char8 == '5');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test19");
        int int5 = org.apache.commons.lang3.Conversion.hexToInt("", (int) (byte) 100, 100, 0, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test20");
        short[] shortArray1 = new short[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.apache.commons.lang3.Conversion.shortArrayToInt(shortArray1, (-1), (int) '1', 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray1);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test21");
        short[] shortArray2 = new short[] {};
        short[] shortArray5 = org.apache.commons.lang3.Conversion.intToShortArray((int) (short) -1, 100, shortArray2, (int) (short) 1, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray5);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test22");
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot interpret ' ' as a hexadecimal digit");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test23");
        boolean[] booleanArray6 = new boolean[] { false, false, false, true, false, true };
        char char7 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray6);
        // The following exception was thrown during execution in test generation
        try {
            char char9 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray6, (int) '1');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '1' + "'", char7 == '1');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test24");
        short[] shortArray0 = new short[] {};
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.shortArrayToLong(shortArray0, 10, (long) '8', 10, (int) '8');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nShorts-1)*16+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray0);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test25");
        byte[] byteArray3 = new byte[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray6 = org.apache.commons.lang3.Conversion.shortToByteArray((short) 10, (int) 'a', byteArray3, (int) (short) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nBytes-1)*8+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test26");
        byte[] byteArray0 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.byteArrayToShort(byteArray0, (int) (short) -1, (short) (byte) 1, (int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nBytes-1)*8+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray0);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test27");
        long long5 = org.apache.commons.lang3.Conversion.hexToLong("", (int) '1', (long) (short) -1, (int) '#', (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test28");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            int int7 = org.apache.commons.lang3.Conversion.byteArrayToInt(byteArray2, (int) '1', (int) '5', (int) '5', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nBytes-1)*8+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test29");
        boolean[] booleanArray0 = new boolean[] {};
        short short5 = org.apache.commons.lang3.Conversion.binaryToShort(booleanArray0, (int) (byte) 0, (short) 0, 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            char char7 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot convert an empty array.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test30");
        boolean[] booleanArray4 = new boolean[] { false, false, true, false };
        char char5 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray4);
        // The following exception was thrown during execution in test generation
        try {
            char char7 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray4, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '4' + "'", char5 == '4');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test31");
        boolean[] booleanArray0 = new boolean[] {};
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.binaryToLong(booleanArray0, (int) (short) 10, 0L, (int) (short) 1, (int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray0);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test32");
        byte[] byteArray2 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray5 = org.apache.commons.lang3.Conversion.intToByteArray((int) (short) 0, (int) '8', byteArray2, (int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nBytes-1)*8+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test33");
        char char1 = org.apache.commons.lang3.Conversion.intToHexDigitMsb0((int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '0' + "'", char1 == '0');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test34");
        int[] intArray3 = new int[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray6 = org.apache.commons.lang3.Conversion.longToIntArray(100L, (int) '4', intArray3, (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nInts-1)*32+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test35");
        short[] shortArray6 = new short[] { (short) 0, (short) 10, (short) 1, (byte) -1 };
        short[] shortArray9 = org.apache.commons.lang3.Conversion.intToShortArray(0, 10, shortArray6, (int) (short) -1, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray9);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test36");
        int int1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToInt('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test37");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.lang3.Conversion.byteArrayToInt(byteArray4, (int) (short) 10, 0, (int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nBytes-1)*8+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test38");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('0');
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.apache.commons.lang3.Conversion.binaryToInt(booleanArray1, 10, 100, 0, (int) '1');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test39");
        int int1 = org.apache.commons.lang3.Conversion.hexDigitToInt('8');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test40");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) -1, 2, "", (int) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test41");
        int int1 = org.apache.commons.lang3.Conversion.hexDigitToInt('1');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test42");
        int int1 = org.apache.commons.lang3.Conversion.hexDigitToInt('5');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test43");
        boolean[] booleanArray0 = new boolean[] {};
        short short5 = org.apache.commons.lang3.Conversion.binaryToShort(booleanArray0, (int) (byte) 0, (short) 0, 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            char char6 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: src.length-srcPos<4: src.length=0, srcPos=0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test44");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.UUID uUID7 = org.apache.commons.lang3.Conversion.byteArrayToUuid(byteArray5, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Need at least 16 bytes for UUID");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test45");
        byte[] byteArray1 = new byte[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.apache.commons.lang3.Conversion.byteArrayToInt(byteArray1, 2, (int) '4', (int) (short) 1, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nBytes-1)*8+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test46");
        boolean[] booleanArray6 = new boolean[] { false, false, false, true, false, true };
        char char7 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray6);
        // The following exception was thrown during execution in test generation
        try {
            char char9 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray6, (int) '0');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 48");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '1' + "'", char7 == '1');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test47");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) 1 };
        byte[] byteArray9 = org.apache.commons.lang3.Conversion.longToByteArray((long) (short) 100, (int) ' ', byteArray6, (int) (byte) 100, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray9);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test48");
        boolean[] booleanArray6 = new boolean[] { false, false, false, true, false, true };
        char char7 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray6);
        // The following exception was thrown during execution in test generation
        try {
            char char9 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray6, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '1' + "'", char7 == '1');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test49");
        boolean[] booleanArray0 = new boolean[] {};
        short short5 = org.apache.commons.lang3.Conversion.binaryToShort(booleanArray0, (int) (byte) 0, (short) 0, 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            char char6 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot convert an empty array.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test50");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('0');
        char char2 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test51");
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("hi!", (-1), (int) (short) 10, (int) (byte) 10, (int) 'b');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test52");
        boolean[] booleanArray5 = new boolean[] { true, false, true, true, false };
        char char6 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray5);
        // The following exception was thrown during execution in test generation
        try {
            char char8 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray5, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + 'b' + "'", char6 == 'b');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test53");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("hi!", (int) '0', (short) 100, (int) '0', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test54");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("", 10, (short) (byte) 1, 8, (int) '0');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test55");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('0');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        // The following exception was thrown during execution in test generation
        try {
            char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: src.length-srcPos<4: src.length=4, srcPos=100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test56");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test57");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('0');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test58");
        // The following exception was thrown during execution in test generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.intToHexDigitMsb0(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nibble value not between 0 and 15: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test59");
        short[] shortArray4 = new short[] { (short) 100, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray7 = org.apache.commons.lang3.Conversion.longToShortArray(1L, 100, shortArray4, (int) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nShorts-1)*16+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test60");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi!", (-1), (byte) 100, (int) (byte) -1, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test61");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 0, (int) '1', "", (int) (short) 1, (int) '0');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test62");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('0');
        // The following exception was thrown during execution in test generation
        try {
            char char3 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test63");
        int int1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToInt('8');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test64");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex(100, (int) (short) 1, "hi!", (int) 'a', 5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 97");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test65");
        int int1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToInt('0');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test66");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("", (int) (short) 1, (short) (byte) 1, 2, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test67");
        boolean[] booleanArray6 = new boolean[] { false, false, false, true, false, true };
        char char7 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray6);
        // The following exception was thrown during execution in test generation
        try {
            char char9 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray6, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: src.length-srcPos<4: src.length=6, srcPos=100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '1' + "'", char7 == '1');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test68");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) 100, 2, "hi!", 0, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test69");
        int int1 = org.apache.commons.lang3.Conversion.hexDigitToInt('b');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11 + "'", int1 == 11);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test70");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 100 };
        byte[] byteArray7 = org.apache.commons.lang3.Conversion.intToByteArray((int) (byte) 10, (int) '0', byteArray4, (int) (short) -1, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test71");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('1');
        char char2 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '8' + "'", char2 == '8');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test72");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) (short) 0, (int) '0', "", 11, (int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test73");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToInt(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot interpret ' ' as a hexadecimal digit");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test74");
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot interpret '#' as a hexadecimal digit");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test75");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('0');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        short short7 = org.apache.commons.lang3.Conversion.binaryToShort(booleanArray1, 1, (short) 1, (int) (short) 1, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test76");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) -1, 10, "hi!", (int) 'b', (int) 'b');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test77");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('0');
        long long6 = org.apache.commons.lang3.Conversion.binaryToLong(booleanArray1, (int) (short) 0, (long) (short) 0, (int) '0', 1);
        char char7 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '0' + "'", char7 == '0');
    }
}

