
package Conversion;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Conversion1 {

    public static boolean debug = false;

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0501");
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("", 13, (long) 5, (int) 'd', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0502");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi00000", (int) ' ', (byte) 10, 2, (int) '8');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0503");
        java.util.UUID uUID0 = null;
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte[] byteArray5 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray2, 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.UUID uUID7 = org.apache.commons.lang3.Conversion.byteArrayToUuid(byteArray2, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Need at least 16 bytes for UUID");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0504");
        boolean[] booleanArray6 = new boolean[] { false, true, false, true, false, false };
        char char7 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray6);
        // The following exception was thrown during execution in test generation
        try {
            char char9 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray6, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + 'a' + "'", char7 == 'a');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0505");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.intToBinary((int) (byte) 10, 0, booleanArray3, (int) '#', (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            char char8 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: src.length-srcPos<4: src.length=4, srcPos=10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0506");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('d');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.longToBinary((long) '2', (int) (byte) -1, booleanArray3, (int) '#', (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            char char8 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray6, 49);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0507");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("", (int) (byte) 100, (byte) 10, (int) '#', 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0508");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('5');
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.apache.commons.lang3.Conversion.binaryToInt(booleanArray1, (int) (short) -1, (int) (short) 0, 100, (int) (short) 100);
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
            System.out.format("%n%s%n", "Conversion1.test0509");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('8');
        char char3 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1, (int) (byte) 0);
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        byte byte9 = org.apache.commons.lang3.Conversion.binaryToByte(booleanArray1, (int) (short) 0, (byte) 100, (int) 'a', (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '8' + "'", char3 == '8');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '1' + "'", char4 == '1');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0510");
        byte[] byteArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray5 = org.apache.commons.lang3.Conversion.shortToByteArray((short) (byte) 1, (int) (byte) 1, byteArray2, 11, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0511");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0512");
        java.util.UUID uUID0 = null;
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) -1, (byte) 1 };
        byte[] byteArray7 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray4, 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.UUID uUID9 = org.apache.commons.lang3.Conversion.byteArrayToUuid(byteArray7, (int) '1');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Need at least 16 bytes for UUID");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0513");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi00000", (int) (byte) -1, (byte) 0, (int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0514");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.intToBinary((int) (byte) 10, 0, booleanArray3, (int) '#', (int) (short) 0);
        char char7 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
        char char8 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        java.lang.Class<?> wildcardClass9 = booleanArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + 'a' + "'", char7 == 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + 'a' + "'", char8 == 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0515");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            int int7 = org.apache.commons.lang3.Conversion.byteArrayToInt(byteArray2, 49, (int) (byte) 1, (int) (short) 1, (int) 'b');
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
            System.out.format("%n%s%n", "Conversion1.test0516");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('5');
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
        char char5 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3);
        boolean[] booleanArray8 = org.apache.commons.lang3.Conversion.intToBinary((int) (byte) -1, (int) (byte) 10, booleanArray3, (int) '4', 0);
        char char9 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + 'a' + "'", char4 == 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '5' + "'", char5 == '5');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + 'a' + "'", char9 == 'a');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0517");
        java.util.UUID uUID0 = null;
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) -1, (byte) 1 };
        byte[] byteArray7 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray4, 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.UUID uUID9 = org.apache.commons.lang3.Conversion.byteArrayToUuid(byteArray4, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Need at least 16 bytes for UUID");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0518");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            short short9 = org.apache.commons.lang3.Conversion.byteArrayToShort(byteArray4, 11, (short) 0, (int) 'a', (int) 'b');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nBytes-1)*8+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0519");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi!", (int) (byte) 1, (byte) 1, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0520");
        java.util.UUID uUID0 = null;
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) -1, (byte) 1 };
        byte[] byteArray7 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray4, 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.UUID uUID9 = org.apache.commons.lang3.Conversion.byteArrayToUuid(byteArray4, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Need at least 16 bytes for UUID");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0521");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 100, 2, "0", 2, (int) '2');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0522");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("0", (int) (short) 1, (byte) -1, 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0523");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 100, (int) (byte) 100, "hi!", (int) (byte) 0, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0524");
        // The following exception was thrown during execution in test generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.intToHexDigit((int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nibble value not between 0 and 15: 53");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0525");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('0');
        short short6 = org.apache.commons.lang3.Conversion.binaryToShort(booleanArray1, 0, (short) -1, 13, (-1));
        // The following exception was thrown during execution in test generation
        try {
            char char8 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1, (int) 'b');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: src.length-srcPos<4: src.length=4, srcPos=98");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -1 + "'", short6 == (short) -1);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0526");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 100, 0, "hi00000", 11, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0527");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('b');
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.apache.commons.lang3.Conversion.binaryToInt(booleanArray1, (int) 'b', (int) '8', (int) (short) 0, (int) 'd');
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
            System.out.format("%n%s%n", "Conversion1.test0528");
        char char1 = org.apache.commons.lang3.Conversion.intToHexDigitMsb0(2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '4' + "'", char1 == '4');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0529");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('4');
        // The following exception was thrown during execution in test generation
        try {
            short short6 = org.apache.commons.lang3.Conversion.binaryToShort(booleanArray1, (int) (byte) 100, (short) (byte) 0, 5, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0530");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("", 4, (short) (byte) -1, 5, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0531");
        char char1 = org.apache.commons.lang3.Conversion.intToHexDigitMsb0(5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'a' + "'", char1 == 'a');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0532");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('8');
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray7 = org.apache.commons.lang3.Conversion.longToBinary((long) 49, (int) 'd', booleanArray3, 2, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '1' + "'", char4 == '1');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0533");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('b');
        // The following exception was thrown during execution in test generation
        try {
            char char3 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1, (int) 'b');
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
            System.out.format("%n%s%n", "Conversion1.test0534");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.UUID uUID4 = org.apache.commons.lang3.Conversion.byteArrayToUuid(byteArray2, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Need at least 16 bytes for UUID");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0535");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.binaryToShort(booleanArray0, (int) (byte) -1, (short) 100, 11, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0536");
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("hi!", 10, (int) '#', (int) (short) 10, (int) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0537");
        boolean[] booleanArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray5 = org.apache.commons.lang3.Conversion.byteToBinary((byte) 1, (int) (byte) 1, booleanArray2, (int) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0538");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) '8', 1, "f", 49, 49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0539");
        boolean[] booleanArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray5 = org.apache.commons.lang3.Conversion.byteToBinary((byte) -1, (-1), booleanArray2, (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0540");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("f", 49, (short) (byte) 1, (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0541");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('0');
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.longToBinary((long) '4', (-1), booleanArray3, (int) 'b', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0542");
        short short5 = org.apache.commons.lang3.Conversion.hexToShort("hi00000", (int) '4', (short) (byte) 0, (int) 'b', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0543");
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("hi!", 0, 2, (int) '5', (int) '8');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0544");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 10, (int) '5', "hi!", (int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0545");
        byte[] byteArray0 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.byteArrayToShort(byteArray0, 4, (short) 1, (int) (byte) -1, 100);
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
            System.out.format("%n%s%n", "Conversion1.test0546");
        boolean[] booleanArray0 = new boolean[] {};
        long long5 = org.apache.commons.lang3.Conversion.binaryToLong(booleanArray0, 0, 0L, 0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            char char7 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot convert an empty array.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0547");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('5');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        char char3 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        // The following exception was thrown during execution in test generation
        try {
            char char5 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'a' + "'", char2 == 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'a' + "'", char3 == 'a');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0548");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 1, (int) (short) 100, "hi00000", (int) (short) -1, (int) '0');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0549");
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("", (int) ' ', (long) ' ', (int) (byte) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 32");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0550");
        java.util.UUID uUID0 = null;
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) -1, (byte) 1 };
        byte[] byteArray7 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray4, 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.UUID uUID9 = org.apache.commons.lang3.Conversion.byteArrayToUuid(byteArray7, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Need at least 16 bytes for UUID");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0551");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.longToBinary((long) (-1), (int) '5', booleanArray3, (int) '8', 0);
        char char7 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray6);
        // The following exception was thrown during execution in test generation
        try {
            char char9 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray6, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: src.length-srcPos<4: src.length=4, srcPos=1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '5' + "'", char7 == '5');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0552");
        // The following exception was thrown during execution in test generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.intToHexDigitMsb0(49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nibble value not between 0 and 15: 49");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0553");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("", (int) (short) 10, (short) 1, (int) '1', (int) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0554");
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("", (int) (short) 100, (int) (short) 100, (int) (byte) 1, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0555");
        long long5 = org.apache.commons.lang3.Conversion.hexToLong("", (int) '#', (long) 'd', (int) '#', (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0556");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 100, (int) 'b', "hi00000", 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0557");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi00000", (int) (byte) -1, (byte) 100, 4, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0558");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 1, 0, "f", (int) '2', (int) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0559");
        java.util.UUID uUID0 = null;
        java.util.UUID uUID1 = null;
        byte[] byteArray3 = new byte[] { (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID1, byteArray3, 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray3, 13, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0560");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 1, (int) (short) 0, "0", (int) ' ', 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0561");
        short[] shortArray6 = new short[] { (byte) 0, (byte) 0, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray9 = org.apache.commons.lang3.Conversion.longToShortArray(10L, (int) '2', shortArray6, (int) 'a', 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nShorts-1)*16+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray6);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0562");
        char char1 = org.apache.commons.lang3.Conversion.intToHexDigit(5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '5' + "'", char1 == '5');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0563");
        // The following exception was thrown during execution in test generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.intToHexDigitMsb0((int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nibble value not between 0 and 15: 53");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0564");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('8');
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.apache.commons.lang3.Conversion.binaryToInt(booleanArray1, (int) '4', (int) (short) 10, (int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0565");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('8');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        char char3 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '1' + "'", char2 == '1');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '1' + "'", char3 == '1');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '8' + "'", char4 == '8');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0566");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("", (int) '1', (short) (byte) -1, 4, 49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0567");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.intToBinary((int) (byte) 10, 0, booleanArray3, (int) '#', (int) (short) 0);
        char char7 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray6);
        char char8 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + 'a' + "'", char7 == 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '5' + "'", char8 == '5');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0568");
        boolean[] booleanArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray5 = org.apache.commons.lang3.Conversion.byteToBinary((byte) 100, (int) (short) 0, booleanArray2, (int) '#', (int) '8');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0569");
        int[] intArray3 = new int[] { '0' };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray6 = org.apache.commons.lang3.Conversion.longToIntArray(0L, (int) (byte) 1, intArray3, (int) (byte) 1, (int) (byte) 100);
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
            System.out.format("%n%s%n", "Conversion1.test0570");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("hi00000", (-1), (short) 100, 13, (int) '1');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0571");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0572");
        char char1 = org.apache.commons.lang3.Conversion.intToHexDigit(8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '8' + "'", char1 == '8');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0573");
        byte[] byteArray0 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.util.UUID uUID2 = org.apache.commons.lang3.Conversion.byteArrayToUuid(byteArray0, (int) (short) 0);
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
            System.out.format("%n%s%n", "Conversion1.test0574");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 100, (int) (byte) 100, "hi!", (int) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0575");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("0", (int) '8', (byte) 100, (int) '#', (int) '0');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0576");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.intToBinary((int) (byte) 10, 0, booleanArray3, (int) '#', (int) (short) 0);
        char char7 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray6);
        // The following exception was thrown during execution in test generation
        try {
            char char9 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray6, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '5' + "'", char7 == '5');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0577");
        byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi!", 13, (byte) 1, (-1), (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0578");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("0", (int) 'a', (byte) 100, 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0579");
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("0", 13, (long) (short) -1, 49, (int) '2');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0580");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('1');
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.longToBinary((long) (short) -1, (int) 'b', booleanArray3, (-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0581");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('8');
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.longToBinary(4L, 0, booleanArray3, 1, (int) '1');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0582");
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("", (int) (short) -1, 0, 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0583");
        boolean[] booleanArray2 = new boolean[] { true, true };
        // The following exception was thrown during execution in test generation
        try {
            char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray2, (int) '2');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: src.length-srcPos<4: src.length=2, srcPos=50");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray2);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0584");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("0", 0, (short) 10, 100, (int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0585");
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("hi!", (int) (short) -1, 8, (int) '#', (int) '2');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0586");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("f", (int) '1', (short) 100, (int) 'd', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0587");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.binaryToLong(booleanArray0, (int) '0', (long) (byte) 0, (int) 'b', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0588");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((-1), (int) 'a', "0", 4, (int) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0589");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) 'b', 8, "", 0, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0000000000" + "'", str5.equals("0000000000"));
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0590");
        byte[] byteArray2 = null;
        byte[] byteArray5 = org.apache.commons.lang3.Conversion.intToByteArray((int) ' ', (int) ' ', byteArray2, (int) '1', (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(byteArray5);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0591");
        java.util.UUID uUID0 = null;
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray4 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray1, (int) '4', 13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0592");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) 'b', 0, "", (int) ' ', (int) 'b');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0593");
        short short5 = org.apache.commons.lang3.Conversion.hexToShort("", (int) ' ', (short) 0, (int) 'b', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0594");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('0');
        // The following exception was thrown during execution in test generation
        try {
            char char3 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0595");
        // The following exception was thrown during execution in test generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.intToHexDigitMsb0((int) '0');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nibble value not between 0 and 15: 48");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0596");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("f", 0, (short) (byte) 1, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0597");
        java.util.UUID uUID0 = null;
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray6 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray3, (int) '#', 11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0598");
        short[] shortArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.shortArrayToLong(shortArray0, (int) (short) 0, (long) (short) -1, 13, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0599");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('5');
        // The following exception was thrown during execution in test generation
        try {
            short short6 = org.apache.commons.lang3.Conversion.binaryToShort(booleanArray1, (int) '5', (short) (byte) 0, (int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0600");
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("0000000000", (int) '5', 0, 1, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 53");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0601");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('5');
        // The following exception was thrown during execution in test generation
        try {
            short short6 = org.apache.commons.lang3.Conversion.binaryToShort(booleanArray1, (int) 'a', (short) (byte) 0, (int) '5', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0602");
        int int5 = org.apache.commons.lang3.Conversion.hexToInt("hi00000", 0, 8, 0, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0603");
        int[] intArray1 = new int[] { (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            long long6 = org.apache.commons.lang3.Conversion.intArrayToLong(intArray1, (int) '4', (long) (short) -1, 13, (int) 'b');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nInts-1)*32+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray1);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0604");
        char char1 = org.apache.commons.lang3.Conversion.intToHexDigit((int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '1' + "'", char1 == '1');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0605");
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("hi00000", (int) (short) 1, (long) (short) 100, (-1), 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot interpret 'i' as a hexadecimal digit");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0606");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.byteArrayToLong(byteArray0, (int) ' ', (long) 'd', 5, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0607");
        java.util.UUID uUID0 = null;
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) -1, (byte) 1 };
        byte[] byteArray7 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray4, 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.UUID uUID9 = org.apache.commons.lang3.Conversion.byteArrayToUuid(byteArray4, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Need at least 16 bytes for UUID");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0608");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) 1, (int) (short) 100, "0000000000", (int) '2', 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0609");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.UUID uUID5 = org.apache.commons.lang3.Conversion.byteArrayToUuid(byteArray3, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Need at least 16 bytes for UUID");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0610");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi!", 2, (byte) -1, (int) '4', (int) '2');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0611");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) '4', (int) (short) 0, "f", 11, (int) '2');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0612");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.binaryToByte(booleanArray0, (int) ' ', (byte) 0, 11, (int) '8');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0613");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('d');
        char char2 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        // The following exception was thrown during execution in test generation
        try {
            byte byte7 = org.apache.commons.lang3.Conversion.binaryToByte(booleanArray1, (int) ' ', (byte) 10, (int) '4', 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'd' + "'", char2 == 'd');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0614");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('8');
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.byteToBinary((byte) 0, (int) ' ', booleanArray3, (int) '5', 49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0615");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) -1, (int) '1', "0000000000", 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0616");
        byte[] byteArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray5 = org.apache.commons.lang3.Conversion.longToByteArray((long) (byte) 1, (int) (short) 0, byteArray2, (int) 'a', (int) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nBytes-1)*8+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0617");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('5');
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray7 = org.apache.commons.lang3.Conversion.longToBinary((long) (-1), 8, booleanArray3, (int) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + 'a' + "'", char4 == 'a');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0618");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 1 };
        byte[] byteArray7 = org.apache.commons.lang3.Conversion.shortToByteArray((short) (byte) -1, 0, byteArray4, 4, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.UUID uUID9 = org.apache.commons.lang3.Conversion.byteArrayToUuid(byteArray7, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Need at least 16 bytes for UUID");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0619");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.longToBinary((long) 0, (int) '4', booleanArray3, (int) '5', 0);
        char char7 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        char char8 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3);
        char char9 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + 'a' + "'", char7 == 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '5' + "'", char8 == '5');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '5' + "'", char9 == '5');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0620");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('4');
        char char2 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        // The following exception was thrown during execution in test generation
        try {
            short short7 = org.apache.commons.lang3.Conversion.binaryToShort(booleanArray1, (int) '5', (short) 100, (-1), (int) '1');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '4' + "'", char2 == '4');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0621");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) -1, (-1), "0000000000", (int) 'b', 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0622");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('1');
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.shortToBinary((short) 100, (int) '5', booleanArray3, (int) (short) 1, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0623");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) (byte) 0, (int) 'b', "0", 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0624");
        byte[] byteArray0 = new byte[] {};
        short short5 = org.apache.commons.lang3.Conversion.byteArrayToShort(byteArray0, (int) (short) 0, (short) (byte) 100, (int) (short) 10, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.UUID uUID7 = org.apache.commons.lang3.Conversion.byteArrayToUuid(byteArray0, (int) '2');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Need at least 16 bytes for UUID");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 100 + "'", short5 == (short) 100);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0625");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) 100, 0, "hi00000", (int) (byte) 0, (int) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0626");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 1, (int) '2', "0000000000", (int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0627");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 100, (-1), "f", (int) '0', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 48");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0628");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('1');
        // The following exception was thrown during execution in test generation
        try {
            long long6 = org.apache.commons.lang3.Conversion.binaryToLong(booleanArray1, 13, (long) 'b', (int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0629");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.longToBinary((long) 0, (int) '4', booleanArray3, (int) '5', 0);
        // The following exception was thrown during execution in test generation
        try {
            char char8 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray6, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0630");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray7 = org.apache.commons.lang3.Conversion.byteToBinary((byte) 0, (-1), booleanArray3, (int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + 'a' + "'", char4 == 'a');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0631");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('d');
        // The following exception was thrown during execution in test generation
        try {
            char char3 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1, (int) '5');
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
            System.out.format("%n%s%n", "Conversion1.test0632");
        int int5 = org.apache.commons.lang3.Conversion.hexToInt("0000000000", (int) '5', (int) (byte) 0, (int) 'a', (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0633");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 10, 10, "f", 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0634");
        java.util.UUID uUID0 = null;
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) -1, (byte) 1 };
        byte[] byteArray7 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray4, 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.UUID uUID9 = org.apache.commons.lang3.Conversion.byteArrayToUuid(byteArray4, (int) '8');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Need at least 16 bytes for UUID");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0635");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.longToBinary((long) (-1), (int) '5', booleanArray3, (int) '8', 0);
        // The following exception was thrown during execution in test generation
        try {
            char char8 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray6, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0636");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("hi!", (int) '0', (short) 0, 5, (int) '1');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0637");
        java.util.UUID uUID0 = null;
        byte[] byteArray2 = new byte[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray5 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray2, (int) '8', 11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0638");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('5');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        char char3 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        // The following exception was thrown during execution in test generation
        try {
            byte byte8 = org.apache.commons.lang3.Conversion.binaryToByte(booleanArray1, (int) 'a', (byte) -1, (int) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'a' + "'", char2 == 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '5' + "'", char3 == '5');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0639");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('1');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.byteToBinary((byte) 0, 8, booleanArray3, 11, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            char char8 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray6, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: src.length-srcPos<4: src.length=4, srcPos=100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0640");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.intToBinary((int) (byte) 10, 0, booleanArray3, (int) '#', (int) (short) 0);
        char char8 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray6, 2);
        java.lang.Class<?> wildcardClass9 = booleanArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '2' + "'", char8 == '2');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0641");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) ' ', (int) '0', "hi!", (int) (byte) 0, (int) '8');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0642");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('a');
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.intToBinary(2, (int) (short) 0, booleanArray3, (int) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0643");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("hi!", (int) ' ', (short) 100, 13, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0644");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("", (int) (short) 100, (short) (byte) 10, 4, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0645");
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("", 100, (int) '4', (int) 'd', (int) 'b');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0646");
        boolean[] booleanArray3 = new boolean[] { true, false, false };
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        // The following exception was thrown during execution in test generation
        try {
            char char6 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '4' + "'", char4 == '4');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0647");
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("0000000000", 100, (int) (byte) 10, (int) '1', 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0648");
        int[] intArray1 = new int[] { '1' };
        // The following exception was thrown during execution in test generation
        try {
            long long6 = org.apache.commons.lang3.Conversion.intArrayToLong(intArray1, 2, (long) 100, 5, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nInts-1)*32+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray1);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0649");
        java.util.UUID uUID0 = null;
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte[] byteArray5 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray2, 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.UUID uUID7 = org.apache.commons.lang3.Conversion.byteArrayToUuid(byteArray5, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Need at least 16 bytes for UUID");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0650");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('0');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = org.apache.commons.lang3.Conversion.binaryToInt(booleanArray1, (int) '4', (int) (byte) -1, (int) '5', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+dstPos is greather or equal to than 32");
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
            System.out.format("%n%s%n", "Conversion1.test0651");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('4');
        char char2 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        // The following exception was thrown during execution in test generation
        try {
            char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '4' + "'", char2 == '4');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0652");
        java.util.UUID uUID0 = null;
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) -1, (byte) 1 };
        byte[] byteArray7 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray4, 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.UUID uUID9 = org.apache.commons.lang3.Conversion.byteArrayToUuid(byteArray4, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Need at least 16 bytes for UUID");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0653");
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("0", (int) (short) 10, 49, (int) (short) 100, (int) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0654");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) 10, (int) ' ', "f", 49, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0655");
        char char1 = org.apache.commons.lang3.Conversion.intToHexDigitMsb0(10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '5' + "'", char1 == '5');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0656");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('5');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        char char3 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        // The following exception was thrown during execution in test generation
        try {
            short short8 = org.apache.commons.lang3.Conversion.binaryToShort(booleanArray1, (int) ' ', (short) 100, (int) '0', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'a' + "'", char2 == 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '5' + "'", char3 == '5');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0657");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("", 0, (byte) 0, 8, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0658");
        // The following exception was thrown during execution in test generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.intToHexDigit((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nibble value not between 0 and 15: 35");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0659");
        int int5 = org.apache.commons.lang3.Conversion.hexToInt("f", (int) 'a', (int) '#', 100, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0660");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex(11L, 4, "hi!", 8, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0661");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 100, (int) (short) 10, "hi!", (int) (short) 0, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0662");
        java.util.UUID uUID0 = null;
        byte[] byteArray1 = new byte[] {};
        short short6 = org.apache.commons.lang3.Conversion.byteArrayToShort(byteArray1, (int) (short) 0, (short) (byte) 100, (int) (short) 10, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray1, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0663");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('4');
        char char2 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        // The following exception was thrown during execution in test generation
        try {
            char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '4' + "'", char2 == '4');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0664");
        java.util.UUID uUID0 = null;
        byte[] byteArray1 = new byte[] {};
        short short6 = org.apache.commons.lang3.Conversion.byteArrayToShort(byteArray1, (int) (short) 0, (short) (byte) 100, (int) (short) 10, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray1, (int) '0', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBytes is greather than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0665");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('1');
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.intToBinary(35, 0, booleanArray3, 0, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0666");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("0", (int) (short) 1, (byte) 10, (int) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0667");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.intToBinary((int) (byte) 10, 0, booleanArray3, (int) '#', (int) (short) 0);
        char char7 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray6);
        java.lang.Class<?> wildcardClass8 = booleanArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '5' + "'", char7 == '5');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0668");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 1, (int) '1', "hi00000", 1, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi00000" + "'", str5.equals("hi00000"));
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0669");
        byte[] byteArray2 = null;
        byte[] byteArray5 = org.apache.commons.lang3.Conversion.intToByteArray((-1), 2, byteArray2, 10, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(byteArray5);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0670");
        byte[] byteArray0 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.util.UUID uUID2 = org.apache.commons.lang3.Conversion.byteArrayToUuid(byteArray0, (int) (byte) 0);
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
            System.out.format("%n%s%n", "Conversion1.test0671");
        short short5 = org.apache.commons.lang3.Conversion.hexToShort("", 49, (short) -1, (int) (short) 1, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0672");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('5');
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.byteToBinary((byte) 10, (int) 'b', booleanArray3, (int) (short) 1, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0673");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('4');
        char char2 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        // The following exception was thrown during execution in test generation
        try {
            char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '4' + "'", char2 == '4');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0674");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.UUID uUID2 = org.apache.commons.lang3.Conversion.byteArrayToUuid(byteArray0, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0675");
        char char1 = org.apache.commons.lang3.Conversion.intToHexDigit(4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '4' + "'", char1 == '4');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0676");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("f", 8, (byte) 10, (int) '2', (int) '8');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0677");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('4');
        // The following exception was thrown during execution in test generation
        try {
            char char3 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1, (int) '1');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 49");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0678");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('1');
        // The following exception was thrown during execution in test generation
        try {
            long long6 = org.apache.commons.lang3.Conversion.binaryToLong(booleanArray1, 10, (long) '1', (int) (byte) 1, (int) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0679");
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("f", (int) 'd', (long) 13, (int) '0', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0680");
        // The following exception was thrown during execution in test generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.intToHexDigit((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nibble value not between 0 and 15: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0681");
        boolean[] booleanArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray5 = org.apache.commons.lang3.Conversion.longToBinary((long) (byte) 100, 49, booleanArray2, 35, (int) '0');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0682");
        java.util.UUID uUID0 = null;
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte[] byteArray5 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray2, 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.UUID uUID7 = org.apache.commons.lang3.Conversion.byteArrayToUuid(byteArray2, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Need at least 16 bytes for UUID");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0683");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('5');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        char char3 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        // The following exception was thrown during execution in test generation
        try {
            char char5 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'a' + "'", char2 == 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '5' + "'", char3 == '5');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0684");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.intToBinary((int) (byte) 10, 0, booleanArray3, (int) '#', (int) (short) 0);
        char char7 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray6);
        // The following exception was thrown during execution in test generation
        try {
            char char9 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray6, (int) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: src.length-srcPos<4: src.length=4, srcPos=100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + 'a' + "'", char7 == 'a');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0685");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('2');
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.shortToBinary((short) 0, (int) '2', booleanArray3, (int) (short) 1, (int) '8');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0686");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('d');
        char char2 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        // The following exception was thrown during execution in test generation
        try {
            short short7 = org.apache.commons.lang3.Conversion.binaryToShort(booleanArray1, 0, (short) 100, (int) '0', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'd' + "'", char2 == 'd');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0687");
        boolean[] booleanArray3 = new boolean[] { true, false, false };
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        char char6 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            char char7 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: src.length-srcPos<4: src.length=3, srcPos=0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '4' + "'", char4 == '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '1' + "'", char6 == '1');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0688");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.intToBinary((int) (byte) 10, 0, booleanArray3, (int) '#', (int) (short) 0);
        char char7 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
        char char8 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
        char char9 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + 'a' + "'", char7 == 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + 'a' + "'", char8 == 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + 'a' + "'", char9 == 'a');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0689");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) (-1), (int) (byte) 1, "0000000000", (int) '1', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0690");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('0');
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray7 = org.apache.commons.lang3.Conversion.byteToBinary((byte) 100, (int) (short) 0, booleanArray3, (int) '#', 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '0' + "'", char4 == '0');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0691");
        java.util.UUID uUID0 = null;
        java.util.UUID uUID1 = null;
        byte[] byteArray3 = new byte[] { (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID1, byteArray3, 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray3, (int) 'b', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0692");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('4');
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.byteToBinary((byte) 10, (int) '#', booleanArray3, (int) '1', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0693");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('8');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        char char3 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        char char5 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            char char7 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: src.length-srcPos<4: src.length=4, srcPos=1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '1' + "'", char2 == '1');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '1' + "'", char3 == '1');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '8' + "'", char5 == '8');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0694");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.intArrayToLong(intArray0, (int) 'a', (long) 0, 8, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0695");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('1');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.longToBinary((long) (-1), 4, booleanArray3, (int) (byte) 0, 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0696");
        // The following exception was thrown during execution in test generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.intToHexDigitMsb0((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nibble value not between 0 and 15: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0697");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) 100, 8, "hi00000", 5, 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi00000" + "'", str5.equals("hi00000"));
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0698");
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("hi!", 49, 0L, (int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0699");
        short[] shortArray4 = new short[] { (short) 10, (byte) 10, (short) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.lang3.Conversion.shortArrayToInt(shortArray4, (-1), (int) 'd', (int) '0', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nShorts-1)*16+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0700");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = org.apache.commons.lang3.Conversion.shortToByteArray((short) -1, 13, byteArray6, 35, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nBytes-1)*8+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0701");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) -1, (int) 'a', "0000000000", (int) '1', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0702");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('4');
        // The following exception was thrown during execution in test generation
        try {
            char char3 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0703");
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("f", 0, (int) '1', 0, (int) '1');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0704");
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("0000000000", 49, (int) '4', (int) 'b', 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0705");
        java.util.UUID uUID0 = null;
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray6, (int) 'a', (int) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBytes is greather than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0706");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.longToBinary((long) (-1), (int) '5', booleanArray3, (int) '8', 0);
        char char7 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3);
        char char8 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + 'a' + "'", char7 == 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '5' + "'", char8 == '5');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0707");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("f", (int) '4', (byte) 10, (int) 'a', 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0708");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('0');
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray7 = org.apache.commons.lang3.Conversion.byteToBinary((byte) 100, (int) (byte) 1, booleanArray3, 10, (int) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '0' + "'", char4 == '0');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0709");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('8');
        char char5 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3, (int) (byte) 0);
        boolean[] booleanArray8 = org.apache.commons.lang3.Conversion.shortToBinary((short) (byte) -1, (int) (short) 0, booleanArray3, 8, 0);
        char char9 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '8' + "'", char5 == '8');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '8' + "'", char9 == '8');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0710");
        java.util.UUID uUID0 = null;
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) -1, (byte) 1 };
        byte[] byteArray7 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray4, 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.UUID uUID9 = org.apache.commons.lang3.Conversion.byteArrayToUuid(byteArray4, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Need at least 16 bytes for UUID");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0711");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) 8, 2, "hi!", 5, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0712");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('0');
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.apache.commons.lang3.Conversion.binaryToInt(booleanArray1, (int) (byte) 10, 5, 0, (int) (byte) 100);
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
            System.out.format("%n%s%n", "Conversion1.test0713");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) 4, (int) (short) 100, "0000000000", (int) (short) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0714");
        int[] intArray0 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.intArrayToLong(intArray0, (int) (byte) 1, 35L, (int) '#', (int) 'b');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nInts-1)*32+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0715");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            char char2 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0716");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('d');
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray7 = org.apache.commons.lang3.Conversion.byteToBinary((byte) 10, (int) (short) 10, booleanArray3, (int) '4', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + 'd' + "'", char4 == 'd');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0717");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) 10, (int) ' ', "f", (int) '#', 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0718");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('8');
        char char3 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1, (int) (byte) 0);
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        // The following exception was thrown during execution in test generation
        try {
            short short9 = org.apache.commons.lang3.Conversion.binaryToShort(booleanArray1, 4, (short) (byte) 0, 100, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '8' + "'", char3 == '8');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '1' + "'", char4 == '1');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0719");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 0, (int) '5', "0000000000", (-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0720");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 100, 10, "hi!", 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0721");
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("0000000000", (int) (byte) 100, (long) (short) 0, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0722");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('2');
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray7 = org.apache.commons.lang3.Conversion.intToBinary((int) (short) 100, (int) (byte) 100, booleanArray3, 8, (int) '0');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '4' + "'", char4 == '4');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0723");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        char char3 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        // The following exception was thrown during execution in test generation
        try {
            char char5 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'a' + "'", char2 == 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'a' + "'", char3 == 'a');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0724");
        java.util.UUID uUID0 = null;
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte[] byteArray5 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray2, 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.UUID uUID7 = org.apache.commons.lang3.Conversion.byteArrayToUuid(byteArray2, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Need at least 16 bytes for UUID");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0725");
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("f", (int) (byte) 100, (long) 35, (int) (byte) 0, (int) 'b');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0726");
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("0", (int) (byte) -1, 10L, 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0727");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi00000", (int) (byte) -1, (byte) 1, 8, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0728");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            char char2 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0729");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('1');
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray7 = org.apache.commons.lang3.Conversion.shortToBinary((short) 10, 0, booleanArray3, (int) (byte) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '8' + "'", char4 == '8');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0730");
        int[] intArray0 = new int[] {};
        long long5 = org.apache.commons.lang3.Conversion.intArrayToLong(intArray0, (int) '5', (long) (short) -1, (int) (short) 1, (int) (short) 0);
        java.lang.Class<?> wildcardClass6 = intArray0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0731");
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("f", (int) '1', 35, (int) (byte) 100, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0732");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.intToBinary((int) (byte) 10, 0, booleanArray3, (int) '#', (int) (short) 0);
        char char7 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
        char char8 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
        char char9 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + 'a' + "'", char7 == 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + 'a' + "'", char8 == 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '5' + "'", char9 == '5');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0733");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) 'b', (int) (short) 1, "0000000000", (int) '2', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0734");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) -1, 11, "f", (int) (short) 100, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0735");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) '2', 0, "f", (int) ' ', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0736");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('2');
        // The following exception was thrown during execution in test generation
        try {
            char char3 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1, (int) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0737");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) 'b', (int) (short) 0, "f", 8, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0738");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex(1, 1, "hi!", (int) (byte) 100, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0739");
        boolean[] booleanArray2 = null;
        boolean[] booleanArray5 = org.apache.commons.lang3.Conversion.byteToBinary((byte) 0, (int) (short) 0, booleanArray2, (int) ' ', (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booleanArray5);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0740");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 100, (int) '5', "", (int) '2', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0741");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('5');
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
        char char5 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray8 = org.apache.commons.lang3.Conversion.longToBinary((long) '0', (int) '1', booleanArray3, 8, (int) '0');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + 'a' + "'", char4 == 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '5' + "'", char5 == '5');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0742");
        short[] shortArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray5 = org.apache.commons.lang3.Conversion.longToShortArray((long) '2', (int) (short) 100, shortArray2, (int) '5', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nShorts-1)*16+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0743");
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("hi!", (int) (short) 100, (int) (short) -1, (int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0744");
        short[] shortArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray5 = org.apache.commons.lang3.Conversion.longToShortArray((long) 10, 100, shortArray2, (int) (byte) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nShorts-1)*16+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0745");
        // The following exception was thrown during execution in test generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.intToHexDigitMsb0((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nibble value not between 0 and 15: 97");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0746");
        byte[] byteArray0 = new byte[] {};
        short short5 = org.apache.commons.lang3.Conversion.byteArrayToShort(byteArray0, (int) (short) 0, (short) (byte) 100, (int) (short) 10, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.UUID uUID7 = org.apache.commons.lang3.Conversion.byteArrayToUuid(byteArray0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Need at least 16 bytes for UUID");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 100 + "'", short5 == (short) 100);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0747");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('8');
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray7 = org.apache.commons.lang3.Conversion.byteToBinary((byte) -1, (int) '8', booleanArray3, 0, 49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '1' + "'", char4 == '1');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0748");
        short[] shortArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray5 = org.apache.commons.lang3.Conversion.intToShortArray((int) '#', (int) 'b', shortArray2, (int) (byte) -1, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nShorts-1)*16+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0749");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) -1, 100, "hi00000", (int) (byte) 0, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi00000" + "'", str5.equals("hi00000"));
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0750");
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("0", (int) '2', (-1L), (int) '1', 2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 50");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0751");
        boolean[] booleanArray2 = null;
        boolean[] booleanArray5 = org.apache.commons.lang3.Conversion.longToBinary((long) 11, (int) '8', booleanArray2, (-1), 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booleanArray5);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0752");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) -1, (int) (short) -1, "", (int) '#', (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0753");
        short short5 = org.apache.commons.lang3.Conversion.hexToShort("0000000000", (int) (short) 1, (short) -1, (int) (byte) 0, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0754");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('1');
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
        boolean[] booleanArray7 = org.apache.commons.lang3.Conversion.longToBinary((long) (-1), 8, booleanArray3, (int) (short) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            char char9 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '8' + "'", char4 == '8');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray7);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0755");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex(0L, 2, "", 5, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0756");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 1, (int) 'b', "0", (int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0757");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 0, 2, "", (int) (byte) 100, (int) '2');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0758");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0759");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('8');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        // The following exception was thrown during execution in test generation
        try {
            char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '1' + "'", char2 == '1');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0760");
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("hi!", 1, (long) 'b', (int) (byte) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0761");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('8');
        // The following exception was thrown during execution in test generation
        try {
            char char3 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: src.length-srcPos<4: src.length=4, srcPos=1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0762");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("0", (int) (byte) 1, (short) (byte) 10, (int) '2', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0763");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) (byte) 0, 1, "", (int) 'd', (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0764");
        int[] intArray5 = new int[] { (byte) 10, 'd', (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = org.apache.commons.lang3.Conversion.longToIntArray((long) (byte) 10, (int) 'a', intArray5, (int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nInts-1)*32+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0765");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('2');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        char char3 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '4' + "'", char2 == '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '4' + "'", char3 == '4');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0766");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 1, 8, "", 13, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0767");
        int int1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToInt('0');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0768");
        boolean[] booleanArray5 = new boolean[] { true, true, false, true, true };
        char char7 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray5, (int) (short) 0);
        char char8 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray5);
        char char9 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + 'b' + "'", char7 == 'b');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + 'd' + "'", char8 == 'd');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + 'b' + "'", char9 == 'b');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0769");
        java.util.UUID uUID0 = null;
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte[] byteArray5 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray2, 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.UUID uUID7 = org.apache.commons.lang3.Conversion.byteArrayToUuid(byteArray2, 49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Need at least 16 bytes for UUID");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0770");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('2');
        char char5 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3, (int) (byte) 0);
        boolean[] booleanArray8 = org.apache.commons.lang3.Conversion.longToBinary((long) '#', (int) ' ', booleanArray3, (int) 'd', (int) (byte) -1);
        java.lang.Class<?> wildcardClass9 = booleanArray8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '2' + "'", char5 == '2');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0771");
        byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("0000000000", 2, (byte) 100, (int) ' ', (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 100 + "'", byte5 == (byte) 100);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0772");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) -1, (int) '#', "hi!", (int) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0773");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('d');
        char char2 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        int int7 = org.apache.commons.lang3.Conversion.binaryToInt(booleanArray1, (int) (byte) 0, 100, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            char char9 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1, (int) 'b');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'd' + "'", char2 == 'd');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0774");
        // The following exception was thrown during execution in test generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.intToHexDigit(49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nibble value not between 0 and 15: 49");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0775");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('5');
        java.lang.Class<?> wildcardClass2 = booleanArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0776");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.binaryToByte(booleanArray0, (int) (byte) 10, (byte) 1, (int) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0777");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("0000000000", 5, (short) 10, 8, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0778");
        java.util.UUID uUID0 = null;
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte[] byteArray5 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray2, 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.UUID uUID7 = org.apache.commons.lang3.Conversion.byteArrayToUuid(byteArray5, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Need at least 16 bytes for UUID");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0779");
        java.util.UUID uUID0 = null;
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) -1, (byte) 1 };
        byte[] byteArray7 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray4, 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.UUID uUID9 = org.apache.commons.lang3.Conversion.byteArrayToUuid(byteArray4, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Need at least 16 bytes for UUID");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0780");
        long long5 = org.apache.commons.lang3.Conversion.hexToLong("0000000000", (int) (byte) 0, (long) 35, (int) '1', (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0781");
        int[] intArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray5 = org.apache.commons.lang3.Conversion.longToIntArray(11L, (int) '8', intArray2, (int) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nInts-1)*32+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0782");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 0, (int) '#', "", (int) ' ', 49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0783");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('5');
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray7 = org.apache.commons.lang3.Conversion.intToBinary((int) (byte) 0, 100, booleanArray3, 35, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + 'a' + "'", char4 == 'a');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0784");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("", (int) '5', (byte) -1, 8, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0785");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('2');
        char char5 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3, (int) (short) 1);
        char char6 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
        boolean[] booleanArray9 = org.apache.commons.lang3.Conversion.intToBinary(0, 10, booleanArray3, (int) ' ', (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '2' + "'", char5 == '2');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '4' + "'", char6 == '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray9);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0786");
        byte[] byteArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray5 = org.apache.commons.lang3.Conversion.shortToByteArray((short) 0, (int) (byte) 0, byteArray2, 5, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nBytes-1)*8+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0787");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex(0, 8, "", 49, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0788");
        byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("", 1, (byte) 10, (int) (short) -1, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0789");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        char char3 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        // The following exception was thrown during execution in test generation
        try {
            char char5 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'a' + "'", char2 == 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'a' + "'", char3 == 'a');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0790");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) 'a', 2, "hi00000", (int) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0791");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) 100, (int) (short) 1, "hi!", (int) (short) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0792");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('8');
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.apache.commons.lang3.Conversion.binaryToInt(booleanArray1, 100, 0, 8, (int) ' ');
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
            System.out.format("%n%s%n", "Conversion1.test0793");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('1');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.byteToBinary((byte) 0, 8, booleanArray3, 11, (int) (byte) -1);
        char char7 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3);
        java.lang.Class<?> wildcardClass8 = booleanArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '8' + "'", char7 == '8');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0794");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 0, 11, "", (int) '5', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0795");
        short[] shortArray2 = null;
        short[] shortArray5 = org.apache.commons.lang3.Conversion.longToShortArray(4L, (int) (short) 10, shortArray2, (int) (short) 100, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(shortArray5);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0796");
        int[] intArray2 = new int[] { '1', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            long long7 = org.apache.commons.lang3.Conversion.intArrayToLong(intArray2, (int) (byte) 100, 0L, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nInts-1)*32+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0797");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.byteArrayToInt(byteArray0, (int) (short) 1, (int) (byte) 10, 2, (int) 'b');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0798");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.longToBinary((long) ' ', (int) '2', booleanArray3, (int) (byte) -1, 0);
        char char7 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
        char char9 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '5' + "'", char7 == '5');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + 'a' + "'", char9 == 'a');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0799");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.binaryToInt(booleanArray0, 4, (int) (short) 1, (int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0800");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('8');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        char char3 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        char char5 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1, 0);
        char char7 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1, 0);
        char char8 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '1' + "'", char2 == '1');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '1' + "'", char3 == '1');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '8' + "'", char5 == '8');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '8' + "'", char7 == '8');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '1' + "'", char8 == '1');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0801");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('1');
        // The following exception was thrown during execution in test generation
        try {
            short short6 = org.apache.commons.lang3.Conversion.binaryToShort(booleanArray1, (int) '8', (short) (byte) 10, (-1), (int) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0802");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.byteArrayToShort(byteArray0, (int) (short) 10, (short) (byte) 100, 13, (int) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0803");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 1, 11, "0000000000", (int) (byte) 1, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0804");
        short short5 = org.apache.commons.lang3.Conversion.hexToShort("0", (int) (short) 1, (short) 10, (int) (short) 1, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0805");
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("0", (int) '0', (long) (short) 10, (int) (short) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 48");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0806");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.intToBinary((int) (byte) 10, 0, booleanArray3, (int) '#', (int) (short) 0);
        char char7 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray6);
        char char8 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + 'a' + "'", char7 == 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + 'a' + "'", char8 == 'a');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0807");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('b');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'b' + "'", char2 == 'b');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0808");
        int int5 = org.apache.commons.lang3.Conversion.hexToInt("0000000000", (int) (short) -1, (int) '8', 35, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 56 + "'", int5 == 56);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0809");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) -1, (int) (byte) -1, "0000000000", (-1), 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0810");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('8');
        char char3 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1, (int) (byte) 0);
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        char char6 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1, 2);
        // The following exception was thrown during execution in test generation
        try {
            char char8 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: src.length-srcPos<4: src.length=4, srcPos=5");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '8' + "'", char3 == '8');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '1' + "'", char4 == '1');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '0' + "'", char6 == '0');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0811");
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("hi00000", (int) '5', (int) ' ', (int) (byte) 1, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0812");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 100, 1, "f", 0, (int) '0');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0813");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) '5', 1, "", 10, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0814");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('5');
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
        boolean[] booleanArray7 = org.apache.commons.lang3.Conversion.byteToBinary((byte) 10, (int) '0', booleanArray3, (int) '2', (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            char char9 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray7, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: src.length-srcPos<4: src.length=4, srcPos=1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + 'a' + "'", char4 == 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray7);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0815");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("f", 100, (short) 100, 4, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0816");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((-1L), 0, "0000000000", (int) (byte) -1, 56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0817");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex(4, 0, "f", (int) '8', (int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0818");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) 49, (int) (short) 0, "", (int) '4', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0819");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) '5', (int) 'd', "0", (int) '4', 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0820");
        int[] intArray5 = new int[] { (byte) -1, 8, 0 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = org.apache.commons.lang3.Conversion.longToIntArray((long) '#', 10, intArray5, 100, (int) '8');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nInts-1)*32+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0821");
        long long5 = org.apache.commons.lang3.Conversion.hexToLong("f", (int) (byte) 1, (long) 11, 56, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 11L + "'", long5 == 11L);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0822");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        char char3 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        // The following exception was thrown during execution in test generation
        try {
            long long8 = org.apache.commons.lang3.Conversion.binaryToLong(booleanArray1, (int) 'b', 11L, 5, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 98");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'a' + "'", char2 == 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'a' + "'", char3 == 'a');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0823");
        short[] shortArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.shortArrayToLong(shortArray0, 10, (long) 0, (int) '5', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0824");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.longToBinary((long) ' ', (int) '2', booleanArray3, (int) (byte) -1, 0);
        char char8 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray6, (int) (byte) 1);
        java.lang.Class<?> wildcardClass9 = booleanArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '2' + "'", char8 == '2');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0825");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        // The following exception was thrown during execution in test generation
        try {
            char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: src.length-srcPos<4: src.length=4, srcPos=32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'a' + "'", char2 == 'a');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0826");
        byte[] byteArray0 = new byte[] {};
        short short5 = org.apache.commons.lang3.Conversion.byteArrayToShort(byteArray0, (int) (short) 0, (short) (byte) 100, (int) (short) 10, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.UUID uUID7 = org.apache.commons.lang3.Conversion.byteArrayToUuid(byteArray0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Need at least 16 bytes for UUID");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 100 + "'", short5 == (short) 100);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0827");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('4');
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray7 = org.apache.commons.lang3.Conversion.byteToBinary((byte) 1, 13, booleanArray3, (int) ' ', (int) '1');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '4' + "'", char4 == '4');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0828");
        java.util.UUID uUID0 = null;
        byte[] byteArray1 = new byte[] {};
        short short6 = org.apache.commons.lang3.Conversion.byteArrayToShort(byteArray1, (int) (short) 0, (short) (byte) 100, (int) (short) 10, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray1, 0, (int) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBytes is greather than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0829");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) 8, 56, "0000000000", (int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0830");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('8');
        char char2 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        char char3 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '1' + "'", char2 == '1');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '1' + "'", char3 == '1');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '1' + "'", char4 == '1');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0831");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('b');
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.byteToBinary((byte) 10, (int) '4', booleanArray3, 8, (int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0832");
        boolean[] booleanArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray5 = org.apache.commons.lang3.Conversion.byteToBinary((byte) 0, 11, booleanArray2, (int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0833");
        short short5 = org.apache.commons.lang3.Conversion.hexToShort("0", 1, (short) (byte) 0, (int) (byte) 0, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0834");
        byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("", (int) (short) 100, (byte) 0, 2, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0835");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi00000", (int) '#', (byte) 0, (int) 'a', 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0836");
        byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi00000", (-1), (byte) 1, 56, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0837");
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("0", 0, (long) (short) 100, 35, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0838");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        // The following exception was thrown during execution in test generation
        try {
            short short6 = org.apache.commons.lang3.Conversion.binaryToShort(booleanArray1, (int) '5', (short) 10, 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0839");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("hi!", 49, (short) 1, (int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0840");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('8');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        // The following exception was thrown during execution in test generation
        try {
            char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: src.length-srcPos<4: src.length=4, srcPos=5");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '1' + "'", char2 == '1');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0841");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) (short) 0, (int) (byte) 100, "", 5, 56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0842");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("", (int) (byte) 1, (short) (byte) 100, (int) 'd', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0843");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.longToBinary((long) 0, (int) '4', booleanArray3, (int) '5', 0);
        char char7 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3);
        java.lang.Class<?> wildcardClass8 = booleanArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '5' + "'", char7 == '5');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0844");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        char char3 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        // The following exception was thrown during execution in test generation
        try {
            short short8 = org.apache.commons.lang3.Conversion.binaryToShort(booleanArray1, (int) 'b', (short) (byte) 0, (int) '#', 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'a' + "'", char2 == 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'a' + "'", char3 == 'a');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0845");
        short short5 = org.apache.commons.lang3.Conversion.hexToShort("f", 2, (short) 10, (int) '2', (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0846");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("", 35, (byte) 0, (int) (byte) 10, 56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0847");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 1, 11, "", (int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0848");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.intArrayToLong(intArray0, (int) 'd', 1L, (int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0849");
        boolean[] booleanArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray5 = org.apache.commons.lang3.Conversion.shortToBinary((short) 10, 49, booleanArray2, 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0850");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) '2', (int) '0', "hi!", (int) '8', 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0851");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi!", (int) (byte) 100, (byte) -1, (int) '0', (int) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0852");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            char char2 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0853");
        short[] shortArray4 = new short[] { (short) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray7 = org.apache.commons.lang3.Conversion.intToShortArray(10, (int) (byte) 100, shortArray4, 0, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nShorts-1)*16+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0854");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('2');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        // The following exception was thrown during execution in test generation
        try {
            char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1, (int) 'b');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: src.length-srcPos<4: src.length=4, srcPos=98");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '4' + "'", char2 == '4');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0855");
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("0000000000", (int) '1', 53L, 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0856");
        int int5 = org.apache.commons.lang3.Conversion.hexToInt("", 0, (int) (byte) 1, 13, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0857");
        short[] shortArray5 = new short[] { (short) 100, (byte) 100, (short) 100 };
        short[] shortArray8 = org.apache.commons.lang3.Conversion.longToShortArray(11L, 13, shortArray5, (int) (short) 0, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray8);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0858");
        short[] shortArray2 = new short[] { (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            int int7 = org.apache.commons.lang3.Conversion.shortArrayToInt(shortArray2, 0, 11, (int) (short) 10, 10);
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
            System.out.format("%n%s%n", "Conversion1.test0859");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 1, (int) '0', "f", 5, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0860");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 10, (-1), "f", (int) (short) 0, (int) '2');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0861");
        byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("", (int) (short) 1, (byte) -1, (int) (byte) -1, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0862");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) 1, 4, "f", 1, (int) '2');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0863");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 0, (int) (byte) 1, "f", 56, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0864");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("", 13, (byte) 100, (int) (byte) 10, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0865");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 0, 0, "hi00000", (int) (byte) 1, 49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0866");
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("", (int) (byte) 10, 35, (int) (short) 0, (int) '0');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0867");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("f", (int) '2', (short) 10, 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0868");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("f", (int) (short) 0, (short) 0, 11, 56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0869");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('b');
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
            System.out.format("%n%s%n", "Conversion1.test0870");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) -1, 0, "0000000000", 0, 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "ff00000000" + "'", str5.equals("ff00000000"));
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0871");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('1');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.byteToBinary((byte) 0, 8, booleanArray3, 11, (int) (byte) -1);
        char char8 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray6, (int) (short) 0);
        char char9 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '1' + "'", char8 == '1');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '8' + "'", char9 == '8');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0872");
        short[] shortArray4 = new short[] { (short) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray7 = org.apache.commons.lang3.Conversion.intToShortArray(4, (int) 'a', shortArray4, 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nShorts-1)*16+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0873");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) -1, (int) 'b', "", (int) (short) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0874");
        // The following exception was thrown during execution in test generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.intToHexDigitMsb0((int) '2');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nibble value not between 0 and 15: 50");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0875");
        int int5 = org.apache.commons.lang3.Conversion.hexToInt("f", 11, 0, (int) (byte) 100, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0876");
        java.util.UUID uUID0 = null;
        java.util.UUID uUID1 = null;
        byte[] byteArray3 = new byte[] { (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID1, byteArray3, 1, (int) (byte) 0);
        byte[] byteArray9 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray6, 0, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray9);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0877");
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("0000000000", 100, (long) (short) 0, (int) (byte) 10, 49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0878");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('5');
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray7 = org.apache.commons.lang3.Conversion.shortToBinary((short) 1, 56, booleanArray3, (int) 'b', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + 'a' + "'", char4 == 'a');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0879");
        // The following exception was thrown during execution in test generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.intToHexDigit((int) 'b');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nibble value not between 0 and 15: 98");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0880");
        boolean[] booleanArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray5 = org.apache.commons.lang3.Conversion.longToBinary((long) (short) 10, 11, booleanArray2, (int) (byte) -1, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0881");
        short[] shortArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray5 = org.apache.commons.lang3.Conversion.intToShortArray((int) (byte) 10, 4, shortArray2, 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nShorts-1)*16+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0882");
        byte[] byteArray0 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.byteArrayToInt(byteArray0, 56, (int) (byte) 0, (int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nBytes-1)*8+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray0);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0883");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) '#', (int) 'd', "f", (int) 'a', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "f" + "'", str5.equals("f"));
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0884");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 0, (int) (short) 0, "f", 0, 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0000" + "'", str5.equals("0000"));
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0885");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) 10, 49, "0000000000", 2, 56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0886");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) -1, (int) (short) 100, "hi!", (int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0887");
        byte[] byteArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray5 = org.apache.commons.lang3.Conversion.longToByteArray((long) 35, (int) 'd', byteArray2, (int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nBytes-1)*8+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0888");
        short[] shortArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.shortArrayToLong(shortArray0, 13, (long) 56, 13, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0889");
        long long5 = org.apache.commons.lang3.Conversion.hexToLong("0000", 35, 50L, (int) (byte) 0, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 50L + "'", long5 == 50L);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0890");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('4');
        char char2 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        char char3 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        // The following exception was thrown during execution in test generation
        try {
            byte byte8 = org.apache.commons.lang3.Conversion.binaryToByte(booleanArray1, (int) '8', (byte) 1, (int) '4', (int) '1');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '4' + "'", char2 == '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '2' + "'", char3 == '2');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0891");
        long long5 = org.apache.commons.lang3.Conversion.hexToLong("hi00000", 13, (long) (byte) -1, 0, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0892");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("0000000000", 0, (byte) 100, 11, (int) '2');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0893");
        long long5 = org.apache.commons.lang3.Conversion.hexToLong("hi00000", 11, 100L, (int) (short) 0, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0894");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("0000", 5, (byte) 10, (int) '1', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0895");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("0000", 13, (byte) 0, (int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0896");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("0000", 100, (byte) 0, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0897");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("ff00000000", (-1), (short) (byte) 10, 13, (int) '2');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0898");
        int int5 = org.apache.commons.lang3.Conversion.hexToInt("ff00000000", (int) 'a', (int) '0', (int) (short) 100, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0899");
        int int5 = org.apache.commons.lang3.Conversion.hexToInt("0000", 0, (int) 'd', (int) '4', (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0900");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 100, (int) (short) 1, "f", (int) (short) -1, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0901");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("0000", (int) 'a', (short) (byte) 1, (int) 'a', 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0902");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            char char2 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray0, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0903");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('5');
        char char2 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            char char6 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'a' + "'", char2 == 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '5' + "'", char4 == '5');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0904");
        int[] intArray0 = new int[] {};
        long long5 = org.apache.commons.lang3.Conversion.intArrayToLong(intArray0, 13, (long) 8, (int) (short) 0, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 8L + "'", long5 == 8L);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0905");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('0');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        // The following exception was thrown during execution in test generation
        try {
            char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
            System.out.format("%n%s%n", "Conversion1.test0906");
        java.util.UUID uUID0 = null;
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte[] byteArray5 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray2, 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.UUID uUID7 = org.apache.commons.lang3.Conversion.byteArrayToUuid(byteArray5, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Need at least 16 bytes for UUID");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0907");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.longToBinary((long) 0, (int) '4', booleanArray3, (int) '5', 0);
        char char7 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
        char char8 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + 'a' + "'", char7 == 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + 'a' + "'", char8 == 'a');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0908");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("", (int) (byte) 100, (short) (byte) 1, (int) '8', (int) '1');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0909");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('5');
        // The following exception was thrown during execution in test generation
        try {
            byte byte6 = org.apache.commons.lang3.Conversion.binaryToByte(booleanArray1, 35, (byte) 10, 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0910");
        char char1 = org.apache.commons.lang3.Conversion.intToHexDigit((int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '0' + "'", char1 == '0');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0911");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("0000", 48, (byte) 1, (int) (byte) 10, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0912");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) -1, 48, "0000000000", (int) ' ', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0913");
        boolean[] booleanArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray5 = org.apache.commons.lang3.Conversion.intToBinary((int) (short) -1, 5, booleanArray2, 11, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0914");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 0, (int) '8', "", (-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0915");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("", 1, (byte) 1, (int) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0916");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray7 = org.apache.commons.lang3.Conversion.shortToByteArray((short) 100, (int) (byte) 1, byteArray4, (int) (short) 0, (int) 'a');
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
            System.out.format("%n%s%n", "Conversion1.test0917");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) '#', (-1), "", (int) 'd', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0918");
        boolean[] booleanArray2 = null;
        boolean[] booleanArray5 = org.apache.commons.lang3.Conversion.intToBinary((int) (short) 0, 11, booleanArray2, 8, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booleanArray5);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0919");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("f", (int) (byte) 100, (short) (byte) 100, 11, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0920");
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("0000", 0, (long) 5, 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0921");
        byte[] byteArray0 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.util.UUID uUID2 = org.apache.commons.lang3.Conversion.byteArrayToUuid(byteArray0, 56);
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
            System.out.format("%n%s%n", "Conversion1.test0922");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.longToBinary((long) (-1), (int) '5', booleanArray3, (int) '8', 0);
        // The following exception was thrown during execution in test generation
        try {
            char char8 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray6, (int) '8');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: src.length-srcPos<4: src.length=4, srcPos=56");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0923");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('2');
        char char3 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1, (int) (short) 1);
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.lang3.Conversion.binaryToLong(booleanArray1, (int) (short) 1, (long) 56, (int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '2' + "'", char3 == '2');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '2' + "'", char4 == '2');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0924");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        char char3 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1, (int) (short) 0);
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        byte byte9 = org.apache.commons.lang3.Conversion.binaryToByte(booleanArray1, 1, (byte) 0, 4, 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'a' + "'", char3 == 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '5' + "'", char4 == '5');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 32 + "'", byte9 == (byte) 32);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0925");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) -1, 0, "", 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0926");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) 100, 4, "f", (int) 'a', 2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 97");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0927");
        byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("f", 48, (byte) 32, (-1), 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 32 + "'", byte5 == (byte) 32);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0928");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('5');
        // The following exception was thrown during execution in test generation
        try {
            char char3 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0929");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            char char2 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray0, (int) 'b');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0930");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray7 = org.apache.commons.lang3.Conversion.intToBinary((int) 'd', 0, booleanArray3, (int) (byte) -1, (int) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + 'a' + "'", char4 == 'a');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0931");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 0, (int) (byte) 10, "", (-1), (int) (byte) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0932");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 1, (int) (byte) 10, "0000", 11, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0000" + "'", str5.equals("0000"));
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0933");
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("f", 13, (int) 'b', (int) '2', 48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0934");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('8');
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray7 = org.apache.commons.lang3.Conversion.byteToBinary((byte) 100, 35, booleanArray3, 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '1' + "'", char4 == '1');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0935");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('2');
        char char3 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1, (int) (short) 1);
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        // The following exception was thrown during execution in test generation
        try {
            char char6 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '2' + "'", char3 == '2');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '4' + "'", char4 == '4');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0936");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('8');
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        char char5 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        char char6 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray9 = org.apache.commons.lang3.Conversion.longToBinary(11L, (int) (short) -1, booleanArray3, (int) 'b', 13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 98");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '1' + "'", char4 == '1');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '1' + "'", char5 == '1');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '1' + "'", char6 == '1');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0937");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('1');
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3);
        boolean[] booleanArray7 = org.apache.commons.lang3.Conversion.byteToBinary((byte) 10, (int) '8', booleanArray3, (int) (byte) 100, 0);
        char char8 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '8' + "'", char4 == '8');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '1' + "'", char8 == '1');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0938");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) 35, 35, "f", 2, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "f" + "'", str5.equals("f"));
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0939");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('8');
        char char5 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray8 = org.apache.commons.lang3.Conversion.longToBinary(4L, 8, booleanArray3, (int) '5', 13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '8' + "'", char5 == '8');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0940");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('8');
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.intToBinary(35, (int) (byte) 1, booleanArray3, (int) (short) 0, (int) '2');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0941");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('1');
        // The following exception was thrown during execution in test generation
        try {
            short short6 = org.apache.commons.lang3.Conversion.binaryToShort(booleanArray1, 5, (short) (byte) 10, 10, (int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0942");
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("0000", 49, (long) 0, 35, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0943");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("0000000000", (int) '1', (byte) -1, (int) '8', (int) '0');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0944");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) '2', (int) (byte) 10, "hi00000", (int) '#', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi00000" + "'", str5.equals("hi00000"));
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0945");
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("0", (int) (short) -1, (int) 'b', (int) '4', 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0946");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 1, (byte) 32 };
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.lang3.Conversion.byteArrayToInt(byteArray3, (-1), (int) (short) 0, (int) '0', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nBytes-1)*8+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0947");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('8');
        char char3 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1, (int) (byte) 0);
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        char char5 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        java.lang.Class<?> wildcardClass6 = booleanArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '8' + "'", char3 == '8');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '1' + "'", char4 == '1');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '8' + "'", char5 == '8');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0948");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) '8', (int) (short) 10, "ff00000000", (int) '#', (int) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0949");
        java.util.UUID uUID0 = null;
        byte[] byteArray2 = new byte[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray5 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray2, (int) '5', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0950");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 1, 11, "0", (int) 'b', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0951");
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("hi00000", (int) ' ', 10L, 11, (int) '2');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0952");
        byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("0000", (int) (short) 1, (byte) -1, (int) (byte) 1, 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0953");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('5');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        java.lang.Class<?> wildcardClass3 = booleanArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'a' + "'", char2 == 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0954");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 0, (int) 'b', "ff00000000", (int) (short) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0955");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('4');
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        char char5 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray8 = org.apache.commons.lang3.Conversion.shortToBinary((short) 10, 0, booleanArray3, (int) '4', 48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '4' + "'", char4 == '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '4' + "'", char5 == '4');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0956");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("0", (int) (short) 0, (short) (byte) 32, (int) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0957");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) 'd', 35, "hi00000", 0, (int) '0');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0958");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('0');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        java.lang.Class<?> wildcardClass3 = booleanArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0959");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('0');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        // The following exception was thrown during execution in test generation
        try {
            long long7 = org.apache.commons.lang3.Conversion.binaryToLong(booleanArray1, (-1), (long) (byte) -1, (int) 'd', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+dstPos is greather or equal to than 64");
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
            System.out.format("%n%s%n", "Conversion1.test0960");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("0000", 4, (byte) 100, (int) (short) 10, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0961");
        char char1 = org.apache.commons.lang3.Conversion.intToHexDigit(1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '1' + "'", char1 == '1');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0962");
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("hi!", (int) (short) 0, (int) (short) 0, 10, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot interpret 'h' as a hexadecimal digit");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0963");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 100, (int) '1', "0", (int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0964");
        java.util.UUID uUID0 = null;
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte[] byteArray5 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray2, 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.UUID uUID7 = org.apache.commons.lang3.Conversion.byteArrayToUuid(byteArray5, (int) 'b');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Need at least 16 bytes for UUID");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0965");
        int int5 = org.apache.commons.lang3.Conversion.hexToInt("hi00000", 10, (int) 'b', (int) ' ', (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 98 + "'", int5 == 98);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0966");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) 1, 48, "0", (int) (byte) 10, (int) (byte) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0967");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) ' ', 5, "", (int) (byte) 32, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0968");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) '4', (int) ' ', "hi00000", (int) '0', (int) '2');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0969");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 1, (int) '4', "hi00000", 98, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0970");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) 100, (-1), "0000000000", (int) '2', 48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0971");
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("f", 100, (int) 'a', (int) (byte) 0, (int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0972");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('d');
        char char2 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        // The following exception was thrown during execution in test generation
        try {
            long long7 = org.apache.commons.lang3.Conversion.binaryToLong(booleanArray1, 11, (long) 11, (int) '#', (int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'd' + "'", char2 == 'd');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0973");
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("hi00000", 98, (long) (byte) 0, 13, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0974");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('4');
        char char2 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        char char3 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        java.lang.Class<?> wildcardClass4 = booleanArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '4' + "'", char2 == '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '2' + "'", char3 == '2');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0975");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) '1', 8, "0000", (int) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0976");
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("0000000000", 11, (long) '5', (int) (short) 1, (int) '1');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0977");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        // The following exception was thrown during execution in test generation
        try {
            char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1, 49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: src.length-srcPos<4: src.length=4, srcPos=49");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'a' + "'", char2 == 'a');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0978");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('1');
        java.lang.Class<?> wildcardClass2 = booleanArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0979");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.longToBinary((long) (-1), (int) '5', booleanArray3, (int) '8', 0);
        char char7 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray6);
        // The following exception was thrown during execution in test generation
        try {
            char char9 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray6, (int) '8');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: src.length-srcPos<4: src.length=4, srcPos=56");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '5' + "'", char7 == '5');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0980");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.intArrayToLong(intArray0, 4, (long) 'd', (int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0981");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 1, 13, "hi00000", (int) (short) 100, (int) '8');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0982");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("0000000000", 5, (short) (byte) 100, (int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0983");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) '8', (int) 'd', "0000000000", 0, (int) '0');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0984");
        java.util.UUID uUID0 = null;
        java.util.UUID uUID1 = null;
        byte[] byteArray3 = new byte[] { (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID1, byteArray3, 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray6, 10, (int) '1');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBytes is greather than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0985");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('0');
        char char2 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        char char3 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        java.lang.Class<?> wildcardClass4 = booleanArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '0' + "'", char3 == '0');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0986");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 32, (byte) 1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.UUID uUID7 = org.apache.commons.lang3.Conversion.byteArrayToUuid(byteArray5, (int) '0');
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
            System.out.format("%n%s%n", "Conversion1.test0987");
        boolean[] booleanArray3 = new boolean[] { true, false, false };
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        // The following exception was thrown during execution in test generation
        try {
            byte byte9 = org.apache.commons.lang3.Conversion.binaryToByte(booleanArray3, (int) (byte) 100, (byte) 10, (int) '4', (int) '1');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '4' + "'", char4 == '4');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0988");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('5');
        char char2 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            char char6 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1, 98);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: src.length-srcPos<4: src.length=4, srcPos=98");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'a' + "'", char2 == 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '5' + "'", char4 == '5');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0989");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) ' ', (int) 'b', "f", 11, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0990");
        int[] intArray2 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray5 = org.apache.commons.lang3.Conversion.longToIntArray((long) '#', 98, intArray2, 98, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nInts-1)*32+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0991");
        byte[] byteArray0 = new byte[] {};
        short short5 = org.apache.commons.lang3.Conversion.byteArrayToShort(byteArray0, (int) (short) 0, (short) (byte) 100, (int) (short) 10, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.UUID uUID7 = org.apache.commons.lang3.Conversion.byteArrayToUuid(byteArray0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Need at least 16 bytes for UUID");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 100 + "'", short5 == (short) 100);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0992");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("0000000000", (int) (short) 0, (byte) 0, (int) '8', 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0993");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) (short) -1, (int) '0', "hi!", 0, (int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0994");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('1');
        char char3 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1, 1);
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        char char5 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        // The following exception was thrown during execution in test generation
        try {
            char char7 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: src.length-srcPos<4: src.length=4, srcPos=1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '0' + "'", char3 == '0');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '1' + "'", char4 == '1');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '1' + "'", char5 == '1');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0995");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('1');
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.shortToBinary((short) (byte) 32, 4, booleanArray3, (int) 'b', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0996");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('2');
        char char3 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1, (int) (byte) 0);
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        long long9 = org.apache.commons.lang3.Conversion.binaryToLong(booleanArray1, 10, 10L, (int) (short) 0, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '2' + "'", char3 == '2');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '4' + "'", char4 == '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0997");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) -1, (int) (byte) 1, "0", (int) (byte) 0, (int) '0');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0998");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.binaryToLong(booleanArray0, (int) (byte) 1, (long) '8', (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test0999");
        boolean[] booleanArray5 = new boolean[] { true, true, false, true, true };
        char char7 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray5, (int) (short) 0);
        char char8 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray5);
        char char9 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + 'b' + "'", char7 == 'b');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + 'b' + "'", char8 == 'b');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + 'd' + "'", char9 == 'd');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.test1000");
        // The following exception was thrown during execution in test generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.intToHexDigitMsb0((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nibble value not between 0 and 15: 52");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }
}

