
package Conversion;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Conversion3 {

    public static boolean debug = false;

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion3.test1501");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex(5, 98, "f", 5, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion3.test1502");
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("1000", (int) (byte) 32, (int) (short) 100, (int) (short) -1, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion3.test1503");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi00000", 2, (byte) -1, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion3.test1504");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) -1, 48, "hi00000", 4, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion3.test1505");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('4');
        long long6 = org.apache.commons.lang3.Conversion.binaryToLong(booleanArray1, (int) (byte) 1, 35L, (int) (short) 100, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion3.test1506");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('0');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        char char3 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '0' + "'", char3 == '0');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion3.test1507");
        java.util.UUID uUID0 = null;
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte[] byteArray5 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray2, 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.UUID uUID7 = org.apache.commons.lang3.Conversion.byteArrayToUuid(byteArray5, (int) (byte) -1);
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
            System.out.format("%n%s%n", "Conversion3.test1508");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('2');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.intToBinary(50, (int) '3', booleanArray3, 48, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion3.test1509");
        byte[] byteArray2 = null;
        byte[] byteArray5 = org.apache.commons.lang3.Conversion.shortToByteArray((short) (byte) 0, (int) (short) 0, byteArray2, (int) '3', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(byteArray5);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion3.test1510");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('1');
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray7 = org.apache.commons.lang3.Conversion.shortToBinary((short) (byte) 32, 1, booleanArray3, 5, (int) (short) 100);
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
            System.out.format("%n%s%n", "Conversion3.test1511");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("1000", 0, (short) 0, 48, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion3.test1512");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 32, (int) '3', "hi!", (int) '2', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion3.test1513");
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("f", 98, (long) 100, 11, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion3.test1514");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        char char3 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            char char5 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'a' + "'", char3 == 'a');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion3.test1515");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) '#', 0, "hi!", (int) (short) 0, 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "32000" + "'", str5.equals("32000"));
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion3.test1516");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("1000", (int) '8', (short) 0, 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion3.test1517");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("ff00000000", (int) (byte) 0, (byte) -1, (-1), 50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion3.test1518");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("0000000000", 50, (short) -1, (int) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion3.test1519");
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("ff00000000", (int) (byte) 32, 0L, (int) '1', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion3.test1520");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("0000000000", (int) '5', (byte) 1, (int) (short) 32, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion3.test1521");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('0');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        char char3 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.lang3.Conversion.binaryToInt(booleanArray1, (int) (byte) 1, 100, 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '0' + "'", char3 == '0');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion3.test1522");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('8');
        char char2 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        // The following exception was thrown during execution in test generation
        try {
            long long7 = org.apache.commons.lang3.Conversion.binaryToLong(booleanArray1, (int) (short) 100, 100L, (int) (byte) -1, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
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
            System.out.format("%n%s%n", "Conversion3.test1523");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) (short) 0, (int) '2', "0000000000", (int) (short) 32, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion3.test1524");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("32000", 100, (byte) 10, (int) (byte) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion3.test1525");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.byteArrayToLong(byteArray0, 48, (long) 13, 8, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion3.test1526");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 1 };
        byte[] byteArray7 = org.apache.commons.lang3.Conversion.shortToByteArray((short) (byte) -1, 0, byteArray4, 4, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.UUID uUID9 = org.apache.commons.lang3.Conversion.byteArrayToUuid(byteArray4, (int) (short) 0);
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
            System.out.format("%n%s%n", "Conversion3.test1527");
        int[] intArray0 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.intArrayToLong(intArray0, (int) '1', (long) (short) 100, 8, (int) (short) 100);
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
            System.out.format("%n%s%n", "Conversion3.test1528");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('0');
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
        char char5 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray8 = org.apache.commons.lang3.Conversion.longToBinary((long) '8', (int) '3', booleanArray3, (int) '3', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '0' + "'", char4 == '0');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '0' + "'", char5 == '0');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion3.test1529");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.byteArrayToShort(byteArray0, (int) (byte) 1, (short) 10, 10, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion3.test1530");
        java.util.UUID uUID0 = null;
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray4 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray1, (int) '5', (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.UUID uUID6 = org.apache.commons.lang3.Conversion.byteArrayToUuid(byteArray1, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Need at least 16 bytes for UUID");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion3.test1531");
        java.util.UUID uUID2 = null;
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray6 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID2, byteArray3, (int) '5', (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = org.apache.commons.lang3.Conversion.intToByteArray(13, 98, byteArray6, 4, (int) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nBytes-1)*8+srcPos is greather or equal to than 32");
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
            System.out.format("%n%s%n", "Conversion3.test1532");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('8');
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.apache.commons.lang3.Conversion.binaryToInt(booleanArray1, 2, (int) '0', (int) (short) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion3.test1533");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex(0, (int) '1', "hi00000", (int) '1', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion3.test1534");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('0');
        short short6 = org.apache.commons.lang3.Conversion.binaryToShort(booleanArray1, 0, (short) -1, 13, (-1));
        java.lang.Class<?> wildcardClass7 = booleanArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -1 + "'", short6 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }
}

